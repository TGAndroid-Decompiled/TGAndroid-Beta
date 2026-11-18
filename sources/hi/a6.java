package hi;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bz;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
public final class a6 {
    public final t8 f14234c;
    public y5 d;
    public CameraView f14236f;
    public Bitmap f14237g;
    public final AtomicReference f14232a = new AtomicReference();
    public final AtomicBoolean f14233b = new AtomicBoolean(false);
    public final x5 h = new x5(this, 0);
    public final String f14235e = mp.u1(j10.f24770t0).X2;

    public a6(Context context, t8 t8Var) {
        this.f14234c = t8Var;
        Utilities.f22779e.c(new r1(7, this, context));
    }

    public final void a(CameraView cameraView) {
        this.f14236f = cameraView;
        if (this.f14232a.get() != null && !this.f14233b.get()) {
            Utilities.f22779e.a(this.h);
            Utilities.f22779e.d(this.h, b());
        }
    }

    public final long b() {
        if (this.d == null) {
            return 750L;
        }
        int o4 = bz.o();
        if (o4 != 1) {
            if (o4 != 2) {
                return 800L;
            }
            return 80L;
        }
        return 400L;
    }

    public final void c(boolean z10) {
        if (this.f14233b.getAndSet(z10) != z10) {
            if (z10) {
                Utilities.f22779e.a(this.h);
                if (this.d != null) {
                    this.d = null;
                    org.telegram.messenger.g0.g3(new x5(this, 1));
                    return;
                }
                return;
            }
            Utilities.f22779e.a(this.h);
            Utilities.f22779e.d(this.h, b());
        }
    }
}
