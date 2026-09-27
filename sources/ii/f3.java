package ii;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
public final class f3 implements b6 {
    public final x3 f11366a;

    public f3(x3 x3Var) {
        this.f11366a = x3Var;
    }

    public final int a(a aVar) {
        float f7;
        int i10;
        x3 x3Var = this.f11366a;
        int indexOf = x3Var.f11738l3.indexOf(aVar);
        if (indexOf >= 0 && (i10 = indexOf + 1) < x3Var.f11738l3.size() && ((a) x3Var.f11738l3.get(i10)).f11195c > 0) {
            f7 = 5.0f;
        } else {
            f7 = 11.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final int b(a aVar) {
        float f7;
        x3 x3Var = this.f11366a;
        int indexOf = x3Var.f11738l3.indexOf(aVar);
        if (indexOf > 0 && ((a) x3Var.f11738l3.get(indexOf - 1)).f11195c > 0) {
            f7 = 2.0f;
        } else {
            f7 = 8.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final void c(a aVar, int i10) {
        x3 x3Var = this.f11366a;
        v3 v3Var = x3Var.f11731h3;
        if (i10 == 7) {
            x3Var.S4(aVar, new TL_iv.pageBlockButtonRow(), 0, 0, false, false);
            return;
        }
        x3Var.f11723b4 = null;
        x3Var.f11724c4 = aVar;
        i2 i2Var = x3Var.J3;
        if (i2Var != null) {
            i2Var.d();
        }
        if (aVar != null) {
            e6.f(aVar.f11194b, "");
            View A1 = x3Var.A1(aVar);
            if (A1 instanceof e6) {
                ((e6) A1).getEditText().setTextSilently("");
            }
        }
        i2 i2Var2 = x3Var.J3;
        if (i2Var2 != null) {
            i2Var2.h();
        }
        switch (i10) {
            case 1:
                v3Var.i(3);
                return;
            case 2:
                v3Var.i(6);
                return;
            case 3:
                r.U(x3Var.getContext(), "", new q1(x3Var, 1), x3Var.f11729g3);
                return;
            case 4:
            case 5:
                v3Var.i(1);
                return;
            case 6:
                x3Var.u3();
                return;
            default:
                return;
        }
    }

    public final void d(a aVar, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z10, boolean z11) {
        boolean z12;
        boolean z13 = pageBlock instanceof TL_iv.pageBlockBlockquote;
        x3 x3Var = this.f11366a;
        if (z13) {
            if (aVar == null) {
                aVar = x3Var.Y4();
            }
            if (aVar != null) {
                ArrayList arrayList = aVar.f11200k;
                if (x3Var.f11738l3.indexOf(aVar) >= 0 && !x3.y3(aVar) && !aVar.f11198i) {
                    i2 i2Var = x3Var.J3;
                    if (i2Var != null) {
                        i2Var.d();
                    }
                    if (arrayList.isEmpty() && !e6.p(aVar.f11194b)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        pageblockblockquote.caption = new TL_iv.textEmpty();
                        aVar.f11194b = pageblockblockquote;
                    } else {
                        if (e6.p(aVar.f11194b)) {
                            long a2 = q0.a();
                            TL_iv.RichText k10 = e6.k(aVar.f11194b);
                            if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                                x3Var.f11739m3.put(Long.valueOf(a2), k10);
                            }
                            arrayList.add(Long.valueOf(a2));
                        }
                        aVar.f11194b = new TL_iv.pageBlockParagraph();
                        arrayList.add(Long.valueOf(q0.a()));
                    }
                    x3Var.t4();
                    if (z12 && (x3Var.findFocus() instanceof i1)) {
                        x3Var.Y1();
                        i2 i2Var2 = x3Var.J3;
                        if (i2Var2 != null) {
                            i2Var2.h();
                        }
                        x3Var.e3(aVar);
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
        x3Var.S4(aVar, pageBlock, i10, i11, z10, z11);
    }
}
