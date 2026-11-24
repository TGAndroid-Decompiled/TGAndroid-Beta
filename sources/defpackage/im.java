package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.a;
public final class im extends FrameLayout {
    public boolean a;
    public int b;
    public io c;
    public io d;

    public io getSubtitleTextView() {
        return this.d;
    }

    public io getTitle() {
        return this.c;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        io ioVar = this.d;
        io ioVar2 = this.c;
        int D = wi8.D(42.0f, a.getCurrentActionBarHeight(), 2);
        if (this.a) {
            i5 = gm.m;
        } else {
            i5 = 0;
        }
        int i6 = D + i5;
        int i7 = this.b;
        if (ioVar.getVisibility() != 8) {
            ioVar2.layout(i7, (gm.L(1.0f) + i6) - ioVar2.getPaddingTop(), ioVar2.getMeasuredWidth() + i7, ioVar2.getPaddingBottom() + ((gm.L(1.3f) + (ioVar2.getTextHeight() + i6)) - ioVar2.getPaddingTop()));
        } else {
            ioVar2.layout(i7, (gm.L(11.0f) + i6) - ioVar2.getPaddingTop(), ioVar2.getMeasuredWidth() + i7, ioVar2.getPaddingBottom() + ((gm.L(11.0f) + (ioVar2.getTextHeight() + i6)) - ioVar2.getPaddingTop()));
        }
        ioVar.layout(i7, gm.L(20.0f) + i6, ioVar.getMeasuredWidth() + i7, gm.L(24.0f) + ioVar.getTextHeight() + i6);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        io ioVar = this.c;
        int paddingRight = ioVar.getPaddingRight() + size;
        int L = paddingRight - gm.L(16.0f);
        ioVar.measure(View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(ioVar.getPaddingRight() + gm.L(32.0f), Integer.MIN_VALUE));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gm.L(20.0f), Integer.MIN_VALUE));
        setMeasuredDimension(paddingRight, View.MeasureSpec.getSize(i2));
    }
}
