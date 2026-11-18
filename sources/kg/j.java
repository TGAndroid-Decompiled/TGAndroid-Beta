package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.fs;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.si;
public final class j extends FrameLayout {
    public final int f18352a = 0;
    public int f18353b;
    public final Object f18354c;
    public final Object d;
    public final fs f18355e;

    public j(n nVar, Context context) {
        super(context);
        this.f18355e = nVar;
        this.f18353b = -1;
        this.f18354c = new Rect();
        this.d = new c6(this, 220L, lr.h);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f18352a) {
            case 1:
                h6.m mVar = (h6.m) this.d;
                Path path = (Path) this.f18354c;
                si siVar = (si) this.f18355e;
                fh.g gVar = siVar.f39744z2;
                if (gVar != null) {
                    gVar.setBounds(0, (int) siVar.T3, getMeasuredWidth(), getMeasuredHeight());
                    siVar.f39744z2.draw(canvas);
                }
                float L = org.telegram.messenger.g0.L(20.0f);
                int L2 = org.telegram.messenger.g0.L(7.0f);
                int L3 = org.telegram.messenger.g0.L(7.0f);
                RectF rectF = org.telegram.messenger.g0.P;
                float f10 = L2;
                rectF.set(getPaddingLeft(), f10, getWidth() - getPaddingRight(), getHeight() - L3);
                path.rewind();
                path.addRoundRect(rectF, L, L, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF, 255, 31);
                super.dispatchDraw(canvas);
                rectF.set(getPaddingLeft(), f10, getWidth() - getPaddingRight(), org.telegram.messenger.g0.L(6.0f) + L2);
                mVar.n(canvas, rectF, 1, 1.0f);
                rectF.set(getPaddingLeft(), (getHeight() - L3) - org.telegram.messenger.g0.L(6.0f), getWidth() - getPaddingRight(), getHeight() - L3);
                mVar.n(canvas, rectF, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f18352a) {
            case 0:
                float width = getWidth() / 2.0f;
                n nVar = (n) this.f18355e;
                float e10 = ((c6) this.d).e(false, nVar.f18388n.getWidth());
                Rect rect = (Rect) this.f18354c;
                float f10 = e10 / 2.0f;
                rect.set((int) (width - (nVar.f18388n.getScaleX() * f10)), (int) (((1.0f - nVar.f18388n.getScaleY()) * nVar.f18388n.getHeight()) + nVar.f18388n.getY()), (int) ((nVar.f18388n.getScaleX() * f10) + width), (int) (nVar.f18388n.getY() + nVar.f18388n.getHeight()));
                nVar.f18389r.setBounds(rect);
                nVar.f18389r.draw(canvas);
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f18352a) {
            case 1:
                int i13 = this.f18353b;
                si siVar = (si) this.f18355e;
                int top = i13 - siVar.f39731w1.getTop();
                super.onLayout(z10, i7, i10, i11, i12);
                this.f18353b = getHeight();
                if (siVar.f39731w1.getVisibility() == 0 && getHeight() - siVar.f39731w1.getTop() != top) {
                    siVar.f39731w1.setTranslationY(siVar.f39731w1.getTranslationY() + ((getHeight() - siVar.f39731w1.getTop()) - top));
                    siVar.f39731w1.animate().translationY(0.0f).setDuration(320L).setInterpolator(lr.h).start();
                    return;
                }
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f18352a) {
            case 0:
                n nVar = (n) this.f18355e;
                nVar.f18388n.measure(i7, i10);
                invalidate();
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(this.f18353b, org.telegram.messenger.g0.L(36.0f) + nVar.f18388n.getMeasuredHeight()), 1073741824));
                if (this.f18353b < 0) {
                    this.f18353b = getMeasuredHeight();
                    return;
                }
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    public j(si siVar, Context context) {
        super(context);
        this.f18355e = siVar;
        this.f18354c = new Path();
        this.d = new h6.m(29);
    }
}
