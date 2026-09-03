package df;

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
public final class e implements cf.c, cf.b {
    public g d;
    public g e;
    public bf.g f4337f;
    public View f4338g;
    public j h;
    public View f4339i;
    public final bf.f f4340j;
    public float f4341k;
    public boolean f4344n;
    public float f4345o;
    public int f4334a = 0;
    public final Rect f4335b = new Rect();
    public final Rect f4336c = new Rect();
    public final RectF f4342l = new RectF();
    public final Path f4343m = new Path();

    public e(bf.f fVar) {
        this.f4340j = fVar;
    }

    @Override
    public final void a() {
        f0 f0Var;
        bf.f fVar = this.f4340j;
        if (fVar != null && (f0Var = fVar.f1825l) != null) {
            f0Var.p(false);
        }
    }

    @Override
    public final void b() {
        this.f4344n = false;
        h();
    }

    @Override
    public final void c() {
        f0 f0Var;
        bf.f fVar = this.f4340j;
        if (fVar != null && (f0Var = fVar.f1825l) != null) {
            f0Var.p(true);
        }
    }

    @Override
    public final void e() {
        this.f4344n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f4335b;
        bf.f fVar = this.f4340j;
        if (this.f4334a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f4334a);
            return;
        }
        rect.set(fVar.h.f5199a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) fVar.f1817a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) fVar.f1817a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap d = fVar.f1821g.d();
        final a aVar = fVar.f1821g;
        Objects.requireNonNull(aVar);
        this.d = new g(measuredWidth, measuredHeight, new Utilities.Callback() {
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
        final a aVar2 = fVar.f1821g;
        Objects.requireNonNull(aVar2);
        this.e = new g(measuredWidth, measuredHeight, new Utilities.Callback() {
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
        this.f4339i = fVar.f1821g.h();
        this.f4338g = new View((LaunchActivity) fVar.f1817a.d);
        bf.g gVar = new bf.g((LaunchActivity) fVar.f1817a.d, this);
        this.f4337f = gVar;
        gVar.addView(this.f4338g);
        this.f4337f.addView(this.f4339i);
        View view = this.f4338g;
        View view2 = fVar.f1824k;
        ?? obj = new Object();
        obj.f2152a = view;
        obj.f2153b = view2;
        this.h = obj;
        obj.y(d);
        fVar.f1817a.b().addView(this.f4337f);
        this.f4334a = 1;
        this.f4337f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f4339i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f4334a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f4334a);
            return;
        }
        this.h.y(this.f4340j.f1821g.b());
        this.f4334a = 3;
        this.f4337f.removeView(this.f4339i);
        this.f4337f.invalidate();
        this.f4339i = null;
        AndroidUtilities.doOnPreDraw(this.f4337f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
