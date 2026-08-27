package g8;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;

public final class u extends Fragment {
    public static final int d = 0;

    public int f6789a;

    public t f6790b;

    public boolean f6791c;

    public final void a(Task task) {
        if (this.f6791c) {
            return;
        }
        int i10 = 1;
        this.f6791c = true;
        Activity activity = getActivity();
        activity.getFragmentManager().beginTransaction().remove(this).commit();
        if (task == null) {
            a.b(activity, this.f6789a, 0, new Intent());
            return;
        }
        int i11 = this.f6789a;
        int i12 = a.f6714c;
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
                ((com.google.android.gms.common.api.p) exception).getStatus().c(activity, i11);
                return;
            } catch (IntentSender.SendIntentException e9) {
                if (Log.isLoggable("AutoResolveHelper", 6)) {
                    Log.e("AutoResolveHelper", "Error starting pending intent!", e9);
                    return;
                }
                return;
            }
        }
        Intent intent = new Intent();
        if (task.isSuccessful()) {
            i iVar = (i) task.getResult();
            iVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            iVar.writeToParcel(parcelObtain, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            intent.putExtra("com.google.android.gms.wallet.PaymentData", bArrMarshall);
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
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f6789a = getArguments().getInt("requestCode");
        if (a.f6713b != getArguments().getLong("initializationElapsedRealtime")) {
            this.f6790b = null;
        } else {
            this.f6790b = (t) t.f6784e.get(getArguments().getInt("resolveCallId"));
        }
        boolean z10 = false;
        if (bundle != null && bundle.getBoolean("delivered")) {
            z10 = true;
        }
        this.f6791c = z10;
    }

    @Override
    public final void onPause() {
        super.onPause();
        t tVar = this.f6790b;
        if (tVar == null || tVar.f6787b != this) {
            return;
        }
        tVar.f6787b = null;
    }

    @Override
    public final void onResume() {
        super.onResume();
        t tVar = this.f6790b;
        if (tVar != null) {
            tVar.f6787b = this;
            tVar.a();
        } else {
            if (Log.isLoggable("AutoResolveHelper", 5)) {
                Log.w("AutoResolveHelper", "Sending canceled result for garbage collected task!");
            }
            a(null);
        }
    }

    @Override
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("delivered", this.f6791c);
        t tVar = this.f6790b;
        if (tVar == null || tVar.f6787b != this) {
            return;
        }
        tVar.f6787b = null;
    }
}
