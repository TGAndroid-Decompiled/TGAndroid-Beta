package hi;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.ef;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.kj0;
public final class x2 extends kj0 {
    public final d3 f15740c;

    public x2(d3 d3Var) {
        this.f15740c = d3Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59165f == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i7) {
        ef efVar;
        int i10 = i7 - 2;
        d3 d3Var = this.f15740c;
        if (d3Var.f14490d0) {
            if (i10 == 0) {
                return null;
            }
            i10 = i7 - 3;
        } else if (d3Var.f14492e0) {
            if (i10 >= 0 && i10 < d3Var.f14489c0.size()) {
                return gd.e0(((c7) d3Var.f14489c0.get(i10)).d / 1000, true);
            }
            i10 -= d3Var.f14489c0.size();
        }
        ArrayList arrayList = d3Var.f14495g0;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size() || (efVar = (ef) d3Var.f14495g0.get(i10)) == null) {
            return null;
        }
        long j3 = efVar.D;
        if (Build.VERSION.SDK_INT <= 28) {
            j3 /= 1000;
        }
        return gd.e0(j3, true);
    }

    @Override
    public final void G(ek0 ek0Var, float f10, int[] iArr) {
        int i7;
        int e10 = e();
        d3 d3Var = this.f15740c;
        gi.g gVar = d3Var.f14491e;
        float f11 = gVar.J;
        int width = (int) (((int) (((ek0Var.getWidth() - ek0Var.getPaddingLeft()) - ek0Var.getPaddingRight()) / f11)) * d3Var.P);
        int ceil = (int) Math.ceil(e10 / f11);
        float W1 = (org.telegram.messenger.g0.W1(f10, 0, Math.max(0, i7 - ((org.telegram.messenger.g0.f24146q.y - ek0Var.getPaddingTop()) - ek0Var.getPaddingBottom()))) / (ceil * width)) * ceil;
        int round = Math.round(W1);
        iArr[0] = Math.max(0, gVar.J * round) + 2;
        iArr[1] = ek0Var.getPaddingTop() + ((int) ((W1 - round) * width));
    }

    @Override
    public final float H(ek0 ek0Var) {
        d3 d3Var;
        int e10 = e();
        float f10 = this.f15740c.f14491e.J;
        return (Math.max(0, ek0Var.computeVerticalScrollOffset() - d3Var.getPadding()) - ek0Var.getPaddingTop()) / ((((int) Math.ceil(e10 / f10)) * ((int) (((int) (((ek0Var.getWidth() - ek0Var.getPaddingLeft()) - ek0Var.getPaddingRight()) / f10)) * d3Var.P))) - (org.telegram.messenger.g0.f24146q.y - ek0Var.getPaddingTop()));
    }

    @Override
    public final int b() {
        return e() + 3;
    }

    @Override
    public final int d(int i7) {
        if (i7 != 0 && i7 != b() - 1) {
            if (i7 == 1) {
                return 1;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final int e() {
        int size;
        d3 d3Var = this.f15740c;
        ArrayList arrayList = d3Var.f14495g0;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        if (d3Var.f14490d0) {
            return size + 1;
        }
        if (d3Var.f14492e0) {
            return d3Var.f14489c0.size() + size;
        }
        return size;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        d3 d3Var = this.f15740c;
        ArrayList arrayList = d3Var.f14497i0;
        ArrayList arrayList2 = d3Var.f14489c0;
        int i10 = f1Var.f59165f;
        View view = f1Var.f59161a;
        int i11 = -1;
        if (i10 == 0) {
            a3 a3Var = (a3) view;
            if (i7 == 0) {
                i11 = d3Var.getPadding();
            }
            a3Var.f14243a = i11;
        } else if (i10 == 2) {
            z2 z2Var = (z2) view;
            boolean z13 = true;
            if (i7 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i7 == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            z2Var.V = z10;
            z2Var.W = z11;
            z2Var.N = new w2(this, z2Var, 0);
            z2Var.O = new w2(this, z2Var, 1);
            int i12 = i7 - 2;
            if (d3Var.f14490d0) {
                if (i12 == 0) {
                    z2Var.f(-1, false, false);
                    z2Var.e(arrayList2.size(), (c7) arrayList2.get(0));
                    return;
                }
                i12 = i7 - 3;
            } else if (d3Var.f14492e0) {
                if (i12 >= 0 && i12 < arrayList2.size()) {
                    z2Var.f(-1, false, false);
                    z2Var.e(0, (c7) arrayList2.get(i12));
                    return;
                }
                i12 -= arrayList2.size();
            }
            ArrayList arrayList3 = d3Var.f14495g0;
            if (arrayList3 != null && i12 >= 0 && i12 < arrayList3.size()) {
                ef efVar = (ef) d3Var.f14495g0.get(i12);
                if (arrayList.isEmpty() && !d3Var.R) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                int indexOf = arrayList.indexOf(efVar);
                if (z2Var.T != efVar) {
                    z13 = false;
                }
                z2Var.f(indexOf, z12, z13);
                z2Var.T = efVar;
                if (efVar != null && efVar.f27875b && !efVar.d()) {
                    str = org.telegram.messenger.g0.g0(efVar.E, false, false);
                } else {
                    str = null;
                }
                z2Var.g(str);
                z2Var.G = null;
                if (efVar == null) {
                    z2Var.P = null;
                } else if (efVar.f27875b) {
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.ui.Cells.c0.u(null, 2131753930, sb2, ", ");
                    sb2.append(gd.z(efVar.E));
                    z2Var.P = sb2.toString();
                } else {
                    z2Var.P = gd.N0(2131753945, null);
                }
                z2Var.b(efVar);
                z2Var.invalidate();
                if (d3Var.N) {
                    z2Var.J.setOnClickListener(new ah.h(this, efVar, z2Var, 14));
                }
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        float f10;
        float f11;
        bi.t2 t2Var;
        d3 d3Var = this.f15740c;
        if (i7 == 0) {
            t2Var = new a3(d3Var, d3Var.getContext());
        } else if (i7 == 1) {
            Context context = d3Var.getContext();
            boolean z10 = d3Var.M;
            bi.t2 t2Var2 = new bi.t2(context, 3);
            if (z10) {
                f10 = 14.0f;
            } else {
                f10 = 16.0f;
            }
            t2Var2.setPadding(org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(10.0f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(-1);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(d3Var.getTitle());
            if (z10) {
                f11 = 32.0f;
            } else {
                f11 = 0.0f;
            }
            t2Var2.addView(textView, c8.ma.d(-1, -1.0f, 119, 0.0f, 0.0f, f11, 0.0f));
            d3Var.f14498j0 = t2Var2;
            t2Var = t2Var2;
        } else {
            t2Var = new z2(d3Var.getContext(), d3Var.f14486b, d3Var.P, d3Var.N);
        }
        return new v4.f1(t2Var);
    }

    @Override
    public final void y(v4.f1 f1Var) {
        boolean z10;
        d3 d3Var = this.f15740c;
        ArrayList arrayList = d3Var.f14497i0;
        if (f1Var.f59165f == 2) {
            z2 z2Var = (z2) f1Var.f59161a;
            Object obj = z2Var.T;
            if (obj instanceof ef) {
                ef efVar = (ef) obj;
                if (arrayList.isEmpty() && !d3Var.R) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                z2Var.f(arrayList.indexOf(efVar), z10, false);
                return;
            }
            z2Var.f(-1, false, false);
        }
    }
}
