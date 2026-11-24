package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
public final class op5 {
    public final byte a;

    public op5(byte b) {
        this.a = b;
    }

    public final xx4 a(Context context, Looper looper, ntb ntbVar, Object obj, ey4 ey4Var, fy4 fy4Var) {
        byte b = this.a;
        switch (b) {
            case 2:
                gha ghaVar = (gha) obj;
                Object obj2 = ntbVar.f;
                Integer num = (Integer) ntbVar.h;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new eha(context, looper, ntbVar, bundle, ey4Var, fy4Var);
            case 3:
                obj.getClass();
                throw new ClassCastException();
            case 4:
            case 5:
            case 6:
            case 8:
            case 11:
            case 14:
            case 15:
            case 17:
            case 19:
            default:
                switch (b) {
                    case 0:
                        context.getClass();
                        looper.getClass();
                        ntbVar.getClass();
                        ((un) obj).getClass();
                        return new xx4(352, ey4Var, fy4Var, ntbVar, context, looper);
                    case 1:
                        context.getClass();
                        looper.getClass();
                        ntbVar.getClass();
                        ((un) obj).getClass();
                        return new xx4(429, ey4Var, fy4Var, ntbVar, context, looper);
                    case 2:
                    case 3:
                    case 7:
                    case 9:
                    case 10:
                    case 12:
                    case 13:
                    case 16:
                    case 18:
                    default:
                        throw new UnsupportedOperationException("buildClient must be implemented");
                    case 4:
                        un unVar = (un) obj;
                        return new xx4(308, ey4Var, fy4Var, ntbVar, context, looper);
                    case 5:
                        un unVar2 = (un) obj;
                        return new xx4(449, ey4Var, fy4Var, ntbVar, context, looper);
                    case 6:
                        return new i3d(context, looper, ntbVar, (ngb) obj, ey4Var, fy4Var);
                    case 8:
                        k4d k4dVar = (k4d) obj;
                        return new r3d(ey4Var, fy4Var, ntbVar, context, looper);
                    case 11:
                        un unVar3 = (un) obj;
                        return new xx4(126, ey4Var, fy4Var, ntbVar, context, looper);
                    case 14:
                        un unVar4 = (un) obj;
                        return new qnd(ey4Var, fy4Var, ntbVar, context, looper);
                    case 15:
                        un unVar5 = (un) obj;
                        return new xx4(19, ey4Var, fy4Var, ntbVar, context, looper);
                    case 17:
                        un unVar6 = (un) obj;
                        return new xx4(457, ey4Var, fy4Var, ntbVar, context, looper);
                    case 19:
                        context.getClass();
                        looper.getClass();
                        ntbVar.getClass();
                        ((un) obj).getClass();
                        return new xx4(380, ey4Var, fy4Var, ntbVar, context, looper);
                }
            case 7:
                return new y3d(context, looper, ntbVar, (x3d) obj, ey4Var, fy4Var);
            case 9:
                return new z3d(context, looper, ntbVar, (GoogleSignInOptions) obj, ey4Var, fy4Var);
            case 10:
                return new xx4(40, ey4Var, fy4Var, ntbVar, context, looper);
            case 12:
                fkc fkcVar = (fkc) obj;
                if (fkcVar == null) {
                    fkcVar = new fkc(new d00());
                }
                return new u5d(fkcVar.a, ey4Var, fy4Var, ntbVar, context, looper);
            case 13:
                yc1 yc1Var = (yc1) obj;
                fre.i(yc1Var, "Setting the API options is required.");
                return new lhf(context, looper, ntbVar, yc1Var.a, yc1Var.c, yc1Var.d, ey4Var, fy4Var);
            case 16:
                yc1 yc1Var2 = (yc1) obj;
                fre.i(yc1Var2, "Setting the API options is required.");
                return new ygf(context, looper, ntbVar, yc1Var2.a, yc1Var2.b, yc1Var2.c, ey4Var, fy4Var);
            case 18:
                zrc zrcVar = (zrc) obj;
                return new jke(ey4Var, fy4Var, ntbVar, context, looper);
            case 20:
                un unVar7 = (un) obj;
                return new xx4(161, ey4Var, fy4Var, ntbVar, context, looper);
            case 21:
                un unVar8 = (un) obj;
                return new n6d(ey4Var, fy4Var, ntbVar, context, looper);
            case 22:
                un unVar9 = (un) obj;
                return new xx4(148, ey4Var, fy4Var, ntbVar, context, looper);
        }
    }
}
