package b6;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import h8.o;
import j5.h;
import j8.i;
import k8.a1;
import kotlin.jvm.internal.j;
import m.s3;
import m5.e;
import s5.w;
import s5.x;
import u6.g;
import z5.p;
public final class b {
    public final int f1938a;

    public b(int i10) {
        this.f1938a = i10;
    }

    public com.google.android.gms.common.api.c a(Context context, Looper looper, s3 commonSettings, Object obj, k kVar, l lVar) {
        switch (this.f1938a) {
            case 4:
                o oVar = (o) obj;
                if (oVar == null) {
                    oVar = new o(new a5.c());
                }
                return new q7.b(context, looper, commonSettings, kVar, lVar, oVar.f7914a);
            case 5:
                return new g(context, looper, commonSettings, (i5.b) obj, kVar, lVar);
            case 6:
                return new e(context, looper, commonSettings, (GoogleSignInOptions) obj, kVar, lVar);
            case 7:
                i iVar = (i) obj;
                return new a1(context, looper, kVar, lVar, commonSettings);
            case 8:
            case 9:
            case 13:
            case 15:
            default:
                switch (this.f1938a) {
                    case 0:
                        return new d(context, looper, commonSettings, (p) obj, kVar, lVar);
                    case 1:
                        com.google.android.gms.common.api.a aVar = (com.google.android.gms.common.api.a) obj;
                        return new z5.g(context, looper, 19, commonSettings, kVar, lVar, 0);
                    case 2:
                        com.google.android.gms.common.api.a aVar2 = (com.google.android.gms.common.api.a) obj;
                        return new d7.k(context, looper, kVar, lVar, commonSettings);
                    case 3:
                        com.google.android.gms.common.api.a aVar3 = (com.google.android.gms.common.api.a) obj;
                        return new z5.g(context, looper, 308, commonSettings, kVar, lVar, 0);
                    case 8:
                        com.google.android.gms.common.api.a aVar4 = (com.google.android.gms.common.api.a) obj;
                        return new z5.g(context, looper, 126, commonSettings, kVar, lVar, 0);
                    case 9:
                        com.google.android.gms.common.api.a apiOptions = (com.google.android.gms.common.api.a) obj;
                        j.e(context, "context");
                        j.e(looper, "looper");
                        j.e(commonSettings, "commonSettings");
                        j.e(apiOptions, "apiOptions");
                        return new z5.g(context, looper, 380, commonSettings, kVar, lVar, 0);
                    case 13:
                        com.google.android.gms.common.api.a apiOptions2 = (com.google.android.gms.common.api.a) obj;
                        j.e(context, "context");
                        j.e(looper, "looper");
                        j.e(commonSettings, "commonSettings");
                        j.e(apiOptions2, "apiOptions");
                        return new z5.g(context, looper, 352, commonSettings, kVar, lVar, 0);
                    case 15:
                        h hVar = (h) obj;
                        return new u6.c(context, looper, kVar, lVar, commonSettings);
                    default:
                        throw new UnsupportedOperationException("buildClient must be implemented");
                }
            case 10:
                o5.e eVar = (o5.e) obj;
                z5.l.i(eVar, "Setting the API options is required.");
                return new x(context, looper, commonSettings, eVar.f19249a, 0, eVar.f19251c, eVar.d, kVar, lVar);
            case 11:
                o5.e eVar2 = (o5.e) obj;
                z5.l.i(eVar2, "Setting the API options is required.");
                return new w(context, looper, commonSettings, eVar2.f19249a, 0, eVar2.f19250b, eVar2.f19251c, kVar, lVar);
            case 12:
                com.google.android.gms.common.api.a aVar5 = (com.google.android.gms.common.api.a) obj;
                return new z5.g(context, looper, 161, commonSettings, kVar, lVar, 0);
            case 14:
                return new z5.g(context, looper, 40, commonSettings, kVar, lVar, 0);
            case 16:
                com.google.android.gms.common.api.a aVar6 = (com.google.android.gms.common.api.a) obj;
                return new n7.a(context, looper, kVar, lVar, commonSettings);
            case 17:
                com.google.android.gms.common.api.a aVar7 = (com.google.android.gms.common.api.a) obj;
                return new z5.g(context, looper, 148, commonSettings, kVar, lVar, 0);
            case 18:
                z7.a aVar8 = (z7.a) obj;
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
                return new a8.a(context, looper, commonSettings, bundle, kVar, lVar);
            case 19:
                throw a4.w.j(obj);
        }
    }
}
