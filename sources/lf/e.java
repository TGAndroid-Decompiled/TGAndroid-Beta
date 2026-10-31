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
import org.telegram.messenger.q20;
import org.telegram.messenger.w0;
import org.telegram.ui.LaunchActivity;
public final class e implements kf.b {
    public f d;
    public f e;
    public g f11820f;
    public View f11821g;
    public bh.d h;
    public View f11822i;
    public final jf.f f11823j;
    public float f11824k;
    public boolean f11827n;
    public float f11828o;
    public int f11817a = 0;
    public final Rect f11818b = new Rect();
    public final Rect f11819c = new Rect();
    public final RectF f11825l = new RectF();
    public final Path f11826m = new Path();

    public e(jf.f fVar) {
        this.f11823j = fVar;
    }

    @Override
    public final void a() {
        i0 i0Var;
        jf.f fVar = this.f11823j;
        if (fVar != null && (i0Var = fVar.f9870l) != null) {
            i0Var.e();
        }
    }

    @Override
    public final void b() {
        this.f11827n = false;
        h();
    }

    @Override
    public final void c() {
        i0 i0Var;
        jf.f fVar = this.f11823j;
        if (fVar != null && (i0Var = fVar.f9870l) != null) {
            i0Var.j();
        }
    }

    @Override
    public final void e() {
        this.f11827n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f11818b;
        jf.f fVar = this.f11823j;
        if (this.f11817a != 0) {
            f8.d("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f11817a);
            return;
        }
        rect.set((Rect) fVar.h.f10752a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) fVar.f9862a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) fVar.f9862a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap m10 = fVar.f9866g.m();
        final a aVar = fVar.f9866g;
        Objects.requireNonNull(aVar);
        this.d = new f(measuredWidth, measuredHeight, new q20() {
            @Override
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        aVar.l((Canvas) obj);
                        return;
                    default:
                        aVar.n((Canvas) obj);
                        return;
                }
            }
        });
        final a aVar2 = fVar.f9866g;
        Objects.requireNonNull(aVar2);
        this.e = new f(measuredWidth, measuredHeight, new q20() {
            @Override
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        aVar2.l((Canvas) obj);
                        return;
                    default:
                        aVar2.n((Canvas) obj);
                        return;
                }
            }
        });
        this.f11822i = fVar.f9866g.r();
        this.f11821g = new View((LaunchActivity) fVar.f9862a.d);
        g gVar = new g((LaunchActivity) fVar.f9862a.d, this);
        this.f11820f = gVar;
        gVar.addView(this.f11821g);
        this.f11820f.addView(this.f11822i);
        View view = this.f11821g;
        View view2 = fVar.f9869k;
        ?? obj = new Object();
        obj.f2777a = view;
        obj.f2778b = view2;
        this.h = obj;
        obj.K(m10);
        fVar.f9862a.p().addView(this.f11820f);
        this.f11817a = 1;
        this.f11820f.invalidate();
        org.telegram.messenger.i0.K(this.f11822i, new o(w0.d, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f11817a != 2) {
            f8.d("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f11817a);
            return;
        }
        this.h.K(this.f11823j.f9866g.i());
        this.f11817a = 3;
        this.f11820f.removeView(this.f11822i);
        this.f11820f.invalidate();
        this.f11822i = null;
        org.telegram.messenger.i0.K(this.f11820f, new o(w0.d, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
