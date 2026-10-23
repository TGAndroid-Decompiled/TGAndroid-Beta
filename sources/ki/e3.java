package ki;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
public final class e3 implements z5 {
    public final w3 f15303a;

    public e3(w3 w3Var) {
        this.f15303a = w3Var;
    }

    public final int a(a aVar) {
        float f7;
        int i10;
        w3 w3Var = this.f15303a;
        int indexOf = w3Var.f15663m3.indexOf(aVar);
        if (indexOf >= 0 && (i10 = indexOf + 1) < w3Var.f15663m3.size() && ((a) w3Var.f15663m3.get(i10)).f15142c > 0) {
            f7 = 5.0f;
        } else {
            f7 = 11.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final int b(a aVar) {
        float f7;
        w3 w3Var = this.f15303a;
        int indexOf = w3Var.f15663m3.indexOf(aVar);
        if (indexOf > 0 && ((a) w3Var.f15663m3.get(indexOf - 1)).f15142c > 0) {
            f7 = 2.0f;
        } else {
            f7 = 8.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final void c(a aVar, int i10) {
        w3 w3Var = this.f15303a;
        u3 u3Var = w3Var.f15656i3;
        if (i10 == 7) {
            w3Var.X4(aVar, new TL_iv.pageBlockButtonRow(), 0, 0, false, false);
            return;
        }
        w3Var.f15648c4 = null;
        w3Var.f15649d4 = aVar;
        h2 h2Var = w3Var.K3;
        if (h2Var != null) {
            h2Var.d();
        }
        if (aVar != null) {
            c6.e(aVar.f15141b, "");
            View F1 = w3Var.F1(aVar);
            if (F1 instanceof c6) {
                ((c6) F1).getEditText().setTextSilently("");
            }
        }
        h2 h2Var2 = w3Var.K3;
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
                q.X(w3Var.getContext(), "", new ig.k0(w3Var, 7), w3Var.f15654h3);
                return;
            case 4:
            case 5:
                u3Var.m(1);
                return;
            case 6:
                w3Var.z3();
                return;
            default:
                return;
        }
    }

    public final void d(a aVar, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z10, boolean z11) {
        boolean z12;
        boolean z13 = pageBlock instanceof TL_iv.pageBlockBlockquote;
        w3 w3Var = this.f15303a;
        if (z13) {
            if (aVar == null) {
                aVar = w3Var.d5();
            }
            if (aVar != null) {
                ArrayList arrayList = aVar.f15147k;
                if (w3Var.f15663m3.indexOf(aVar) >= 0 && !w3.D3(aVar) && !aVar.f15145i) {
                    h2 h2Var = w3Var.K3;
                    if (h2Var != null) {
                        h2Var.d();
                    }
                    if (arrayList.isEmpty() && !c6.o(aVar.f15141b)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        pageblockblockquote.caption = new TL_iv.textEmpty();
                        aVar.f15141b = pageblockblockquote;
                    } else {
                        if (c6.o(aVar.f15141b)) {
                            long a2 = p0.a();
                            TL_iv.RichText j10 = c6.j(aVar.f15141b);
                            if (j10 != null && !(j10 instanceof TL_iv.textEmpty)) {
                                w3Var.f15665n3.put(Long.valueOf(a2), j10);
                            }
                            arrayList.add(Long.valueOf(a2));
                        }
                        aVar.f15141b = new TL_iv.pageBlockParagraph();
                        arrayList.add(Long.valueOf(p0.a()));
                    }
                    w3Var.y4();
                    if (z12 && (w3Var.findFocus() instanceof h1)) {
                        w3Var.d2();
                        h2 h2Var2 = w3Var.K3;
                        if (h2Var2 != null) {
                            h2Var2.h();
                        }
                        w3Var.j3(aVar);
                        return;
                    }
                    w3Var.Z2.N(false);
                    h2 h2Var3 = w3Var.K3;
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
        w3Var.X4(aVar, pageBlock, i10, i11, z10, z11);
    }
}
