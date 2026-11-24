package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.a;
public final class wb8 extends FrameLayout {
    public final lqb a;
    public final b61 b;
    public final cu3 c;
    public ndc d;
    public long e;
    public float f;
    public xt4 h;
    public qac n;
    public Runnable r;

    public wb8(Context context, ylb ylbVar, sm0 sm0Var) {
        super(context);
        this.e = -1L;
        this.f = 1.39f;
        a aVar = new a(context, ylbVar);
        aVar.setBackButtonImage(2131231244);
        aVar.setTitle(jb6.M0(2131751142, null));
        aVar.H(-1, false);
        aVar.G(587202559, false);
        aVar.setActionBarMenuOnItemClick(new wl5(this, (byte) 22));
        addView(aVar, qoe.e(-1, -2, 55));
        lqb lqbVar = new lqb(context, null, null, ylbVar, sm0Var);
        this.a = lqbVar;
        lqbVar.Y0 = true;
        addView(lqbVar, qoe.d(-1, 388.0f, 87, 0.0f, 0.0f, 0.0f, 74.0f));
        b61 b61Var = new b61(ylbVar, context, true);
        this.b = b61Var;
        b61Var.i(jb6.M0(2131751143, null), false, true);
        b61Var.f();
        addView(b61Var, qoe.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 16.0f));
        cu3 cu3Var = new cu3(context, jb6.M0(2131751144, null));
        this.c = cu3Var;
        cu3Var.setOnClickListener(new jw4(this, context, ylbVar, (byte) 15));
        addView(cu3Var, qoe.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 134.0f));
        lqbVar.setDelegate(new wm4(this));
    }

    public final void a(jo6 jo6Var, ndc ndcVar, ylb ylbVar) {
        int i;
        b61 b61Var = this.b;
        b61Var.a = ylbVar;
        b61Var.F = false;
        b61Var.updateColors();
        int i2 = jo6Var.F;
        if (i2 > 0 && (i = jo6Var.G) > 0) {
            this.f = Utilities.i(i / i2, 1.39f, 0.85f);
        } else {
            this.f = 1.39f;
        }
        this.d = ndcVar;
        long j = jo6Var.d;
        if (j >= 0) {
            this.e = j;
            ndcVar.p0(j, false);
        } else {
            this.e = ndcVar.S();
        }
        String path = ndcVar.G.getPath();
        long U = ndcVar.U();
        h74 h74Var = ndcVar.d;
        h74Var.y1();
        this.a.o(false, path, U, h74Var.b0);
        long U2 = ndcVar.U();
        float max = 2.8f / ((float) Math.max(60L, U2));
        float max2 = (1.0f - max) * (((float) this.e) / ((float) Math.max(1L, ndcVar.U())));
        lqb lqbVar = this.a;
        lqbVar.setVideoLeft(max2);
        lqbVar.setVideoRight(max2 + max);
        lqbVar.a1 = 0L;
        lqbVar.b1 = U2;
        gqb gqbVar = lqbVar.h;
        if (gqbVar != null) {
            gqbVar.a(true);
        }
        lqbVar.k();
    }

    public long getTime() {
        return this.e;
    }

    public void setOnClose(Runnable runnable) {
        this.r = runnable;
    }

    public void setOnGalleryImage(qac qacVar) {
        this.n = qacVar;
    }
}
