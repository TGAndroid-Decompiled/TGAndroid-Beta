package a8;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import g6.v;
import g6.w;
import kotlin.jvm.internal.i;
import m.p3;
import n6.p;
import v8.o;
import y8.y0;
public final class d {
    public final int f319a;

    public d(int i10) {
        this.f319a = i10;
    }

    public com.google.android.gms.common.api.c a(Context context, Looper looper, p3 commonSettings, Object obj, k kVar, l lVar) {
        switch (this.f319a) {
            case 1:
                c6.e eVar = (c6.e) obj;
                n6.l.i(eVar, "Setting the API options is required.");
                return new w(context, looper, commonSettings, eVar.f4487a, 0, eVar.f4489c, eVar.d, kVar, lVar);
            case 2:
                c6.e eVar2 = (c6.e) obj;
                n6.l.i(eVar2, "Setting the API options is required.");
                return new v(context, looper, commonSettings, eVar2.f4487a, 0, eVar2.f4488b, eVar2.f4489c, kVar, lVar);
            case 3:
                com.google.android.gms.common.api.a aVar = (com.google.android.gms.common.api.a) obj;
                return new n6.g(context, looper, 161, commonSettings, kVar, lVar, 0);
            case 4:
            case 6:
            case 11:
            case 12:
            case 13:
            case 14:
            default:
                switch (this.f319a) {
                    case 0:
                        com.google.android.gms.common.api.a apiOptions = (com.google.android.gms.common.api.a) obj;
                        i.e(context, "context");
                        i.e(looper, "looper");
                        i.e(commonSettings, "commonSettings");
                        i.e(apiOptions, "apiOptions");
                        return new n6.g(context, looper, 380, commonSettings, kVar, lVar, 0);
                    case 4:
                        com.google.android.gms.common.api.a apiOptions2 = (com.google.android.gms.common.api.a) obj;
                        i.e(context, "context");
                        i.e(looper, "looper");
                        i.e(commonSettings, "commonSettings");
                        i.e(apiOptions2, "apiOptions");
                        return new n6.g(context, looper, 352, commonSettings, kVar, lVar, 0);
                    case 6:
                        x5.i iVar = (x5.i) obj;
                        return new i7.c(context, looper, kVar, lVar, commonSettings);
                    case 11:
                        return new p6.c(context, looper, commonSettings, (p) obj, kVar, lVar);
                    case 12:
                        com.google.android.gms.common.api.a aVar2 = (com.google.android.gms.common.api.a) obj;
                        return new n6.g(context, looper, 19, commonSettings, kVar, lVar, 0);
                    case 13:
                        com.google.android.gms.common.api.a aVar3 = (com.google.android.gms.common.api.a) obj;
                        return new r7.k(context, looper, kVar, lVar, commonSettings);
                    case 14:
                        com.google.android.gms.common.api.a aVar4 = (com.google.android.gms.common.api.a) obj;
                        return new n6.g(context, looper, 308, commonSettings, kVar, lVar, 0);
                    case 19:
                        com.google.android.gms.common.api.a aVar5 = (com.google.android.gms.common.api.a) obj;
                        return new n6.g(context, looper, 126, commonSettings, kVar, lVar, 0);
                    default:
                        throw new UnsupportedOperationException("buildClient must be implemented");
                }
            case 5:
                return new n6.g(context, looper, 40, commonSettings, kVar, lVar, 0);
            case 7:
                com.google.android.gms.common.api.a aVar6 = (com.google.android.gms.common.api.a) obj;
                return new b8.a(context, looper, kVar, lVar, commonSettings);
            case 8:
                com.google.android.gms.common.api.a aVar7 = (com.google.android.gms.common.api.a) obj;
                return new n6.g(context, looper, 148, commonSettings, kVar, lVar, 0);
            case 9:
                n8.a aVar8 = (n8.a) obj;
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
                return new o8.a(context, looper, commonSettings, bundle, kVar, lVar);
            case 10:
                throw a4.a.j(obj);
            case 15:
                o oVar = (o) obj;
                if (oVar == null) {
                    oVar = new o(new com.google.android.gms.internal.cast.a());
                }
                return new e8.b(context, looper, commonSettings, kVar, lVar, oVar.f47737a);
            case 16:
                return new i7.g(context, looper, commonSettings, (w5.b) obj, kVar, lVar);
            case 17:
                return new a6.e(context, looper, commonSettings, (GoogleSignInOptions) obj, kVar, lVar);
            case 18:
                x8.i iVar2 = (x8.i) obj;
                return new y0(context, looper, kVar, lVar, commonSettings);
        }
    }
}
