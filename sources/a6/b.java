package a6;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.internal.clearcut.b2;
import d6.h;
import g8.o;
import j8.z0;
import k5.e;
import kotlin.jvm.internal.j;
import l7.f;
import m.t3;
import r5.t;
import r5.w;
import r5.x;
import t6.g;
import y5.p;
import y6.l1;

public final class b {

    public final int f102a;

    public b(int i10) {
        this.f102a = i10;
    }

    public com.google.android.gms.common.api.c a(Context context, Looper looper, t3 commonSettings, Object obj, k kVar, l lVar) {
        switch (this.f102a) {
            case 4:
                return new g(context, looper, commonSettings, (g5.c) obj, kVar, lVar);
            case 5:
                return new e(context, looper, commonSettings, (GoogleSignInOptions) obj, kVar, lVar);
            case 6:
                o oVar = (o) obj;
                if (oVar == null) {
                    oVar = new o(new com.google.android.gms.internal.cast.a());
                }
                return new p7.b(context, looper, commonSettings, kVar, lVar, oVar.f6767a);
            case 7:
            case 9:
            case 13:
            case 15:
            default:
                switch (this.f102a) {
                    case 0:
                        return new d(context, looper, commonSettings, (p) obj, kVar, lVar);
                    case 1:
                        return new a7.b(context, looper, 19, commonSettings, kVar, lVar, 0);
                    case 2:
                        return new c7.l(context, looper, kVar, lVar, commonSettings);
                    case 3:
                        return new h(context, looper, 308, commonSettings, kVar, lVar, 0);
                    case 7:
                        return new u6.e(context, looper, 126, commonSettings, kVar, lVar, 0);
                    case 9:
                        com.google.android.gms.common.api.a apiOptions = (com.google.android.gms.common.api.a) obj;
                        j.e(context, "context");
                        j.e(looper, "looper");
                        j.e(commonSettings, "commonSettings");
                        j.e(apiOptions, "apiOptions");
                        return new f(context, looper, 380, commonSettings, kVar, lVar, 0);
                    case 13:
                        com.google.android.gms.common.api.a apiOptions2 = (com.google.android.gms.common.api.a) obj;
                        j.e(context, "context");
                        j.e(looper, "looper");
                        j.e(commonSettings, "commonSettings");
                        j.e(apiOptions2, "apiOptions");
                        return new s6.e(context, looper, 352, commonSettings, kVar, lVar, 0);
                    case 15:
                        return new t6.c(context, looper, kVar, lVar, commonSettings);
                    default:
                        throw new UnsupportedOperationException("buildClient must be implemented");
                }
            case 8:
                return new z0(context, looper, kVar, lVar, commonSettings);
            case 10:
                m5.e eVar = (m5.e) obj;
                y5.l.i(eVar, "Setting the API options is required.");
                return new x(context, looper, commonSettings, eVar.f17766a, 0, eVar.f17768c, eVar.d, kVar, lVar);
            case 11:
                m5.e eVar2 = (m5.e) obj;
                y5.l.i(eVar2, "Setting the API options is required.");
                return new w(context, looper, commonSettings, eVar2.f17766a, 0, eVar2.f17767b, eVar2.f17768c, kVar, lVar);
            case 12:
                return new t(context, looper, 161, commonSettings, kVar, lVar, 0);
            case 14:
                return new b2(context, looper, 40, commonSettings, kVar, lVar, 0);
            case 16:
                return new m7.a(context, looper, kVar, lVar, commonSettings);
            case 17:
                return new l1(context, looper, 148, commonSettings, kVar, lVar, 0);
            case 18:
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
                return new z7.a(context, looper, commonSettings, bundle, kVar, lVar);
            case 19:
                throw a9.p.i(obj);
        }
    }
}
