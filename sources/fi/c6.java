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
    public final v8 f11737c;
    public a6 d;
    public CameraView f11739f;
    public Bitmap f11740g;
    public final AtomicReference f11735a = new AtomicReference();
    public final AtomicBoolean f11736b = new AtomicBoolean(false);
    public final z5 h = new z5(this, 0);
    public final String f11738e = qp.s1(p10.f24474s0).U2;

    public c6(Context context, v8 v8Var) {
        this.f11737c = v8Var;
        Utilities.f21341e.c(new f2.h(10, context, (Object) this));
    }

    public final void a(CameraView cameraView) {
        this.f11739f = cameraView;
        if (this.f11735a.get() != null && !this.f11736b.get()) {
            Utilities.f21341e.a(this.h);
            Utilities.f21341e.d(this.h, b());
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
        if (this.f11736b.getAndSet(z9) != z9) {
            if (z9) {
                Utilities.f21341e.a(this.h);
                if (this.d != null) {
                    this.d = null;
                    org.telegram.messenger.g0.h3(new z5(this, 1));
                    return;
                }
                return;
            }
            Utilities.f21341e.a(this.h);
            Utilities.f21341e.d(this.h, b());
        }
    }
}
