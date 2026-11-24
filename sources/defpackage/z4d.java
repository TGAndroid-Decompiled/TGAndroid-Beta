package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
public final class z4d implements aq2, OnSuccessListener, OnFailureListener {
    public final byte a;

    public z4d(ad1 ad1Var) {
        this.a = (byte) 3;
    }

    @Override
    public final Object K(gl2 gl2Var) {
        switch (this.a) {
            case 0:
                ae7 ae7Var = (ae7) gl2Var.a(ae7.class);
                return new ie7((byte) 0);
            default:
                return new l69(gl2Var.O(k69.class));
        }
    }

    @Override
    public final void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override
    public final void onSuccess(Object obj) {
        cze.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    public z4d(byte b) {
        this.a = b;
    }
}
