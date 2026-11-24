package defpackage;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
public final class xb0 implements gk7 {
    public final byte a;
    public final Object b;

    public xb0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                yb0 yb0Var = (yb0) obj;
                if (yb0Var.g && i == yb0Var.e) {
                    yb0Var.b(objArr);
                    return;
                }
                return;
            case 1:
                ad6 ad6Var = (ad6) obj;
                int intValue = ((Integer) objArr[0]).intValue();
                ((Integer) objArr[1]).getClass();
                Intent intent = (Intent) objArr[2];
                kk7.e().n(this, 308);
                if (intValue == 200) {
                    try {
                        ad6Var.G = (GoogleSignInAccount) aje.b(intent).getResult(zn.class);
                        ad6Var.h(null);
                        return;
                    } catch (zn e) {
                        fa4.g(e, true);
                        return;
                    }
                }
                return;
            default:
                de6 de6Var = (de6) obj;
                int intValue2 = ((Integer) objArr[0]).intValue();
                ((Integer) objArr[1]).getClass();
                Intent intent2 = (Intent) objArr[2];
                kk7.e().n(this, 308);
                if (intValue2 == 200) {
                    try {
                        de6Var.E = (GoogleSignInAccount) aje.b(intent2).getResult(zn.class);
                        de6Var.h(null);
                        return;
                    } catch (zn e2) {
                        fa4.g(e2, true);
                        return;
                    }
                }
                return;
        }
    }
}
