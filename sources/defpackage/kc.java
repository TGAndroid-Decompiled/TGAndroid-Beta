package defpackage;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
public final class kc extends View implements tjb {
    public final ImageReceiver a;
    public final String b;
    public final String c;
    public final TextPaint d;
    public StaticLayout e;
    public float f;
    public float h;
    public final TextPaint n;
    public StaticLayout r;
    public float s;
    public float w;
    public final wjb x;

    public kc(android.content.Context r9, defpackage.jm6 r10, java.lang.String r11, int r12, defpackage.wjb r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kc.<init>(android.content.Context, jm6, java.lang.String, int, wjb):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float paddingLeft = getPaddingLeft();
        ImageReceiver imageReceiver = this.a;
        imageReceiver.i0(paddingLeft, (getMeasuredHeight() - gl.L(30.0f)) / 2.0f, gl.L(30.0f), gl.L(30.0f));
        imageReceiver.h(canvas, null);
        float L = paddingLeft + gl.L(30.0f) + gl.L(12.0f);
        if (this.e != null) {
            canvas.save();
            canvas.translate(L - this.h, (getMeasuredHeight() - this.e.getHeight()) / 2.0f);
            this.e.draw(canvas);
            L = L + this.f + gl.L(6.0f);
            canvas.restore();
        }
        if (this.r != null) {
            canvas.save();
            canvas.translate(L - this.w, gl.N(1.6f) + ((getMeasuredHeight() - this.r.getHeight()) / 2.0f));
            this.r.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.I();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.K();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        float f2;
        float f3;
        int size = (((View.MeasureSpec.getSize(i) - gl.L(30.0f)) - gl.L(12.0f)) - getPaddingLeft()) - getPaddingRight();
        StaticLayout staticLayout = this.e;
        if (staticLayout == null || staticLayout.getWidth() != size) {
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            String str = this.b;
            TextPaint textPaint = this.d;
            CharSequence ellipsize = TextUtils.ellipsize(str, textPaint, size, truncateAt);
            int max = Math.max(0, size);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            StaticLayout staticLayout2 = new StaticLayout(ellipsize, textPaint, max, alignment, 1.0f, 0.0f, false);
            this.e = staticLayout2;
            int lineCount = staticLayout2.getLineCount();
            float f4 = 0.0f;
            if (lineCount > 0) {
                f = this.e.getLineLeft(0);
            } else {
                f = 0.0f;
            }
            this.h = f;
            if (this.e.getLineCount() > 0) {
                f2 = this.e.getLineWidth(0);
            } else {
                f2 = 0.0f;
            }
            this.f = f2;
            int L = size - ((int) (f2 + gl.L(8.0f)));
            TextPaint textPaint2 = this.n;
            StaticLayout staticLayout3 = new StaticLayout(TextUtils.ellipsize(this.c, textPaint2, L, truncateAt), textPaint2, Math.max(0, L), alignment, 1.0f, 0.0f, false);
            this.r = staticLayout3;
            if (staticLayout3.getLineCount() > 0) {
                f3 = this.r.getLineLeft(0);
            } else {
                f3 = 0.0f;
            }
            this.w = f3;
            if (this.r.getLineCount() > 0) {
                f4 = this.r.getLineWidth(0);
            }
            this.s = f4;
        }
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension((int) Math.min(gl.L(12.0f) + gl.L(30.0f) + getPaddingLeft() + this.f + gl.L(8.0f) + this.s + getPaddingRight(), View.MeasureSpec.getSize(i)), gl.L(48.0f));
        } else if (View.MeasureSpec.getMode(i) == 1073741824) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), gl.L(48.0f));
        }
    }

    @Override
    public final void updateColors() {
        TextPaint textPaint = this.n;
        try {
            int v0 = bkb.v0(bkb.D8, this.x);
            this.d.setColor(v0);
            textPaint.setColor(v0);
            textPaint.setAlpha(102);
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
