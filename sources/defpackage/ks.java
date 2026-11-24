package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class ks extends e69 {
    public final byte a;
    public final Object b;

    public ks(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void d(Rect rect, View view, RecyclerView recyclerView, r69 r69Var) {
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
                os osVar = (os) obj;
                int b2 = recyclerView.T(view).b();
                if (b2 == 0) {
                    rect.left = gm.L(18.0f);
                }
                if (b2 == osVar.getAdapter().b() - 1) {
                    rect.right = gm.L(18.0f);
                    return;
                }
                int b3 = osVar.getAdapter().b();
                if (b3 == 4) {
                    rect.right = ((osVar.getWidth() - gm.L(36.0f)) - (gm.L(58.0f) * b3)) / (b3 - 1);
                    return;
                } else {
                    rect.right = gm.L(24.0f);
                    return;
                }
            case 1:
                if (RecyclerView.R(view) == ((ArrayList) obj).size() - 1) {
                    rect.bottom = gm.L(4.0f);
                    return;
                }
                return;
            case 2:
                un3 un3Var = (un3) obj;
                if (un3Var.F0 > 0.0f && RecyclerView.R(view) == 0) {
                    rect.bottom += (int) un3Var.F0;
                    return;
                }
                return;
            case 3:
                if (!((yw3) obj).e.C1(RecyclerView.R(view))) {
                    i4 = gm.L(4.0f);
                }
                rect.right = i4;
                rect.bottom = gm.L(4.0f);
                return;
            case 4:
                boolean z5 = view instanceof zy3;
                hx hxVar = ((az3) obj).q1;
                if (z5) {
                    rect.left = -hxVar.getPaddingLeft();
                    rect.right = -hxVar.getPaddingRight();
                    return;
                }
                hxVar.getClass();
                if (RecyclerView.R(view) == 1) {
                    rect.top = gm.L(14.0f);
                    return;
                }
                return;
            case 5:
                e34 e34Var = (e34) obj;
                r14 r14Var = e34Var.Q;
                if (view instanceof w1b) {
                    rect.left = gm.L(5.0f);
                    rect.right = gm.L(5.0f);
                    if (RecyclerView.R(view) + 1 > e34Var.S.F && !z8c.h(e34Var.d1).p() && !e34Var.V0) {
                        rect.top = gm.L(10.0f);
                        return;
                    }
                    return;
                } else if (!(view instanceof r59) && !(view instanceof w14)) {
                    if (view instanceof bf0) {
                        rect.bottom = gm.L(12.0f);
                        return;
                    }
                    return;
                } else {
                    rect.left = -r14Var.getPaddingLeft();
                    rect.right = -r14Var.getPaddingRight();
                    if (view instanceof w14) {
                        rect.top = gm.L(8.0f);
                        return;
                    }
                    return;
                }
            case 6:
                if (RecyclerView.R(view) == ((t57) obj).c.size() - 1) {
                    rect.bottom = gm.L(4.0f);
                    return;
                }
                return;
            case 7:
                super.d(rect, view, recyclerView, r69Var);
                ji7 ji7Var = (ji7) obj;
                if (RecyclerView.R(view) == ji7Var.X1.size()) {
                    rect.bottom = ji7Var.g2;
                    return;
                }
                return;
            case 8:
                int R = RecyclerView.R(view);
                w28 w28Var = (w28) obj;
                int i5 = w28Var.c0;
                if (R >= i5) {
                    int i6 = w28Var.g0;
                    if (R < i5 + i6) {
                        int i7 = R - i5;
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
                            i = gm.L(8.0f);
                        } else {
                            i = 0;
                        }
                        rect.top = i;
                        if (z2) {
                            i2 = gm.L(8.0f);
                        } else {
                            i2 = 0;
                        }
                        rect.bottom = i2;
                        if (z3) {
                            i3 = gm.L(10.0f);
                        } else {
                            i3 = 0;
                        }
                        rect.left = i3;
                        if (z4) {
                            i4 = gm.L(10.0f);
                        }
                        rect.right = i4;
                        return;
                    }
                    return;
                }
                return;
            case 9:
                super.d(rect, view, recyclerView, r69Var);
                b1a b1aVar = (b1a) obj;
                if (RecyclerView.R(view) == b1aVar.Y1.size()) {
                    rect.bottom = b1aVar.k2;
                    return;
                }
                return;
            default:
                super.d(rect, view, recyclerView, r69Var);
                t9c t9cVar = (t9c) obj;
                if (RecyclerView.R(view) == t9cVar.a2.size()) {
                    rect.bottom = t9cVar.k2;
                    return;
                }
                return;
        }
    }
}
