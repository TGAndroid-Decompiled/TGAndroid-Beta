package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public class px3 extends my0 implements jm7 {
    public static int C1 = 1;
    public rac A1;
    public final ArrayList B1;
    public String l1;
    public int m1;
    public final mw3 n1;
    public final nw3 o1;
    public final hs1 p1;
    public final ox3 q1;
    public float r1;
    public final boolean s1;
    public final boolean t1;
    public boolean u1;
    public int v1;
    public vt4 w1;
    public float x1;
    public mac y1;
    public y41 z1;

    public px3(ylb ylbVar, Context context, boolean z, boolean z2) {
        super(1, ylbVar, context, true);
        int i;
        this.l1 = null;
        this.m1 = -1;
        this.n1 = new TLRPC.Document();
        this.o1 = new TLRPC.Document();
        this.r1 = -1.0f;
        this.B1 = new ArrayList();
        this.s1 = z;
        this.t1 = z2;
        this.G = true;
        K(cmb.v0(cmb.g5, ylbVar));
        this.v1 = this.H0;
        this.x = true;
        z0(false);
        this.b = new pw3(this, context);
        hs1 hs1Var = new hs1((byte) 2, context, this);
        this.p1 = hs1Var;
        if (z) {
            i = 0;
        } else {
            i = C1;
        }
        hs1Var.b = i;
        hs1Var.setAdapter(new ow3(this, z, context));
        this.b.addView(hs1Var, qoe.e(-1, -1, 87));
        new mx5(this.b, false, new lw3(this, (byte) 0));
        if (!z) {
            ox3 ox3Var = new ox3(context);
            this.q1 = ox3Var;
            ox3Var.H = new lw3(this, (byte) 1);
            ox3Var.G = hs1Var.b;
            ox3Var.invalidate();
            this.b.addView(ox3Var, qoe.e(-1, -2, 87));
        }
        nm7.f(this.a).b(this, nm7.x0);
        nm7.f(this.a).b(this, nm7.B0);
        boolean z3 = fc4.j;
        if (!z) {
            hs6.d0(this.a).D(5);
            hs6.d0(this.a).y();
            hs6.d0(this.a).X0(true, true, false, 0);
        }
        hs6.d0(this.a).D(0);
        hs6.d0(this.a).X0(false, true, false, 0);
        hs6.d0(this.a).X0(false, true, false, 2);
        hs6.d0(this.a).X0(false, true, false, 7);
    }

    @Override
    public final boolean C() {
        if (this.p1.getTranslationY() >= ((int) this.r1)) {
            return true;
        }
        return false;
    }

    public boolean D0(Integer num) {
        return true;
    }

    public boolean E0(Integer num) {
        if (num.intValue() != 6) {
            return true;
        }
        return false;
    }

    public boolean F0(Runnable runnable) {
        return true;
    }

    public final void G0() {
        View[] viewPages;
        ix3 ix3Var;
        this.d = false;
        this.c.animate().translationY(0.0f).setDuration(250L).setInterpolator(gb.w).start();
        for (View view : this.p1.getViewPages()) {
            if (view instanceof ex3) {
                ix3 ix3Var2 = ((ex3) view).f;
                if (ix3Var2 != null) {
                    gm.t1(ix3Var2.e);
                }
            } else if ((view instanceof yw3) && (ix3Var = ((yw3) view).d) != null) {
                gm.t1(ix3Var.e);
            }
        }
    }

    public final void H0(int i) {
        if (D0(Integer.valueOf(i))) {
            if ((i != 1 || F0(new bm3(this, i, (byte) 3))) && ((Boolean) this.A1.a(Integer.valueOf(i))).booleanValue()) {
                dismiss();
            }
        }
    }

    public final void I0() {
        boolean z;
        ArrayList arrayList = this.B1;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            nx3 nx3Var = (nx3) obj;
            boolean E0 = nx3Var.f.E0(6);
            ArrayList arrayList2 = nx3Var.c;
            int size2 = arrayList2.size();
            int i2 = -1;
            int i3 = 0;
            while (true) {
                z = true;
                if (i3 >= arrayList2.size()) {
                    break;
                }
                byte b = ((jx3) arrayList2.get(i3)).a;
                if (b == 6) {
                    i2 = i3;
                }
                if (size2 == arrayList2.size() && (b == 1 || b == 2 || b == 3)) {
                    size2 = i3;
                }
                i3++;
            }
            if (i2 < 0) {
                z = false;
            }
            if (E0 != z) {
                if (E0) {
                    arrayList2.add(size2, new kx3(nx3Var, 6, 2131231191, jb6.M0(2131744129, null)));
                } else {
                    arrayList2.remove(i2);
                }
                nx3Var.requestLayout();
                nx3Var.invalidate();
            }
        }
    }

    public final void J0(rac racVar) {
        View[] viewPages;
        this.A1 = racVar;
        for (View view : this.p1.getViewPages()) {
            if (view instanceof ex3) {
                dx3 dx3Var = ((ex3) view).c;
                if (dx3Var.I == null) {
                    dx3Var.D(null);
                }
            }
        }
    }

    @Override
    public final int P() {
        if (this.b.getMeasuredHeight() <= 0) {
            return gm.q.y;
        }
        return (int) (this.b.getMeasuredHeight() - this.p1.getY());
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        View[] viewPages;
        int i3 = nm7.x0;
        int i4 = nm7.B0;
        if (i == i3 || i == i4) {
            for (View view : this.p1.getViewPages()) {
                if (view instanceof ex3) {
                    ex3 ex3Var = (ex3) view;
                    if (i == i4 || ((ex3Var.a == 0 && ((Integer) objArr[0]).intValue() == 5) || (ex3Var.a == 1 && ((Integer) objArr[0]).intValue() == 0))) {
                        dx3 dx3Var = ex3Var.c;
                        if (dx3Var.I == null) {
                            dx3Var.D(null);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        nm7.f(this.a).n(this, nm7.x0);
        nm7.f(this.a).n(this, nm7.B0);
        G0();
        super.dismiss();
        boolean z = fc4.j;
    }

    @Override
    public final void p0() {
        int v0;
        super.p0();
        try {
            if (this.G0 < 0 && this.H0 == this.v1 && (v0 = cmb.v0(cmb.g5, this.J0)) != this.H0) {
                this.H0 = v0;
                this.v1 = v0;
                x0(v0);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
