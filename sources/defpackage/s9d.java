package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
public final class s9d implements tq2, OnSuccessListener, OnFailureListener {
    public final byte a;

    public s9d(id1 id1Var) {
        this.a = (byte) 3;
    }

    @Override
    public final Object b0(am2 am2Var) {
        switch (this.a) {
            case 0:
                kg7 kg7Var = (kg7) am2Var.a(kg7.class);
                return new sg7((byte) 0);
            default:
                return new y99(am2Var.N(x99.class));
        }
    }

    @Override
    public final void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override
    public final void onSuccess(Object obj) {
        v3f.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    public s9d(byte b) {
        this.a = b;
    }
}
