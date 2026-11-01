package lf;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.cast.o;
import i2.i0;
import j$.util.Objects;
import jf.g;
import org.telegram.messenger.f8;
import org.telegram.messenger.r20;
import org.telegram.messenger.w0;
import org.telegram.ui.LaunchActivity;
public final class e implements kf.b {
    public f d;
    public f e;
    public g f11821f;
    public View f11822g;
    public bh.d h;
    public View f11823i;
    public final jf.f f11824j;
    public float f11825k;
    public boolean f11828n;
    public float f11829o;
    public int f11818a = 0;
    public final Rect f11819b = new Rect();
    public final Rect f11820c = new Rect();
    public final RectF f11826l = new RectF();
    public final Path f11827m = new Path();

    public e(jf.f fVar) {
        this.f11824j = fVar;
    }

    @Override
    public final void a() {
        i0 i0Var;
        jf.f fVar = this.f11824j;
        if (fVar != null && (i0Var = fVar.f9871l) != null) {
            i0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f11828n = false;
        h();
    }

    @Override
    public final void c() {
        i0 i0Var;
        jf.f fVar = this.f11824j;
        if (fVar != null && (i0Var = fVar.f9871l) != null) {
            i0Var.j();
        }
    }

    @Override
    public final void e() {
        this.f11828n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f11819b;
        jf.f fVar = this.f11824j;
        if (this.f11818a != 0) {
            f8.d("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f11818a);
            return;
        }
        rect.set((Rect) fVar.h.f10753a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) fVar.f9863a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) fVar.f9863a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap m10 = fVar.f9867g.m();
        final a aVar = fVar.f9867g;
        Objects.requireNonNull(aVar);
        this.d = new f(measuredWidth, measuredHeight, new r20() {
            @Override
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        aVar.l((Canvas) obj);
                        return;
                    default:
                        aVar.o((Canvas) obj);
                        return;
                }
            }
        });
        final a aVar2 = fVar.f9867g;
        Objects.requireNonNull(aVar2);
        this.e = new f(measuredWidth, measuredHeight, new r20() {
            @Override
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        aVar2.l((Canvas) obj);
                        return;
                    default:
                        aVar2.o((Canvas) obj);
                        return;
                }
            }
        });
        this.f11823i = fVar.f9867g.r();
        this.f11822g = new View((LaunchActivity) fVar.f9863a.d);
        g gVar = new g((LaunchActivity) fVar.f9863a.d, this);
        this.f11821f = gVar;
        gVar.addView(this.f11822g);
        this.f11821f.addView(this.f11823i);
        View view = this.f11822g;
        View view2 = fVar.f9870k;
        ?? obj = new Object();
        obj.f2777a = view;
        obj.f2778b = view2;
        this.h = obj;
        obj.K(m10);
        fVar.f9863a.p().addView(this.f11821f);
        this.f11818a = 1;
        this.f11821f.invalidate();
        org.telegram.messenger.i0.K(this.f11823i, new o(w0.d, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f11818a != 2) {
            f8.d("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f11818a);
            return;
        }
        this.h.K(this.f11824j.f9867g.i());
        this.f11818a = 3;
        this.f11821f.removeView(this.f11823i);
        this.f11821f.invalidate();
        this.f11823i = null;
        org.telegram.messenger.i0.K(this.f11821f, new o(w0.d, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
