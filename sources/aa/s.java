package aa;

import ai.j1;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.telegram.ui.Dictation.DictationAsr;
public final class s implements Callable {
    public final int f852a;
    public final Object f853b;

    public s(Object obj, int i7) {
        this.f852a = i7;
        this.f853b = obj;
    }

    @Override
    public final Object call() {
        switch (this.f852a) {
            case 0:
                p pVar = ((t) this.f853b).f858f;
                pVar.getClass();
                ba.e.a();
                wf.b bVar = pVar.f833c;
                ga.d dVar = (ga.d) bVar.f59108c;
                String str = (String) bVar.f59107b;
                dVar.getClass();
                boolean z10 = true;
                if (!new File((File) dVar.d, str).exists()) {
                    String g10 = pVar.g();
                    if (g10 == null || !pVar.f838j.c(g10)) {
                        z10 = false;
                    }
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    ga.d dVar2 = (ga.d) bVar.f59108c;
                    dVar2.getClass();
                    new File((File) dVar2.d, str).delete();
                }
                return Boolean.valueOf(z10);
            case 1:
                ai.t[] tVarArr = DictationAsr.f42579a;
                return Integer.valueOf(DictationAsr.u("silero_vad.onnx", j1.f((ArrayList) this.f853b, "silero-vad"), null));
            case 2:
                return new e5.f((JsReplyProxyBoundaryInterface) this.f853b);
            default:
                ia.c cVar = (ia.c) ((q4.q) this.f853b).f55253c;
                f5.g gVar = (f5.g) cVar.f15877f;
                ia.f fVar = (ia.f) cVar.f15874b;
                String str2 = gVar.f10981a;
                ba.e.b();
                try {
                    HashMap c10 = f5.g.c(fVar);
                    android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(str2, c10);
                    a0Var.m("User-Agent", "Crashlytics Android SDK/20.1.1");
                    a0Var.m("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    f5.g.b(a0Var, fVar);
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
