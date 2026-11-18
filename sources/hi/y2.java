package hi;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.ef;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.ij0;
public final class y2 extends ij0 {
    public final e3 f15759c;

    public y2(e3 e3Var) {
        this.f15759c = e3Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59127f == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i7) {
        ef efVar;
        int i10 = i7 - 2;
        e3 e3Var = this.f15759c;
        if (e3Var.f14539d0) {
            if (i10 == 0) {
                return null;
            }
            i10 = i7 - 3;
        } else if (e3Var.f14541e0) {
            if (i10 >= 0 && i10 < e3Var.f14538c0.size()) {
                return gd.e0(((d7) e3Var.f14538c0.get(i10)).d / 1000, true);
            }
            i10 -= e3Var.f14538c0.size();
        }
        ArrayList arrayList = e3Var.f14544g0;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size() || (efVar = (ef) e3Var.f14544g0.get(i10)) == null) {
            return null;
        }
        long j3 = efVar.D;
        if (Build.VERSION.SDK_INT <= 28) {
            j3 /= 1000;
        }
        return gd.e0(j3, true);
    }

    @Override
    public final void G(ck0 ck0Var, float f10, int[] iArr) {
        int i7;
        int e10 = e();
        e3 e3Var = this.f15759c;
        gi.g gVar = e3Var.f14540e;
        float f11 = gVar.J;
        int width = (int) (((int) (((ck0Var.getWidth() - ck0Var.getPaddingLeft()) - ck0Var.getPaddingRight()) / f11)) * e3Var.P);
        int ceil = (int) Math.ceil(e10 / f11);
        float W1 = (org.telegram.messenger.g0.W1(f10, 0, Math.max(0, i7 - ((org.telegram.messenger.g0.f24118q.y - ck0Var.getPaddingTop()) - ck0Var.getPaddingBottom()))) / (ceil * width)) * ceil;
        int round = Math.round(W1);
        iArr[0] = Math.max(0, gVar.J * round) + 2;
        iArr[1] = ck0Var.getPaddingTop() + ((int) ((W1 - round) * width));
    }

    @Override
    public final float H(ck0 ck0Var) {
        e3 e3Var;
        int e10 = e();
        float f10 = this.f15759c.f14540e.J;
        return (Math.max(0, ck0Var.computeVerticalScrollOffset() - e3Var.getPadding()) - ck0Var.getPaddingTop()) / ((((int) Math.ceil(e10 / f10)) * ((int) (((int) (((ck0Var.getWidth() - ck0Var.getPaddingLeft()) - ck0Var.getPaddingRight()) / f10)) * e3Var.P))) - (org.telegram.messenger.g0.f24118q.y - ck0Var.getPaddingTop()));
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
        e3 e3Var = this.f15759c;
        ArrayList arrayList = e3Var.f14544g0;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        if (e3Var.f14539d0) {
            return size + 1;
        }
        if (e3Var.f14541e0) {
            return e3Var.f14538c0.size() + size;
        }
        return size;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        e3 e3Var = this.f15759c;
        ArrayList arrayList = e3Var.f14546i0;
        ArrayList arrayList2 = e3Var.f14538c0;
        int i10 = f1Var.f59127f;
        View view = f1Var.f59123a;
        int i11 = -1;
        if (i10 == 0) {
            b3 b3Var = (b3) view;
            if (i7 == 0) {
                i11 = e3Var.getPadding();
            }
            b3Var.f14262a = i11;
        } else if (i10 == 2) {
            a3 a3Var = (a3) view;
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
            a3Var.V = z10;
            a3Var.W = z11;
            a3Var.N = new x2(this, a3Var, 0);
            a3Var.O = new x2(this, a3Var, 1);
            int i12 = i7 - 2;
            if (e3Var.f14539d0) {
                if (i12 == 0) {
                    a3Var.f(-1, false, false);
                    a3Var.e(arrayList2.size(), (d7) arrayList2.get(0));
                    return;
                }
                i12 = i7 - 3;
            } else if (e3Var.f14541e0) {
                if (i12 >= 0 && i12 < arrayList2.size()) {
                    a3Var.f(-1, false, false);
                    a3Var.e(0, (d7) arrayList2.get(i12));
                    return;
                }
                i12 -= arrayList2.size();
            }
            ArrayList arrayList3 = e3Var.f14544g0;
            if (arrayList3 != null && i12 >= 0 && i12 < arrayList3.size()) {
                ef efVar = (ef) e3Var.f14544g0.get(i12);
                if (arrayList.isEmpty() && !e3Var.R) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                int indexOf = arrayList.indexOf(efVar);
                if (a3Var.T != efVar) {
                    z13 = false;
                }
                a3Var.f(indexOf, z12, z13);
                a3Var.T = efVar;
                if (efVar != null && efVar.f27847b && !efVar.d()) {
                    str = org.telegram.messenger.g0.g0(efVar.E, false, false);
                } else {
                    str = null;
                }
                a3Var.g(str);
                a3Var.G = null;
                if (efVar == null) {
                    a3Var.P = null;
                } else if (efVar.f27847b) {
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.ui.Cells.c0.u(null, 2131753931, sb2, ", ");
                    sb2.append(gd.z(efVar.E));
                    a3Var.P = sb2.toString();
                } else {
                    a3Var.P = gd.M0(2131753946, null);
                }
                a3Var.b(efVar);
                a3Var.invalidate();
                if (e3Var.N) {
                    a3Var.J.setOnClickListener(new ah.h(this, efVar, a3Var, 14));
                }
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        float f10;
        float f11;
        bi.p2 p2Var;
        e3 e3Var = this.f15759c;
        if (i7 == 0) {
            p2Var = new b3(e3Var, e3Var.getContext());
        } else if (i7 == 1) {
            Context context = e3Var.getContext();
            boolean z10 = e3Var.M;
            bi.p2 p2Var2 = new bi.p2(context, 3);
            if (z10) {
                f10 = 14.0f;
            } else {
                f10 = 16.0f;
            }
            p2Var2.setPadding(org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(10.0f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(-1);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(e3Var.getTitle());
            if (z10) {
                f11 = 32.0f;
            } else {
                f11 = 0.0f;
            }
            p2Var2.addView(textView, c8.ma.d(-1, -1.0f, 119, 0.0f, 0.0f, f11, 0.0f));
            e3Var.f14547j0 = p2Var2;
            p2Var = p2Var2;
        } else {
            p2Var = new a3(e3Var.getContext(), e3Var.f14535b, e3Var.P, e3Var.N);
        }
        return new v4.f1(p2Var);
    }

    @Override
    public final void y(v4.f1 f1Var) {
        boolean z10;
        e3 e3Var = this.f15759c;
        ArrayList arrayList = e3Var.f14546i0;
        if (f1Var.f59127f == 2) {
            a3 a3Var = (a3) f1Var.f59123a;
            Object obj = a3Var.T;
            if (obj instanceof ef) {
                ef efVar = (ef) obj;
                if (arrayList.isEmpty() && !e3Var.R) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                a3Var.f(arrayList.indexOf(efVar), z10, false);
                return;
            }
            a3Var.f(-1, false, false);
        }
    }
}
