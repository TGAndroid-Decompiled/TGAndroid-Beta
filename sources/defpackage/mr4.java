package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
public final class mr4 extends w29 {
    public final sr4 c;

    public mr4(sr4 sr4Var) {
        this.c = sr4Var;
    }

    @Override
    public final boolean D(s49 s49Var) {
        if (s49Var.f == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i) {
        jm6 jm6Var;
        int i2 = i - 2;
        sr4 sr4Var = this.c;
        ArrayList arrayList = sr4Var.c0;
        if (sr4Var.d0) {
            if (i2 != 0) {
                i2 = i - 3;
            } else {
                return null;
            }
        } else if (sr4Var.e0) {
            if (i2 >= 0 && i2 < arrayList.size()) {
                return k96.e0(((f4b) arrayList.get(i2)).d / 1000, true);
            }
            i2 -= arrayList.size();
        }
        ArrayList arrayList2 = sr4Var.g0;
        if (arrayList2 != null && i2 >= 0 && i2 < arrayList2.size() && (jm6Var = (jm6) sr4Var.g0.get(i2)) != null) {
            long j = jm6Var.D;
            if (Build.VERSION.SDK_INT <= 28) {
                j /= 1000;
            }
            return k96.e0(j, true);
        }
        return null;
    }

    @Override
    public final void G(o39 o39Var, float f, int[] iArr) {
        int i;
        int e = e();
        sr4 sr4Var = this.c;
        ar0 ar0Var = sr4Var.e;
        float f2 = ar0Var.J;
        int width = (int) (((int) (((o39Var.getWidth() - o39Var.getPaddingLeft()) - o39Var.getPaddingRight()) / f2)) * sr4Var.P);
        int ceil = (int) Math.ceil(e / f2);
        float U1 = (gl.U1(f, 0, Math.max(0, i - ((gl.q.y - o39Var.getPaddingTop()) - o39Var.getPaddingBottom()))) / (ceil * width)) * ceil;
        int round = Math.round(U1);
        iArr[0] = Math.max(0, ar0Var.J * round) + 2;
        iArr[1] = o39Var.getPaddingTop() + ((int) ((U1 - round) * width));
    }

    @Override
    public final float H(o39 o39Var) {
        sr4 sr4Var;
        int e = e();
        float f = this.c.e.J;
        return (Math.max(0, o39Var.computeVerticalScrollOffset() - sr4Var.getPadding()) - o39Var.getPaddingTop()) / ((((int) Math.ceil(e / f)) * ((int) (((int) (((o39Var.getWidth() - o39Var.getPaddingLeft()) - o39Var.getPaddingRight()) / f)) * sr4Var.P))) - (gl.q.y - o39Var.getPaddingTop()));
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
        sr4 sr4Var = this.c;
        ArrayList arrayList = sr4Var.g0;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        if (sr4Var.d0) {
            return size + 1;
        }
        if (sr4Var.e0) {
            return sr4Var.c0.size() + size;
        }
        return size;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        sr4 sr4Var = this.c;
        ArrayList arrayList = sr4Var.i0;
        ArrayList arrayList2 = sr4Var.c0;
        int i2 = s49Var.f;
        View view = s49Var.a;
        int i3 = -1;
        if (i2 == 0) {
            pr4 pr4Var = (pr4) view;
            if (i == 0) {
                i3 = sr4Var.getPadding();
            }
            pr4Var.a = i3;
        } else if (i2 == 2) {
            or4 or4Var = (or4) view;
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
            or4Var.V = z;
            or4Var.W = z2;
            or4Var.N = new lr4(this, or4Var, (byte) 0);
            or4Var.O = new lr4(this, or4Var, (byte) 1);
            int i4 = i - 2;
            if (sr4Var.d0) {
                if (i4 == 0) {
                    or4Var.f(-1, false, false);
                    or4Var.e(arrayList2.size(), (f4b) arrayList2.get(0));
                    return;
                }
                i4 = i - 3;
            } else if (sr4Var.e0) {
                if (i4 >= 0 && i4 < arrayList2.size()) {
                    or4Var.f(-1, false, false);
                    or4Var.e(0, (f4b) arrayList2.get(i4));
                    return;
                }
                i4 -= arrayList2.size();
            }
            ArrayList arrayList3 = sr4Var.g0;
            if (arrayList3 != null && i4 >= 0 && i4 < arrayList3.size()) {
                jm6 jm6Var = (jm6) sr4Var.g0.get(i4);
                if (arrayList.isEmpty() && !sr4Var.R) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                int indexOf = arrayList.indexOf(jm6Var);
                if (or4Var.T != jm6Var) {
                    z4 = false;
                }
                or4Var.f(indexOf, z3, z4);
                or4Var.T = jm6Var;
                if (jm6Var != null && jm6Var.b && !jm6Var.d()) {
                    str = gl.g0(jm6Var.E, false, false);
                } else {
                    str = null;
                }
                or4Var.g(str);
                or4Var.G = null;
                if (jm6Var == null) {
                    or4Var.P = null;
                } else if (jm6Var.b) {
                    or4Var.P = k96.M0(2131753930, null) + ", " + k96.z(jm6Var.E);
                } else {
                    or4Var.P = k96.M0(2131753945, null);
                }
                or4Var.b(jm6Var);
                or4Var.invalidate();
                if (sr4Var.N) {
                    or4Var.J.setOnClickListener(new b0(this, jm6Var, or4Var, (byte) 29));
                }
            }
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        View or4Var;
        float f;
        float f2;
        sr4 sr4Var = this.c;
        if (i == 0) {
            or4Var = new pr4(sr4Var, sr4Var.getContext());
        } else if (i == 1) {
            Context context = sr4Var.getContext();
            boolean z = sr4Var.M;
            a6 a6Var = new a6(context, (byte) 14);
            if (z) {
                f = 14.0f;
            } else {
                f = 16.0f;
            }
            a6Var.setPadding(gl.L(f), gl.L(16.0f), gl.L(8.0f), gl.L(10.0f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(-1);
            textView.setTypeface(gl.o());
            textView.setText(sr4Var.getTitle());
            if (z) {
                f2 = 32.0f;
            } else {
                f2 = 0.0f;
            }
            a6Var.addView(textView, nme.d(-1, -1.0f, 119, 0.0f, 0.0f, f2, 0.0f));
            sr4Var.j0 = a6Var;
            or4Var = a6Var;
        } else {
            or4Var = new or4(sr4Var.getContext(), sr4Var.b, sr4Var.P, sr4Var.N);
        }
        return new s49(or4Var);
    }

    @Override
    public final void y(s49 s49Var) {
        boolean z;
        sr4 sr4Var = this.c;
        ArrayList arrayList = sr4Var.i0;
        if (s49Var.f == 2) {
            or4 or4Var = (or4) s49Var.a;
            Object obj = or4Var.T;
            if (obj instanceof jm6) {
                jm6 jm6Var = (jm6) obj;
                if (arrayList.isEmpty() && !sr4Var.R) {
                    z = false;
                } else {
                    z = true;
                }
                or4Var.f(arrayList.indexOf(jm6Var), z, false);
                return;
            }
            or4Var.f(-1, false, false);
        }
    }
}
