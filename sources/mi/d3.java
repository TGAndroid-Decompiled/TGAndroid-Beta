package mi;

import android.view.View;
import gi.j8;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class d3 implements y5 {
    public final t3 f19561a;

    public d3(t3 t3Var) {
        this.f19561a = t3Var;
    }

    public final int a(a aVar) {
        float f10;
        int i3;
        t3 t3Var = this.f19561a;
        int indexOf = t3Var.f19924t3.indexOf(aVar);
        if (indexOf >= 0 && (i3 = indexOf + 1) < t3Var.f19924t3.size() && ((a) t3Var.f19924t3.get(i3)).f19432c > 0) {
            f10 = 5.0f;
        } else {
            f10 = 11.0f;
        }
        return org.telegram.messenger.g0.L(f10);
    }

    public final int b(a aVar) {
        float f10;
        t3 t3Var = this.f19561a;
        int indexOf = t3Var.f19924t3.indexOf(aVar);
        if (indexOf > 0 && ((a) t3Var.f19924t3.get(indexOf - 1)).f19432c > 0) {
            f10 = 2.0f;
        } else {
            f10 = 8.0f;
        }
        return org.telegram.messenger.g0.L(f10);
    }

    public final void c(a aVar, int i3) {
        t3 t3Var = this.f19561a;
        r3 r3Var = t3Var.f19916p3;
        if (i3 == 7) {
            t3Var.U4(aVar, new TL_iv.pageBlockButtonRow(), 0, 0, false, false);
            return;
        }
        t3Var.f19909j4 = null;
        t3Var.f19910k4 = aVar;
        g2 g2Var = t3Var.R3;
        if (g2Var != null) {
            g2Var.d();
        }
        if (aVar != null) {
            b6.e(aVar.f19431b, "");
            View C1 = t3Var.C1(aVar);
            if (C1 instanceof b6) {
                ((b6) C1).getEditText().setTextSilently("");
            }
        }
        g2 g2Var2 = t3Var.R3;
        if (g2Var2 != null) {
            g2Var2.h();
        }
        switch (i3) {
            case 1:
                r3Var.O(3);
                return;
            case 2:
                r3Var.O(6);
                return;
            case 3:
                p.Z(t3Var.getContext(), "", new j8(t3Var, 15), t3Var.f19914o3);
                return;
            case 4:
            case 5:
                r3Var.O(1);
                return;
            case 6:
                t3Var.w3();
                return;
            default:
                return;
        }
    }

    public final void d(a aVar, TL_iv.PageBlock pageBlock, int i3, int i10, boolean z10, boolean z11) {
        boolean z12;
        boolean z13 = pageBlock instanceof TL_iv.pageBlockBlockquote;
        t3 t3Var = this.f19561a;
        if (z13) {
            if (aVar == null) {
                aVar = t3Var.a5();
            }
            if (aVar != null) {
                ArrayList arrayList = aVar.f19438k;
                if (t3Var.f19924t3.indexOf(aVar) >= 0 && !t3.A3(aVar) && !aVar.f19436i) {
                    g2 g2Var = t3Var.R3;
                    if (g2Var != null) {
                        g2Var.d();
                    }
                    if (arrayList.isEmpty() && !b6.p(aVar.f19431b)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        pageblockblockquote.caption = new TL_iv.textEmpty();
                        aVar.f19431b = pageblockblockquote;
                    } else {
                        if (b6.p(aVar.f19431b)) {
                            long a10 = o0.a();
                            TL_iv.RichText j10 = b6.j(aVar.f19431b);
                            if (j10 != null && !(j10 instanceof TL_iv.textEmpty)) {
                                t3Var.f19926u3.put(Long.valueOf(a10), j10);
                            }
                            arrayList.add(Long.valueOf(a10));
                        }
                        aVar.f19431b = new TL_iv.pageBlockParagraph();
                        arrayList.add(Long.valueOf(o0.a()));
                    }
                    t3Var.v4();
                    if (z12 && (t3Var.findFocus() instanceof h1)) {
                        t3Var.b2();
                        g2 g2Var2 = t3Var.R3;
                        if (g2Var2 != null) {
                            g2Var2.h();
                        }
                        t3Var.g3(aVar);
                        return;
                    }
                    t3Var.f35594g3.O(false);
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
        t3Var.U4(aVar, pageBlock, i3, i10, z10, z11);
    }
}
