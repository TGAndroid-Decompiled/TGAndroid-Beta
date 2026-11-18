package aa;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
public final class s implements Callable {
    public final int f851a;
    public final Object f852b;

    public s(Object obj, int i7) {
        this.f851a = i7;
        this.f852b = obj;
    }

    @Override
    public final Object call() {
        switch (this.f851a) {
            case 0:
                p pVar = ((t) this.f852b).f857f;
                pVar.getClass();
                ba.e.a();
                wf.b bVar = pVar.f832c;
                ga.d dVar = (ga.d) bVar.f59674c;
                String str = (String) bVar.f59673b;
                dVar.getClass();
                boolean z10 = true;
                if (!new File((File) dVar.d, str).exists()) {
                    String g10 = pVar.g();
                    if (g10 == null || !pVar.f837j.c(g10)) {
                        z10 = false;
                    }
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    ga.d dVar2 = (ga.d) bVar.f59674c;
                    dVar2.getClass();
                    new File((File) dVar2.d, str).delete();
                }
                return Boolean.valueOf(z10);
            case 1:
                return new e5.f((JsReplyProxyBoundaryInterface) this.f852b);
            default:
                ia.c cVar = (ia.c) ((q4.q) this.f852b).f55827c;
                f5.g gVar = (f5.g) cVar.f16192f;
                ia.e eVar = (ia.e) cVar.f16189b;
                String str2 = gVar.f11286a;
                ba.e.b();
                try {
                    HashMap c10 = f5.g.c(eVar);
                    android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(str2, c10);
                    a0Var.m("User-Agent", "Crashlytics Android SDK/20.1.1");
                    a0Var.m("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    f5.g.b(a0Var, eVar);
                    String str3 = "Requesting settings from " + str2;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str3, null);
                    }
                    String str4 = "Settings query params were: " + c10;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str4, null);
                    }
                    return gVar.d(a0Var.h());
                } catch (IOException e10) {
                    Log.e("FirebaseCrashlytics", "Settings request failed.", e10);
                    return null;
                }
        }
    }
}
