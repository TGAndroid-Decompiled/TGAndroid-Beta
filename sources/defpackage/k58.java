package defpackage;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public final class k58 extends View {
    public boolean E;
    public long F;
    public float G;
    public float H;
    public float I;
    public oq7 J;
    public TextPaint a;
    public TextPaint b;
    public StaticLayout c;
    public float d;
    public float e;
    public StaticLayout f;
    public float h;
    public float n;
    public boolean r;
    public lm s;
    public boolean w;
    public l58 x;
    public d6b y;

    @Override
    public final void onDraw(Canvas canvas) {
        float d = this.s.d(this.r);
        if (d > 0.0f && this.c != null && this.f != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (d * 255.0f), 31);
            canvas.save();
            canvas.translate(((getWidth() - this.d) / 2.0f) - this.e, getHeight() * 0.22f);
            this.c.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((getWidth() - this.h) / 2.0f) - this.n, (getHeight() * 0.22f) + gl.L(60.0f));
            this.f.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        TextPaint textPaint = this.a;
        textPaint.setColor(-1);
        float f2 = 0.0f;
        textPaint.setShadowLayer(gl.L(8.0f), 0.0f, 0.0f, 805306368);
        textPaint.setTextSize(gl.L(34.0f));
        TextPaint textPaint2 = this.b;
        textPaint2.setColor(-1);
        textPaint2.setShadowLayer(gl.L(12.0f), 0.0f, 0.0f, 805306368);
        textPaint2.setTextSize(gl.L(58.0f));
        if (this.c == null) {
            StaticLayout staticLayout = new StaticLayout(k96.M0(2131751114, null), textPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.c = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                f = this.c.getLineWidth(0);
            } else {
                f = 0.0f;
            }
            this.d = f;
            if (this.c.getLineCount() > 0) {
                f2 = this.c.getLineLeft(0);
            }
            this.e = f2;
        }
    }

    public void setAllowTouch(boolean z) {
        this.w = z;
    }

    public void setFilterView(l58 l58Var) {
        this.x = l58Var;
    }
}
