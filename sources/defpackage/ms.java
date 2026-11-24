package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
public class ms extends ImageView {
    public Drawable a;
    public final Path b;
    public int c;
    public int d;

    public ms(Context context) {
        super(context);
        this.b = new Path();
        this.c = gm.L(5.0f);
        this.d = gm.L(42.0f);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.b);
        canvas.scale((this.d / getWidth()) + 1.0f, (this.d / getHeight()) + 1.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
        Drawable drawable = this.a;
        if (drawable != null) {
            int i = this.c;
            drawable.setBounds(-i, -i, getWidth() + this.c, getHeight() + this.c);
            this.a.draw(canvas);
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Path path = this.b;
        path.rewind();
        path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f, Path.Direction.CW);
    }

    public void setBackgroundOuterPadding(int i) {
        this.d = i;
    }

    public void setForeground(int i) {
        this.a = getContext().getDrawable(i);
        invalidate();
    }

    public void setOuterPadding(int i) {
        this.c = i;
    }

    public void setPadding(int i) {
        setPadding(i, i, i, i);
    }
}
