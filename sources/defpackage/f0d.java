package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.tgnet.TLRPC;
public final class f0d implements u0d {
    public final vw2 a;
    public final String b;
    public final q0d c;
    public final vnb d;
    public final Paint e = new Paint(1);
    public final Path f = new Path();
    public v0d h;
    public int n;
    public boolean r;

    public f0d(vw2 vw2Var, int i, TLRPC.BotInlineResult botInlineResult, vnb vnbVar) {
        this.a = vw2Var;
        this.d = vnbVar;
        String w = k0d.w(i, botInlineResult);
        this.b = w;
        this.c = k0d.h(w);
    }

    public final void a(int i) {
        q0d q0dVar = this.c;
        if (q0dVar != null && i > 0) {
            this.n = i;
            q0dVar.m(i);
            if (!this.r) {
                this.r = true;
                q0dVar.k(c1d.a(this.d, true));
                v0d v0dVar = this.h;
                if (v0dVar == null) {
                    v0dVar = new v0d(this, hl.p);
                    this.h = v0dVar;
                }
                v0dVar.b(q0dVar);
                this.h.q(true);
                k0d.u(q0dVar);
            }
        }
    }

    @Override
    public final void f() {
        this.a.invalidate();
    }

    @Override
    public final void h() {
        vw2 vw2Var = this.a;
        vw2Var.requestLayout();
        vw2Var.invalidate();
    }

    @Override
    public final void d() {
    }

    @Override
    public final void b(boolean z) {
    }

    @Override
    public final void setCursor(String str) {
    }
}
