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
public final class z5 {
    public final s8 f15858c;
    public x5 d;
    public CameraView f15860f;
    public Bitmap f15861g;
    public final AtomicReference f15856a = new AtomicReference();
    public final AtomicBoolean f15857b = new AtomicBoolean(false);
    public final w5 h = new w5(this, 0);
    public final String f15859e = np.u1(k10.f24968t0).X2;

    public z5(Context context, s8 s8Var) {
        this.f15858c = s8Var;
        Utilities.f22810e.c(new c(9, this, context));
    }

    public final void a(CameraView cameraView) {
        this.f15860f = cameraView;
        if (this.f15856a.get() != null && !this.f15857b.get()) {
            Utilities.f22810e.a(this.h);
            Utilities.f22810e.d(this.h, b());
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
        if (this.f15857b.getAndSet(z10) != z10) {
            if (z10) {
                Utilities.f22810e.a(this.h);
                if (this.d != null) {
                    this.d = null;
                    org.telegram.messenger.g0.g3(new w5(this, 1));
                    return;
                }
                return;
            }
            Utilities.f22810e.a(this.h);
            Utilities.f22810e.d(this.h, b());
        }
    }
}
