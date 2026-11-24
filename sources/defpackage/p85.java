package defpackage;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.LaunchActivity;
public final class p85 extends r59 {
    public final LongSparseIntArray f3;
    public final g95 g3;

    public p85(g95 g95Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.g3 = g95Var;
        this.f3 = new LongSparseIntArray();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p85.dispatchDraw(android.graphics.Canvas):void");
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
        w85 w85Var = this.g3.Q1;
        HashSet hashSet = w85Var.I;
        g95 g95Var = w85Var.L;
        HashSet hashSet2 = w85Var.H;
        if (w85Var.G == null) {
            hashSet2.clear();
            hashSet2.addAll(w85Var.q);
            hashSet.clear();
            hashSet.addAll(w85Var.p);
            w85Var.J = 0.0f;
            w85Var.K = Float.MAX_VALUE;
            if (hashSet2.isEmpty() && hashSet.isEmpty()) {
                return;
            }
            p85 p85Var = g95Var.J1;
            int childCount = p85Var.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = p85Var.getChildAt(i6);
                u69 G = p85Var.G(childAt);
                if (G != null && (i5 = G.f) != 3 && i5 != 4 && i5 != 5 && i5 != 7 && !hashSet2.contains(G)) {
                    w85Var.J = Math.max(w85Var.J, childAt.getY() + childAt.getMeasuredHeight());
                    w85Var.K = Math.min(w85Var.K, Math.max(0.0f, childAt.getY()));
                }
            }
            w85Var.F = 0.0f;
            p85Var.invalidate();
        }
    }

    @Override
    public final void setVisibility(int i) {
        boolean z;
        if (getVisibility() != i) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (childAt instanceof n95) {
                    n95 n95Var = (n95) childAt;
                    if (childAt.isAttachedToWindow() && i == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.g3.E0(n95Var, z);
                }
            }
        }
        super.setVisibility(i);
    }
}
