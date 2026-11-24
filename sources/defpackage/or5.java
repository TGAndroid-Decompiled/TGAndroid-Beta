package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
public final class or5 {
    public final byte a;

    public or5(byte b) {
        this.a = b;
    }

    public final zz4 a(Context context, Looper looper, ovb ovbVar, Object obj, f05 f05Var, g05 g05Var) {
        byte b = this.a;
        switch (b) {
            case 2:
                ija ijaVar = (ija) obj;
                Object obj2 = ovbVar.f;
                Integer num = (Integer) ovbVar.h;
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
                return new gja(context, looper, ovbVar, bundle, f05Var, g05Var);
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
                        ovbVar.getClass();
                        ((vo) obj).getClass();
                        return new zz4(352, f05Var, g05Var, ovbVar, context, looper);
                    case 1:
                        context.getClass();
                        looper.getClass();
                        ovbVar.getClass();
                        ((vo) obj).getClass();
                        return new zz4(429, f05Var, g05Var, ovbVar, context, looper);
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
                        vo voVar = (vo) obj;
                        return new zz4(308, f05Var, g05Var, ovbVar, context, looper);
                    case 5:
                        vo voVar2 = (vo) obj;
                        return new zz4(449, f05Var, g05Var, ovbVar, context, looper);
                    case 6:
                        return new k5d(context, looper, ovbVar, (oib) obj, f05Var, g05Var);
                    case 8:
                        m6d m6dVar = (m6d) obj;
                        return new t5d(f05Var, g05Var, ovbVar, context, looper);
                    case 11:
                        vo voVar3 = (vo) obj;
                        return new zz4(126, f05Var, g05Var, ovbVar, context, looper);
                    case 14:
                        vo voVar4 = (vo) obj;
                        return new tpd(f05Var, g05Var, ovbVar, context, looper);
                    case 15:
                        vo voVar5 = (vo) obj;
                        return new zz4(19, f05Var, g05Var, ovbVar, context, looper);
                    case 17:
                        vo voVar6 = (vo) obj;
                        return new zz4(457, f05Var, g05Var, ovbVar, context, looper);
                    case 19:
                        context.getClass();
                        looper.getClass();
                        ovbVar.getClass();
                        ((vo) obj).getClass();
                        return new zz4(380, f05Var, g05Var, ovbVar, context, looper);
                }
            case 7:
                return new a6d(context, looper, ovbVar, (z5d) obj, f05Var, g05Var);
            case 9:
                return new b6d(context, looper, ovbVar, (GoogleSignInOptions) obj, f05Var, g05Var);
            case 10:
                return new zz4(40, f05Var, g05Var, ovbVar, context, looper);
            case 12:
                emc emcVar = (emc) obj;
                if (emcVar == null) {
                    emcVar = new emc(new d10());
                }
                return new w7d(emcVar.a, f05Var, g05Var, ovbVar, context, looper);
            case 13:
                ge1 ge1Var = (ge1) obj;
                ite.i(ge1Var, "Setting the API options is required.");
                return new mjf(context, looper, ovbVar, ge1Var.a, ge1Var.c, ge1Var.d, f05Var, g05Var);
            case 16:
                ge1 ge1Var2 = (ge1) obj;
                ite.i(ge1Var2, "Setting the API options is required.");
                return new zif(context, looper, ovbVar, ge1Var2.a, ge1Var2.b, ge1Var2.c, f05Var, g05Var);
            case 18:
                cuc cucVar = (cuc) obj;
                return new lme(f05Var, g05Var, ovbVar, context, looper);
            case 20:
                vo voVar7 = (vo) obj;
                return new zz4(161, f05Var, g05Var, ovbVar, context, looper);
            case 21:
                vo voVar8 = (vo) obj;
                return new p8d(f05Var, g05Var, ovbVar, context, looper);
            case 22:
                vo voVar9 = (vo) obj;
                return new zz4(148, f05Var, g05Var, ovbVar, context, looper);
        }
    }
}
