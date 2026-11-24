package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.tgnet.TLRPC;
public final class qvc implements fwc {
    public final bw2 a;
    public final String b;
    public final bwc c;
    public final wjb d;
    public final Paint e = new Paint(1);
    public final Path f = new Path();
    public gwc h;
    public int n;
    public boolean r;

    public qvc(bw2 bw2Var, int i, TLRPC.BotInlineResult botInlineResult, wjb wjbVar) {
        this.a = bw2Var;
        this.d = wjbVar;
        String v = vvc.v(i, botInlineResult);
        this.b = v;
        this.c = vvc.h(v);
    }

    public final void a(int i) {
        bwc bwcVar = this.c;
        if (bwcVar != null && i > 0) {
            this.n = i;
            bwcVar.l(i);
            if (!this.r) {
                this.r = true;
                bwcVar.j(mwc.a(this.d, true));
                gwc gwcVar = this.h;
                if (gwcVar == null) {
                    gwcVar = new gwc(this, gl.p);
                    this.h = gwcVar;
                }
                gwcVar.b(bwcVar);
                this.h.q(true);
                vvc.t(bwcVar);
            }
        }
    }

    @Override
    public final void g() {
        this.a.invalidate();
    }

    @Override
    public final void j() {
        bw2 bw2Var = this.a;
        bw2Var.requestLayout();
        bw2Var.invalidate();
    }

    @Override
    public final void d() {
    }

    @Override
    public final void b(boolean z) {
    }

    @Override
    public final void f(String str) {
    }
}
