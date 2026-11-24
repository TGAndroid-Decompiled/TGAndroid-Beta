package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.TextView;
public class fm extends TextView {
    public int a;
    public PorterDuffColorFilter b;
    public cm c;

    public fm(Context context) {
        super(context);
        this.a = 0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c = gm.update(this.a, this, this.c, getLayout());
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gm.release(this, this.c);
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f;
        int paddingLeft;
        Canvas canvas2;
        super.onDraw(canvas);
        if ((getGravity() & 16) != 0 && getLayout() != null) {
            f = ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2.0f) + getPaddingTop();
        } else {
            f = 0.0f;
        }
        if (k96.a0) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        float f2 = paddingLeft;
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i == 0 && f2 == 0.0f) {
            canvas2 = canvas;
        } else {
            canvas.save();
            canvas2 = canvas;
            canvas2.translate(f2, f);
        }
        gm.drawAnimatedEmojis(canvas2, getLayout(), this.c, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.b);
        if (i == 0 && f2 == 0.0f) {
            return;
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.c = gm.update(this.a, this, this.c, getLayout());
    }

    public void setCacheType(int i) {
        if (this.a == i) {
            return;
        }
        this.a = i;
        this.c = gm.update(i, this, this.c, getLayout());
    }

    public void setEmojiColor(int i) {
        this.b = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.c = gm.update(this.a, this, this.c, getLayout());
    }
}
