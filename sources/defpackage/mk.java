package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.webrtc.TextureBufferImpl;
import org.webrtc.VideoFrame;
public final class mk implements Callable {
    public final byte a;
    public final Object b;

    public mk(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final Object call() {
        VideoFrame.I420Buffer lambda$toI420$1;
        byte b = this.a;
        boolean z = true;
        Object obj = this.b;
        switch (b) {
            case 0:
                try {
                    return (Boolean) ((rk) obj).run();
                } catch (Exception e) {
                    cc4.g(e, true);
                    return Boolean.FALSE;
                }
            case 1:
                yy2 yy2Var = (yy2) ((zc1) obj).f;
                yy2Var.getClass();
                rx6.v();
                lh2 lh2Var = yy2Var.c;
                String str = (String) lh2Var.b;
                if (!new File((File) ((gd4) lh2Var.c).c, str).exists()) {
                    if (yy2Var.e() == null || !yy2Var.j.c()) {
                        z = false;
                    }
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    new File((File) ((gd4) lh2Var.c).c, str).delete();
                }
                return Boolean.valueOf(z);
            case 2:
                return new cv5((JsReplyProxyBoundaryInterface) obj);
            case 3:
                oy8 oy8Var = (oy8) ((um4) obj).c;
                sc3 sc3Var = (sc3) oy8Var.f;
                cca ccaVar = (cca) oy8Var.c;
                String str2 = sc3Var.a;
                rx6.w();
                try {
                    HashMap b2 = sc3.b(ccaVar);
                    pm3 pm3Var = new pm3(str2, b2);
                    pm3Var.A("User-Agent", "Crashlytics Android SDK/20.1.1");
                    pm3Var.A("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    sc3.a(pm3Var, ccaVar);
                    String concat = "Requesting settings from ".concat(str2);
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", concat, null);
                    }
                    String str3 = "Settings query params were: " + b2;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str3, null);
                    }
                    return sc3Var.c(pm3Var.s());
                } catch (IOException e2) {
                    Log.e("FirebaseCrashlytics", "Settings request failed.", e2);
                    return null;
                }
            default:
                lambda$toI420$1 = ((TextureBufferImpl) obj).lambda$toI420$1();
                return lambda$toI420$1;
        }
    }
}
