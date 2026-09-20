package ii;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
public final class e3 implements a6 {
    public final w3 f11358a;

    public e3(w3 w3Var) {
        this.f11358a = w3Var;
    }

    public final int a(a aVar) {
        float f7;
        int i10;
        w3 w3Var = this.f11358a;
        int indexOf = w3Var.f11722l3.indexOf(aVar);
        if (indexOf >= 0 && (i10 = indexOf + 1) < w3Var.f11722l3.size() && ((a) w3Var.f11722l3.get(i10)).f11206c > 0) {
            f7 = 5.0f;
        } else {
            f7 = 11.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final int b(a aVar) {
        float f7;
        w3 w3Var = this.f11358a;
        int indexOf = w3Var.f11722l3.indexOf(aVar);
        if (indexOf > 0 && ((a) w3Var.f11722l3.get(indexOf - 1)).f11206c > 0) {
            f7 = 2.0f;
        } else {
            f7 = 8.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final void c(a aVar, int i10) {
        w3 w3Var = this.f11358a;
        u3 u3Var = w3Var.f11715h3;
        if (i10 == 7) {
            w3Var.S4(aVar, new TL_iv.pageBlockButtonRow(), 0, 0, false, false);
            return;
        }
        w3Var.f11707b4 = null;
        w3Var.f11708c4 = aVar;
        h2 h2Var = w3Var.J3;
        if (h2Var != null) {
            h2Var.d();
        }
        if (aVar != null) {
            d6.f(aVar.f11205b, "");
            View A1 = w3Var.A1(aVar);
            if (A1 instanceof d6) {
                ((d6) A1).getEditText().setTextSilently("");
            }
        }
        h2 h2Var2 = w3Var.J3;
        if (h2Var2 != null) {
            h2Var2.h();
        }
        switch (i10) {
            case 1:
                u3Var.m(3);
                return;
            case 2:
                u3Var.m(6);
                return;
            case 3:
                r.U(w3Var.getContext(), "", new ai.y1(w3Var, 28), w3Var.f11713g3);
                return;
            case 4:
            case 5:
                u3Var.m(1);
                return;
            case 6:
                w3Var.u3();
                return;
            default:
                return;
        }
    }

    public final void d(a aVar, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z10, boolean z11) {
        boolean z12;
        boolean z13 = pageBlock instanceof TL_iv.pageBlockBlockquote;
        w3 w3Var = this.f11358a;
        if (z13) {
            if (aVar == null) {
                aVar = w3Var.Y4();
            }
            if (aVar != null) {
                ArrayList arrayList = aVar.f11211k;
                if (w3Var.f11722l3.indexOf(aVar) >= 0 && !w3.y3(aVar) && !aVar.f11209i) {
                    h2 h2Var = w3Var.J3;
                    if (h2Var != null) {
                        h2Var.d();
                    }
                    if (arrayList.isEmpty() && !d6.p(aVar.f11205b)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        pageblockblockquote.caption = new TL_iv.textEmpty();
                        aVar.f11205b = pageblockblockquote;
                    } else {
                        if (d6.p(aVar.f11205b)) {
                            long a2 = q0.a();
                            TL_iv.RichText k10 = d6.k(aVar.f11205b);
                            if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                                w3Var.f11723m3.put(Long.valueOf(a2), k10);
                            }
                            arrayList.add(Long.valueOf(a2));
                        }
                        aVar.f11205b = new TL_iv.pageBlockParagraph();
                        arrayList.add(Long.valueOf(q0.a()));
                    }
                    w3Var.t4();
                    if (z12 && (w3Var.findFocus() instanceof i1)) {
                        w3Var.Y1();
                        h2 h2Var2 = w3Var.J3;
                        if (h2Var2 != null) {
                            h2Var2.h();
                        }
                        w3Var.e3(aVar);
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
        w3Var.S4(aVar, pageBlock, i10, i11, z10, z11);
    }
}
