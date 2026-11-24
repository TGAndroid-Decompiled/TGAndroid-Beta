package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public class ew3 extends fx0 implements gk7 {
    public static int C1 = 1;
    public q8c A1;
    public final ArrayList B1;
    public String l1;
    public int m1;
    public final bv3 n1;
    public final cv3 o1;
    public final vq1 p1;
    public final dw3 q1;
    public float r1;
    public final boolean s1;
    public final boolean t1;
    public boolean u1;
    public int v1;
    public ur4 w1;
    public float x1;
    public l8c y1;
    public r31 z1;

    public ew3(wjb wjbVar, Context context, boolean z, boolean z2) {
        super(1, wjbVar, context, true);
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
        L(bkb.v0(bkb.g5, wjbVar));
        this.v1 = this.H0;
        this.x = true;
        z0(false);
        this.b = new ev3(this, context);
        vq1 vq1Var = new vq1((byte) 2, context, this);
        this.p1 = vq1Var;
        if (z) {
            i = 0;
        } else {
            i = C1;
        }
        vq1Var.b = i;
        vq1Var.setAdapter(new dv3(this, z, context));
        this.b.addView(vq1Var, nme.e(-1, -1, 87));
        new mv5(this.b, false, new av3(this, (byte) 0));
        if (!z) {
            dw3 dw3Var = new dw3(context);
            this.q1 = dw3Var;
            dw3Var.H = new av3(this, (byte) 1);
            dw3Var.G = vq1Var.b;
            dw3Var.invalidate();
            this.b.addView(dw3Var, nme.e(-1, -2, 87));
        }
        kk7.f(this.a).b(this, kk7.w0);
        kk7.f(this.a).b(this, kk7.A0);
        boolean z3 = fa4.j;
        if (!z) {
            hq6.d0(this.a).D(5);
            hq6.d0(this.a).y();
            hq6.d0(this.a).X0(true, true, false, 0);
        }
        hq6.d0(this.a).D(0);
        hq6.d0(this.a).X0(false, true, false, 0);
        hq6.d0(this.a).X0(false, true, false, 2);
        hq6.d0(this.a).X0(false, true, false, 7);
    }

    @Override
    public final boolean D() {
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
        xv3 xv3Var;
        this.d = false;
        this.c.animate().translationY(0.0f).setDuration(250L).setInterpolator(gb.w).start();
        for (View view : this.p1.getViewPages()) {
            if (view instanceof tv3) {
                xv3 xv3Var2 = ((tv3) view).f;
                if (xv3Var2 != null) {
                    gl.t1(xv3Var2.e);
                }
            } else if ((view instanceof nv3) && (xv3Var = ((nv3) view).d) != null) {
                gl.t1(xv3Var.e);
            }
        }
    }

    public final void H0(int i) {
        if (D0(Integer.valueOf(i))) {
            if ((i != 1 || F0(new sm3(this, i, (byte) 2))) && ((Boolean) this.A1.a(Integer.valueOf(i))).booleanValue()) {
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
            cw3 cw3Var = (cw3) obj;
            boolean E0 = cw3Var.f.E0(6);
            ArrayList arrayList2 = cw3Var.c;
            int size2 = arrayList2.size();
            int i2 = -1;
            int i3 = 0;
            while (true) {
                z = true;
                if (i3 >= arrayList2.size()) {
                    break;
                }
                byte b = ((yv3) arrayList2.get(i3)).a;
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
                    arrayList2.add(size2, new zv3(cw3Var, 6, 2131231190, k96.M0(2131744203, null)));
                } else {
                    arrayList2.remove(i2);
                }
                cw3Var.requestLayout();
                cw3Var.invalidate();
            }
        }
    }

    public final void J0(q8c q8cVar) {
        View[] viewPages;
        this.A1 = q8cVar;
        for (View view : this.p1.getViewPages()) {
            if (view instanceof tv3) {
                sv3 sv3Var = ((tv3) view).c;
                if (sv3Var.I == null) {
                    sv3Var.D(null);
                }
            }
        }
    }

    @Override
    public final int Q() {
        if (this.b.getMeasuredHeight() <= 0) {
            return gl.q.y;
        }
        return (int) (this.b.getMeasuredHeight() - this.p1.getY());
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        View[] viewPages;
        int i3 = kk7.w0;
        int i4 = kk7.A0;
        if (i == i3 || i == i4) {
            for (View view : this.p1.getViewPages()) {
                if (view instanceof tv3) {
                    tv3 tv3Var = (tv3) view;
                    if (i == i4 || ((tv3Var.a == 0 && ((Integer) objArr[0]).intValue() == 5) || (tv3Var.a == 1 && ((Integer) objArr[0]).intValue() == 0))) {
                        sv3 sv3Var = tv3Var.c;
                        if (sv3Var.I == null) {
                            sv3Var.D(null);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        kk7.f(this.a).n(this, kk7.w0);
        kk7.f(this.a).n(this, kk7.A0);
        G0();
        super.dismiss();
        boolean z = fa4.j;
    }

    @Override
    public final void p0() {
        int v0;
        super.p0();
        try {
            if (this.G0 < 0 && this.H0 == this.v1 && (v0 = bkb.v0(bkb.g5, this.J0)) != this.H0) {
                this.H0 = v0;
                this.v1 = v0;
                x0(v0);
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
