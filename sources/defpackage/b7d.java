package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
public final class b7d implements lr2, OnSuccessListener, OnFailureListener {
    public final byte a;

    public b7d(ie1 ie1Var) {
        this.a = (byte) 3;
    }

    @Override
    public final Object X(sm2 sm2Var) {
        switch (this.a) {
            case 0:
                cg7 cg7Var = (cg7) sm2Var.a(cg7.class);
                return new kg7((byte) 0);
            default:
                return new n89(sm2Var.N(m89.class));
        }
    }

    @Override
    public final void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override
    public final void onSuccess(Object obj) {
        e1f.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    public b7d(byte b) {
        this.a = b;
    }
}
