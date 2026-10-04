package ii;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
public final class f3 implements c6 {
    public final x3 f12362a;

    public f3(x3 x3Var) {
        this.f12362a = x3Var;
    }

    public final int a(a aVar) {
        float f7;
        int i10;
        x3 x3Var = this.f12362a;
        int indexOf = x3Var.f12778s3.indexOf(aVar);
        if (indexOf >= 0 && (i10 = indexOf + 1) < x3Var.f12778s3.size() && ((a) x3Var.f12778s3.get(i10)).f12188c > 0) {
            f7 = 5.0f;
        } else {
            f7 = 11.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final int b(a aVar) {
        float f7;
        x3 x3Var = this.f12362a;
        int indexOf = x3Var.f12778s3.indexOf(aVar);
        if (indexOf > 0 && ((a) x3Var.f12778s3.get(indexOf - 1)).f12188c > 0) {
            f7 = 2.0f;
        } else {
            f7 = 8.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final void c(a aVar, int i10) {
        x3 x3Var = this.f12362a;
        v3 v3Var = x3Var.f12770o3;
        if (i10 == 7) {
            x3Var.T4(aVar, new TL_iv.pageBlockButtonRow(), 0, 0, false, false);
            return;
        }
        x3Var.f12763i4 = null;
        x3Var.f12764j4 = aVar;
        i2 i2Var = x3Var.Q3;
        if (i2Var != null) {
            i2Var.d();
        }
        if (aVar != null) {
            f6.f(aVar.f12187b, "");
            View B1 = x3Var.B1(aVar);
            if (B1 instanceof f6) {
                ((f6) B1).getEditText().setTextSilently("");
            }
        }
        i2 i2Var2 = x3Var.Q3;
        if (i2Var2 != null) {
            i2Var2.h();
        }
        switch (i10) {
            case 1:
                v3Var.r(3);
                return;
            case 2:
                v3Var.r(6);
                return;
            case 3:
                r.S(x3Var.getContext(), "", new q1(x3Var, 1), x3Var.f12768n3);
                return;
            case 4:
            case 5:
                v3Var.r(1);
                return;
            case 6:
                x3Var.v3();
                return;
            default:
                return;
        }
    }

    public final void d(a aVar, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z10, boolean z11) {
        boolean z12;
        boolean z13 = pageBlock instanceof TL_iv.pageBlockBlockquote;
        x3 x3Var = this.f12362a;
        if (z13) {
            if (aVar == null) {
                aVar = x3Var.Z4();
            }
            if (aVar != null) {
                ArrayList arrayList = aVar.f12194k;
                if (x3Var.f12778s3.indexOf(aVar) >= 0 && !x3.z3(aVar) && !aVar.f12192i) {
                    i2 i2Var = x3Var.Q3;
                    if (i2Var != null) {
                        i2Var.d();
                    }
                    if (arrayList.isEmpty() && !f6.p(aVar.f12187b)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        pageblockblockquote.caption = new TL_iv.textEmpty();
                        aVar.f12187b = pageblockblockquote;
                    } else {
                        if (f6.p(aVar.f12187b)) {
                            long a2 = q0.a();
                            TL_iv.RichText k10 = f6.k(aVar.f12187b);
                            if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                                x3Var.f12780t3.put(Long.valueOf(a2), k10);
                            }
                            arrayList.add(Long.valueOf(a2));
                        }
                        aVar.f12187b = new TL_iv.pageBlockParagraph();
                        arrayList.add(Long.valueOf(q0.a()));
                    }
                    x3Var.u4();
                    if (z12 && (x3Var.findFocus() instanceof i1)) {
                        x3Var.Z1();
                        i2 i2Var2 = x3Var.Q3;
                        if (i2Var2 != null) {
                            i2Var2.h();
                        }
                        x3Var.f3(aVar);
                        return;
                    }
                    x3Var.f25250f3.N(false);
                    i2 i2Var3 = x3Var.Q3;
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
        x3Var.T4(aVar, pageBlock, i10, i11, z10, z11);
    }
}
