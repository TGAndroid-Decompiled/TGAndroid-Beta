package hi;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bz;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
public final class j6 {
    public final n9 f14732c;
    public h6 d;
    public CameraView f14734f;
    public Bitmap f14735g;
    public final AtomicReference f14730a = new AtomicReference();
    public final AtomicBoolean f14731b = new AtomicBoolean(false);
    public final g6 h = new g6(this, 0);
    public final String f14733e = mp.u1(i10.f24637t0).X2;

    public j6(Context context, n9 n9Var) {
        this.f14732c = n9Var;
        Utilities.f22877e.c(new c(10, this, context));
    }

    public final void a(CameraView cameraView) {
        this.f14734f = cameraView;
        if (this.f14730a.get() != null && !this.f14731b.get()) {
            Utilities.f22877e.a(this.h);
            Utilities.f22877e.d(this.h, b());
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
        if (this.f14731b.getAndSet(z10) != z10) {
            if (z10) {
                Utilities.f22877e.a(this.h);
                if (this.d != null) {
                    this.d = null;
                    org.telegram.messenger.g0.g3(new g6(this, 1));
                    return;
                }
                return;
            }
            Utilities.f22877e.a(this.h);
            Utilities.f22877e.d(this.h, b());
        }
    }
}
