package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class hk2 extends w39 {
    public final byte c;
    public final Context d;
    public final Object e;
    public final KeyEvent.Callback f;

    public hk2(KeyEvent.Callback callback, Context context, Object obj, byte b) {
        this.c = b;
        this.f = callback;
        this.d = context;
        this.e = obj;
    }

    @Override
    public final int b() {
        switch (this.c) {
            case 0:
                return fk2.a().size();
            default:
                return ((j47) this.f).N.size();
        }
    }

    @Override
    public final void t(s49 s49Var, int i) {
        byte b = this.c;
        boolean z = true;
        KeyEvent.Callback callback = this.f;
        int i2 = 0;
        switch (b) {
            case 0:
                ik2 ik2Var = (ik2) s49Var.a;
                fk2 fk2Var = (fk2) fk2.a().get(i);
                if (i != ik2Var.s) {
                    z = false;
                }
                ik2Var.setDrawable(new gk2(fk2Var, false));
                ik2Var.b(fk2Var.equals(((jk2) callback).b), z);
                ik2Var.s = i;
                return;
            default:
                j47 j47Var = (j47) callback;
                ArrayList arrayList = j47Var.N;
                k27 k27Var = (k27) arrayList.get((b() - 1) - i);
                gb2 gb2Var = (gb2) s49Var.a;
                f27 j = j47Var.j(k27Var);
                if (j == null) {
                    z = false;
                }
                gb2Var.setInvalidatesParent(z);
                gb2Var.z3(k27Var, j, false, false, false, false);
                if (!j47Var.P.i() && arrayList.size() >= 10) {
                    i2 = arrayList.size() % 10;
                }
                if (i == i2 && !k27Var.m5()) {
                    j47Var.Q = gb2Var;
                    Point point = gl.q;
                    gb2Var.B3(point.x, point.y);
                    j47Var.R = k27Var.e1();
                    return;
                }
                return;
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        byte b = this.c;
        Context context = this.d;
        switch (b) {
            case 0:
                mpb mpbVar = new mpb(context);
                mpbVar.setLayoutParams(new e49(gl.L(46.0f), gl.L(56.0f)));
                mpbVar.setBackground(bkb.f0(553648127, 1, -1));
                return new s49(mpbVar);
            default:
                j47 j47Var = (j47) this.f;
                i47 i47Var = new i47(j47Var, context, j47Var.c, (wjb) this.e);
                i47Var.setDelegate(new pd5((byte) 22));
                return new s49(i47Var);
        }
    }

    @Override
    public final void y(s49 s49Var) {
        switch (this.c) {
            case 0:
                ik2 ik2Var = (ik2) s49Var.a;
                ((mi4) this.e).a(ik2Var);
                int i = ik2Var.s;
                if (i >= 0 && i < fk2.a().size()) {
                    fk2 fk2Var = (fk2) fk2.a().get(ik2Var.s);
                    ik2Var.setDrawable(new gk2(fk2Var, false));
                    ik2Var.b(fk2Var.equals(((jk2) this.f).b), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void z(s49 s49Var) {
        switch (this.c) {
            case 0:
                ((mi4) this.e).d.remove((ik2) s49Var.a);
                return;
            default:
                return;
        }
    }
}
