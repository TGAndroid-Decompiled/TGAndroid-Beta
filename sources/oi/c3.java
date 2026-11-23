package oi;

import android.view.View;
import hi.t6;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class c3 implements w5 {
    public final s3 f21999a;

    public c3(s3 s3Var) {
        this.f21999a = s3Var;
    }

    public final int a(a aVar) {
        float f10;
        int i7;
        s3 s3Var = this.f21999a;
        int indexOf = s3Var.f22373t3.indexOf(aVar);
        if (indexOf >= 0 && (i7 = indexOf + 1) < s3Var.f22373t3.size() && ((a) s3Var.f22373t3.get(i7)).f21902c > 0) {
            f10 = 5.0f;
        } else {
            f10 = 11.0f;
        }
        return org.telegram.messenger.g0.L(f10);
    }

    public final int b(a aVar) {
        float f10;
        s3 s3Var = this.f21999a;
        int indexOf = s3Var.f22373t3.indexOf(aVar);
        if (indexOf > 0 && ((a) s3Var.f22373t3.get(indexOf - 1)).f21902c > 0) {
            f10 = 2.0f;
        } else {
            f10 = 8.0f;
        }
        return org.telegram.messenger.g0.L(f10);
    }

    public final void c(a aVar, int i7) {
        s3 s3Var = this.f21999a;
        q3 q3Var = s3Var.f22365p3;
        if (i7 == 7) {
            s3Var.U4(aVar, new TL_iv.pageBlockButtonRow(), 0, 0, false, false);
            return;
        }
        s3Var.f22358j4 = null;
        s3Var.f22359k4 = aVar;
        e2 e2Var = s3Var.R3;
        if (e2Var != null) {
            e2Var.d();
        }
        if (aVar != null) {
            z5.e(aVar.f21901b, "");
            View C1 = s3Var.C1(aVar);
            if (C1 instanceof z5) {
                ((z5) C1).getEditText().setTextSilently("");
            }
        }
        e2 e2Var2 = s3Var.R3;
        if (e2Var2 != null) {
            e2Var2.h();
        }
        switch (i7) {
            case 1:
                q3Var.D(3);
                return;
            case 2:
                q3Var.D(6);
                return;
            case 3:
                o.Z(s3Var.getContext(), "", new t6(s3Var, 18), s3Var.f22364o3);
                return;
            case 4:
            case 5:
                q3Var.D(1);
                return;
            case 6:
                s3Var.w3();
                return;
            default:
                return;
        }
    }

    public final void d(a aVar, TL_iv.PageBlock pageBlock, int i7, int i10, boolean z10, boolean z11) {
        boolean z12;
        boolean z13 = pageBlock instanceof TL_iv.pageBlockBlockquote;
        s3 s3Var = this.f21999a;
        if (z13) {
            if (aVar == null) {
                aVar = s3Var.a5();
            }
            if (aVar != null) {
                ArrayList arrayList = aVar.f21908k;
                if (s3Var.f22373t3.indexOf(aVar) >= 0 && !s3.A3(aVar) && !aVar.f21906i) {
                    e2 e2Var = s3Var.R3;
                    if (e2Var != null) {
                        e2Var.d();
                    }
                    if (arrayList.isEmpty() && !z5.p(aVar.f21901b)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        pageblockblockquote.caption = new TL_iv.textEmpty();
                        aVar.f21901b = pageblockblockquote;
                    } else {
                        if (z5.p(aVar.f21901b)) {
                            long a10 = l0.a();
                            TL_iv.RichText j3 = z5.j(aVar.f21901b);
                            if (j3 != null && !(j3 instanceof TL_iv.textEmpty)) {
                                s3Var.f22375u3.put(Long.valueOf(a10), j3);
                            }
                            arrayList.add(Long.valueOf(a10));
                        }
                        aVar.f21901b = new TL_iv.pageBlockParagraph();
                        arrayList.add(Long.valueOf(l0.a()));
                    }
                    s3Var.v4();
                    if (z12 && (s3Var.findFocus() instanceof e1)) {
                        s3Var.b2();
                        e2 e2Var2 = s3Var.R3;
                        if (e2Var2 != null) {
                            e2Var2.h();
                        }
                        s3Var.g3(aVar);
                        return;
                    }
                    s3Var.f35742g3.O(false);
                    e2 e2Var3 = s3Var.R3;
                    if (e2Var3 != null) {
                        e2Var3.h();
                    }
                    s3Var.post(new x2(s3Var, aVar, 5));
                    return;
                }
                return;
            }
            return;
        }
        s3Var.U4(aVar, pageBlock, i7, i10, z10, z11);
    }
}
