package gi;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.az;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
public final class c6 {
    public final w8 f12494c;
    public a6 d;
    public CameraView f12496f;
    public Bitmap f12497g;
    public final AtomicReference f12492a = new AtomicReference();
    public final AtomicBoolean f12493b = new AtomicBoolean(false);
    public final z5 h = new z5(this, 0);
    public final String f12495e = hp.s1(h10.f22829t0).V2;

    public c6(Context context, w8 w8Var) {
        this.f12494c = w8Var;
        Utilities.f21387e.c(new g2.c(16, this, context));
    }

    public final void a(CameraView cameraView) {
        this.f12496f = cameraView;
        if (this.f12492a.get() != null && !this.f12493b.get()) {
            Utilities.f21387e.a(this.h);
            Utilities.f21387e.e(this.h, b());
        }
    }

    public final long b() {
        if (this.d == null) {
            return 750L;
        }
        int o10 = az.o();
        if (o10 != 1) {
            if (o10 != 2) {
                return 800L;
            }
            return 80L;
        }
        return 400L;
    }

    public final void c(boolean z10) {
        if (this.f12493b.getAndSet(z10) != z10) {
            if (z10) {
                Utilities.f21387e.a(this.h);
                if (this.d != null) {
                    this.d = null;
                    org.telegram.messenger.g0.h3(new z5(this, 1));
                    return;
                }
                return;
            }
            Utilities.f21387e.a(this.h);
            Utilities.f21387e.e(this.h, b());
        }
    }
}
