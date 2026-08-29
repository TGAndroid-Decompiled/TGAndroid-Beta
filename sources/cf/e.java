package cf;

import a5.j;
import af.h;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import c2.p;
import j$.util.Objects;
import j3.k0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
public final class e implements bf.c, bf.b {
    public g d;
    public g f3047e;
    public h f3048f;
    public View f3049g;
    public j h;
    public View f3050i;
    public final af.g f3051j;
    public float f3052k;
    public boolean f3055n;
    public float f3056o;
    public int f3044a = 0;
    public final Rect f3045b = new Rect();
    public final Rect f3046c = new Rect();
    public final RectF f3053l = new RectF();
    public final Path f3054m = new Path();

    public e(af.g gVar) {
        this.f3051j = gVar;
    }

    @Override
    public final void a() {
        k0 k0Var;
        af.g gVar = this.f3051j;
        if (gVar != null && (k0Var = gVar.f406l) != null) {
            k0Var.o(false);
        }
    }

    @Override
    public final void b() {
        this.f3055n = false;
        h();
    }

    @Override
    public final void c() {
        k0 k0Var;
        af.g gVar = this.f3051j;
        if (gVar != null && (k0Var = gVar.f406l) != null) {
            k0Var.o(true);
        }
    }

    @Override
    public final void e() {
        this.f3055n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f3045b;
        af.g gVar = this.f3051j;
        if (this.f3044a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f3044a);
            return;
        }
        rect.set(gVar.h.f5546a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) gVar.f397a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) gVar.f397a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap d = gVar.f402g.d();
        final a aVar = gVar.f402g;
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
        final a aVar2 = gVar.f402g;
        Objects.requireNonNull(aVar2);
        this.f3047e = new g(measuredWidth, measuredHeight, new Utilities.Callback() {
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
        this.f3050i = gVar.f402g.h();
        this.f3049g = new View((LaunchActivity) gVar.f397a.d);
        h hVar = new h((LaunchActivity) gVar.f397a.d, this);
        this.f3048f = hVar;
        hVar.addView(this.f3049g);
        this.f3048f.addView(this.f3050i);
        View view = this.f3049g;
        View view2 = gVar.f405k;
        ?? obj = new Object();
        obj.f211a = view;
        obj.f212b = view2;
        this.h = obj;
        obj.s(d);
        gVar.f397a.b().addView(this.f3048f);
        this.f3044a = 1;
        this.f3048f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f3050i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f3044a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f3044a);
            return;
        }
        this.h.s(this.f3051j.f402g.b());
        this.f3044a = 3;
        this.f3048f.removeView(this.f3050i);
        this.f3048f.invalidate();
        this.f3050i = null;
        AndroidUtilities.doOnPreDraw(this.f3048f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
