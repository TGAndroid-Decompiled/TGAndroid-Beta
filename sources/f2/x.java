package f2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public abstract class x extends w {
    public final ArrayList Q;
    public boolean R;

    public x(boolean z4) {
        super(1000, z4);
        this.Q = new ArrayList(4);
        this.R = true;
    }

    public abstract boolean B1(int i10);

    public abstract boolean C1(View view);

    @Override
    public final void Z0(af.h r22, f2.i1 r23, f2.g0 r24, f2.f0 r25) {
        throw new UnsupportedOperationException("Method not decompiled: f2.x.Z0(af.h, f2.i1, f2.g0, f2.f0):void");
    }

    @Override
    public final boolean e() {
        return this.R;
    }

    @Override
    public final void e1(af.h hVar, int i10, int i11) {
        if (i10 >= 0) {
            int r10 = r();
            if (this.v) {
                int i12 = r10 - 1;
                for (int i13 = i12; i13 >= 0; i13--) {
                    View q10 = q(i13);
                    if (q10.getBottom() + ((ViewGroup.MarginLayoutParams) ((w0) q10.getLayoutParams())).bottomMargin <= i10) {
                        if (q10.getHeight() + q10.getTop() <= i10) {
                        }
                    }
                    d1(hVar, i12, i13);
                    return;
                }
                return;
            }
            for (int i14 = 0; i14 < r10; i14++) {
                View q11 = q(i14);
                if (q11.getBottom() + ((ViewGroup.MarginLayoutParams) ((w0) q11.getLayoutParams())).bottomMargin <= i10) {
                    if (q11.getHeight() + q11.getTop() <= i10) {
                    }
                }
                d1(hVar, 0, i14);
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
    public final void w1(View view, int i10, boolean z4) {
        u uVar = (u) view.getLayoutParams();
        Rect rect = uVar.f5848b;
        int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) uVar).topMargin + ((ViewGroup.MarginLayoutParams) uVar).bottomMargin;
        x1(v0.s(false, this.K[uVar.f5833f], i10, rect.left + rect.right + ((ViewGroup.MarginLayoutParams) uVar).leftMargin + ((ViewGroup.MarginLayoutParams) uVar).rightMargin, ((ViewGroup.MarginLayoutParams) uVar).width), v0.s(true, this.f5722q.k(), this.f5844l, i11, ((ViewGroup.MarginLayoutParams) uVar).height), view, z4);
    }
}
