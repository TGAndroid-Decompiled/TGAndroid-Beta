package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.util.Base64;
import j$.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
public final class k50 implements sdb {
    public final byte a;

    public k50(byte b) {
        this.a = b;
    }

    @Override
    public final Object get() {
        boolean z;
        Object tg7Var;
        switch (this.a) {
            case 0:
                if (Build.VERSION.SDK_INT > 37 && Objects.equals(hac.J("persist.audio.compressed_offload_implicit_aac"), "false")) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                if (newSingleThreadExecutor instanceof tg7) {
                    return (tg7) newSingleThreadExecutor;
                }
                if (newSingleThreadExecutor instanceof ScheduledExecutorService) {
                    tg7Var = new wg7((ScheduledExecutorService) newSingleThreadExecutor);
                } else {
                    tg7Var = new tg7(newSingleThreadExecutor);
                }
                return tg7Var;
            case 2:
                byte[] bArr = new byte[12];
                gd3.i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 3:
                return new xc3(new ag0(), 50000, 1000, 50000, 50000, 1000, 1000, 2000, 1000, true, d89.h);
            case 4:
                String J = hac.J("ro.vendor.api_level");
                if (J == null) {
                    J = "";
                }
                return ine.f(J);
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
                    dq9.o(e);
                    return null;
                }
            default:
                throw new IllegalStateException();
        }
    }
}
