package e5;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Surface;
import android.view.WindowManager;
import d5.g0;

public final class r {

    public final d f5279a;

    public final o f5280b;

    public final q f5281c;
    public boolean d;

    public Surface f5282e;

    public float f5283f;

    public float f5284g;
    public float h;

    public float f5285i;

    public int f5286j;

    public long f5287k;

    public long f5288l;

    public long f5289m;

    public long f5290n;

    public long f5291o;

    public long f5292p;

    public long f5293q;

    public r(Context context) {
        o pVar;
        DisplayManager displayManager;
        d dVar = new d();
        dVar.f5241a = new c();
        dVar.f5242b = new c();
        dVar.d = -9223372036854775807L;
        this.f5279a = dVar;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            pVar = (g0.f4795a < 17 || (displayManager = (DisplayManager) applicationContext.getSystemService("display")) == null) ? null : new p(displayManager);
            if (pVar == null) {
                WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
                if (windowManager != null) {
                    pVar = new k5.i(windowManager, 12);
                } else {
                    pVar = null;
                }
            }
        } else {
            pVar = null;
        }
        this.f5280b = pVar;
        this.f5281c = pVar != null ? q.f5275e : null;
        this.f5287k = -9223372036854775807L;
        this.f5288l = -9223372036854775807L;
        this.f5283f = -1.0f;
        this.f5285i = 1.0f;
        this.f5286j = 0;
    }

    public final void a() {
        Surface surface;
        if (g0.f4795a < 30 || (surface = this.f5282e) == null || this.f5286j == Integer.MIN_VALUE || this.h == 0.0f) {
            return;
        }
        this.h = 0.0f;
        n.a(surface, 0.0f);
    }

    public final void b() {
        float f10;
        float f11;
        if (g0.f4795a < 30 || this.f5282e == null) {
            return;
        }
        d dVar = this.f5279a;
        if (!dVar.f5241a.a()) {
            f10 = this.f5283f;
        } else if (dVar.f5241a.a()) {
            c cVar = dVar.f5241a;
            long j10 = cVar.f5238e;
            f10 = (float) (1.0E9d / (j10 != 0 ? cVar.f5239f / j10 : 0L));
        } else {
            f10 = -1.0f;
        }
        float f12 = this.f5284g;
        if (f10 == f12) {
            return;
        }
        if (f10 != -1.0f && f12 != -1.0f) {
            if (dVar.f5241a.a()) {
                if ((dVar.f5241a.a() ? dVar.f5241a.f5239f : -9223372036854775807L) >= 5000000000L) {
                    f11 = 0.02f;
                } else {
                    f11 = 1.0f;
                }
            } else {
                f11 = 1.0f;
            }
            if (Math.abs(f10 - this.f5284g) < f11) {
                return;
            }
        } else if (f10 == -1.0f && dVar.f5244e < 30) {
            return;
        }
        this.f5284g = f10;
        c(false);
    }

    public final void c(boolean z10) {
        Surface surface;
        float f10;
        if (g0.f4795a < 30 || (surface = this.f5282e) == null || this.f5286j == Integer.MIN_VALUE) {
            return;
        }
        if (this.d) {
            float f11 = this.f5284g;
            if (f11 != -1.0f) {
                f10 = f11 * this.f5285i;
            } else {
                f10 = 0.0f;
            }
        } else {
            f10 = 0.0f;
        }
        if (z10 || this.h != f10) {
            this.h = f10;
            n.a(surface, f10);
        }
    }
}
