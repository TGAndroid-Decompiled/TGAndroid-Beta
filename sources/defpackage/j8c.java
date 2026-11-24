package defpackage;

import android.content.Context;
import androidx.core.widget.NestedScrollView;
public final class j8c extends NestedScrollView {
    public boolean W;
    public final k8c a0;

    public j8c(k8c k8cVar, Context context) {
        super(context);
        this.a0 = k8cVar;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.a0.E0();
    }

    @Override
    public final void onMeasure(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j8c.onMeasure(int, int):void");
    }

    @Override
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.a0.E0();
    }

    @Override
    public final void requestLayout() {
        if (this.W) {
            return;
        }
        super.requestLayout();
    }
}
