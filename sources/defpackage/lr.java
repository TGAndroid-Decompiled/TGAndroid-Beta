package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class lr extends p79 {
    public final byte a;
    public final Object b;

    public lr(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void d(Rect rect, View view, RecyclerView recyclerView, c89 c89Var) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        int i3;
        byte b = this.a;
        int i4 = 0;
        boolean z4 = true;
        Object obj = this.b;
        switch (b) {
            case 0:
                pr prVar = (pr) obj;
                int b2 = recyclerView.U(view).b();
                if (b2 == 0) {
                    rect.left = hl.L(18.0f);
                }
                if (b2 == prVar.getAdapter().b() - 1) {
                    rect.right = hl.L(18.0f);
                    return;
                }
                int b3 = prVar.getAdapter().b();
                if (b3 == 4) {
                    rect.right = ((prVar.getWidth() - hl.L(36.0f)) - (hl.L(58.0f) * b3)) / (b3 - 1);
                    return;
                } else {
                    rect.right = hl.L(24.0f);
                    return;
                }
            case 1:
                if (RecyclerView.S(view) == ((ArrayList) obj).size() - 1) {
                    rect.bottom = hl.L(4.0f);
                    return;
                }
                return;
            case 2:
                bn3 bn3Var = (bn3) obj;
                if (bn3Var.G0 > 0.0f && RecyclerView.S(view) == 0) {
                    rect.bottom += (int) bn3Var.G0;
                    return;
                }
                return;
            case 3:
                if (!((hw3) obj).e.C1(RecyclerView.S(view))) {
                    i4 = hl.L(4.0f);
                }
                rect.right = i4;
                rect.bottom = hl.L(4.0f);
                return;
            case 4:
                boolean z5 = view instanceof ky3;
                iw iwVar = ((ly3) obj).q1;
                if (z5) {
                    rect.left = -iwVar.getPaddingLeft();
                    rect.right = -iwVar.getPaddingRight();
                    return;
                }
                iwVar.getClass();
                if (RecyclerView.S(view) == 1) {
                    rect.top = hl.L(14.0f);
                    return;
                }
                return;
            case 5:
                o24 o24Var = (o24) obj;
                b14 b14Var = o24Var.Q;
                if (view instanceof u3b) {
                    rect.left = hl.L(5.0f);
                    rect.right = hl.L(5.0f);
                    if (RecyclerView.S(view) + 1 > o24Var.S.F && !yac.h(o24Var.d1).p() && !o24Var.V0) {
                        rect.top = hl.L(10.0f);
                        return;
                    }
                    return;
                } else if (!(view instanceof d79) && !(view instanceof g14)) {
                    if (view instanceof de0) {
                        rect.bottom = hl.L(12.0f);
                        return;
                    }
                    return;
                } else {
                    rect.left = -b14Var.getPaddingLeft();
                    rect.right = -b14Var.getPaddingRight();
                    if (view instanceof g14) {
                        rect.top = hl.L(8.0f);
                        return;
                    }
                    return;
                }
            case 6:
                if (RecyclerView.S(view) == ((a67) obj).c.size() - 1) {
                    rect.bottom = hl.L(4.0f);
                    return;
                }
                return;
            case 7:
                super.d(rect, view, recyclerView, c89Var);
                qi7 qi7Var = (qi7) obj;
                if (RecyclerView.S(view) == qi7Var.X1.size()) {
                    rect.bottom = qi7Var.g2;
                    return;
                }
                return;
            case 8:
                int S = RecyclerView.S(view);
                a48 a48Var = (a48) obj;
                int i5 = a48Var.c0;
                if (S >= i5) {
                    int i6 = a48Var.g0;
                    if (S < i5 + i6) {
                        int i7 = S - i5;
                        int i8 = i7 / 3;
                        if (i8 == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (i8 == (i6 - 1) / 3) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        int i9 = i7 % 3;
                        if (i9 == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (i9 != 2) {
                            z4 = false;
                        }
                        if (z) {
                            i = hl.L(8.0f);
                        } else {
                            i = 0;
                        }
                        rect.top = i;
                        if (z2) {
                            i2 = hl.L(8.0f);
                        } else {
                            i2 = 0;
                        }
                        rect.bottom = i2;
                        if (z3) {
                            i3 = hl.L(10.0f);
                        } else {
                            i3 = 0;
                        }
                        rect.left = i3;
                        if (z4) {
                            i4 = hl.L(10.0f);
                        }
                        rect.right = i4;
                        return;
                    }
                    return;
                }
                return;
            case 9:
                super.d(rect, view, recyclerView, c89Var);
                t2a t2aVar = (t2a) obj;
                if (RecyclerView.S(view) == t2aVar.Y1.size()) {
                    rect.bottom = t2aVar.k2;
                    return;
                }
                return;
            default:
                super.d(rect, view, recyclerView, c89Var);
                sbc sbcVar = (sbc) obj;
                if (RecyclerView.S(view) == sbcVar.a2.size()) {
                    rect.bottom = sbcVar.k2;
                    return;
                }
                return;
        }
    }
}
