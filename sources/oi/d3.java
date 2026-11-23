package oi;

import android.view.View;
import hi.s6;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class d3 implements x5 {
    public final t3 f22056a;

    public d3(t3 t3Var) {
        this.f22056a = t3Var;
    }

    public final int a(a aVar) {
        float f10;
        int i7;
        t3 t3Var = this.f22056a;
        int indexOf = t3Var.f22436t3.indexOf(aVar);
        if (indexOf >= 0 && (i7 = indexOf + 1) < t3Var.f22436t3.size() && ((a) t3Var.f22436t3.get(i7)).f21936c > 0) {
            f10 = 5.0f;
        } else {
            f10 = 11.0f;
        }
        return org.telegram.messenger.g0.L(f10);
    }

    public final int b(a aVar) {
        float f10;
        t3 t3Var = this.f22056a;
        int indexOf = t3Var.f22436t3.indexOf(aVar);
        if (indexOf > 0 && ((a) t3Var.f22436t3.get(indexOf - 1)).f21936c > 0) {
            f10 = 2.0f;
        } else {
            f10 = 8.0f;
        }
        return org.telegram.messenger.g0.L(f10);
    }

    public final void c(a aVar, int i7) {
        t3 t3Var = this.f22056a;
        r3 r3Var = t3Var.f22428p3;
        if (i7 == 7) {
            t3Var.U4(aVar, new TL_iv.pageBlockButtonRow(), 0, 0, false, false);
            return;
        }
        t3Var.f22421j4 = null;
        t3Var.f22422k4 = aVar;
        g2 g2Var = t3Var.R3;
        if (g2Var != null) {
            g2Var.d();
        }
        if (aVar != null) {
            a6.e(aVar.f21935b, "");
            View C1 = t3Var.C1(aVar);
            if (C1 instanceof a6) {
                ((a6) C1).getEditText().setTextSilently("");
            }
        }
        g2 g2Var2 = t3Var.R3;
        if (g2Var2 != null) {
            g2Var2.h();
        }
        switch (i7) {
            case 1:
                r3Var.D(3);
                return;
            case 2:
                r3Var.D(6);
                return;
            case 3:
                o.Z(t3Var.getContext(), "", new s6(t3Var, 18), t3Var.f22427o3);
                return;
            case 4:
            case 5:
                r3Var.D(1);
                return;
            case 6:
                t3Var.w3();
                return;
            default:
                return;
        }
    }

    public final void d(a aVar, TL_iv.PageBlock pageBlock, int i7, int i10, boolean z10, boolean z11) {
        boolean z12;
        boolean z13 = pageBlock instanceof TL_iv.pageBlockBlockquote;
        t3 t3Var = this.f22056a;
        if (z13) {
            if (aVar == null) {
                aVar = t3Var.a5();
            }
            if (aVar != null) {
                ArrayList arrayList = aVar.f21942k;
                if (t3Var.f22436t3.indexOf(aVar) >= 0 && !t3.A3(aVar) && !aVar.f21940i) {
                    g2 g2Var = t3Var.R3;
                    if (g2Var != null) {
                        g2Var.d();
                    }
                    if (arrayList.isEmpty() && !a6.p(aVar.f21935b)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        pageblockblockquote.caption = new TL_iv.textEmpty();
                        aVar.f21935b = pageblockblockquote;
                    } else {
                        if (a6.p(aVar.f21935b)) {
                            long a10 = m0.a();
                            TL_iv.RichText j3 = a6.j(aVar.f21935b);
                            if (j3 != null && !(j3 instanceof TL_iv.textEmpty)) {
                                t3Var.f22438u3.put(Long.valueOf(a10), j3);
                            }
                            arrayList.add(Long.valueOf(a10));
                        }
                        aVar.f21935b = new TL_iv.pageBlockParagraph();
                        arrayList.add(Long.valueOf(m0.a()));
                    }
                    t3Var.v4();
                    if (z12 && (t3Var.findFocus() instanceof f1)) {
                        t3Var.b2();
                        g2 g2Var2 = t3Var.R3;
                        if (g2Var2 != null) {
                            g2Var2.h();
                        }
                        t3Var.g3(aVar);
                        return;
                    }
                    t3Var.f35790g3.O(false);
                    g2 g2Var3 = t3Var.R3;
                    if (g2Var3 != null) {
                        g2Var3.h();
                    }
                    t3Var.post(new y2(t3Var, aVar, 5));
                    return;
                }
                return;
            }
            return;
        }
        t3Var.U4(aVar, pageBlock, i7, i10, z10, z11);
    }
}
