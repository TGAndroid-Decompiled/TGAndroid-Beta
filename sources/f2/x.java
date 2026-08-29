package f2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public abstract class x extends w {
    public final ArrayList Q;
    public boolean R;

    public x(boolean z10) {
        super(1000, z10);
        this.Q = new ArrayList(4);
        this.R = true;
    }

    public abstract boolean B1(int i10);

    public abstract boolean C1(View view);

    @Override
    public final void Z0(f2.d1 r22, f2.k1 r23, f2.h0 r24, f2.g0 r25) {
        throw new UnsupportedOperationException("Method not decompiled: f2.x.Z0(f2.d1, f2.k1, f2.h0, f2.g0):void");
    }

    @Override
    public final boolean e() {
        return this.R;
    }

    @Override
    public final void e1(d1 d1Var, int i10, int i11) {
        if (i10 >= 0) {
            int r6 = r();
            if (this.v) {
                int i12 = r6 - 1;
                for (int i13 = i12; i13 >= 0; i13--) {
                    View q6 = q(i13);
                    if (q6.getBottom() + ((ViewGroup.MarginLayoutParams) ((x0) q6.getLayoutParams())).bottomMargin <= i10) {
                        if (q6.getHeight() + q6.getTop() <= i10) {
                        }
                    }
                    d1(d1Var, i12, i13);
                    return;
                }
                return;
            }
            for (int i14 = 0; i14 < r6; i14++) {
                View q9 = q(i14);
                if (q9.getBottom() + ((ViewGroup.MarginLayoutParams) ((x0) q9.getLayoutParams())).bottomMargin <= i10) {
                    if (q9.getHeight() + q9.getTop() <= i10) {
                    }
                }
                d1(d1Var, 0, i14);
                return;
            }
        }
    }

    @Override
    public final int[] q1(int i10, int i11, int[] iArr) {
        if (iArr == null || iArr.length != i10 + 1 || iArr[iArr.length - 1] != i11) {
            iArr = new int[i10 + 1];
        }
        iArr[0] = 0;
        for (int i12 = 1; i12 <= i10; i12++) {
            iArr[i12] = (int) Math.ceil((i12 / i10) * i11);
        }
        return iArr;
    }

    @Override
    public final void w1(View view, int i10, boolean z10) {
        u uVar = (u) view.getLayoutParams();
        Rect rect = uVar.f6509b;
        int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) uVar).topMargin + ((ViewGroup.MarginLayoutParams) uVar).bottomMargin;
        x1(w0.s(false, this.K[uVar.f6483f], i10, rect.left + rect.right + ((ViewGroup.MarginLayoutParams) uVar).leftMargin + ((ViewGroup.MarginLayoutParams) uVar).rightMargin, ((ViewGroup.MarginLayoutParams) uVar).width), w0.s(true, this.f6364q.k(), this.f6505l, i11, ((ViewGroup.MarginLayoutParams) uVar).height), view, z10);
    }
}
