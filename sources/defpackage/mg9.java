package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class mg9 implements uk9 {
    public final ch9 a;

    public mg9(ch9 ch9Var) {
        this.a = ch9Var;
    }

    public final int a(ll0 ll0Var) {
        float f;
        int i;
        ArrayList arrayList = this.a.t3;
        int indexOf = arrayList.indexOf(ll0Var);
        if (indexOf >= 0 && (i = indexOf + 1) < arrayList.size() && ((ll0) arrayList.get(i)).c > 0) {
            f = 5.0f;
        } else {
            f = 11.0f;
        }
        return gm.L(f);
    }

    public final int b(ll0 ll0Var) {
        float f;
        ArrayList arrayList = this.a.t3;
        int indexOf = arrayList.indexOf(ll0Var);
        if (indexOf > 0 && ((ll0) arrayList.get(indexOf - 1)).c > 0) {
            f = 2.0f;
        } else {
            f = 8.0f;
        }
        return gm.L(f);
    }

    public final void c(ll0 ll0Var, int i) {
        ch9 ch9Var = this.a;
        ah9 ah9Var = ch9Var.p3;
        if (i == 7) {
            ch9Var.U4(ll0Var, new TL_iv.pageBlockButtonRow(), 0, 0, false, false);
            return;
        }
        ch9Var.j4 = null;
        ch9Var.k4 = ll0Var;
        of9 of9Var = ch9Var.R3;
        if (of9Var != null) {
            of9Var.d();
        }
        if (ll0Var != null) {
            xk9.c(ll0Var.b, "");
            View C1 = ch9Var.C1(ll0Var);
            if (C1 instanceof xk9) {
                ((xk9) C1).getEditText().setTextSilently("");
            }
        }
        of9 of9Var2 = ch9Var.R3;
        if (of9Var2 != null) {
            of9Var2.h();
        }
        switch (i) {
            case 1:
                ah9Var.c(3);
                return;
            case 2:
                ah9Var.c(6);
                return;
            case 3:
                p82.X(ch9Var.getContext(), "", new eg9(ch9Var, (byte) 0), ch9Var.o3);
                return;
            case 4:
            case 5:
                ah9Var.c(1);
                return;
            case 6:
                ch9Var.p3();
                return;
            default:
                return;
        }
    }

    public final void d(ll0 ll0Var, TL_iv.PageBlock pageBlock, int i, int i2, boolean z, boolean z2) {
        boolean z3;
        boolean z4 = pageBlock instanceof TL_iv.pageBlockBlockquote;
        ch9 ch9Var = this.a;
        if (z4) {
            if (ll0Var == null) {
                ll0Var = ch9Var.a5();
            }
            if (ll0Var != null) {
                ArrayList arrayList = ll0Var.k;
                if (ch9Var.t3.indexOf(ll0Var) >= 0 && !ch9.t3(ll0Var) && !ll0Var.i) {
                    of9 of9Var = ch9Var.R3;
                    if (of9Var != null) {
                        of9Var.d();
                    }
                    if (arrayList.isEmpty() && !xk9.n(ll0Var.b)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        pageblockblockquote.caption = new TL_iv.textEmpty();
                        ll0Var.b = pageblockblockquote;
                    } else {
                        if (xk9.n(ll0Var.b)) {
                            long a = wd9.a();
                            TL_iv.RichText h = xk9.h(ll0Var.b);
                            if (h != null && !(h instanceof TL_iv.textEmpty)) {
                                ch9Var.u3.put(Long.valueOf(a), h);
                            }
                            arrayList.add(Long.valueOf(a));
                        }
                        ll0Var.b = new TL_iv.pageBlockParagraph();
                        arrayList.add(Long.valueOf(wd9.a()));
                    }
                    ch9Var.t4();
                    if (z3 && (ch9Var.findFocus() instanceof ne9)) {
                        ch9Var.T1();
                        of9 of9Var2 = ch9Var.R3;
                        if (of9Var2 != null) {
                            of9Var2.h();
                        }
                        ch9Var.Z2(ll0Var);
                        return;
                    }
                    ch9Var.g3.O(false);
                    of9 of9Var3 = ch9Var.R3;
                    if (of9Var3 != null) {
                        of9Var3.h();
                    }
                    ch9Var.post(new gg9(ch9Var, ll0Var, (byte) 5));
                    return;
                }
                return;
            }
            return;
        }
        ch9Var.U4(ll0Var, pageBlock, i, i2, z, z2);
    }
}
