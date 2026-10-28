package a3;

import android.content.res.Resources;
import android.util.Base64;
import f9.x1;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
public final class s implements e9.t {
    public final int f190a;

    public s(int i10) {
        this.f190a = i10;
    }

    @Override
    public final Object get() {
        Object a0Var;
        switch (this.f190a) {
            case 0:
                try {
                    return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            case 1:
                throw new IllegalStateException();
            case 2:
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                if (newSingleThreadExecutor instanceof k9.z) {
                    return (k9.z) newSingleThreadExecutor;
                }
                if (newSingleThreadExecutor instanceof ScheduledExecutorService) {
                    a0Var = new k9.d0((ScheduledExecutorService) newSingleThreadExecutor);
                } else {
                    a0Var = new k9.a0(newSingleThreadExecutor);
                }
                return a0Var;
            case 3:
                return new i2.i(new y2.d(), 1000, 1000, 1000, 2000, 1000, true, x1.h);
            case 4:
                byte[] bArr = new byte[12];
                j2.g.f15207i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            default:
                Resources system = Resources.getSystem();
                int i10 = system.getDisplayMetrics().widthPixels;
                try {
                    i10 = system.getDimensionPixelSize(system.getIdentifier("config_mediaMetadataBitmapMaxSize", "dimen", "android"));
                } catch (Resources.NotFoundException unused) {
                }
                return Integer.valueOf(i10);
        }
    }
}
