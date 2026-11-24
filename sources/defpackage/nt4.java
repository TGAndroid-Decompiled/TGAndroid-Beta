package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
public final class nt4 extends z49 {
    public final tt4 c;

    public nt4(tt4 tt4Var) {
        this.c = tt4Var;
    }

    @Override
    public final boolean D(u69 u69Var) {
        if (u69Var.f == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i) {
        jo6 jo6Var;
        int i2 = i - 2;
        tt4 tt4Var = this.c;
        ArrayList arrayList = tt4Var.c0;
        if (tt4Var.d0) {
            if (i2 != 0) {
                i2 = i - 3;
            } else {
                return null;
            }
        } else if (tt4Var.e0) {
            if (i2 >= 0 && i2 < arrayList.size()) {
                return jb6.e0(((g6b) arrayList.get(i2)).d / 1000, true);
            }
            i2 -= arrayList.size();
        }
        ArrayList arrayList2 = tt4Var.g0;
        if (arrayList2 != null && i2 >= 0 && i2 < arrayList2.size() && (jo6Var = (jo6) tt4Var.g0.get(i2)) != null) {
            long j = jo6Var.D;
            if (Build.VERSION.SDK_INT <= 28) {
                j /= 1000;
            }
            return jb6.e0(j, true);
        }
        return null;
    }

    @Override
    public final void G(r59 r59Var, float f, int[] iArr) {
        int i;
        int e = e();
        tt4 tt4Var = this.c;
        as0 as0Var = tt4Var.e;
        float f2 = as0Var.J;
        int width = (int) (((int) (((r59Var.getWidth() - r59Var.getPaddingLeft()) - r59Var.getPaddingRight()) / f2)) * tt4Var.P);
        int ceil = (int) Math.ceil(e / f2);
        float U1 = (gm.U1(f, 0, Math.max(0, i - ((gm.q.y - r59Var.getPaddingTop()) - r59Var.getPaddingBottom()))) / (ceil * width)) * ceil;
        int round = Math.round(U1);
        iArr[0] = Math.max(0, as0Var.J * round) + 2;
        iArr[1] = r59Var.getPaddingTop() + ((int) ((U1 - round) * width));
    }

    @Override
    public final float H(r59 r59Var) {
        tt4 tt4Var;
        int e = e();
        float f = this.c.e.J;
        return (Math.max(0, r59Var.computeVerticalScrollOffset() - tt4Var.getPadding()) - r59Var.getPaddingTop()) / ((((int) Math.ceil(e / f)) * ((int) (((int) (((r59Var.getWidth() - r59Var.getPaddingLeft()) - r59Var.getPaddingRight()) / f)) * tt4Var.P))) - (gm.q.y - r59Var.getPaddingTop()));
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
        tt4 tt4Var = this.c;
        ArrayList arrayList = tt4Var.g0;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        if (tt4Var.d0) {
            return size + 1;
        }
        if (tt4Var.e0) {
            return tt4Var.c0.size() + size;
        }
        return size;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        tt4 tt4Var = this.c;
        ArrayList arrayList = tt4Var.i0;
        ArrayList arrayList2 = tt4Var.c0;
        int i2 = u69Var.f;
        View view = u69Var.a;
        int i3 = -1;
        if (i2 == 0) {
            qt4 qt4Var = (qt4) view;
            if (i == 0) {
                i3 = tt4Var.getPadding();
            }
            qt4Var.a = i3;
        } else if (i2 == 2) {
            pt4 pt4Var = (pt4) view;
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
            pt4Var.V = z;
            pt4Var.W = z2;
            pt4Var.N = new mt4(this, pt4Var, (byte) 0);
            pt4Var.O = new mt4(this, pt4Var, (byte) 1);
            int i4 = i - 2;
            if (tt4Var.d0) {
                if (i4 == 0) {
                    pt4Var.f(-1, false, false);
                    pt4Var.e(arrayList2.size(), (g6b) arrayList2.get(0));
                    return;
                }
                i4 = i - 3;
            } else if (tt4Var.e0) {
                if (i4 >= 0 && i4 < arrayList2.size()) {
                    pt4Var.f(-1, false, false);
                    pt4Var.e(0, (g6b) arrayList2.get(i4));
                    return;
                }
                i4 -= arrayList2.size();
            }
            ArrayList arrayList3 = tt4Var.g0;
            if (arrayList3 != null && i4 >= 0 && i4 < arrayList3.size()) {
                jo6 jo6Var = (jo6) tt4Var.g0.get(i4);
                if (arrayList.isEmpty() && !tt4Var.R) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                int indexOf = arrayList.indexOf(jo6Var);
                if (pt4Var.T != jo6Var) {
                    z4 = false;
                }
                pt4Var.f(indexOf, z3, z4);
                pt4Var.T = jo6Var;
                if (jo6Var != null && jo6Var.b && !jo6Var.d()) {
                    str = gm.g0(jo6Var.E, false, false);
                } else {
                    str = null;
                }
                pt4Var.g(str);
                pt4Var.G = null;
                if (jo6Var == null) {
                    pt4Var.P = null;
                } else if (jo6Var.b) {
                    pt4Var.P = jb6.M0(2131753898, null) + ", " + jb6.z(jo6Var.E);
                } else {
                    pt4Var.P = jb6.M0(2131753913, null);
                }
                pt4Var.b(jo6Var);
                pt4Var.invalidate();
                if (tt4Var.N) {
                    pt4Var.J.setOnClickListener(new b0(this, jo6Var, pt4Var, (byte) 29));
                }
            }
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        View pt4Var;
        float f;
        float f2;
        tt4 tt4Var = this.c;
        if (i == 0) {
            pt4Var = new qt4(tt4Var, tt4Var.getContext());
        } else if (i == 1) {
            Context context = tt4Var.getContext();
            boolean z = tt4Var.M;
            a6 a6Var = new a6(context, (byte) 14);
            if (z) {
                f = 14.0f;
            } else {
                f = 16.0f;
            }
            a6Var.setPadding(gm.L(f), gm.L(16.0f), gm.L(8.0f), gm.L(10.0f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(-1);
            textView.setTypeface(gm.o());
            textView.setText(tt4Var.getTitle());
            if (z) {
                f2 = 32.0f;
            } else {
                f2 = 0.0f;
            }
            a6Var.addView(textView, qoe.d(-1, -1.0f, 119, 0.0f, 0.0f, f2, 0.0f));
            tt4Var.j0 = a6Var;
            pt4Var = a6Var;
        } else {
            pt4Var = new pt4(tt4Var.getContext(), tt4Var.b, tt4Var.P, tt4Var.N);
        }
        return new u69(pt4Var);
    }

    @Override
    public final void y(u69 u69Var) {
        boolean z;
        tt4 tt4Var = this.c;
        ArrayList arrayList = tt4Var.i0;
        if (u69Var.f == 2) {
            pt4 pt4Var = (pt4) u69Var.a;
            Object obj = pt4Var.T;
            if (obj instanceof jo6) {
                jo6 jo6Var = (jo6) obj;
                if (arrayList.isEmpty() && !tt4Var.R) {
                    z = false;
                } else {
                    z = true;
                }
                pt4Var.f(arrayList.indexOf(jo6Var), z, false);
                return;
            }
            pt4Var.f(-1, false, false);
        }
    }
}
