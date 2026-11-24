package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class kr extends c49 {
    public final byte a;
    public final Object b;

    public kr(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, p49 p49Var) {
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
                or orVar = (or) obj;
                int b2 = recyclerView.T(view).b();
                if (b2 == 0) {
                    rect.left = gl.L(18.0f);
                }
                if (b2 == orVar.getAdapter().b() - 1) {
                    rect.right = gl.L(18.0f);
                    return;
                }
                int b3 = orVar.getAdapter().b();
                if (b3 == 4) {
                    rect.right = ((orVar.getWidth() - gl.L(36.0f)) - (gl.L(58.0f) * b3)) / (b3 - 1);
                    return;
                } else {
                    rect.right = gl.L(24.0f);
                    return;
                }
            case 1:
                if (RecyclerView.R(view) == ((ArrayList) obj).size() - 1) {
                    rect.bottom = gl.L(4.0f);
                    return;
                }
                return;
            case 2:
                jm3 jm3Var = (jm3) obj;
                if (jm3Var.F0 > 0.0f && RecyclerView.R(view) == 0) {
                    rect.bottom += (int) jm3Var.F0;
                    return;
                }
                return;
            case 3:
                if (!((nv3) obj).e.C1(RecyclerView.R(view))) {
                    i4 = gl.L(4.0f);
                }
                rect.right = i4;
                rect.bottom = gl.L(4.0f);
                return;
            case 4:
                boolean z5 = view instanceof px3;
                hw hwVar = ((qx3) obj).q1;
                if (z5) {
                    rect.left = -hwVar.getPaddingLeft();
                    rect.right = -hwVar.getPaddingRight();
                    return;
                }
                hwVar.getClass();
                if (RecyclerView.R(view) == 1) {
                    rect.top = gl.L(14.0f);
                    return;
                }
                return;
            case 5:
                t14 t14Var = (t14) obj;
                g04 g04Var = t14Var.Q;
                if (view instanceof vza) {
                    rect.left = gl.L(5.0f);
                    rect.right = gl.L(5.0f);
                    if (RecyclerView.R(view) + 1 > t14Var.S.F && !y6c.h(t14Var.d1).p() && !t14Var.V0) {
                        rect.top = gl.L(10.0f);
                        return;
                    }
                    return;
                } else if (!(view instanceof o39) && !(view instanceof l04)) {
                    if (view instanceof be0) {
                        rect.bottom = gl.L(12.0f);
                        return;
                    }
                    return;
                } else {
                    rect.left = -g04Var.getPaddingLeft();
                    rect.right = -g04Var.getPaddingRight();
                    if (view instanceof l04) {
                        rect.top = gl.L(8.0f);
                        return;
                    }
                    return;
                }
            case 6:
                if (RecyclerView.R(view) == ((t37) obj).c.size() - 1) {
                    rect.bottom = gl.L(4.0f);
                    return;
                }
                return;
            case 7:
                super.e(rect, view, recyclerView, p49Var);
                gg7 gg7Var = (gg7) obj;
                if (RecyclerView.R(view) == gg7Var.X1.size()) {
                    rect.bottom = gg7Var.g2;
                    return;
                }
                return;
            case 8:
                int R = RecyclerView.R(view);
                t08 t08Var = (t08) obj;
                int i5 = t08Var.c0;
                if (R >= i5) {
                    int i6 = t08Var.g0;
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
                            i = gl.L(8.0f);
                        } else {
                            i = 0;
                        }
                        rect.top = i;
                        if (z2) {
                            i2 = gl.L(8.0f);
                        } else {
                            i2 = 0;
                        }
                        rect.bottom = i2;
                        if (z3) {
                            i3 = gl.L(10.0f);
                        } else {
                            i3 = 0;
                        }
                        rect.left = i3;
                        if (z4) {
                            i4 = gl.L(10.0f);
                        }
                        rect.right = i4;
                        return;
                    }
                    return;
                }
                return;
            case 9:
                super.e(rect, view, recyclerView, p49Var);
                zy9 zy9Var = (zy9) obj;
                if (RecyclerView.R(view) == zy9Var.Y1.size()) {
                    rect.bottom = zy9Var.k2;
                    return;
                }
                return;
            default:
                super.e(rect, view, recyclerView, p49Var);
                s7c s7cVar = (s7c) obj;
                if (RecyclerView.R(view) == s7cVar.a2.size()) {
                    rect.bottom = s7cVar.k2;
                    return;
                }
                return;
        }
    }
}
