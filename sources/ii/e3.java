package ii;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
public final class e3 implements a6 {
    public final w3 f11354a;

    public e3(w3 w3Var) {
        this.f11354a = w3Var;
    }

    public final int a(a aVar) {
        float f7;
        int i10;
        w3 w3Var = this.f11354a;
        int indexOf = w3Var.f11718l3.indexOf(aVar);
        if (indexOf >= 0 && (i10 = indexOf + 1) < w3Var.f11718l3.size() && ((a) w3Var.f11718l3.get(i10)).f11202c > 0) {
            f7 = 5.0f;
        } else {
            f7 = 11.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final int b(a aVar) {
        float f7;
        w3 w3Var = this.f11354a;
        int indexOf = w3Var.f11718l3.indexOf(aVar);
        if (indexOf > 0 && ((a) w3Var.f11718l3.get(indexOf - 1)).f11202c > 0) {
            f7 = 2.0f;
        } else {
            f7 = 8.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final void c(a aVar, int i10) {
        w3 w3Var = this.f11354a;
        u3 u3Var = w3Var.f11711h3;
        if (i10 == 7) {
            w3Var.R4(aVar, new TL_iv.pageBlockButtonRow(), 0, 0, false, false);
            return;
        }
        w3Var.f11703b4 = null;
        w3Var.f11704c4 = aVar;
        h2 h2Var = w3Var.J3;
        if (h2Var != null) {
            h2Var.d();
        }
        if (aVar != null) {
            d6.f(aVar.f11201b, "");
            View z12 = w3Var.z1(aVar);
            if (z12 instanceof d6) {
                ((d6) z12).getEditText().setTextSilently("");
            }
        }
        h2 h2Var2 = w3Var.J3;
        if (h2Var2 != null) {
            h2Var2.h();
        }
        switch (i10) {
            case 1:
                u3Var.h(3);
                return;
            case 2:
                u3Var.h(6);
                return;
            case 3:
                r.U(w3Var.getContext(), "", new ai.y1(w3Var, 28), w3Var.f11709g3);
                return;
            case 4:
            case 5:
                u3Var.h(1);
                return;
            case 6:
                w3Var.t3();
                return;
            default:
                return;
        }
    }

    public final void d(a aVar, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z10, boolean z11) {
        boolean z12;
        boolean z13 = pageBlock instanceof TL_iv.pageBlockBlockquote;
        w3 w3Var = this.f11354a;
        if (z13) {
            if (aVar == null) {
                aVar = w3Var.X4();
            }
            if (aVar != null) {
                ArrayList arrayList = aVar.f11207k;
                if (w3Var.f11718l3.indexOf(aVar) >= 0 && !w3.x3(aVar) && !aVar.f11205i) {
                    h2 h2Var = w3Var.J3;
                    if (h2Var != null) {
                        h2Var.d();
                    }
                    if (arrayList.isEmpty() && !d6.p(aVar.f11201b)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        pageblockblockquote.caption = new TL_iv.textEmpty();
                        aVar.f11201b = pageblockblockquote;
                    } else {
                        if (d6.p(aVar.f11201b)) {
                            long a2 = q0.a();
                            TL_iv.RichText k10 = d6.k(aVar.f11201b);
                            if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                                w3Var.f11719m3.put(Long.valueOf(a2), k10);
                            }
                            arrayList.add(Long.valueOf(a2));
                        }
                        aVar.f11201b = new TL_iv.pageBlockParagraph();
                        arrayList.add(Long.valueOf(q0.a()));
                    }
                    w3Var.s4();
                    if (z12 && (w3Var.findFocus() instanceof i1)) {
                        w3Var.X1();
                        h2 h2Var2 = w3Var.J3;
                        if (h2Var2 != null) {
                            h2Var2.h();
                        }
                        w3Var.d3(aVar);
                        return;
                    }
                    w3Var.Y2.N(false);
                    h2 h2Var3 = w3Var.J3;
                    if (h2Var3 != null) {
                        h2Var3.h();
                    }
                    w3Var.post(new z2(w3Var, aVar, 5));
                    return;
                }
                return;
            }
            return;
        }
        w3Var.R4(aVar, pageBlock, i10, i11, z10, z11);
    }
}
