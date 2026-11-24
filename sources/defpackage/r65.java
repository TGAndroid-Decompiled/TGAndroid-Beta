package defpackage;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.LaunchActivity;
public final class r65 extends o39 {
    public final LongSparseIntArray f3;
    public final h75 g3;

    public r65(h75 h75Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.g3 = h75Var;
        this.f3 = new LongSparseIntArray();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r65.dispatchDraw(android.graphics.Canvas):void");
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
        x65 x65Var = this.g3.Q1;
        HashSet hashSet = x65Var.I;
        h75 h75Var = x65Var.L;
        HashSet hashSet2 = x65Var.H;
        if (x65Var.G == null) {
            hashSet2.clear();
            hashSet2.addAll(x65Var.q);
            hashSet.clear();
            hashSet.addAll(x65Var.p);
            x65Var.J = 0.0f;
            x65Var.K = Float.MAX_VALUE;
            if (hashSet2.isEmpty() && hashSet.isEmpty()) {
                return;
            }
            r65 r65Var = h75Var.J1;
            int childCount = r65Var.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = r65Var.getChildAt(i6);
                s49 G = r65Var.G(childAt);
                if (G != null && (i5 = G.f) != 3 && i5 != 4 && i5 != 5 && i5 != 7 && !hashSet2.contains(G)) {
                    x65Var.J = Math.max(x65Var.J, childAt.getY() + childAt.getMeasuredHeight());
                    x65Var.K = Math.min(x65Var.K, Math.max(0.0f, childAt.getY()));
                }
            }
            x65Var.F = 0.0f;
            r65Var.invalidate();
        }
    }

    @Override
    public final void setVisibility(int i) {
        boolean z;
        if (getVisibility() != i) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (childAt instanceof o75) {
                    o75 o75Var = (o75) childAt;
                    if (childAt.isAttachedToWindow() && i == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.g3.E0(o75Var, z);
                }
            }
        }
        super.setVisibility(i);
    }
}
