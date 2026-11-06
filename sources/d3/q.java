package d3;

import android.content.res.Resources;
import android.util.Base64;
import h9.y1;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
public final class q implements g9.u {
    public final int f8076a;

    public q(int i7) {
        this.f8076a = i7;
    }

    @Override
    public final Object get() {
        Object a0Var;
        switch (this.f8076a) {
            case 0:
                try {
                    return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
            case 1:
                throw new IllegalStateException();
            case 2:
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                if (newSingleThreadExecutor instanceof m9.z) {
                    return (m9.z) newSingleThreadExecutor;
                }
                if (newSingleThreadExecutor instanceof ScheduledExecutorService) {
                    a0Var = new m9.d0((ScheduledExecutorService) newSingleThreadExecutor);
                } else {
                    a0Var = new m9.a0(newSingleThreadExecutor);
                }
                return a0Var;
            case 3:
                return new l2.h(new b3.e(), 1000, 1000, 1000, 2000, 1000, true, y1.h);
            case 4:
                byte[] bArr = new byte[12];
                m2.g.f19538i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            default:
                Resources system = Resources.getSystem();
                int i7 = system.getDisplayMetrics().widthPixels;
                try {
                    i7 = system.getDimensionPixelSize(system.getIdentifier("config_mediaMetadataBitmapMaxSize", "dimen", "android"));
                } catch (Resources.NotFoundException unused) {
                }
                return Integer.valueOf(i7);
        }
    }
}
