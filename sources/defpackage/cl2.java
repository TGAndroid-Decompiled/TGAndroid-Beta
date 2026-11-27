package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class cl2 extends j79 {
    public final byte c;
    public final Context d;
    public final Object e;
    public final KeyEvent.Callback f;

    public cl2(KeyEvent.Callback callback, Context context, Object obj, byte b) {
        this.c = b;
        this.f = callback;
        this.d = context;
        this.e = obj;
    }

    @Override
    public final int b() {
        switch (this.c) {
            case 0:
                return al2.a().size();
            default:
                return ((q67) this.f).N.size();
        }
    }

    @Override
    public final void t(f89 f89Var, int i) {
        byte b = this.c;
        boolean z = true;
        KeyEvent.Callback callback = this.f;
        int i2 = 0;
        switch (b) {
            case 0:
                dl2 dl2Var = (dl2) f89Var.a;
                al2 al2Var = (al2) al2.a().get(i);
                if (i != dl2Var.s) {
                    z = false;
                }
                dl2Var.setDrawable(new bl2(al2Var, false));
                dl2Var.b(al2Var.equals(((el2) callback).b), z);
                dl2Var.s = i;
                return;
            default:
                q67 q67Var = (q67) callback;
                ArrayList arrayList = q67Var.N;
                r47 r47Var = (r47) arrayList.get((b() - 1) - i);
                wb2 wb2Var = (wb2) f89Var.a;
                m47 j = q67Var.j(r47Var);
                if (j == null) {
                    z = false;
                }
                wb2Var.setInvalidatesParent(z);
                wb2Var.z3(r47Var, j, false, false, false, false);
                if (!q67Var.P.i() && arrayList.size() >= 10) {
                    i2 = arrayList.size() % 10;
                }
                if (i == i2 && !r47Var.m5()) {
                    q67Var.Q = wb2Var;
                    Point point = hl.q;
                    wb2Var.B3(point.x, point.y);
                    q67Var.R = r47Var.e1();
                    return;
                }
                return;
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        byte b = this.c;
        Context context = this.d;
        switch (b) {
            case 0:
                ntb ntbVar = new ntb((Activity) context);
                ntbVar.setLayoutParams(new r79(hl.L(46.0f), hl.L(56.0f)));
                ntbVar.setBackground(aob.f0(553648127, 1, -1));
                return new f89(ntbVar);
            default:
                q67 q67Var = (q67) this.f;
                p67 p67Var = new p67(q67Var, context, q67Var.c, (vnb) this.e);
                p67Var.setDelegate(new qf5((byte) 22));
                return new f89(p67Var);
        }
    }

    @Override
    public final void y(f89 f89Var) {
        switch (this.c) {
            case 0:
                dl2 dl2Var = (dl2) f89Var.a;
                ((rk4) this.e).a(dl2Var);
                int i = dl2Var.s;
                if (i >= 0 && i < al2.a().size()) {
                    al2 al2Var = (al2) al2.a().get(dl2Var.s);
                    dl2Var.setDrawable(new bl2(al2Var, false));
                    dl2Var.b(al2Var.equals(((el2) this.f).b), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void z(f89 f89Var) {
        switch (this.c) {
            case 0:
                ((rk4) this.e).d.remove((dl2) f89Var.a);
                return;
            default:
                return;
        }
    }
}
