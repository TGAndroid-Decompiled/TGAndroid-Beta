package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
public final class rr5 {
    public final byte a;

    public rr5(byte b) {
        this.a = b;
    }

    public final d05 a(Context context, Looper looper, oxb oxbVar, Object obj, k05 k05Var, l05 l05Var) {
        byte b = this.a;
        switch (b) {
            case 2:
                zka zkaVar = (zka) obj;
                Object obj2 = oxbVar.f;
                Integer num = (Integer) oxbVar.h;
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
                return new xka(context, looper, oxbVar, bundle, k05Var, l05Var);
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
                        oxbVar.getClass();
                        ((vn) obj).getClass();
                        return new d05(352, k05Var, l05Var, oxbVar, context, looper);
                    case 1:
                        context.getClass();
                        looper.getClass();
                        oxbVar.getClass();
                        ((vn) obj).getClass();
                        return new d05(429, k05Var, l05Var, oxbVar, context, looper);
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
                        vn vnVar = (vn) obj;
                        return new d05(308, k05Var, l05Var, oxbVar, context, looper);
                    case 5:
                        vn vnVar2 = (vn) obj;
                        return new d05(449, k05Var, l05Var, oxbVar, context, looper);
                    case 6:
                        return new z7d(context, looper, oxbVar, (jkb) obj, k05Var, l05Var);
                    case 8:
                        b9d b9dVar = (b9d) obj;
                        return new i8d(k05Var, l05Var, oxbVar, context, looper);
                    case 11:
                        vn vnVar3 = (vn) obj;
                        return new d05(126, k05Var, l05Var, oxbVar, context, looper);
                    case 14:
                        vn vnVar4 = (vn) obj;
                        return new hsd(k05Var, l05Var, oxbVar, context, looper);
                    case 15:
                        vn vnVar5 = (vn) obj;
                        return new d05(19, k05Var, l05Var, oxbVar, context, looper);
                    case 17:
                        vn vnVar6 = (vn) obj;
                        return new d05(457, k05Var, l05Var, oxbVar, context, looper);
                    case 19:
                        context.getClass();
                        looper.getClass();
                        oxbVar.getClass();
                        ((vn) obj).getClass();
                        return new d05(380, k05Var, l05Var, oxbVar, context, looper);
                }
            case 7:
                return new p8d(context, looper, oxbVar, (o8d) obj, k05Var, l05Var);
            case 9:
                return new q8d(context, looper, oxbVar, (GoogleSignInOptions) obj, k05Var, l05Var);
            case 10:
                return new d05(40, k05Var, l05Var, oxbVar, context, looper);
            case 12:
                roc rocVar = (roc) obj;
                if (rocVar == null) {
                    rocVar = new roc(new e00());
                }
                return new nad(rocVar.a, k05Var, l05Var, oxbVar, context, looper);
            case 13:
                gd1 gd1Var = (gd1) obj;
                xve.i(gd1Var, "Setting the API options is required.");
                return new bmf(context, looper, oxbVar, gd1Var.a, gd1Var.c, gd1Var.d, k05Var, l05Var);
            case 16:
                gd1 gd1Var2 = (gd1) obj;
                xve.i(gd1Var2, "Setting the API options is required.");
                return new olf(context, looper, oxbVar, gd1Var2.a, gd1Var2.b, gd1Var2.c, k05Var, l05Var);
            case 18:
                pwc pwcVar = (pwc) obj;
                return new ape(k05Var, l05Var, oxbVar, context, looper);
            case 20:
                vn vnVar7 = (vn) obj;
                return new d05(161, k05Var, l05Var, oxbVar, context, looper);
            case 21:
                vn vnVar8 = (vn) obj;
                return new gbd(k05Var, l05Var, oxbVar, context, looper);
            case 22:
                vn vnVar9 = (vn) obj;
                return new d05(148, k05Var, l05Var, oxbVar, context, looper);
        }
    }
}
