package a9;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import b9.y0;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import j6.v;
import j6.w;
import kotlin.jvm.internal.j;
import m.q3;
import q6.m;
import q6.q;
import y8.o;
public final class e {
    public final int f758a;

    public e(int i7) {
        this.f758a = i7;
    }

    public com.google.android.gms.common.api.c a(Context context, Looper looper, q3 commonSettings, Object obj, k kVar, l lVar) {
        switch (this.f758a) {
            case 0:
                b bVar = (b) obj;
                return new y0(context, looper, kVar, lVar, commonSettings);
            case 1:
            case 2:
            case 3:
            case 7:
            case 9:
            case 10:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            default:
                switch (this.f758a) {
                    case 1:
                        com.google.android.gms.common.api.a aVar = (com.google.android.gms.common.api.a) obj;
                        return new q6.h(context, looper, 126, commonSettings, kVar, lVar, 0);
                    case 2:
                        com.google.android.gms.common.api.a apiOptions = (com.google.android.gms.common.api.a) obj;
                        j.e(context, "context");
                        j.e(looper, "looper");
                        j.e(commonSettings, "commonSettings");
                        j.e(apiOptions, "apiOptions");
                        return new q6.h(context, looper, 380, commonSettings, kVar, lVar, 0);
                    case 3:
                        com.google.android.gms.common.api.a apiOptions2 = (com.google.android.gms.common.api.a) obj;
                        j.e(context, "context");
                        j.e(looper, "looper");
                        j.e(commonSettings, "commonSettings");
                        j.e(apiOptions2, "apiOptions");
                        return new q6.h(context, looper, 429, commonSettings, kVar, lVar, 0);
                    case 4:
                    case 5:
                    case 6:
                    case 8:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    default:
                        throw new UnsupportedOperationException("buildClient must be implemented");
                    case 7:
                        com.google.android.gms.common.api.a apiOptions3 = (com.google.android.gms.common.api.a) obj;
                        j.e(context, "context");
                        j.e(looper, "looper");
                        j.e(commonSettings, "commonSettings");
                        j.e(apiOptions3, "apiOptions");
                        return new q6.h(context, looper, 352, commonSettings, kVar, lVar, 0);
                    case 9:
                        a6.h hVar = (a6.h) obj;
                        return new l7.c(context, looper, kVar, lVar, commonSettings);
                    case 10:
                        com.google.android.gms.common.api.a aVar2 = (com.google.android.gms.common.api.a) obj;
                        return new q6.h(context, looper, 457, commonSettings, kVar, lVar, 0);
                    case 15:
                        com.google.android.gms.common.api.a aVar3 = (com.google.android.gms.common.api.a) obj;
                        return new q6.h(context, looper, 449, commonSettings, kVar, lVar, 0);
                    case 16:
                        return new s6.e(context, looper, commonSettings, (q) obj, kVar, lVar);
                    case 17:
                        com.google.android.gms.common.api.a aVar4 = (com.google.android.gms.common.api.a) obj;
                        return new q6.h(context, looper, 19, commonSettings, kVar, lVar, 0);
                    case 18:
                        com.google.android.gms.common.api.a aVar5 = (com.google.android.gms.common.api.a) obj;
                        return new u7.k(context, looper, kVar, lVar, commonSettings);
                    case 19:
                        com.google.android.gms.common.api.a aVar6 = (com.google.android.gms.common.api.a) obj;
                        return new q6.h(context, looper, 308, commonSettings, kVar, lVar, 0);
                }
            case 4:
                f6.e eVar = (f6.e) obj;
                m.h(eVar, "Setting the API options is required.");
                return new w(context, looper, commonSettings, eVar.f11247a, 0, eVar.f11249c, eVar.d, kVar, lVar);
            case 5:
                f6.e eVar2 = (f6.e) obj;
                m.h(eVar2, "Setting the API options is required.");
                return new v(context, looper, commonSettings, eVar2.f11247a, 0, eVar2.f11248b, eVar2.f11249c, kVar, lVar);
            case 6:
                com.google.android.gms.common.api.a aVar7 = (com.google.android.gms.common.api.a) obj;
                return new q6.h(context, looper, 161, commonSettings, kVar, lVar, 0);
            case 8:
                return new q6.h(context, looper, 40, commonSettings, kVar, lVar, 0);
            case 11:
                com.google.android.gms.common.api.a aVar8 = (com.google.android.gms.common.api.a) obj;
                return new e8.a(context, looper, kVar, lVar, commonSettings);
            case 12:
                com.google.android.gms.common.api.a aVar9 = (com.google.android.gms.common.api.a) obj;
                return new q6.h(context, looper, 148, commonSettings, kVar, lVar, 0);
            case 13:
                q8.a aVar10 = (q8.a) obj;
                commonSettings.getClass();
                Integer num = (Integer) commonSettings.f19230g;
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
                return new r8.a(context, looper, commonSettings, bundle, kVar, lVar);
            case 14:
                obj.getClass();
                throw new ClassCastException();
            case 20:
                o oVar = (o) obj;
                if (oVar == null) {
                    oVar = new o(new b7.l());
                }
                return new h8.b(context, looper, commonSettings, kVar, lVar, oVar.f59191a);
            case 21:
                return new l7.g(context, looper, commonSettings, (z5.b) obj, kVar, lVar);
            case 22:
                return new d6.e(context, looper, commonSettings, (GoogleSignInOptions) obj, kVar, lVar);
        }
    }
}
