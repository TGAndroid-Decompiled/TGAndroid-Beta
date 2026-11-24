package defpackage;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
public final class it9 extends i49 {
    public final byte a;
    public final cj3 b;
    public final hi3 c;

    public it9(hi3 hi3Var, cj3 cj3Var, byte b) {
        this.a = b;
        this.c = hi3Var;
        this.b = cj3Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        byte b = this.a;
        cj3 cj3Var = this.b;
        switch (b) {
            case 0:
                if (i == 1) {
                    gl.t1(cj3Var.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i == 1) {
                    gl.t1(cj3Var.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                if (i == 1) {
                    gl.t1(cj3Var.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i == 1) {
                    gl.t1(cj3Var.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        ji3 ji3Var;
        int i3;
        o39 o39Var;
        byte b = this.a;
        hi3 hi3Var = this.c;
        switch (b) {
            case 0:
                hi3Var.r0.W();
                hi3Var.T();
                return;
            case 1:
                hi3Var.y0.X();
                hi3Var.T();
                return;
            case 2:
                mt9 mt9Var = hi3Var.e0;
                t26 t26Var = hi3Var.f0;
                int K0 = t26Var.K0();
                int M0 = t26Var.M0();
                int abs = Math.abs(t26Var.M0() - K0) + 1;
                int b2 = recyclerView.getAdapter().b();
                if (abs > 0 && (((mt9Var.V.a() != 0 && !mt9Var.Y) || !mt9Var.X) && (M0 == b2 - 1 || ((ji3Var = mt9Var.V) != null && ji3Var.a() != 0 && (i3 = mt9Var.Z) >= 0 && K0 <= i3 && M0 >= i3)))) {
                    mt9Var.P();
                }
                hi3Var.T();
                return;
            default:
                ot9 ot9Var = hi3Var.m0;
                if (ot9Var.b0 && !ot9Var.Z && !TextUtils.isEmpty(ot9Var.e0) && (o39Var = ot9Var.d) != null) {
                    int i4 = 0;
                    while (true) {
                        if (i4 < o39Var.getChildCount()) {
                            if (o39Var.getChildAt(i4) instanceof pi4) {
                                if (ot9Var.b0 && !ot9Var.Z && !TextUtils.isEmpty(ot9Var.e0)) {
                                    ot9Var.W(true);
                                }
                            } else {
                                i4++;
                            }
                        }
                    }
                }
                hi3Var.T();
                return;
        }
    }
}
