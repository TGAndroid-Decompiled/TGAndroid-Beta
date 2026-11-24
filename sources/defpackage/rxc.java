package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.tgnet.TLRPC;
public final class rxc implements gyc {
    public final lx2 a;
    public final String b;
    public final cyc c;
    public final ylb d;
    public final Paint e = new Paint(1);
    public final Path f = new Path();
    public hyc h;
    public int n;
    public boolean r;

    public rxc(lx2 lx2Var, int i, TLRPC.BotInlineResult botInlineResult, ylb ylbVar) {
        this.a = lx2Var;
        this.d = ylbVar;
        String w = wxc.w(i, botInlineResult);
        this.b = w;
        this.c = wxc.h(w);
    }

    public final void a(int i) {
        cyc cycVar = this.c;
        if (cycVar != null && i > 0) {
            this.n = i;
            cycVar.m(i);
            if (!this.r) {
                this.r = true;
                cycVar.k(nyc.a(this.d, true));
                hyc hycVar = this.h;
                if (hycVar == null) {
                    hycVar = new hyc(this, gm.p);
                    this.h = hycVar;
                }
                hycVar.b(cycVar);
                this.h.q(true);
                wxc.u(cycVar);
            }
        }
    }

    @Override
    public final void f() {
        this.a.invalidate();
    }

    @Override
    public final void h() {
        lx2 lx2Var = this.a;
        lx2Var.requestLayout();
        lx2Var.invalidate();
    }

    @Override
    public final void b(boolean z) {
    }

    @Override
    public final void d() {
    }

    @Override
    public final void setCursor(String str) {
    }
}
