package d5;

import android.support.v4.media.session.a0;
import android.util.Log;
import be.t;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import p4.q;
import z9.p;
public final class f implements Callable {
    public final int f8572a;
    public final Object f8573b;

    public f(Object obj, int i3) {
        this.f8572a = i3;
        this.f8573b = obj;
    }

    @Override
    public final Object call() {
        switch (this.f8572a) {
            case 0:
                return new g((JsReplyProxyBoundaryInterface) this.f8573b);
            case 1:
                ha.c cVar = (ha.c) ((q) this.f8573b).f53182b;
                t tVar = (t) cVar.f14376f;
                ha.e eVar = (ha.e) cVar.f14373b;
                String str = tVar.f3285b;
                aa.g.b();
                try {
                    HashMap b10 = t.b(eVar);
                    a0 a0Var = new a0(str, b10);
                    a0Var.n("User-Agent", "Crashlytics Android SDK/20.1.1");
                    a0Var.n("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    t.a(a0Var, eVar);
                    String str2 = "Requesting settings from " + str;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str2, null);
                    }
                    String str3 = "Settings query params were: " + b10;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str3, null);
                    }
                    return tVar.c(a0Var.g());
                } catch (IOException e10) {
                    Log.e("FirebaseCrashlytics", "Settings request failed.", e10);
                    return null;
                }
            default:
                z9.m mVar = ((p) this.f8573b).f60220f;
                mVar.getClass();
                aa.g.a();
                w9.b bVar = mVar.f60197c;
                fa.f fVar = (fa.f) bVar.f57425c;
                String str4 = (String) bVar.f57424b;
                fVar.getClass();
                boolean z10 = true;
                if (!new File((File) fVar.d, str4).exists()) {
                    String g7 = mVar.g();
                    if (g7 == null || !mVar.f60202j.c(g7)) {
                        z10 = false;
                    }
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    fa.f fVar2 = (fa.f) bVar.f57425c;
                    fVar2.getClass();
                    new File((File) fVar2.d, str4).delete();
                }
                return Boolean.valueOf(z10);
        }
    }
}
