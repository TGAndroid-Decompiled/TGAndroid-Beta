package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.util.Base64;
import j$.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
public final class m40 implements mfb {
    public final byte a;

    public m40(byte b) {
        this.a = b;
    }

    @Override
    public final Object get() {
        boolean z;
        Object ah7Var;
        switch (this.a) {
            case 0:
                if (Build.VERSION.SDK_INT > 37 && Objects.equals(gcc.J("persist.audio.compressed_offload_implicit_aac"), "false")) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                if (newSingleThreadExecutor instanceof ah7) {
                    return (ah7) newSingleThreadExecutor;
                }
                if (newSingleThreadExecutor instanceof ScheduledExecutorService) {
                    ah7Var = new dh7((ScheduledExecutorService) newSingleThreadExecutor);
                } else {
                    ah7Var = new ah7(newSingleThreadExecutor);
                }
                return ah7Var;
            case 2:
                byte[] bArr = new byte[12];
                nc3.i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 3:
                return new ec3(new cf0(), 50000, 1000, 50000, 50000, 1000, 1000, 2000, 1000, true, o99.h);
            case 4:
                String J = gcc.J("ro.vendor.api_level");
                if (J == null) {
                    J = "";
                }
                return ype.f(J);
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
                    vr9.l(e);
                    return null;
                }
            default:
                throw new IllegalStateException();
        }
    }
}
