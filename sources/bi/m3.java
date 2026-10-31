package bi;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class m3 implements n6 {
    public final d4 f3203a;

    public m3(d4 d4Var) {
        this.f3203a = d4Var;
    }

    public final int a(a aVar) {
        float f7;
        int i10;
        d4 d4Var = this.f3203a;
        int indexOf = d4Var.f2946s3.indexOf(aVar);
        if (indexOf >= 0 && (i10 = indexOf + 1) < d4Var.f2946s3.size() && ((a) d4Var.f2946s3.get(i10)).f2819c > 0) {
            f7 = 5.0f;
        } else {
            f7 = 11.0f;
        }
        return org.telegram.messenger.i0.L(f7);
    }

    public final int b(a aVar) {
        float f7;
        d4 d4Var = this.f3203a;
        int indexOf = d4Var.f2946s3.indexOf(aVar);
        if (indexOf > 0 && ((a) d4Var.f2946s3.get(indexOf - 1)).f2819c > 0) {
            f7 = 2.0f;
        } else {
            f7 = 8.0f;
        }
        return org.telegram.messenger.i0.L(f7);
    }

    public final void c(a aVar, int i10) {
        d4 d4Var = this.f3203a;
        b4 b4Var = d4Var.f2938o3;
        if (i10 == 7) {
            d4Var.U4(aVar, new TL_iv.pageBlockButtonRow(), 0, 0, false, false);
            return;
        }
        d4Var.f2931i4 = null;
        d4Var.f2932j4 = aVar;
        o2 o2Var = d4Var.Q3;
        if (o2Var != null) {
            o2Var.d();
        }
        if (aVar != null) {
            q6.e(aVar.f2818b, "");
            View C1 = d4Var.C1(aVar);
            if (C1 instanceof q6) {
                ((q6) C1).getEditText().setTextSilently("");
            }
        }
        o2 o2Var2 = d4Var.Q3;
        if (o2Var2 != null) {
            o2Var2.h();
        }
        switch (i10) {
            case 1:
                b4Var.p(3);
                return;
            case 2:
                b4Var.p(6);
                return;
            case 3:
                t.X(d4Var.getContext(), "", new ag.l(d4Var, 9), d4Var.f2936n3);
                return;
            case 4:
            case 5:
                b4Var.p(1);
                return;
            case 6:
                d4Var.w3();
                return;
            default:
                return;
        }
    }

    public final void d(a aVar, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z10, boolean z11) {
        boolean z12;
        boolean z13 = pageBlock instanceof TL_iv.pageBlockBlockquote;
        d4 d4Var = this.f3203a;
        if (z13) {
            if (aVar == null) {
                aVar = d4Var.a5();
            }
            if (aVar != null) {
                ArrayList arrayList = aVar.f2824k;
                if (d4Var.f2946s3.indexOf(aVar) >= 0 && !d4.A3(aVar) && !aVar.f2822i) {
                    o2 o2Var = d4Var.Q3;
                    if (o2Var != null) {
                        o2Var.d();
                    }
                    if (arrayList.isEmpty() && !q6.p(aVar.f2818b)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        pageblockblockquote.caption = new TL_iv.textEmpty();
                        aVar.f2818b = pageblockblockquote;
                    } else {
                        if (q6.p(aVar.f2818b)) {
                            long a2 = r0.a();
                            TL_iv.RichText k10 = q6.k(aVar.f2818b);
                            if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                                d4Var.f2948t3.put(Long.valueOf(a2), k10);
                            }
                            arrayList.add(Long.valueOf(a2));
                        }
                        aVar.f2818b = new TL_iv.pageBlockParagraph();
                        arrayList.add(Long.valueOf(r0.a()));
                    }
                    d4Var.v4();
                    if (z12 && (d4Var.findFocus() instanceof n1)) {
                        d4Var.a2();
                        o2 o2Var2 = d4Var.Q3;
                        if (o2Var2 != null) {
                            o2Var2.h();
                        }
                        d4Var.g3(aVar);
                        return;
                    }
                    d4Var.f30819f3.O(false);
                    o2 o2Var3 = d4Var.Q3;
                    if (o2Var3 != null) {
                        o2Var3.h();
                    }
                    d4Var.post(new h3(d4Var, aVar, 5));
                    return;
                }
                return;
            }
            return;
        }
        d4Var.U4(aVar, pageBlock, i10, i11, z10, z11);
    }
}
