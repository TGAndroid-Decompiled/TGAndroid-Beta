package j8;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
public final class v extends Fragment {
    public static final int d = 0;
    public int f9312a;
    public u f9313b;
    public boolean f9314c;

    public final void a(Task task) {
        if (!this.f9314c) {
            int i10 = 1;
            this.f9314c = true;
            Activity activity = getActivity();
            activity.getFragmentManager().beginTransaction().remove(this).commit();
            if (task != null) {
                int i11 = this.f9312a;
                int i12 = a.f9243c;
                if (activity.isFinishing()) {
                    if (Log.isLoggable("AutoResolveHelper", 3)) {
                        Log.d("AutoResolveHelper", "Ignoring task result for, Activity is finishing.");
                        return;
                    }
                    return;
                }
                Exception exception = task.getException();
                if (exception instanceof com.google.android.gms.common.api.p) {
                    try {
                        ((com.google.android.gms.common.api.p) exception).getStatus().f(activity, i11);
                        return;
                    } catch (IntentSender.SendIntentException e) {
                        if (Log.isLoggable("AutoResolveHelper", 6)) {
                            Log.e("AutoResolveHelper", "Error starting pending intent!", e);
                            return;
                        }
                        return;
                    }
                }
                Intent intent = new Intent();
                if (task.isSuccessful()) {
                    i iVar = (i) task.getResult();
                    iVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    iVar.writeToParcel(obtain, 0);
                    byte[] marshall = obtain.marshall();
                    obtain.recycle();
                    intent.putExtra("com.google.android.gms.wallet.PaymentData", marshall);
                    i10 = -1;
                } else if (exception instanceof com.google.android.gms.common.api.f) {
                    com.google.android.gms.common.api.f fVar = (com.google.android.gms.common.api.f) exception;
                    intent.putExtra("com.google.android.gms.common.api.AutoResolveHelper.status", new Status(fVar.getStatusCode(), fVar.getMessage(), null, null));
                } else {
                    if (Log.isLoggable("AutoResolveHelper", 6)) {
                        Log.e("AutoResolveHelper", "Unexpected non API exception!", exception);
                    }
                    intent.putExtra("com.google.android.gms.common.api.AutoResolveHelper.status", new Status(8, "Unexpected non API exception when trying to deliver the task result to an activity!", null, null));
                }
                a.b(activity, i11, i10, intent);
                return;
            }
            a.b(activity, this.f9312a, 0, new Intent());
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f9312a = getArguments().getInt("requestCode");
        if (a.f9242b != getArguments().getLong("initializationElapsedRealtime")) {
            this.f9313b = null;
        } else {
            this.f9313b = (u) u.e.get(getArguments().getInt("resolveCallId"));
        }
        boolean z4 = false;
        if (bundle != null && bundle.getBoolean("delivered")) {
            z4 = true;
        }
        this.f9314c = z4;
    }

    @Override
    public final void onPause() {
        super.onPause();
        u uVar = this.f9313b;
        if (uVar != null && uVar.f9310b == this) {
            uVar.f9310b = null;
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        u uVar = this.f9313b;
        if (uVar != null) {
            uVar.f9310b = this;
            uVar.a();
            return;
        }
        if (Log.isLoggable("AutoResolveHelper", 5)) {
            Log.w("AutoResolveHelper", "Sending canceled result for garbage collected task!");
        }
        a(null);
    }

    @Override
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("delivered", this.f9314c);
        u uVar = this.f9313b;
        if (uVar != null && uVar.f9310b == this) {
            uVar.f9310b = null;
        }
    }
}
