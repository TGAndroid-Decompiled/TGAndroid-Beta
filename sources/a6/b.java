package a6;

import a9.y0;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import e6.e;
import i6.v;
import i6.w;
import k7.g;
import kotlin.jvm.internal.j;
import m.o3;
import p6.h;
import p6.m;
import p6.q;
import x8.o;
public final class b {
    public final int f137a;

    public b(int i3) {
        this.f137a = i3;
    }

    public c a(Context context, Looper looper, o3 commonSettings, Object obj, k kVar, l lVar) {
        switch (this.f137a) {
            case 2:
                e eVar = (e) obj;
                m.h(eVar, "Setting the API options is required.");
                return new w(context, looper, commonSettings, eVar.f9690a, 0, eVar.f9692c, eVar.d, kVar, lVar);
            case 3:
                e eVar2 = (e) obj;
                m.h(eVar2, "Setting the API options is required.");
                return new v(context, looper, commonSettings, eVar2.f9690a, 0, eVar2.f9691b, eVar2.f9692c, kVar, lVar);
            case 4:
                com.google.android.gms.common.api.a aVar = (com.google.android.gms.common.api.a) obj;
                return new h(context, looper, 161, commonSettings, kVar, lVar, 0);
            case 5:
            case 7:
            case 8:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            default:
                switch (this.f137a) {
                    case 0:
                        com.google.android.gms.common.api.a aVar2 = (com.google.android.gms.common.api.a) obj;
                        return new h(context, looper, 126, commonSettings, kVar, lVar, 0);
                    case 1:
                        com.google.android.gms.common.api.a apiOptions = (com.google.android.gms.common.api.a) obj;
                        j.e(context, "context");
                        j.e(looper, "looper");
                        j.e(commonSettings, "commonSettings");
                        j.e(apiOptions, "apiOptions");
                        return new h(context, looper, 380, commonSettings, kVar, lVar, 0);
                    case 2:
                    case 3:
                    case 4:
                    case 6:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    default:
                        throw new UnsupportedOperationException("buildClient must be implemented");
                    case 5:
                        com.google.android.gms.common.api.a apiOptions2 = (com.google.android.gms.common.api.a) obj;
                        j.e(context, "context");
                        j.e(looper, "looper");
                        j.e(commonSettings, "commonSettings");
                        j.e(apiOptions2, "apiOptions");
                        return new h(context, looper, 352, commonSettings, kVar, lVar, 0);
                    case 7:
                        z5.h hVar = (z5.h) obj;
                        return new k7.c(context, looper, kVar, lVar, commonSettings);
                    case 8:
                        com.google.android.gms.common.api.a aVar3 = (com.google.android.gms.common.api.a) obj;
                        return new h(context, looper, 457, commonSettings, kVar, lVar, 0);
                    case 13:
                        com.google.android.gms.common.api.a aVar4 = (com.google.android.gms.common.api.a) obj;
                        return new h(context, looper, 449, commonSettings, kVar, lVar, 0);
                    case 14:
                        return new r6.e(context, looper, commonSettings, (q) obj, kVar, lVar);
                    case 15:
                        com.google.android.gms.common.api.a aVar5 = (com.google.android.gms.common.api.a) obj;
                        return new h(context, looper, 19, commonSettings, kVar, lVar, 0);
                    case 16:
                        com.google.android.gms.common.api.a aVar6 = (com.google.android.gms.common.api.a) obj;
                        return new t7.k(context, looper, kVar, lVar, commonSettings);
                    case 17:
                        com.google.android.gms.common.api.a aVar7 = (com.google.android.gms.common.api.a) obj;
                        return new h(context, looper, 308, commonSettings, kVar, lVar, 0);
                }
            case 6:
                return new h(context, looper, 40, commonSettings, kVar, lVar, 0);
            case 9:
                com.google.android.gms.common.api.a aVar8 = (com.google.android.gms.common.api.a) obj;
                return new d8.a(context, looper, kVar, lVar, commonSettings);
            case 10:
                com.google.android.gms.common.api.a aVar9 = (com.google.android.gms.common.api.a) obj;
                return new h(context, looper, 148, commonSettings, kVar, lVar, 0);
            case 11:
                p8.a aVar10 = (p8.a) obj;
                commonSettings.getClass();
                Integer num = (Integer) commonSettings.f18687g;
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
                return new q8.a(context, looper, commonSettings, bundle, kVar, lVar);
            case 12:
                obj.getClass();
                throw new ClassCastException();
            case 18:
                o oVar = (o) obj;
                if (oVar == null) {
                    oVar = new o(new a7.l());
                }
                return new g8.b(context, looper, commonSettings, kVar, lVar, oVar.f58567a);
            case 19:
                return new g(context, looper, commonSettings, (y5.b) obj, kVar, lVar);
            case 20:
                return new c6.e(context, looper, commonSettings, (GoogleSignInOptions) obj, kVar, lVar);
            case 21:
                z8.b bVar = (z8.b) obj;
                return new y0(context, looper, kVar, lVar, commonSettings);
        }
    }
}
