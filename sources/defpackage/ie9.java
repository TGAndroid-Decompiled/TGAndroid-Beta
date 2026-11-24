package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class ie9 implements ti9 {
    public final ye9 a;

    public ie9(ye9 ye9Var) {
        this.a = ye9Var;
    }

    public final int a(lk0 lk0Var) {
        float f;
        int i;
        ArrayList arrayList = this.a.t3;
        int indexOf = arrayList.indexOf(lk0Var);
        if (indexOf >= 0 && (i = indexOf + 1) < arrayList.size() && ((lk0) arrayList.get(i)).c > 0) {
            f = 5.0f;
        } else {
            f = 11.0f;
        }
        return gl.L(f);
    }

    public final int b(lk0 lk0Var) {
        float f;
        ArrayList arrayList = this.a.t3;
        int indexOf = arrayList.indexOf(lk0Var);
        if (indexOf > 0 && ((lk0) arrayList.get(indexOf - 1)).c > 0) {
            f = 2.0f;
        } else {
            f = 8.0f;
        }
        return gl.L(f);
    }

    public final void c(lk0 lk0Var, int i) {
        ye9 ye9Var = this.a;
        we9 we9Var = ye9Var.p3;
        if (i == 7) {
            ye9Var.U4(lk0Var, new TL_iv.pageBlockButtonRow(), 0, 0, false, false);
            return;
        }
        ye9Var.j4 = null;
        ye9Var.k4 = lk0Var;
        ld9 ld9Var = ye9Var.R3;
        if (ld9Var != null) {
            ld9Var.d();
        }
        if (lk0Var != null) {
            wi9.c(lk0Var.b, "");
            View C1 = ye9Var.C1(lk0Var);
            if (C1 instanceof wi9) {
                ((wi9) C1).getEditText().setTextSilently("");
            }
        }
        ld9 ld9Var2 = ye9Var.R3;
        if (ld9Var2 != null) {
            ld9Var2.h();
        }
        switch (i) {
            case 1:
                we9Var.c(3);
                return;
            case 2:
                we9Var.c(6);
                return;
            case 3:
                e72.X(ye9Var.getContext(), "", new ae9(ye9Var, (byte) 0), ye9Var.o3);
                return;
            case 4:
            case 5:
                we9Var.c(1);
                return;
            case 6:
                ye9Var.p3();
                return;
            default:
                return;
        }
    }

    public final void d(lk0 lk0Var, TL_iv.PageBlock pageBlock, int i, int i2, boolean z, boolean z2) {
        boolean z3;
        boolean z4 = pageBlock instanceof TL_iv.pageBlockBlockquote;
        ye9 ye9Var = this.a;
        if (z4) {
            if (lk0Var == null) {
                lk0Var = ye9Var.a5();
            }
            if (lk0Var != null) {
                ArrayList arrayList = lk0Var.k;
                if (ye9Var.t3.indexOf(lk0Var) >= 0 && !ye9.t3(lk0Var) && !lk0Var.i) {
                    ld9 ld9Var = ye9Var.R3;
                    if (ld9Var != null) {
                        ld9Var.d();
                    }
                    if (arrayList.isEmpty() && !wi9.n(lk0Var.b)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        pageblockblockquote.caption = new TL_iv.textEmpty();
                        lk0Var.b = pageblockblockquote;
                    } else {
                        if (wi9.n(lk0Var.b)) {
                            long a = wb9.a();
                            TL_iv.RichText h = wi9.h(lk0Var.b);
                            if (h != null && !(h instanceof TL_iv.textEmpty)) {
                                ye9Var.u3.put(Long.valueOf(a), h);
                            }
                            arrayList.add(Long.valueOf(a));
                        }
                        lk0Var.b = new TL_iv.pageBlockParagraph();
                        arrayList.add(Long.valueOf(wb9.a()));
                    }
                    ye9Var.t4();
                    if (z3 && (ye9Var.findFocus() instanceof mc9)) {
                        ye9Var.T1();
                        ld9 ld9Var2 = ye9Var.R3;
                        if (ld9Var2 != null) {
                            ld9Var2.h();
                        }
                        ye9Var.Z2(lk0Var);
                        return;
                    }
                    ye9Var.g3.O(false);
                    ld9 ld9Var3 = ye9Var.R3;
                    if (ld9Var3 != null) {
                        ld9Var3.h();
                    }
                    ye9Var.post(new ce9(ye9Var, lk0Var, (byte) 5));
                    return;
                }
                return;
            }
            return;
        }
        ye9Var.U4(lk0Var, pageBlock, i, i2, z, z2);
    }
}
