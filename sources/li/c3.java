package li;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class c3 implements x5 {
    public final t3 f18504a;

    public c3(t3 t3Var) {
        this.f18504a = t3Var;
    }

    public final int a(a aVar) {
        float f10;
        int i7;
        t3 t3Var = this.f18504a;
        int indexOf = t3Var.f18897s3.indexOf(aVar);
        if (indexOf >= 0 && (i7 = indexOf + 1) < t3Var.f18897s3.size() && ((a) t3Var.f18897s3.get(i7)).f18393c > 0) {
            f10 = 5.0f;
        } else {
            f10 = 11.0f;
        }
        return org.telegram.messenger.g0.L(f10);
    }

    public final int b(a aVar) {
        float f10;
        t3 t3Var = this.f18504a;
        int indexOf = t3Var.f18897s3.indexOf(aVar);
        if (indexOf > 0 && ((a) t3Var.f18897s3.get(indexOf - 1)).f18393c > 0) {
            f10 = 2.0f;
        } else {
            f10 = 8.0f;
        }
        return org.telegram.messenger.g0.L(f10);
    }

    public final void c(a aVar, int i7) {
        t3 t3Var = this.f18504a;
        r3 r3Var = t3Var.f18890o3;
        if (i7 == 7) {
            t3Var.U4(aVar, new TL_iv.pageBlockButtonRow(), 0, 0, false, false);
            return;
        }
        t3Var.f18882i4 = null;
        t3Var.f18883j4 = aVar;
        f2 f2Var = t3Var.Q3;
        if (f2Var != null) {
            f2Var.d();
        }
        if (aVar != null) {
            a6.e(aVar.f18392b, "");
            View C1 = t3Var.C1(aVar);
            if (C1 instanceof a6) {
                ((a6) C1).getEditText().setTextSilently("");
            }
        }
        f2 f2Var2 = t3Var.Q3;
        if (f2Var2 != null) {
            f2Var2.h();
        }
        switch (i7) {
            case 1:
                r3Var.g(3);
                return;
            case 2:
                r3Var.g(6);
                return;
            case 3:
                p.Z(t3Var.getContext(), "", new ii.c(t3Var, 12), t3Var.f18888n3);
                return;
            case 4:
            case 5:
                r3Var.g(1);
                return;
            case 6:
                t3Var.w3();
                return;
            default:
                return;
        }
    }

    public final void d(a aVar, TL_iv.PageBlock pageBlock, int i7, int i10, boolean z9, boolean z10) {
        boolean z11;
        boolean z12 = pageBlock instanceof TL_iv.pageBlockBlockquote;
        t3 t3Var = this.f18504a;
        if (z12) {
            if (aVar == null) {
                aVar = t3Var.a5();
            }
            if (aVar != null) {
                ArrayList arrayList = aVar.f18399k;
                if (t3Var.f18897s3.indexOf(aVar) >= 0 && !t3.A3(aVar) && !aVar.f18397i) {
                    f2 f2Var = t3Var.Q3;
                    if (f2Var != null) {
                        f2Var.d();
                    }
                    if (arrayList.isEmpty() && !a6.p(aVar.f18392b)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        pageblockblockquote.caption = new TL_iv.textEmpty();
                        aVar.f18392b = pageblockblockquote;
                    } else {
                        if (a6.p(aVar.f18392b)) {
                            long a10 = n0.a();
                            TL_iv.RichText j3 = a6.j(aVar.f18392b);
                            if (j3 != null && !(j3 instanceof TL_iv.textEmpty)) {
                                t3Var.f18899t3.put(Long.valueOf(a10), j3);
                            }
                            arrayList.add(Long.valueOf(a10));
                        }
                        aVar.f18392b = new TL_iv.pageBlockParagraph();
                        arrayList.add(Long.valueOf(n0.a()));
                    }
                    t3Var.v4();
                    if (z11 && (t3Var.findFocus() instanceof g1)) {
                        t3Var.b2();
                        f2 f2Var2 = t3Var.Q3;
                        if (f2Var2 != null) {
                            f2Var2.h();
                        }
                        t3Var.g3(aVar);
                        return;
                    }
                    t3Var.f37190f3.O(false);
                    f2 f2Var3 = t3Var.Q3;
                    if (f2Var3 != null) {
                        f2Var3.h();
                    }
                    t3Var.post(new x2(t3Var, aVar, 5));
                    return;
                }
                return;
            }
            return;
        }
        t3Var.U4(aVar, pageBlock, i7, i10, z9, z10);
    }
}
