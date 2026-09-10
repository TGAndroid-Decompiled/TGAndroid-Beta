package a3;

import android.util.Base64;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
public final class s implements d9.i {
    public final int f186a;

    public s(int i10) {
        this.f186a = i10;
    }

    @Override
    public final Object get() {
        Object yVar;
        switch (this.f186a) {
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
                if (newSingleThreadExecutor instanceof i9.x) {
                    return (i9.x) newSingleThreadExecutor;
                }
                if (newSingleThreadExecutor instanceof ScheduledExecutorService) {
                    yVar = new i9.b0((ScheduledExecutorService) newSingleThreadExecutor);
                } else {
                    yVar = new i9.y(newSingleThreadExecutor);
                }
                return yVar;
            case 3:
                return new i2.k(new y2.d(), 1000, 2000);
            default:
                byte[] bArr = new byte[12];
                j2.g.f11473i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
        }
    }
}
