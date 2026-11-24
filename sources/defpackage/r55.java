package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public abstract class r55 extends q55 {
    public final ArrayList Q;
    public boolean R;

    public r55(boolean z) {
        super(1000, z);
        this.Q = new ArrayList(4);
        this.R = true;
    }

    public boolean A1(View view) {
        return false;
    }

    @Override
    public final void Y0(defpackage.ki2 r22, defpackage.r69 r23, defpackage.s46 r24, defpackage.r46 r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r55.Y0(ki2, r69, s46, r46):void");
    }

    @Override
    public final void d1(ki2 ki2Var, int i, int i2) {
        if (i >= 0) {
            int r = r();
            if (this.v) {
                int i3 = r - 1;
                for (int i4 = i3; i4 >= 0; i4--) {
                    View q = q(i4);
                    if (q.getBottom() + ((ViewGroup.MarginLayoutParams) ((g69) q.getLayoutParams())).bottomMargin <= i) {
                        if (q.getHeight() + q.getTop() <= i) {
                        }
                    }
                    c1(ki2Var, i3, i4);
                    return;
                }
                return;
            }
            for (int i5 = 0; i5 < r; i5++) {
                View q2 = q(i5);
                if (q2.getBottom() + ((ViewGroup.MarginLayoutParams) ((g69) q2.getLayoutParams())).bottomMargin <= i) {
                    if (q2.getHeight() + q2.getTop() <= i) {
                    }
                }
                c1(ki2Var, 0, i5);
                return;
            }
        }
    }

    @Override
    public final boolean e() {
        return this.R;
    }

    @Override
    public final int[] p1(int i, int i2, int[] iArr) {
        if (iArr == null || iArr.length != i + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i + 1];
        }
        iArr[0] = 0;
        for (int i3 = 1; i3 <= i; i3++) {
            iArr[i3] = (int) Math.ceil((i3 / i) * i2);
        }
        return iArr;
    }

    @Override
    public final void v1(int i, View view, boolean z) {
        p55 p55Var = (p55) view.getLayoutParams();
        Rect rect = p55Var.b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) p55Var).topMargin + ((ViewGroup.MarginLayoutParams) p55Var).bottomMargin;
        w1(f69.s(false, this.K[p55Var.f], i, rect.left + rect.right + ((ViewGroup.MarginLayoutParams) p55Var).leftMargin + ((ViewGroup.MarginLayoutParams) p55Var).rightMargin, ((ViewGroup.MarginLayoutParams) p55Var).width), f69.s(true, this.q.k(), this.l, i2, ((ViewGroup.MarginLayoutParams) p55Var).height), view, z);
    }

    public abstract boolean z1(int i);
}
