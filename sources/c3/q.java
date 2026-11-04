package c3;

import android.content.res.Resources;
import android.util.Base64;
import g9.x1;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
public final class q implements f9.t {
    public final int f4102a;

    public q(int i3) {
        this.f4102a = i3;
    }

    @Override
    public final Object get() {
        Object a0Var;
        switch (this.f4102a) {
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
                if (newSingleThreadExecutor instanceof l9.z) {
                    return (l9.z) newSingleThreadExecutor;
                }
                if (newSingleThreadExecutor instanceof ScheduledExecutorService) {
                    a0Var = new l9.d0((ScheduledExecutorService) newSingleThreadExecutor);
                } else {
                    a0Var = new l9.a0(newSingleThreadExecutor);
                }
                return a0Var;
            case 3:
                return new k2.h(new a3.e(), 1000, 1000, 1000, 2000, 1000, true, x1.h);
            case 4:
                byte[] bArr = new byte[12];
                l2.h.f17707i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            default:
                Resources system = Resources.getSystem();
                int i3 = system.getDisplayMetrics().widthPixels;
                try {
                    i3 = system.getDimensionPixelSize(system.getIdentifier("config_mediaMetadataBitmapMaxSize", "dimen", "android"));
                } catch (Resources.NotFoundException unused) {
                }
                return Integer.valueOf(i3);
        }
    }
}
