package hi;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.cz;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
public final class a6 {
    public final t8 f14187c;
    public y5 d;
    public CameraView f14189f;
    public Bitmap f14190g;
    public final AtomicReference f14185a = new AtomicReference();
    public final AtomicBoolean f14186b = new AtomicBoolean(false);
    public final x5 h = new x5(this, 0);
    public final String f14188e = np.u1(k10.f24932t0).X2;

    public a6(Context context, t8 t8Var) {
        this.f14187c = t8Var;
        Utilities.f22774e.c(new q1(7, this, context));
    }

    public final void a(CameraView cameraView) {
        this.f14189f = cameraView;
        if (this.f14185a.get() != null && !this.f14186b.get()) {
            Utilities.f22774e.a(this.h);
            Utilities.f22774e.d(this.h, b());
        }
    }

    public final long b() {
        if (this.d == null) {
            return 750L;
        }
        int o4 = cz.o();
        if (o4 != 1) {
            if (o4 != 2) {
                return 800L;
            }
            return 80L;
        }
        return 400L;
    }

    public final void c(boolean z10) {
        if (this.f14186b.getAndSet(z10) != z10) {
            if (z10) {
                Utilities.f22774e.a(this.h);
                if (this.d != null) {
                    this.d = null;
                    org.telegram.messenger.g0.g3(new x5(this, 1));
                    return;
                }
                return;
            }
            Utilities.f22774e.a(this.h);
            Utilities.f22774e.d(this.h, b());
        }
    }
}
