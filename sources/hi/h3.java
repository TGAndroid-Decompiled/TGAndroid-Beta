package hi;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
public final class h3 implements d6 {
    public final z3 f9636a;

    public h3(z3 z3Var) {
        this.f9636a = z3Var;
    }

    public final int a(a aVar) {
        float f7;
        int i10;
        z3 z3Var = this.f9636a;
        int indexOf = z3Var.f10008l3.indexOf(aVar);
        if (indexOf >= 0 && (i10 = indexOf + 1) < z3Var.f10008l3.size() && ((a) z3Var.f10008l3.get(i10)).f9422c > 0) {
            f7 = 5.0f;
        } else {
            f7 = 11.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final int b(a aVar) {
        float f7;
        z3 z3Var = this.f9636a;
        int indexOf = z3Var.f10008l3.indexOf(aVar);
        if (indexOf > 0 && ((a) z3Var.f10008l3.get(indexOf - 1)).f9422c > 0) {
            f7 = 2.0f;
        } else {
            f7 = 8.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final void c(a aVar, int i10) {
        z3 z3Var = this.f9636a;
        x3 x3Var = z3Var.f10001h3;
        if (i10 == 7) {
            z3Var.Q4(aVar, new TL_iv.pageBlockButtonRow(), 0, 0, false, false);
            return;
        }
        z3Var.f9993b4 = null;
        z3Var.f9994c4 = aVar;
        k2 k2Var = z3Var.J3;
        if (k2Var != null) {
            k2Var.d();
        }
        if (aVar != null) {
            g6.f(aVar.f9421b, "");
            View y12 = z3Var.y1(aVar);
            if (y12 instanceof g6) {
                ((g6) y12).getEditText().setTextSilently("");
            }
        }
        k2 k2Var2 = z3Var.J3;
        if (k2Var2 != null) {
            k2Var2.h();
        }
        switch (i10) {
            case 1:
                x3Var.q(3);
                return;
            case 2:
                x3Var.q(6);
                return;
            case 3:
                s.U(z3Var.getContext(), "", new ai.b(z3Var, 24), z3Var.f9999g3);
                return;
            case 4:
            case 5:
                x3Var.q(1);
                return;
            case 6:
                z3Var.s3();
                return;
            default:
                return;
        }
    }

    public final void d(a aVar, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z10, boolean z11) {
        boolean z12;
        boolean z13 = pageBlock instanceof TL_iv.pageBlockBlockquote;
        z3 z3Var = this.f9636a;
        if (z13) {
            if (aVar == null) {
                aVar = z3Var.W4();
            }
            if (aVar != null) {
                ArrayList arrayList = aVar.f9427k;
                if (z3Var.f10008l3.indexOf(aVar) >= 0 && !z3.w3(aVar) && !aVar.f9425i) {
                    k2 k2Var = z3Var.J3;
                    if (k2Var != null) {
                        k2Var.d();
                    }
                    if (arrayList.isEmpty() && !g6.p(aVar.f9421b)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        pageblockblockquote.caption = new TL_iv.textEmpty();
                        aVar.f9421b = pageblockblockquote;
                    } else {
                        if (g6.p(aVar.f9421b)) {
                            long a2 = r0.a();
                            TL_iv.RichText k10 = g6.k(aVar.f9421b);
                            if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                                z3Var.f10009m3.put(Long.valueOf(a2), k10);
                            }
                            arrayList.add(Long.valueOf(a2));
                        }
                        aVar.f9421b = new TL_iv.pageBlockParagraph();
                        arrayList.add(Long.valueOf(r0.a()));
                    }
                    z3Var.r4();
                    if (z12 && (z3Var.findFocus() instanceof k1)) {
                        z3Var.W1();
                        k2 k2Var2 = z3Var.J3;
                        if (k2Var2 != null) {
                            k2Var2.h();
                        }
                        z3Var.c3(aVar);
                        return;
                    }
                    z3Var.Y2.N(false);
                    k2 k2Var3 = z3Var.J3;
                    if (k2Var3 != null) {
                        k2Var3.h();
                    }
                    z3Var.post(new c3(z3Var, aVar, 5));
                    return;
                }
                return;
            }
            return;
        }
        z3Var.Q4(aVar, pageBlock, i10, i11, z10, z11);
    }
}
