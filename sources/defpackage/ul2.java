package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class ul2 extends y59 {
    public final byte c;
    public final Context d;
    public final Object e;
    public final KeyEvent.Callback f;

    public ul2(KeyEvent.Callback callback, Context context, Object obj, byte b) {
        this.c = b;
        this.f = callback;
        this.d = context;
        this.e = obj;
    }

    @Override
    public final int b() {
        switch (this.c) {
            case 0:
                return sl2.a().size();
            default:
                return ((j67) this.f).N.size();
        }
    }

    @Override
    public final void t(u69 u69Var, int i) {
        byte b = this.c;
        boolean z = true;
        KeyEvent.Callback callback = this.f;
        int i2 = 0;
        switch (b) {
            case 0:
                vl2 vl2Var = (vl2) u69Var.a;
                sl2 sl2Var = (sl2) sl2.a().get(i);
                if (i != vl2Var.s) {
                    z = false;
                }
                vl2Var.setDrawable(new tl2(sl2Var, false));
                vl2Var.b(sl2Var.equals(((wl2) callback).b), z);
                vl2Var.s = i;
                return;
            default:
                j67 j67Var = (j67) callback;
                ArrayList arrayList = j67Var.N;
                k47 k47Var = (k47) arrayList.get((b() - 1) - i);
                rc2 rc2Var = (rc2) u69Var.a;
                f47 j = j67Var.j(k47Var);
                if (j == null) {
                    z = false;
                }
                rc2Var.setInvalidatesParent(z);
                rc2Var.z3(k47Var, j, false, false, false, false);
                if (!j67Var.P.i() && arrayList.size() >= 10) {
                    i2 = arrayList.size() % 10;
                }
                if (i == i2 && !k47Var.m5()) {
                    j67Var.Q = rc2Var;
                    Point point = gm.q;
                    rc2Var.B3(point.x, point.y);
                    j67Var.R = k47Var.e1();
                    return;
                }
                return;
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        byte b = this.c;
        Context context = this.d;
        switch (b) {
            case 0:
                nrb nrbVar = new nrb((Activity) context);
                nrbVar.setLayoutParams(new g69(gm.L(46.0f), gm.L(56.0f)));
                nrbVar.setBackground(cmb.f0(553648127, 1, -1));
                return new u69(nrbVar);
            default:
                j67 j67Var = (j67) this.f;
                i67 i67Var = new i67(j67Var, context, j67Var.c, (ylb) this.e);
                i67Var.setDelegate(new nf5((byte) 22));
                return new u69(i67Var);
        }
    }

    @Override
    public final void y(u69 u69Var) {
        switch (this.c) {
            case 0:
                vl2 vl2Var = (vl2) u69Var.a;
                ((rk4) this.e).a(vl2Var);
                int i = vl2Var.s;
                if (i >= 0 && i < sl2.a().size()) {
                    sl2 sl2Var = (sl2) sl2.a().get(vl2Var.s);
                    vl2Var.setDrawable(new tl2(sl2Var, false));
                    vl2Var.b(sl2Var.equals(((wl2) this.f).b), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void z(u69 u69Var) {
        switch (this.c) {
            case 0:
                ((rk4) this.e).d.remove((vl2) u69Var.a);
                return;
            default:
                return;
        }
    }
}
