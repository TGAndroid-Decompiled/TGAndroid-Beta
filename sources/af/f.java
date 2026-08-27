package af;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import h3.k0;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;

public final class f implements ze.c, ze.b {
    public i d;

    public i f261e;

    public ye.e f262f;

    public View f263g;
    public h h;

    public View f264i;

    public final ye.d f265j;

    public float f266k;

    public boolean f269n;

    public float f270o;

    public int f258a = 0;

    public final Rect f259b = new Rect();

    public final Rect f260c = new Rect();

    public final RectF f267l = new RectF();

    public final Path f268m = new Path();

    public f(ye.d dVar) {
        this.f265j = dVar;
    }

    @Override
    public final void a() {
        k0 k0Var;
        ye.d dVar = this.f265j;
        if (dVar == null || (k0Var = dVar.f49869l) == null) {
            return;
        }
        k0Var.o(false);
    }

    @Override
    public final void b() {
        this.f269n = false;
        h();
    }

    @Override
    public final void c() {
        k0 k0Var;
        ye.d dVar = this.f265j;
        if (dVar == null || (k0Var = dVar.f49869l) == null) {
            return;
        }
        k0Var.o(true);
    }

    @Override
    public final void e() {
        this.f269n = true;
        g();
    }

    public final void g() {
        Rect rect = this.f259b;
        ye.d dVar = this.f265j;
        if (this.f258a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.f258a);
            return;
        }
        rect.set(dVar.h.f2081a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) dVar.f49860a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) dVar.f49860a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap bitmapC = dVar.f49865g.c();
        final a aVar = dVar.f49865g;
        Objects.requireNonNull(aVar);
        final int i10 = 0;
        this.d = new i(measuredWidth, measuredHeight, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                switch (i10) {
                    case 0:
                        aVar.b((Canvas) obj);
                        break;
                    default:
                        aVar.e((Canvas) obj);
                        break;
                }
            }
        });
        final a aVar2 = dVar.f49865g;
        Objects.requireNonNull(aVar2);
        final int i11 = 1;
        this.f261e = new i(measuredWidth, measuredHeight, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                switch (i11) {
                    case 0:
                        aVar2.b((Canvas) obj);
                        break;
                    default:
                        aVar2.e((Canvas) obj);
                        break;
                }
            }
        });
        this.f264i = dVar.f49865g.h();
        this.f263g = new View((LaunchActivity) dVar.f49860a.d);
        ye.e eVar = new ye.e((LaunchActivity) dVar.f49860a.d, this);
        this.f262f = eVar;
        eVar.addView(this.f263g);
        this.f262f.addView(this.f264i);
        View view = this.f263g;
        View view2 = dVar.f49868k;
        h hVar = new h();
        hVar.f274a = view;
        hVar.f275b = view2;
        this.h = hVar;
        hVar.z(bitmapC);
        dVar.f49860a.b().addView(this.f262f);
        this.f258a = 1;
        this.f262f.invalidate();
        AndroidUtilities.doOnPreDraw(this.f264i, new bf.e(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.f258a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.f258a);
            return;
        }
        this.h.z(this.f265j.f49865g.a());
        this.f258a = 3;
        this.f262f.removeView(this.f264i);
        this.f262f.invalidate();
        this.f264i = null;
        AndroidUtilities.doOnPreDraw(this.f262f, new bf.e(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override
    public final void d() {
    }

    @Override
    public final void f() {
    }
}
