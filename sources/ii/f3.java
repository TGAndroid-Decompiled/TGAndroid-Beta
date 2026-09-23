package ii;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
public final class f3 implements b6 {
    public final x3 f11363a;

    public f3(x3 x3Var) {
        this.f11363a = x3Var;
    }

    public final int a(a aVar) {
        float f7;
        int i10;
        x3 x3Var = this.f11363a;
        int indexOf = x3Var.f11735l3.indexOf(aVar);
        if (indexOf >= 0 && (i10 = indexOf + 1) < x3Var.f11735l3.size() && ((a) x3Var.f11735l3.get(i10)).f11192c > 0) {
            f7 = 5.0f;
        } else {
            f7 = 11.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final int b(a aVar) {
        float f7;
        x3 x3Var = this.f11363a;
        int indexOf = x3Var.f11735l3.indexOf(aVar);
        if (indexOf > 0 && ((a) x3Var.f11735l3.get(indexOf - 1)).f11192c > 0) {
            f7 = 2.0f;
        } else {
            f7 = 8.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final void c(a aVar, int i10) {
        x3 x3Var = this.f11363a;
        v3 v3Var = x3Var.f11728h3;
        if (i10 == 7) {
            x3Var.R4(aVar, new TL_iv.pageBlockButtonRow(), 0, 0, false, false);
            return;
        }
        x3Var.f11720b4 = null;
        x3Var.f11721c4 = aVar;
        i2 i2Var = x3Var.J3;
        if (i2Var != null) {
            i2Var.d();
        }
        if (aVar != null) {
            e6.f(aVar.f11191b, "");
            View z12 = x3Var.z1(aVar);
            if (z12 instanceof e6) {
                ((e6) z12).getEditText().setTextSilently("");
            }
        }
        i2 i2Var2 = x3Var.J3;
        if (i2Var2 != null) {
            i2Var2.h();
        }
        switch (i10) {
            case 1:
                v3Var.h(3);
                return;
            case 2:
                v3Var.h(6);
                return;
            case 3:
                r.U(x3Var.getContext(), "", new q1(x3Var, 1), x3Var.f11726g3);
                return;
            case 4:
            case 5:
                v3Var.h(1);
                return;
            case 6:
                x3Var.t3();
                return;
            default:
                return;
        }
    }

    public final void d(a aVar, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z10, boolean z11) {
        boolean z12;
        boolean z13 = pageBlock instanceof TL_iv.pageBlockBlockquote;
        x3 x3Var = this.f11363a;
        if (z13) {
            if (aVar == null) {
                aVar = x3Var.X4();
            }
            if (aVar != null) {
                ArrayList arrayList = aVar.f11197k;
                if (x3Var.f11735l3.indexOf(aVar) >= 0 && !x3.x3(aVar) && !aVar.f11195i) {
                    i2 i2Var = x3Var.J3;
                    if (i2Var != null) {
                        i2Var.d();
                    }
                    if (arrayList.isEmpty() && !e6.p(aVar.f11191b)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        pageblockblockquote.caption = new TL_iv.textEmpty();
                        aVar.f11191b = pageblockblockquote;
                    } else {
                        if (e6.p(aVar.f11191b)) {
                            long a2 = q0.a();
                            TL_iv.RichText k10 = e6.k(aVar.f11191b);
                            if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                                x3Var.f11736m3.put(Long.valueOf(a2), k10);
                            }
                            arrayList.add(Long.valueOf(a2));
                        }
                        aVar.f11191b = new TL_iv.pageBlockParagraph();
                        arrayList.add(Long.valueOf(q0.a()));
                    }
                    x3Var.s4();
                    if (z12 && (x3Var.findFocus() instanceof i1)) {
                        x3Var.X1();
                        i2 i2Var2 = x3Var.J3;
                        if (i2Var2 != null) {
                            i2Var2.h();
                        }
                        x3Var.d3(aVar);
                        return;
                    }
                    x3Var.Y2.N(false);
                    i2 i2Var3 = x3Var.J3;
                    if (i2Var3 != null) {
                        i2Var3.h();
                    }
                    x3Var.post(new a3(x3Var, aVar, 5));
                    return;
                }
                return;
            }
            return;
        }
        x3Var.R4(aVar, pageBlock, i10, i11, z10, z11);
    }
}
