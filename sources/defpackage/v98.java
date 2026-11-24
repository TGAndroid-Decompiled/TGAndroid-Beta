package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.a;
public final class v98 extends FrameLayout {
    public final kob a;
    public final u41 b;
    public final ss3 c;
    public lbc d;
    public long e;
    public float f;
    public wr4 h;
    public p8c n;
    public Runnable r;

    public v98(Context context, wjb wjbVar, sl0 sl0Var) {
        super(context);
        this.e = -1L;
        this.f = 1.39f;
        a aVar = new a(context, wjbVar);
        aVar.setBackButtonImage(2131231243);
        aVar.setTitle(k96.M0(2131751193, null));
        aVar.H(-1, false);
        aVar.G(587202559, false);
        aVar.setActionBarMenuOnItemClick(new bq5(this, (byte) 21));
        addView(aVar, nme.e(-1, -2, 55));
        kob kobVar = new kob(context, null, null, wjbVar, sl0Var);
        this.a = kobVar;
        kobVar.Y0 = true;
        addView(kobVar, nme.d(-1, 388.0f, 87, 0.0f, 0.0f, 0.0f, 74.0f));
        u41 u41Var = new u41(wjbVar, context, true);
        this.b = u41Var;
        u41Var.i(k96.M0(2131751194, null), false, true);
        u41Var.f();
        addView(u41Var, nme.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 16.0f));
        ss3 ss3Var = new ss3(context, k96.M0(2131751195, null));
        this.c = ss3Var;
        ss3Var.setOnClickListener(new hu4(this, context, wjbVar, (byte) 15));
        addView(ss3Var, nme.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 134.0f));
        kobVar.setDelegate(new wk4(this));
    }

    public final void a(jm6 jm6Var, lbc lbcVar, wjb wjbVar) {
        int i;
        u41 u41Var = this.b;
        u41Var.a = wjbVar;
        u41Var.F = false;
        u41Var.updateColors();
        int i2 = jm6Var.F;
        if (i2 > 0 && (i = jm6Var.G) > 0) {
            this.f = Utilities.i(i / i2, 1.39f, 0.85f);
        } else {
            this.f = 1.39f;
        }
        this.d = lbcVar;
        long j = jm6Var.d;
        if (j >= 0) {
            this.e = j;
            lbcVar.p0(j, false);
        } else {
            this.e = lbcVar.S();
        }
        String path = lbcVar.G.getPath();
        long U = lbcVar.U();
        y54 y54Var = lbcVar.d;
        y54Var.y1();
        this.a.o(false, path, U, y54Var.b0);
        long U2 = lbcVar.U();
        float max = 2.8f / ((float) Math.max(60L, U2));
        float max2 = (1.0f - max) * (((float) this.e) / ((float) Math.max(1L, lbcVar.U())));
        kob kobVar = this.a;
        kobVar.setVideoLeft(max2);
        kobVar.setVideoRight(max2 + max);
        kobVar.a1 = 0L;
        kobVar.b1 = U2;
        fob fobVar = kobVar.h;
        if (fobVar != null) {
            fobVar.a(true);
        }
        kobVar.k();
    }

    public long getTime() {
        return this.e;
    }

    public void setOnClose(Runnable runnable) {
        this.r = runnable;
    }

    public void setOnGalleryImage(p8c p8cVar) {
        this.n = p8cVar;
    }
}
