package defpackage;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.LaunchActivity;
public final class t85 extends d79 {
    public final LongSparseIntArray f3;
    public final j95 g3;

    public t85(j95 j95Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.g3 = j95Var;
        this.f3 = new LongSparseIntArray();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t85.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.g3.M4) {
            return false;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        z85 z85Var = this.g3.Q1;
        HashSet hashSet = z85Var.I;
        j95 j95Var = z85Var.L;
        HashSet hashSet2 = z85Var.H;
        if (z85Var.G == null) {
            hashSet2.clear();
            hashSet2.addAll(z85Var.q);
            hashSet.clear();
            hashSet.addAll(z85Var.p);
            z85Var.J = 0.0f;
            z85Var.K = Float.MAX_VALUE;
            if (hashSet2.isEmpty() && hashSet.isEmpty()) {
                return;
            }
            t85 t85Var = j95Var.J1;
            int childCount = t85Var.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = t85Var.getChildAt(i6);
                f89 H = t85Var.H(childAt);
                if (H != null && (i5 = H.f) != 3 && i5 != 4 && i5 != 5 && i5 != 7 && !hashSet2.contains(H)) {
                    z85Var.J = Math.max(z85Var.J, childAt.getY() + childAt.getMeasuredHeight());
                    z85Var.K = Math.min(z85Var.K, Math.max(0.0f, childAt.getY()));
                }
            }
            z85Var.F = 0.0f;
            t85Var.invalidate();
        }
    }

    @Override
    public final void setVisibility(int i) {
        boolean z;
        if (getVisibility() != i) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (childAt instanceof q95) {
                    q95 q95Var = (q95) childAt;
                    if (childAt.isAttachedToWindow() && i == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.g3.F0(q95Var, z);
                }
            }
        }
        super.setVisibility(i);
    }
}
