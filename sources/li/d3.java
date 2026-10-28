package li;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
public final class d3 implements a6 {
    public final v3 f17188a;

    public d3(v3 v3Var) {
        this.f17188a = v3Var;
    }

    public final int a(a aVar) {
        float f7;
        int i10;
        v3 v3Var = this.f17188a;
        int indexOf = v3Var.f17564t3.indexOf(aVar);
        if (indexOf >= 0 && (i10 = indexOf + 1) < v3Var.f17564t3.size() && ((a) v3Var.f17564t3.get(i10)).f17054c > 0) {
            f7 = 5.0f;
        } else {
            f7 = 11.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final int b(a aVar) {
        float f7;
        v3 v3Var = this.f17188a;
        int indexOf = v3Var.f17564t3.indexOf(aVar);
        if (indexOf > 0 && ((a) v3Var.f17564t3.get(indexOf - 1)).f17054c > 0) {
            f7 = 2.0f;
        } else {
            f7 = 8.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final void c(a aVar, int i10) {
        v3 v3Var = this.f17188a;
        t3 t3Var = v3Var.f17556p3;
        if (i10 == 7) {
            v3Var.X4(aVar, new TL_iv.pageBlockButtonRow(), 0, 0, false, false);
            return;
        }
        v3Var.f17549j4 = null;
        v3Var.f17550k4 = aVar;
        f2 f2Var = v3Var.R3;
        if (f2Var != null) {
            f2Var.d();
        }
        if (aVar != null) {
            d6.e(aVar.f17053b, "");
            View F1 = v3Var.F1(aVar);
            if (F1 instanceof d6) {
                ((d6) F1).getEditText().setTextSilently("");
            }
        }
        f2 f2Var2 = v3Var.R3;
        if (f2Var2 != null) {
            f2Var2.h();
        }
        switch (i10) {
            case 1:
                t3Var.m(3);
                return;
            case 2:
                t3Var.m(6);
                return;
            case 3:
                q.X(v3Var.getContext(), "", new ig.o(v3Var, 11), v3Var.f17554o3);
                return;
            case 4:
            case 5:
                t3Var.m(1);
                return;
            case 6:
                v3Var.z3();
                return;
            default:
                return;
        }
    }

    public final void d(a aVar, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z10, boolean z11) {
        boolean z12;
        boolean z13 = pageBlock instanceof TL_iv.pageBlockBlockquote;
        v3 v3Var = this.f17188a;
        if (z13) {
            if (aVar == null) {
                aVar = v3Var.d5();
            }
            if (aVar != null) {
                ArrayList arrayList = aVar.f17059k;
                if (v3Var.f17564t3.indexOf(aVar) >= 0 && !v3.D3(aVar) && !aVar.f17057i) {
                    f2 f2Var = v3Var.R3;
                    if (f2Var != null) {
                        f2Var.d();
                    }
                    if (arrayList.isEmpty() && !d6.o(aVar.f17053b)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        pageblockblockquote.caption = new TL_iv.textEmpty();
                        aVar.f17053b = pageblockblockquote;
                    } else {
                        if (d6.o(aVar.f17053b)) {
                            long a2 = o0.a();
                            TL_iv.RichText j10 = d6.j(aVar.f17053b);
                            if (j10 != null && !(j10 instanceof TL_iv.textEmpty)) {
                                v3Var.f17566u3.put(Long.valueOf(a2), j10);
                            }
                            arrayList.add(Long.valueOf(a2));
                        }
                        aVar.f17053b = new TL_iv.pageBlockParagraph();
                        arrayList.add(Long.valueOf(o0.a()));
                    }
                    v3Var.y4();
                    if (z12 && (v3Var.findFocus() instanceof g1)) {
                        v3Var.d2();
                        f2 f2Var2 = v3Var.R3;
                        if (f2Var2 != null) {
                            f2Var2.h();
                        }
                        v3Var.j3(aVar);
                        return;
                    }
                    v3Var.f32504g3.O(false);
                    f2 f2Var3 = v3Var.R3;
                    if (f2Var3 != null) {
                        f2Var3.h();
                    }
                    v3Var.post(new y2(v3Var, aVar, 5));
                    return;
                }
                return;
            }
            return;
        }
        v3Var.X4(aVar, pageBlock, i10, i11, z10, z11);
    }
}
