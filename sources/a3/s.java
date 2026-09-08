package a3;

import android.util.Base64;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
public final class s implements d9.j {
    public final int f203a;

    public s(int i10) {
        this.f203a = i10;
    }

    @Override
    public final Object get() {
        Object yVar;
        switch (this.f203a) {
            case 0:
                try {
                    return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                } catch (Exception e7) {
                    throw new IllegalStateException(e7);
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
                return new i2.l(new y2.d(), 1000, 2000);
            default:
                byte[] bArr = new byte[12];
                j2.h.f13215i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
        }
    }
}
