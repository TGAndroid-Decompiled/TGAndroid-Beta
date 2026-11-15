package hi;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.gz;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
public final class b6 {
    public final t8 f13933c;
    public z5 d;
    public CameraView f13935f;
    public Bitmap f13936g;
    public final AtomicReference f13931a = new AtomicReference();
    public final AtomicBoolean f13932b = new AtomicBoolean(false);
    public final y5 h = new y5(this, 0);
    public final String f13934e = np.s1(m10.f24940t0).V2;

    public b6(Context context, t8 t8Var) {
        this.f13933c = t8Var;
        Utilities.f22416e.c(new h4(5, this, context));
    }

    public final void a(CameraView cameraView) {
        this.f13935f = cameraView;
        if (this.f13931a.get() != null && !this.f13932b.get()) {
            Utilities.f22416e.a(this.h);
            Utilities.f22416e.d(this.h, b());
        }
    }

    public final long b() {
        if (this.d == null) {
            return 750L;
        }
        int o4 = gz.o();
        if (o4 != 1) {
            if (o4 != 2) {
                return 800L;
            }
            return 80L;
        }
        return 400L;
    }

    public final void c(boolean z10) {
        if (this.f13932b.getAndSet(z10) != z10) {
            if (z10) {
                Utilities.f22416e.a(this.h);
                if (this.d != null) {
                    this.d = null;
                    org.telegram.messenger.g0.h3(new y5(this, 1));
                    return;
                }
                return;
            }
            Utilities.f22416e.a(this.h);
            Utilities.f22416e.d(this.h, b());
        }
    }
}
