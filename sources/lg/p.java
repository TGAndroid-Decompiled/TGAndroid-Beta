package lg;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
public final class p extends Thread {
    public final SurfaceTexture f11915a;
    public volatile boolean f11916b;
    public boolean f11917c;
    public final q d;

    public p(q qVar, SurfaceTexture surfaceTexture) {
        this.d = qVar;
        this.f11915a = surfaceTexture;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: lg.p.a():void");
    }

    @Override
    public final void run() {
        synchronized (this.d.d) {
            try {
                if (this.f11916b) {
                    return;
                }
                q qVar = this.d;
                qVar.f11922c = this.f11915a;
                qVar.H = true;
                try {
                    a();
                } catch (Exception e) {
                    if (!this.f11916b) {
                        f8.g(e, true);
                        i0.g3(new o(this, 0));
                    }
                }
                q.b(this.d);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
