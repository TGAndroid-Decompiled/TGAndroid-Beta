package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class zh9 implements hm9 {
    public final pi9 a;

    public zh9(pi9 pi9Var) {
        this.a = pi9Var;
    }

    public final int a(mk0 mk0Var) {
        float f;
        int i;
        ArrayList arrayList = this.a.t3;
        int indexOf = arrayList.indexOf(mk0Var);
        if (indexOf >= 0 && (i = indexOf + 1) < arrayList.size() && ((mk0) arrayList.get(i)).c > 0) {
            f = 5.0f;
        } else {
            f = 11.0f;
        }
        return hl.L(f);
    }

    public final int b(mk0 mk0Var) {
        float f;
        ArrayList arrayList = this.a.t3;
        int indexOf = arrayList.indexOf(mk0Var);
        if (indexOf > 0 && ((mk0) arrayList.get(indexOf - 1)).c > 0) {
            f = 2.0f;
        } else {
            f = 8.0f;
        }
        return hl.L(f);
    }

    public final void c(mk0 mk0Var, int i) {
        pi9 pi9Var = this.a;
        ni9 ni9Var = pi9Var.p3;
        if (i == 7) {
            pi9Var.V4(mk0Var, new TL_iv.pageBlockButtonRow(), 0, 0, false, false);
            return;
        }
        pi9Var.j4 = null;
        pi9Var.k4 = mk0Var;
        ch9 ch9Var = pi9Var.R3;
        if (ch9Var != null) {
            ch9Var.d();
        }
        if (mk0Var != null) {
            km9.c(mk0Var.b, "");
            View D1 = pi9Var.D1(mk0Var);
            if (D1 instanceof km9) {
                ((km9) D1).getEditText().setTextSilently("");
            }
        }
        ch9 ch9Var2 = pi9Var.R3;
        if (ch9Var2 != null) {
            ch9Var2.h();
        }
        switch (i) {
            case 1:
                ni9Var.d(3);
                return;
            case 2:
                ni9Var.d(6);
                return;
            case 3:
                v72.W(pi9Var.getContext(), "", new sh9(pi9Var, (byte) 0), pi9Var.o3);
                return;
            case 4:
            case 5:
                ni9Var.d(1);
                return;
            case 6:
                pi9Var.q3();
                return;
            default:
                return;
        }
    }

    public final void d(mk0 mk0Var, TL_iv.PageBlock pageBlock, int i, int i2, boolean z, boolean z2) {
        boolean z3;
        boolean z4 = pageBlock instanceof TL_iv.pageBlockBlockquote;
        pi9 pi9Var = this.a;
        if (z4) {
            if (mk0Var == null) {
                mk0Var = pi9Var.b5();
            }
            if (mk0Var != null) {
                ArrayList arrayList = mk0Var.k;
                if (pi9Var.t3.indexOf(mk0Var) >= 0 && !pi9.u3(mk0Var) && !mk0Var.i) {
                    ch9 ch9Var = pi9Var.R3;
                    if (ch9Var != null) {
                        ch9Var.d();
                    }
                    if (arrayList.isEmpty() && !km9.n(mk0Var.b)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        pageblockblockquote.caption = new TL_iv.textEmpty();
                        mk0Var.b = pageblockblockquote;
                    } else {
                        if (km9.n(mk0Var.b)) {
                            long a = mf9.a();
                            TL_iv.RichText h = km9.h(mk0Var.b);
                            if (h != null && !(h instanceof TL_iv.textEmpty)) {
                                pi9Var.u3.put(Long.valueOf(a), h);
                            }
                            arrayList.add(Long.valueOf(a));
                        }
                        mk0Var.b = new TL_iv.pageBlockParagraph();
                        arrayList.add(Long.valueOf(mf9.a()));
                    }
                    pi9Var.u4();
                    if (z3 && (pi9Var.findFocus() instanceof dg9)) {
                        pi9Var.U1();
                        ch9 ch9Var2 = pi9Var.R3;
                        if (ch9Var2 != null) {
                            ch9Var2.h();
                        }
                        pi9Var.a3(mk0Var);
                        return;
                    }
                    pi9Var.g3.O(false);
                    ch9 ch9Var3 = pi9Var.R3;
                    if (ch9Var3 != null) {
                        ch9Var3.h();
                    }
                    pi9Var.post(new th9(pi9Var, mk0Var, (byte) 5));
                    return;
                }
                return;
            }
            return;
        }
        pi9Var.V4(mk0Var, pageBlock, i, i2, z, z2);
    }
}
