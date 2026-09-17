package ji;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
public final class d3 implements d6 {
    public final v3 f13861a;

    public d3(v3 v3Var) {
        this.f13861a = v3Var;
    }

    public final int a(a aVar) {
        float f7;
        int i10;
        v3 v3Var = this.f13861a;
        int indexOf = v3Var.f14256l3.indexOf(aVar);
        if (indexOf >= 0 && (i10 = indexOf + 1) < v3Var.f14256l3.size() && ((a) v3Var.f14256l3.get(i10)).f13733c > 0) {
            f7 = 5.0f;
        } else {
            f7 = 11.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final int b(a aVar) {
        float f7;
        v3 v3Var = this.f13861a;
        int indexOf = v3Var.f14256l3.indexOf(aVar);
        if (indexOf > 0 && ((a) v3Var.f14256l3.get(indexOf - 1)).f13733c > 0) {
            f7 = 2.0f;
        } else {
            f7 = 8.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final void c(a aVar, int i10) {
        v3 v3Var = this.f13861a;
        t3 t3Var = v3Var.f14249h3;
        if (i10 == 7) {
            v3Var.Q4(aVar, new TL_iv.pageBlockButtonRow(), 0, 0, false, false);
            return;
        }
        v3Var.f14241b4 = null;
        v3Var.f14242c4 = aVar;
        g2 g2Var = v3Var.J3;
        if (g2Var != null) {
            g2Var.d();
        }
        if (aVar != null) {
            g6.f(aVar.f13732b, "");
            View y12 = v3Var.y1(aVar);
            if (y12 instanceof g6) {
                ((g6) y12).getEditText().setTextSilently("");
            }
        }
        g2 g2Var2 = v3Var.J3;
        if (g2Var2 != null) {
            g2Var2.h();
        }
        switch (i10) {
            case 1:
                t3Var.e(3);
                return;
            case 2:
                t3Var.e(6);
                return;
            case 3:
                r.U(v3Var.getContext(), "", new bi.o1(v3Var, 28), v3Var.f14247g3);
                return;
            case 4:
            case 5:
                t3Var.e(1);
                return;
            case 6:
                v3Var.s3();
                return;
            default:
                return;
        }
    }

    public final void d(a aVar, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z10, boolean z11) {
        boolean z12;
        boolean z13 = pageBlock instanceof TL_iv.pageBlockBlockquote;
        v3 v3Var = this.f13861a;
        if (z13) {
            if (aVar == null) {
                aVar = v3Var.W4();
            }
            if (aVar != null) {
                ArrayList arrayList = aVar.f13739k;
                if (v3Var.f14256l3.indexOf(aVar) >= 0 && !v3.w3(aVar) && !aVar.f13737i) {
                    g2 g2Var = v3Var.J3;
                    if (g2Var != null) {
                        g2Var.d();
                    }
                    if (arrayList.isEmpty() && !g6.p(aVar.f13732b)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        pageblockblockquote.caption = new TL_iv.textEmpty();
                        aVar.f13732b = pageblockblockquote;
                    } else {
                        if (g6.p(aVar.f13732b)) {
                            long a2 = p0.a();
                            TL_iv.RichText k10 = g6.k(aVar.f13732b);
                            if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                                v3Var.f14257m3.put(Long.valueOf(a2), k10);
                            }
                            arrayList.add(Long.valueOf(a2));
                        }
                        aVar.f13732b = new TL_iv.pageBlockParagraph();
                        arrayList.add(Long.valueOf(p0.a()));
                    }
                    v3Var.r4();
                    if (z12 && (v3Var.findFocus() instanceof h1)) {
                        v3Var.W1();
                        g2 g2Var2 = v3Var.J3;
                        if (g2Var2 != null) {
                            g2Var2.h();
                        }
                        v3Var.c3(aVar);
                        return;
                    }
                    v3Var.Y2.N(false);
                    g2 g2Var3 = v3Var.J3;
                    if (g2Var3 != null) {
                        g2Var3.h();
                    }
                    v3Var.post(new y2(v3Var, aVar, 5));
                    return;
                }
                return;
            }
            return;
        }
        v3Var.Q4(aVar, pageBlock, i10, i11, z10, z11);
    }
}
