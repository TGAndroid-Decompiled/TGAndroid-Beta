package aa;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
public final class t implements Callable {
    public final int f855a;
    public final Object f856b;

    public t(Object obj, int i7) {
        this.f855a = i7;
        this.f856b = obj;
    }

    @Override
    public final Object call() {
        switch (this.f855a) {
            case 0:
                q qVar = ((u) this.f856b).f861f;
                qVar.getClass();
                ba.e.a();
                wf.b bVar = qVar.f836c;
                ga.d dVar = (ga.d) bVar.f57564c;
                String str = (String) bVar.f57563b;
                dVar.getClass();
                boolean z9 = true;
                if (!new File((File) dVar.d, str).exists()) {
                    String g10 = qVar.g();
                    if (g10 == null || !qVar.f841j.c(g10)) {
                        z9 = false;
                    }
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    ga.d dVar2 = (ga.d) bVar.f57564c;
                    dVar2.getClass();
                    new File((File) dVar2.d, str).delete();
                }
                return Boolean.valueOf(z9);
            case 1:
                return new e5.f((JsReplyProxyBoundaryInterface) this.f856b);
            default:
                ia.c cVar = (ia.c) ((q4.q) this.f856b).f53712c;
                g9.l lVar = (g9.l) cVar.f15419f;
                ia.e eVar = (ia.e) cVar.f15416b;
                String str2 = lVar.f13591a;
                ba.e.b();
                try {
                    HashMap c10 = g9.l.c(eVar);
                    android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(str2, c10);
                    a0Var.l("User-Agent", "Crashlytics Android SDK/20.1.1");
                    a0Var.l("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    g9.l.b(a0Var, eVar);
                    String str3 = "Requesting settings from " + str2;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str3, null);
                    }
                    String str4 = "Settings query params were: " + c10;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str4, null);
                    }
                    return lVar.d(a0Var.h());
                } catch (IOException e10) {
                    Log.e("FirebaseCrashlytics", "Settings request failed.", e10);
                    return null;
                }
        }
    }
}
