package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.a;
public final class jl extends FrameLayout {
    public boolean a;
    public int b;
    public in c;
    public in d;

    public in getSubtitleTextView() {
        return this.d;
    }

    public in getTitle() {
        return this.c;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        in inVar = this.d;
        in inVar2 = this.c;
        int D = ik8.D(42.0f, a.getCurrentActionBarHeight(), 2);
        if (this.a) {
            i5 = hl.m;
        } else {
            i5 = 0;
        }
        int i6 = D + i5;
        int i7 = this.b;
        if (inVar.getVisibility() != 8) {
            inVar2.layout(i7, (hl.L(1.0f) + i6) - inVar2.getPaddingTop(), inVar2.getMeasuredWidth() + i7, inVar2.getPaddingBottom() + ((hl.L(1.3f) + (inVar2.getTextHeight() + i6)) - inVar2.getPaddingTop()));
        } else {
            inVar2.layout(i7, (hl.L(11.0f) + i6) - inVar2.getPaddingTop(), inVar2.getMeasuredWidth() + i7, inVar2.getPaddingBottom() + ((hl.L(11.0f) + (inVar2.getTextHeight() + i6)) - inVar2.getPaddingTop()));
        }
        inVar.layout(i7, hl.L(20.0f) + i6, inVar.getMeasuredWidth() + i7, hl.L(24.0f) + inVar.getTextHeight() + i6);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        in inVar = this.c;
        int paddingRight = inVar.getPaddingRight() + size;
        int L = paddingRight - hl.L(16.0f);
        inVar.measure(View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(inVar.getPaddingRight() + hl.L(32.0f), Integer.MIN_VALUE));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), Integer.MIN_VALUE));
        setMeasuredDimension(paddingRight, View.MeasureSpec.getSize(i2));
    }
}
