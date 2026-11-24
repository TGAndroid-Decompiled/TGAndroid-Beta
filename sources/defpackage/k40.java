package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.util.Base64;
import j$.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
public final class k40 implements qbb {
    public final byte a;

    public k40(byte b) {
        this.a = b;
    }

    @Override
    public final Object get() {
        boolean z;
        Object re7Var;
        switch (this.a) {
            case 0:
                if (Build.VERSION.SDK_INT > 37 && Objects.equals(g8c.J("persist.audio.compressed_offload_implicit_aac"), "false")) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                if (newSingleThreadExecutor instanceof re7) {
                    return (re7) newSingleThreadExecutor;
                }
                if (newSingleThreadExecutor instanceof ScheduledExecutorService) {
                    re7Var = new ue7((ScheduledExecutorService) newSingleThreadExecutor);
                } else {
                    re7Var = new re7(newSingleThreadExecutor);
                }
                return re7Var;
            case 2:
                byte[] bArr = new byte[12];
                ub3.i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 3:
                return new lb3(new af0(), 50000, 1000, 50000, 50000, 1000, 1000, 2000, 1000, true, b69.h);
            case 4:
                String J = g8c.J("ro.vendor.api_level");
                if (J == null) {
                    J = "";
                }
                return gle.f(J);
            case 5:
                Resources system = Resources.getSystem();
                int i = system.getDisplayMetrics().widthPixels;
                try {
                    i = system.getDimensionPixelSize(system.getIdentifier("config_mediaMetadataBitmapMaxSize", "dimen", "android"));
                } catch (Resources.NotFoundException unused) {
                }
                return Integer.valueOf(i);
            case 6:
                try {
                    return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                } catch (Exception e) {
                    ho9.n(e);
                    return null;
                }
            default:
                throw new IllegalStateException();
        }
    }
}
