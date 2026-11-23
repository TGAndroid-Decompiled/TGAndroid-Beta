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
public final class g3 extends kj0 {
    public final m3 f14527c;

    public g3(m3 m3Var) {
        this.f14527c = m3Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59249f == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i7) {
        ef efVar;
        int i10 = i7 - 2;
        m3 m3Var = this.f14527c;
        if (m3Var.f14893d0) {
            if (i10 == 0) {
                return null;
            }
            i10 = i7 - 3;
        } else if (m3Var.f14895e0) {
            if (i10 >= 0 && i10 < m3Var.f14892c0.size()) {
                return gd.e0(((x7) m3Var.f14892c0.get(i10)).d / 1000, true);
            }
            i10 -= m3Var.f14892c0.size();
        }
        ArrayList arrayList = m3Var.f14898g0;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size() || (efVar = (ef) m3Var.f14898g0.get(i10)) == null) {
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
        m3 m3Var = this.f14527c;
        gi.g gVar = m3Var.f14894e;
        float f11 = gVar.J;
        int width = (int) (((int) (((ek0Var.getWidth() - ek0Var.getPaddingLeft()) - ek0Var.getPaddingRight()) / f11)) * m3Var.P);
        int ceil = (int) Math.ceil(e10 / f11);
        float W1 = (org.telegram.messenger.g0.W1(f10, 0, Math.max(0, i7 - ((org.telegram.messenger.g0.f24226q.y - ek0Var.getPaddingTop()) - ek0Var.getPaddingBottom()))) / (ceil * width)) * ceil;
        int round = Math.round(W1);
        iArr[0] = Math.max(0, gVar.J * round) + 2;
        iArr[1] = ek0Var.getPaddingTop() + ((int) ((W1 - round) * width));
    }

    @Override
    public final float H(ek0 ek0Var) {
        m3 m3Var;
        int e10 = e();
        float f10 = this.f14527c.f14894e.J;
        return (Math.max(0, ek0Var.computeVerticalScrollOffset() - m3Var.getPadding()) - ek0Var.getPaddingTop()) / ((((int) Math.ceil(e10 / f10)) * ((int) (((int) (((ek0Var.getWidth() - ek0Var.getPaddingLeft()) - ek0Var.getPaddingRight()) / f10)) * m3Var.P))) - (org.telegram.messenger.g0.f24226q.y - ek0Var.getPaddingTop()));
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
        m3 m3Var = this.f14527c;
        ArrayList arrayList = m3Var.f14898g0;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        if (m3Var.f14893d0) {
            return size + 1;
        }
        if (m3Var.f14895e0) {
            return m3Var.f14892c0.size() + size;
        }
        return size;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        m3 m3Var = this.f14527c;
        ArrayList arrayList = m3Var.f14900i0;
        ArrayList arrayList2 = m3Var.f14892c0;
        int i10 = f1Var.f59249f;
        View view = f1Var.f59245a;
        int i11 = -1;
        if (i10 == 0) {
            j3 j3Var = (j3) view;
            if (i7 == 0) {
                i11 = m3Var.getPadding();
            }
            j3Var.f14725a = i11;
        } else if (i10 == 2) {
            i3 i3Var = (i3) view;
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
            i3Var.V = z10;
            i3Var.W = z11;
            i3Var.N = new f3(this, i3Var, 0);
            i3Var.O = new f3(this, i3Var, 1);
            int i12 = i7 - 2;
            if (m3Var.f14893d0) {
                if (i12 == 0) {
                    i3Var.f(-1, false, false);
                    i3Var.e(arrayList2.size(), (x7) arrayList2.get(0));
                    return;
                }
                i12 = i7 - 3;
            } else if (m3Var.f14895e0) {
                if (i12 >= 0 && i12 < arrayList2.size()) {
                    i3Var.f(-1, false, false);
                    i3Var.e(0, (x7) arrayList2.get(i12));
                    return;
                }
                i12 -= arrayList2.size();
            }
            ArrayList arrayList3 = m3Var.f14898g0;
            if (arrayList3 != null && i12 >= 0 && i12 < arrayList3.size()) {
                ef efVar = (ef) m3Var.f14898g0.get(i12);
                if (arrayList.isEmpty() && !m3Var.R) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                int indexOf = arrayList.indexOf(efVar);
                if (i3Var.T != efVar) {
                    z13 = false;
                }
                i3Var.f(indexOf, z12, z13);
                i3Var.T = efVar;
                if (efVar != null && efVar.f27963b && !efVar.d()) {
                    str = org.telegram.messenger.g0.g0(efVar.E, false, false);
                } else {
                    str = null;
                }
                i3Var.g(str);
                i3Var.G = null;
                if (efVar == null) {
                    i3Var.P = null;
                } else if (efVar.f27963b) {
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.ui.Cells.c0.u(null, 2131753930, sb2, ", ");
                    sb2.append(gd.z(efVar.E));
                    i3Var.P = sb2.toString();
                } else {
                    i3Var.P = gd.N0(2131753945, null);
                }
                i3Var.b(efVar);
                i3Var.invalidate();
                if (m3Var.N) {
                    i3Var.J.setOnClickListener(new ah.h(this, efVar, i3Var, 14));
                }
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        float f10;
        float f11;
        bi.v2 v2Var;
        m3 m3Var = this.f14527c;
        if (i7 == 0) {
            v2Var = new j3(m3Var, m3Var.getContext());
        } else if (i7 == 1) {
            Context context = m3Var.getContext();
            boolean z10 = m3Var.M;
            bi.v2 v2Var2 = new bi.v2(context, 3);
            if (z10) {
                f10 = 14.0f;
            } else {
                f10 = 16.0f;
            }
            v2Var2.setPadding(org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(10.0f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(-1);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(m3Var.getTitle());
            if (z10) {
                f11 = 32.0f;
            } else {
                f11 = 0.0f;
            }
            v2Var2.addView(textView, c8.na.d(-1, -1.0f, 119, 0.0f, 0.0f, f11, 0.0f));
            m3Var.f14901j0 = v2Var2;
            v2Var = v2Var2;
        } else {
            v2Var = new i3(m3Var.getContext(), m3Var.f14889b, m3Var.P, m3Var.N);
        }
        return new v4.f1(v2Var);
    }

    @Override
    public final void y(v4.f1 f1Var) {
        boolean z10;
        m3 m3Var = this.f14527c;
        ArrayList arrayList = m3Var.f14900i0;
        if (f1Var.f59249f == 2) {
            i3 i3Var = (i3) f1Var.f59245a;
            Object obj = i3Var.T;
            if (obj instanceof ef) {
                ef efVar = (ef) obj;
                if (arrayList.isEmpty() && !m3Var.R) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                i3Var.f(arrayList.indexOf(efVar), z10, false);
                return;
            }
            i3Var.f(-1, false, false);
        }
    }
}
