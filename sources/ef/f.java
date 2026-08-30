package ef;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import c2.p;
import c5.j;
import j$.util.Objects;
import j3.f0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
public final class f implements df.c, df.b {
    public h d;
    public h e;
    public cf.g f5199f;
    public View f5200g;
    public j h;
    public View f5201i;
    public final cf.f f5202j;
    public float f5203k;
    public boolean f5206n;
    public float f5207o;
    public int f5196a = 0;
    public final Rect f5197b = new Rect();
    public final Rect f5198c = new Rect();
    public final RectF f5204l = new RectF();
    public final Path f5205m = new Path();

    public f(cf.f fVar) {
        this.f5202j = fVar;
    }

    @Override
    public final void a() {
        f0 f0Var;
        cf.f fVar = this.f5202j;
        if (fVar != null && (f0Var = fVar.f2303l) != null) {
            f0Var.p(false);
        }
    }

    @Override
    public final void b() {
        this.f5206n = false;
        h();
    }

    @Override
    public final void c() {
        f0 f0Var;
        cf.f fVar = this.f5202j;
        if (fVar != null && (f0Var = fVar.f2303l) != null) {
            f0Var.p(true);
        }
    }

    @Override
    public final void e() {
        this.f5206n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f5197b;
        cf.f fVar = this.f5202j;
        if (this.f5196a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f5196a);
            return;
        }
        rect.set(fVar.h.f6114a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) fVar.f2295a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) fVar.f2295a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap d = fVar.f2299g.d();
        final a aVar = fVar.f2299g;
        Objects.requireNonNull(aVar);
        this.d = new h(measuredWidth, measuredHeight, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                switch (r2) {
                    case 0:
                        aVar.c((Canvas) obj);
                        return;
                    default:
                        aVar.f((Canvas) obj);
                        return;
                }
            }
        });
        final a aVar2 = fVar.f2299g;
        Objects.requireNonNull(aVar2);
        this.e = new h(measuredWidth, measuredHeight, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                switch (r2) {
                    case 0:
                        aVar2.c((Canvas) obj);
                        return;
                    default:
                        aVar2.f((Canvas) obj);
                        return;
                }
            }
        });
        this.f5201i = fVar.f2299g.h();
        this.f5200g = new View((LaunchActivity) fVar.f2295a.d);
        cf.g gVar = new cf.g((LaunchActivity) fVar.f2295a.d, this);
        this.f5199f = gVar;
        gVar.addView(this.f5200g);
        this.f5199f.addView(this.f5201i);
        View view = this.f5200g;
        View view2 = fVar.f2302k;
        ?? obj = new Object();
        obj.f2129a = view;
        obj.f2130b = view2;
        this.h = obj;
        obj.y(d);
        fVar.f2295a.b().addView(this.f5199f);
        this.f5196a = 1;
        this.f5199f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f5201i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f5196a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f5196a);
            return;
        }
        this.h.y(this.f5202j.f2299g.b());
        this.f5196a = 3;
        this.f5199f.removeView(this.f5201i);
        this.f5199f.invalidate();
        this.f5201i = null;
        AndroidUtilities.doOnPreDraw(this.f5199f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
