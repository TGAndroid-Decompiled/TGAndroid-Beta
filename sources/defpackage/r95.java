package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public abstract class r95 extends FrameLayout implements snb {
    public de0 a;
    public ema b;
    public ema c;
    public ImageView d;
    public rb0 e;
    public TLRPC.User f;
    public Paint h;
    public int n;
    public boolean r;
    public int s;

    public final void a(int i, int i2) {
        this.n = i;
        ImageView imageView = this.d;
        imageView.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.MULTIPLY));
        this.c.setTextColor(i2);
        aob.F1(imageView.getDrawable(), i2 & 620756991, true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float L;
        int i;
        if (this.r) {
            if (ob6.a0) {
                L = 0.0f;
            } else {
                L = hl.L(68.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (ob6.a0) {
                i = hl.L(68.0f);
            } else {
                i = 0;
            }
            canvas2 = canvas;
            canvas2.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, this.h);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    public CharSequence getName() {
        return this.b.getText();
    }

    public TLRPC.User getUser() {
        return this.f;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(58.0f), 1073741824));
    }

    public void setDrawDivider(boolean z) {
        this.r = z;
        invalidate();
    }

    @Override
    public final void updateColors() {
        int w0;
        try {
            this.h.setColor(aob.w0(null, aob.Xg, false));
            if (this.d != null && this.c != null && (w0 = aob.w0(null, this.n, false)) != this.s) {
                this.s = w0;
                a(this.n, w0);
            }
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
