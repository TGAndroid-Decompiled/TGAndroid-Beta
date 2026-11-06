package fi;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.iz;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
public final class c6 {
    public final v8 f11733c;
    public a6 d;
    public CameraView f11735f;
    public Bitmap f11736g;
    public final AtomicReference f11731a = new AtomicReference();
    public final AtomicBoolean f11732b = new AtomicBoolean(false);
    public final z5 h = new z5(this, 0);
    public final String f11734e = qp.s1(p10.f24459s0).U2;

    public c6(Context context, v8 v8Var) {
        this.f11733c = v8Var;
        Utilities.f21333e.c(new f2.h(10, context, (Object) this));
    }

    public final void a(CameraView cameraView) {
        this.f11735f = cameraView;
        if (this.f11731a.get() != null && !this.f11732b.get()) {
            Utilities.f21333e.a(this.h);
            Utilities.f21333e.d(this.h, b());
        }
    }

    public final long b() {
        if (this.d == null) {
            return 750L;
        }
        int o4 = iz.o();
        if (o4 != 1) {
            if (o4 != 2) {
                return 800L;
            }
            return 80L;
        }
        return 400L;
    }

    public final void c(boolean z9) {
        if (this.f11732b.getAndSet(z9) != z9) {
            if (z9) {
                Utilities.f21333e.a(this.h);
                if (this.d != null) {
                    this.d = null;
                    org.telegram.messenger.g0.h3(new z5(this, 1));
                    return;
                }
                return;
            }
            Utilities.f21333e.a(this.h);
            Utilities.f21333e.d(this.h, b());
        }
    }
}
