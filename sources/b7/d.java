package b7;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import i8.a1;
import m.t3;
public final class d {
    public final int f1555a;

    public d(int i9) {
        this.f1555a = i9;
    }

    public com.google.android.gms.common.api.c a(Context context, Looper looper, t3 commonSettings, Object obj, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar) {
        switch (this.f1555a) {
            case 2:
                f8.o oVar = (f8.o) obj;
                if (oVar == null) {
                    oVar = new f8.o(new com.google.android.gms.internal.cast.a());
                }
                return new o7.b(context, looper, commonSettings, kVar, lVar, oVar.f5966a);
            case 3:
                return new s6.g(context, looper, commonSettings, (g5.c) obj, kVar, lVar);
            case 4:
                return new k5.e(context, looper, commonSettings, (GoogleSignInOptions) obj, kVar, lVar);
            case 5:
                h8.i iVar = (h8.i) obj;
                return new a1(context, looper, kVar, lVar, commonSettings);
            case 6:
            case 7:
            case 11:
            case 13:
            default:
                switch (this.f1555a) {
                    case 0:
                        com.google.android.gms.common.api.a aVar = (com.google.android.gms.common.api.a) obj;
                        return new m(context, looper, kVar, lVar, commonSettings);
                    case 1:
                        com.google.android.gms.common.api.a aVar2 = (com.google.android.gms.common.api.a) obj;
                        return new x5.g(context, looper, 308, commonSettings, kVar, lVar, 0);
                    case 6:
                        com.google.android.gms.common.api.a aVar3 = (com.google.android.gms.common.api.a) obj;
                        return new x5.g(context, looper, 126, commonSettings, kVar, lVar, 0);
                    case 7:
                        com.google.android.gms.common.api.a apiOptions = (com.google.android.gms.common.api.a) obj;
                        kotlin.jvm.internal.i.e(context, "context");
                        kotlin.jvm.internal.i.e(looper, "looper");
                        kotlin.jvm.internal.i.e(commonSettings, "commonSettings");
                        kotlin.jvm.internal.i.e(apiOptions, "apiOptions");
                        return new x5.g(context, looper, 380, commonSettings, kVar, lVar, 0);
                    case 11:
                        com.google.android.gms.common.api.a apiOptions2 = (com.google.android.gms.common.api.a) obj;
                        kotlin.jvm.internal.i.e(context, "context");
                        kotlin.jvm.internal.i.e(looper, "looper");
                        kotlin.jvm.internal.i.e(commonSettings, "commonSettings");
                        kotlin.jvm.internal.i.e(apiOptions2, "apiOptions");
                        return new x5.g(context, looper, 352, commonSettings, kVar, lVar, 0);
                    case 13:
                        h5.i iVar2 = (h5.i) obj;
                        return new s6.c(context, looper, kVar, lVar, commonSettings);
                    case 18:
                        return new z5.c(context, looper, commonSettings, (x5.p) obj, kVar, lVar);
                    case 19:
                        com.google.android.gms.common.api.a aVar4 = (com.google.android.gms.common.api.a) obj;
                        return new x5.g(context, looper, 19, commonSettings, kVar, lVar, 0);
                    default:
                        throw new UnsupportedOperationException("buildClient must be implemented");
                }
            case 8:
                m5.e eVar = (m5.e) obj;
                x5.l.i(eVar, "Setting the API options is required.");
                return new q5.x(context, looper, commonSettings, eVar.f17389a, 0, eVar.f17391c, eVar.d, kVar, lVar);
            case 9:
                m5.e eVar2 = (m5.e) obj;
                x5.l.i(eVar2, "Setting the API options is required.");
                return new q5.w(context, looper, commonSettings, eVar2.f17389a, 0, eVar2.f17390b, eVar2.f17391c, kVar, lVar);
            case 10:
                com.google.android.gms.common.api.a aVar5 = (com.google.android.gms.common.api.a) obj;
                return new x5.g(context, looper, 161, commonSettings, kVar, lVar, 0);
            case 12:
                return new x5.g(context, looper, 40, commonSettings, kVar, lVar, 0);
            case 14:
                com.google.android.gms.common.api.a aVar6 = (com.google.android.gms.common.api.a) obj;
                return new l7.a(context, looper, kVar, lVar, commonSettings);
            case 15:
                com.google.android.gms.common.api.a aVar7 = (com.google.android.gms.common.api.a) obj;
                return new x5.g(context, looper, 148, commonSettings, kVar, lVar, 0);
            case 16:
                x7.a aVar8 = (x7.a) obj;
                commonSettings.getClass();
                Integer num = (Integer) commonSettings.h;
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
                return new y7.a(context, looper, commonSettings, bundle, kVar, lVar);
            case 17:
                throw aa.d.j(obj);
        }
    }
}
