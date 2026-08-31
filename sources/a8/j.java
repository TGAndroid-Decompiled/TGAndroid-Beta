package a8;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import b6.m;
import b6.q;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import j8.o;
import m.r3;
import m8.z0;
import u5.w;
import u5.x;
public final class j {
    public final int f154a;

    public j(int i10) {
        this.f154a = i10;
    }

    public com.google.android.gms.common.api.c a(Context context, Looper looper, r3 commonSettings, Object obj, k kVar, l lVar) {
        switch (this.f154a) {
            case 0:
                com.google.android.gms.common.api.a aVar = (com.google.android.gms.common.api.a) obj;
                return new p7.a(context, looper, kVar, lVar, commonSettings);
            case 1:
                com.google.android.gms.common.api.a aVar2 = (com.google.android.gms.common.api.a) obj;
                return new b6.g(context, looper, 148, commonSettings, kVar, lVar, 0);
            case 2:
                b8.a aVar3 = (b8.a) obj;
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
                return new c8.a(context, looper, commonSettings, bundle, kVar, lVar);
            case 3:
                throw android.support.v4.media.a.j(obj);
            case 4:
            case 5:
            case 6:
            case 7:
            case 12:
            case 13:
            case 17:
            default:
                switch (this.f154a) {
                    case 4:
                        return new d6.c(context, looper, commonSettings, (q) obj, kVar, lVar);
                    case 5:
                        com.google.android.gms.common.api.a aVar4 = (com.google.android.gms.common.api.a) obj;
                        return new b6.g(context, looper, 19, commonSettings, kVar, lVar, 0);
                    case 6:
                        com.google.android.gms.common.api.a aVar5 = (com.google.android.gms.common.api.a) obj;
                        return new f7.l(context, looper, kVar, lVar, commonSettings);
                    case 7:
                        com.google.android.gms.common.api.a aVar6 = (com.google.android.gms.common.api.a) obj;
                        return new b6.g(context, looper, 308, commonSettings, kVar, lVar, 0);
                    case 12:
                        com.google.android.gms.common.api.a aVar7 = (com.google.android.gms.common.api.a) obj;
                        return new b6.g(context, looper, 126, commonSettings, kVar, lVar, 0);
                    case 13:
                        com.google.android.gms.common.api.a apiOptions = (com.google.android.gms.common.api.a) obj;
                        kotlin.jvm.internal.j.e(context, "context");
                        kotlin.jvm.internal.j.e(looper, "looper");
                        kotlin.jvm.internal.j.e(commonSettings, "commonSettings");
                        kotlin.jvm.internal.j.e(apiOptions, "apiOptions");
                        return new b6.g(context, looper, 380, commonSettings, kVar, lVar, 0);
                    case 17:
                        com.google.android.gms.common.api.a apiOptions2 = (com.google.android.gms.common.api.a) obj;
                        kotlin.jvm.internal.j.e(context, "context");
                        kotlin.jvm.internal.j.e(looper, "looper");
                        kotlin.jvm.internal.j.e(commonSettings, "commonSettings");
                        kotlin.jvm.internal.j.e(apiOptions2, "apiOptions");
                        return new b6.g(context, looper, 352, commonSettings, kVar, lVar, 0);
                    case 19:
                        l5.h hVar = (l5.h) obj;
                        return new w6.c(context, looper, kVar, lVar, commonSettings);
                    default:
                        throw new UnsupportedOperationException("buildClient must be implemented");
                }
            case 8:
                o oVar = (o) obj;
                if (oVar == null) {
                    oVar = new o(new c5.c());
                }
                return new s7.b(context, looper, commonSettings, kVar, lVar, oVar.f9921a);
            case 9:
                return new w6.g(context, looper, commonSettings, (k5.b) obj, kVar, lVar);
            case 10:
                return new o5.e(context, looper, commonSettings, (GoogleSignInOptions) obj, kVar, lVar);
            case 11:
                l8.i iVar = (l8.i) obj;
                return new z0(context, looper, kVar, lVar, commonSettings);
            case 14:
                q5.e eVar = (q5.e) obj;
                m.i(eVar, "Setting the API options is required.");
                return new x(context, looper, commonSettings, eVar.f44537a, 0, eVar.f44539c, eVar.d, kVar, lVar);
            case 15:
                q5.e eVar2 = (q5.e) obj;
                m.i(eVar2, "Setting the API options is required.");
                return new w(context, looper, commonSettings, eVar2.f44537a, 0, eVar2.f44538b, eVar2.f44539c, kVar, lVar);
            case 16:
                com.google.android.gms.common.api.a aVar8 = (com.google.android.gms.common.api.a) obj;
                return new b6.g(context, looper, 161, commonSettings, kVar, lVar, 0);
            case 18:
                return new b6.g(context, looper, 40, commonSettings, kVar, lVar, 0);
        }
    }
}
