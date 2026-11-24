package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.a;
public final class il extends FrameLayout {
    public boolean a;
    public int b;
    public hn c;
    public hn d;

    public hn getSubtitleTextView() {
        return this.d;
    }

    public hn getTitle() {
        return this.c;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        hn hnVar = this.d;
        hn hnVar2 = this.c;
        int D = ug8.D(42.0f, a.getCurrentActionBarHeight(), 2);
        if (this.a) {
            i5 = gl.m;
        } else {
            i5 = 0;
        }
        int i6 = D + i5;
        int i7 = this.b;
        if (hnVar.getVisibility() != 8) {
            hnVar2.layout(i7, (gl.L(1.0f) + i6) - hnVar2.getPaddingTop(), hnVar2.getMeasuredWidth() + i7, hnVar2.getPaddingBottom() + ((gl.L(1.3f) + (hnVar2.getTextHeight() + i6)) - hnVar2.getPaddingTop()));
        } else {
            hnVar2.layout(i7, (gl.L(11.0f) + i6) - hnVar2.getPaddingTop(), hnVar2.getMeasuredWidth() + i7, hnVar2.getPaddingBottom() + ((gl.L(11.0f) + (hnVar2.getTextHeight() + i6)) - hnVar2.getPaddingTop()));
        }
        hnVar.layout(i7, gl.L(20.0f) + i6, hnVar.getMeasuredWidth() + i7, gl.L(24.0f) + hnVar.getTextHeight() + i6);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        hn hnVar = this.c;
        int paddingRight = hnVar.getPaddingRight() + size;
        int L = paddingRight - gl.L(16.0f);
        hnVar.measure(View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(hnVar.getPaddingRight() + gl.L(32.0f), Integer.MIN_VALUE));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gl.L(20.0f), Integer.MIN_VALUE));
        setMeasuredDimension(paddingRight, View.MeasureSpec.getSize(i2));
    }
}
