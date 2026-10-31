package d1;

import android.os.PowerManager;
import java.util.concurrent.atomic.AtomicBoolean;
public final class e implements Runnable {
    public final int f5638a;
    public final Object f5639b;
    public final Object f5640c;

    public e(int i10, Object obj, Object obj2) {
        this.f5638a = i10;
        this.f5639b = obj;
        this.f5640c = obj2;
    }

    private final void a() {
        PowerManager.WakeLock wakeLock;
        hf.b bVar = (hf.b) this.f5639b;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f5640c;
        synchronized (bVar) {
            if (atomicBoolean.get() && (wakeLock = (PowerManager.WakeLock) bVar.f7658c) != null) {
                wakeLock.release();
            }
        }
    }

    private final void b() {
        throw new UnsupportedOperationException("Method not decompiled: d1.e.b():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: d1.e.run():void");
    }
}
