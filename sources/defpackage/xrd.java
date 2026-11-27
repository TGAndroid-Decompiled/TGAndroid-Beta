package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
public final class xrd extends Fragment {
    public static final int d = 0;
    public int a;
    public vld b;
    public boolean c;

    public final void a(Task task) {
        if (!this.c) {
            int i = 1;
            this.c = true;
            Activity activity = getActivity();
            activity.getFragmentManager().beginTransaction().remove(this).commit();
            int i2 = this.a;
            if (task != null) {
                int i3 = n70.b;
                if (activity.isFinishing()) {
                    if (Log.isLoggable("AutoResolveHelper", 3)) {
                        Log.d("AutoResolveHelper", "Ignoring task result for, Activity is finishing.");
                        return;
                    }
                    return;
                }
                Exception exception = task.getException();
                if (exception instanceof rd9) {
                    try {
                        ((rd9) exception).getStatus().c(activity, i2);
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
                    u18 u18Var = (u18) task.getResult();
                    u18Var.getClass();
                    Parcel obtain = Parcel.obtain();
                    u18Var.writeToParcel(obtain, 0);
                    byte[] marshall = obtain.marshall();
                    obtain.recycle();
                    intent.putExtra("com.google.android.gms.wallet.PaymentData", marshall);
                    i = -1;
                } else if (exception instanceof ao) {
                    ao aoVar = (ao) exception;
                    intent.putExtra("com.google.android.gms.common.api.AutoResolveHelper.status", new Status(aoVar.getStatusCode(), aoVar.getMessage(), null, null));
                } else {
                    if (Log.isLoggable("AutoResolveHelper", 6)) {
                        Log.e("AutoResolveHelper", "Unexpected non API exception!", exception);
                    }
                    intent.putExtra("com.google.android.gms.common.api.AutoResolveHelper.status", new Status(8, "Unexpected non API exception when trying to deliver the task result to an activity!", null, null));
                }
                n70.b(activity, i2, i, intent);
                return;
            }
            n70.b(activity, i2, 0, new Intent());
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = getArguments().getInt("requestCode");
        if (n70.a != getArguments().getLong("initializationElapsedRealtime")) {
            this.b = null;
        } else {
            this.b = (vld) vld.e.get(getArguments().getInt("resolveCallId"));
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("delivered")) {
            z = true;
        }
        this.c = z;
    }

    @Override
    public final void onPause() {
        super.onPause();
        vld vldVar = this.b;
        if (vldVar != null && vldVar.b == this) {
            vldVar.b = null;
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        vld vldVar = this.b;
        if (vldVar != null) {
            vldVar.b = this;
            vldVar.a();
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
        bundle.putBoolean("delivered", this.c);
        vld vldVar = this.b;
        if (vldVar != null && vldVar.b == this) {
            vldVar.b = null;
        }
    }
}
