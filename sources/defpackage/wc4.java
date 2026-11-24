package defpackage;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public final class wc4 extends FrameLayout {
    public ImageView a;
    public TextView b;
    public int c;
    public boolean d;
    public Boolean e;

    @Override
    public final void onDraw(Canvas canvas) {
        TextView textView = this.b;
        super.onDraw(canvas);
        if (this.d) {
            canvas.drawRect(textView.getLeft(), getMeasuredHeight() - 1, textView.getRight(), getMeasuredHeight(), bkb.j0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), 1073741824));
    }
}
