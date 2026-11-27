package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
public final class qt4 extends l69 {
    public final wt4 c;

    public qt4(wt4 wt4Var) {
        this.c = wt4Var;
    }

    @Override
    public final boolean D(f89 f89Var) {
        if (f89Var.f == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i) {
        no6 no6Var;
        int i2 = i - 2;
        wt4 wt4Var = this.c;
        ArrayList arrayList = wt4Var.c0;
        if (wt4Var.d0) {
            if (i2 != 0) {
                i2 = i - 3;
            } else {
                return null;
            }
        } else if (wt4Var.e0) {
            if (i2 >= 0 && i2 < arrayList.size()) {
                return ob6.e0(((c8b) arrayList.get(i2)).d / 1000, true);
            }
            i2 -= arrayList.size();
        }
        ArrayList arrayList2 = wt4Var.g0;
        if (arrayList2 != null && i2 >= 0 && i2 < arrayList2.size() && (no6Var = (no6) wt4Var.g0.get(i2)) != null) {
            long j = no6Var.D;
            if (Build.VERSION.SDK_INT <= 28) {
                j /= 1000;
            }
            return ob6.e0(j, true);
        }
        return null;
    }

    @Override
    public final void G(d79 d79Var, float f, int[] iArr) {
        int i;
        int e = e();
        wt4 wt4Var = this.c;
        ar0 ar0Var = wt4Var.e;
        float f2 = ar0Var.J;
        int width = (int) (((int) (((d79Var.getWidth() - d79Var.getPaddingLeft()) - d79Var.getPaddingRight()) / f2)) * wt4Var.P);
        int ceil = (int) Math.ceil(e / f2);
        float U1 = (hl.U1(f, 0, Math.max(0, i - ((hl.q.y - d79Var.getPaddingTop()) - d79Var.getPaddingBottom()))) / (ceil * width)) * ceil;
        int round = Math.round(U1);
        iArr[0] = Math.max(0, ar0Var.J * round) + 2;
        iArr[1] = d79Var.getPaddingTop() + ((int) ((U1 - round) * width));
    }

    @Override
    public final float H(d79 d79Var) {
        wt4 wt4Var;
        int e = e();
        float f = this.c.e.J;
        return (Math.max(0, d79Var.computeVerticalScrollOffset() - wt4Var.getPadding()) - d79Var.getPaddingTop()) / ((((int) Math.ceil(e / f)) * ((int) (((int) (((d79Var.getWidth() - d79Var.getPaddingLeft()) - d79Var.getPaddingRight()) / f)) * wt4Var.P))) - (hl.q.y - d79Var.getPaddingTop()));
    }

    @Override
    public final int b() {
        return e() + 3;
    }

    @Override
    public final int d(int i) {
        if (i != 0 && i != b() - 1) {
            if (i == 1) {
                return 1;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final int e() {
        int size;
        wt4 wt4Var = this.c;
        ArrayList arrayList = wt4Var.g0;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        if (wt4Var.d0) {
            return size + 1;
        }
        if (wt4Var.e0) {
            return wt4Var.c0.size() + size;
        }
        return size;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        wt4 wt4Var = this.c;
        ArrayList arrayList = wt4Var.i0;
        ArrayList arrayList2 = wt4Var.c0;
        int i2 = f89Var.f;
        View view = f89Var.a;
        int i3 = -1;
        if (i2 == 0) {
            tt4 tt4Var = (tt4) view;
            if (i == 0) {
                i3 = wt4Var.getPadding();
            }
            tt4Var.a = i3;
        } else if (i2 == 2) {
            st4 st4Var = (st4) view;
            boolean z4 = true;
            if (i == 2) {
                z = true;
            } else {
                z = false;
            }
            if (i == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            st4Var.V = z;
            st4Var.W = z2;
            st4Var.N = new pt4(this, st4Var, (byte) 0);
            st4Var.O = new pt4(this, st4Var, (byte) 1);
            int i4 = i - 2;
            if (wt4Var.d0) {
                if (i4 == 0) {
                    st4Var.f(-1, false, false);
                    st4Var.e(arrayList2.size(), (c8b) arrayList2.get(0));
                    return;
                }
                i4 = i - 3;
            } else if (wt4Var.e0) {
                if (i4 >= 0 && i4 < arrayList2.size()) {
                    st4Var.f(-1, false, false);
                    st4Var.e(0, (c8b) arrayList2.get(i4));
                    return;
                }
                i4 -= arrayList2.size();
            }
            ArrayList arrayList3 = wt4Var.g0;
            if (arrayList3 != null && i4 >= 0 && i4 < arrayList3.size()) {
                no6 no6Var = (no6) wt4Var.g0.get(i4);
                if (arrayList.isEmpty() && !wt4Var.R) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                int indexOf = arrayList.indexOf(no6Var);
                if (st4Var.T != no6Var) {
                    z4 = false;
                }
                st4Var.f(indexOf, z3, z4);
                st4Var.T = no6Var;
                if (no6Var != null && no6Var.b && !no6Var.d()) {
                    str = hl.g0(no6Var.E, false, false);
                } else {
                    str = null;
                }
                st4Var.g(str);
                st4Var.G = null;
                if (no6Var == null) {
                    st4Var.P = null;
                } else if (no6Var.b) {
                    st4Var.P = ob6.M0(2131753926, null) + ", " + ob6.z(no6Var.E);
                } else {
                    st4Var.P = ob6.M0(2131753941, null);
                }
                st4Var.b(no6Var);
                st4Var.invalidate();
                if (wt4Var.N) {
                    st4Var.J.setOnClickListener(new c0(this, no6Var, st4Var, (byte) 29));
                }
            }
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        View st4Var;
        float f;
        float f2;
        wt4 wt4Var = this.c;
        if (i == 0) {
            st4Var = new tt4(wt4Var, wt4Var.getContext());
        } else if (i == 1) {
            Context context = wt4Var.getContext();
            boolean z = wt4Var.M;
            b6 b6Var = new b6(context, (byte) 15);
            if (z) {
                f = 14.0f;
            } else {
                f = 16.0f;
            }
            b6Var.setPadding(hl.L(f), hl.L(16.0f), hl.L(8.0f), hl.L(10.0f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(-1);
            textView.setTypeface(hl.o());
            textView.setText(wt4Var.getTitle());
            if (z) {
                f2 = 32.0f;
            } else {
                f2 = 0.0f;
            }
            b6Var.addView(textView, tre.d(-1, -1.0f, 119, 0.0f, 0.0f, f2, 0.0f));
            wt4Var.j0 = b6Var;
            st4Var = b6Var;
        } else {
            st4Var = new st4(wt4Var.getContext(), wt4Var.b, wt4Var.P, wt4Var.N);
        }
        return new f89(st4Var);
    }

    @Override
    public final void y(f89 f89Var) {
        boolean z;
        wt4 wt4Var = this.c;
        ArrayList arrayList = wt4Var.i0;
        if (f89Var.f == 2) {
            st4 st4Var = (st4) f89Var.a;
            Object obj = st4Var.T;
            if (obj instanceof no6) {
                no6 no6Var = (no6) obj;
                if (arrayList.isEmpty() && !wt4Var.R) {
                    z = false;
                } else {
                    z = true;
                }
                st4Var.f(arrayList.indexOf(no6Var), z, false);
                return;
            }
            st4Var.f(-1, false, false);
        }
    }
}
