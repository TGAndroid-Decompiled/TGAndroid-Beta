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
public final class e implements df.c, df.b {
    public g d;
    public g f5039e;
    public cf.g f5040f;
    public View f5041g;
    public j h;
    public View f5042i;
    public final cf.f f5043j;
    public float f5044k;
    public boolean f5047n;
    public float f5048o;
    public int f5036a = 0;
    public final Rect f5037b = new Rect();
    public final Rect f5038c = new Rect();
    public final RectF f5045l = new RectF();
    public final Path f5046m = new Path();

    public e(cf.f fVar) {
        this.f5043j = fVar;
    }

    @Override
    public final void a() {
        f0 f0Var;
        cf.f fVar = this.f5043j;
        if (fVar != null && (f0Var = fVar.f2500l) != null) {
            f0Var.p(false);
        }
    }

    @Override
    public final void b() {
        this.f5047n = false;
        h();
    }

    @Override
    public final void c() {
        f0 f0Var;
        cf.f fVar = this.f5043j;
        if (fVar != null && (f0Var = fVar.f2500l) != null) {
            f0Var.p(true);
        }
    }

    @Override
    public final void e() {
        this.f5047n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f5037b;
        cf.f fVar = this.f5043j;
        if (this.f5036a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f5036a);
            return;
        }
        rect.set(fVar.h.f6233a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) fVar.f2491a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) fVar.f2491a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap d = fVar.f2496g.d();
        final a aVar = fVar.f2496g;
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
        final a aVar2 = fVar.f2496g;
        Objects.requireNonNull(aVar2);
        this.f5039e = new g(measuredWidth, measuredHeight, new Utilities.Callback() {
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
        this.f5042i = fVar.f2496g.h();
        this.f5041g = new View((LaunchActivity) fVar.f2491a.d);
        cf.g gVar = new cf.g((LaunchActivity) fVar.f2491a.d, this);
        this.f5040f = gVar;
        gVar.addView(this.f5041g);
        this.f5040f.addView(this.f5042i);
        View view = this.f5041g;
        View view2 = fVar.f2499k;
        ?? obj = new Object();
        obj.f2315a = view;
        obj.f2316b = view2;
        this.h = obj;
        obj.y(d);
        fVar.f2491a.b().addView(this.f5040f);
        this.f5036a = 1;
        this.f5040f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f5042i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f5036a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f5036a);
            return;
        }
        this.h.y(this.f5043j.f2496g.b());
        this.f5036a = 3;
        this.f5040f.removeView(this.f5042i);
        this.f5040f.invalidate();
        this.f5042i = null;
        AndroidUtilities.doOnPreDraw(this.f5040f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
