package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class yc5 extends FrameLayout {
    public Drawable a;
    public TextView b;

    @Override
    public final void onDraw(Canvas canvas) {
        Drawable drawable = this.a;
        drawable.setBounds(0, getMeasuredHeight() - hl.L(3.0f), getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(40.0f), 1073741824));
    }

    public void setText(String str) {
        this.b.setText(str);
    }
}
