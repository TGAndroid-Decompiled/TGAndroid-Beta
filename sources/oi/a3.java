package oi;

import android.view.View;
import hi.g7;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class a3 implements v5 {
    public final q3 f21571a;

    public a3(q3 q3Var) {
        this.f21571a = q3Var;
    }

    public final int a(a aVar) {
        float f10;
        int i7;
        q3 q3Var = this.f21571a;
        int indexOf = q3Var.f21939t3.indexOf(aVar);
        if (indexOf >= 0 && (i7 = indexOf + 1) < q3Var.f21939t3.size() && ((a) q3Var.f21939t3.get(i7)).f21545c > 0) {
            f10 = 5.0f;
        } else {
            f10 = 11.0f;
        }
        return org.telegram.messenger.g0.L(f10);
    }

    public final int b(a aVar) {
        float f10;
        q3 q3Var = this.f21571a;
        int indexOf = q3Var.f21939t3.indexOf(aVar);
        if (indexOf > 0 && ((a) q3Var.f21939t3.get(indexOf - 1)).f21545c > 0) {
            f10 = 2.0f;
        } else {
            f10 = 8.0f;
        }
        return org.telegram.messenger.g0.L(f10);
    }

    public final void c(a aVar, int i7) {
        q3 q3Var = this.f21571a;
        o3 o3Var = q3Var.f21931p3;
        if (i7 == 7) {
            q3Var.U4(aVar, new TL_iv.pageBlockButtonRow(), 0, 0, false, false);
            return;
        }
        q3Var.f21924j4 = null;
        q3Var.f21925k4 = aVar;
        d2 d2Var = q3Var.R3;
        if (d2Var != null) {
            d2Var.d();
        }
        if (aVar != null) {
            y5.e(aVar.f21544b, "");
            View C1 = q3Var.C1(aVar);
            if (C1 instanceof y5) {
                ((y5) C1).getEditText().setTextSilently("");
            }
        }
        d2 d2Var2 = q3Var.R3;
        if (d2Var2 != null) {
            d2Var2.h();
        }
        switch (i7) {
            case 1:
                o3Var.s(3);
                return;
            case 2:
                o3Var.s(6);
                return;
            case 3:
                o.Z(q3Var.getContext(), "", new g7(q3Var, 17), q3Var.f21930o3);
                return;
            case 4:
            case 5:
                o3Var.s(1);
                return;
            case 6:
                q3Var.w3();
                return;
            default:
                return;
        }
    }

    public final void d(a aVar, TL_iv.PageBlock pageBlock, int i7, int i10, boolean z10, boolean z11) {
        boolean z12;
        boolean z13 = pageBlock instanceof TL_iv.pageBlockBlockquote;
        q3 q3Var = this.f21571a;
        if (z13) {
            if (aVar == null) {
                aVar = q3Var.a5();
            }
            if (aVar != null) {
                ArrayList arrayList = aVar.f21551k;
                if (q3Var.f21939t3.indexOf(aVar) >= 0 && !q3.A3(aVar) && !aVar.f21549i) {
                    d2 d2Var = q3Var.R3;
                    if (d2Var != null) {
                        d2Var.d();
                    }
                    if (arrayList.isEmpty() && !y5.p(aVar.f21544b)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        pageblockblockquote.caption = new TL_iv.textEmpty();
                        aVar.f21544b = pageblockblockquote;
                    } else {
                        if (y5.p(aVar.f21544b)) {
                            long a10 = l0.a();
                            TL_iv.RichText j3 = y5.j(aVar.f21544b);
                            if (j3 != null && !(j3 instanceof TL_iv.textEmpty)) {
                                q3Var.f21941u3.put(Long.valueOf(a10), j3);
                            }
                            arrayList.add(Long.valueOf(a10));
                        }
                        aVar.f21544b = new TL_iv.pageBlockParagraph();
                        arrayList.add(Long.valueOf(l0.a()));
                    }
                    q3Var.v4();
                    if (z12 && (q3Var.findFocus() instanceof e1)) {
                        q3Var.b2();
                        d2 d2Var2 = q3Var.R3;
                        if (d2Var2 != null) {
                            d2Var2.h();
                        }
                        q3Var.g3(aVar);
                        return;
                    }
                    q3Var.f39892g3.O(false);
                    d2 d2Var3 = q3Var.R3;
                    if (d2Var3 != null) {
                        d2Var3.h();
                    }
                    q3Var.post(new v2(q3Var, aVar, 5));
                    return;
                }
                return;
            }
            return;
        }
        q3Var.U4(aVar, pageBlock, i7, i10, z10, z11);
    }
}
