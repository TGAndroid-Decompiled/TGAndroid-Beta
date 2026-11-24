package defpackage;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
public final class xc0 implements jm7 {
    public final byte a;
    public final Object b;

    public xc0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                yc0 yc0Var = (yc0) obj;
                if (yc0Var.g && i == yc0Var.e) {
                    yc0Var.b(objArr);
                    return;
                }
                return;
            case 1:
                ze6 ze6Var = (ze6) obj;
                int intValue = ((Integer) objArr[0]).intValue();
                ((Integer) objArr[1]).getClass();
                Intent intent = (Intent) objArr[2];
                nm7.e().n(this, 310);
                if (intValue == 200) {
                    try {
                        ze6Var.G = (GoogleSignInAccount) ble.b(intent).getResult(ap.class);
                        ze6Var.h(null);
                        return;
                    } catch (ap e) {
                        fc4.g(e, true);
                        return;
                    }
                }
                return;
            default:
                cg6 cg6Var = (cg6) obj;
                int intValue2 = ((Integer) objArr[0]).intValue();
                ((Integer) objArr[1]).getClass();
                Intent intent2 = (Intent) objArr[2];
                nm7.e().n(this, 310);
                if (intValue2 == 200) {
                    try {
                        cg6Var.E = (GoogleSignInAccount) ble.b(intent2).getResult(ap.class);
                        cg6Var.h(null);
                        return;
                    } catch (ap e2) {
                        fc4.g(e2, true);
                        return;
                    }
                }
                return;
        }
    }
}
