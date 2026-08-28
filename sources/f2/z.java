package f2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public abstract class z extends y {
    public final ArrayList Q;
    public boolean R;

    public z(boolean z10) {
        super(1000, z10);
        this.Q = new ArrayList(4);
        this.R = true;
    }

    public abstract boolean B1(int i9);

    public abstract boolean C1(View view);

    @Override
    public final void Z0(f2.g1 r22, f2.n1 r23, f2.k0 r24, f2.j0 r25) {
        throw new UnsupportedOperationException("Method not decompiled: f2.z.Z0(f2.g1, f2.n1, f2.k0, f2.j0):void");
    }

    @Override
    public final boolean e() {
        return this.R;
    }

    @Override
    public final void e1(g1 g1Var, int i9, int i10) {
        if (i9 >= 0) {
            int r10 = r();
            if (this.v) {
                int i11 = r10 - 1;
                for (int i12 = i11; i12 >= 0; i12--) {
                    View q10 = q(i12);
                    if (q10.getBottom() + ((ViewGroup.MarginLayoutParams) ((a1) q10.getLayoutParams())).bottomMargin <= i9) {
                        if (q10.getHeight() + q10.getTop() <= i9) {
                        }
                    }
                    d1(g1Var, i11, i12);
                    return;
                }
                return;
            }
            for (int i13 = 0; i13 < r10; i13++) {
                View q11 = q(i13);
                if (q11.getBottom() + ((ViewGroup.MarginLayoutParams) ((a1) q11.getLayoutParams())).bottomMargin <= i9) {
                    if (q11.getHeight() + q11.getTop() <= i9) {
                    }
                }
                d1(g1Var, 0, i13);
                return;
            }
        }
    }

    @Override
    public final int[] q1(int i9, int i10, int[] iArr) {
        if (iArr == null || iArr.length != i9 + 1 || iArr[iArr.length - 1] != i10) {
            iArr = new int[i9 + 1];
        }
        iArr[0] = 0;
        for (int i11 = 1; i11 <= i9; i11++) {
            iArr[i11] = (int) Math.ceil((i11 / i9) * i10);
        }
        return iArr;
    }

    @Override
    public final void w1(View view, int i9, boolean z10) {
        w wVar = (w) view.getLayoutParams();
        Rect rect = wVar.f5312b;
        int i10 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) wVar).topMargin + ((ViewGroup.MarginLayoutParams) wVar).bottomMargin;
        x1(z0.s(false, this.K[wVar.f5545f], i9, rect.left + rect.right + ((ViewGroup.MarginLayoutParams) wVar).leftMargin + ((ViewGroup.MarginLayoutParams) wVar).rightMargin, ((ViewGroup.MarginLayoutParams) wVar).width), z0.s(true, this.f5434q.k(), this.f5571l, i10, ((ViewGroup.MarginLayoutParams) wVar).height), view, z10);
    }
}
