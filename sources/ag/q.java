package ag;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.us;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.t5;
public final class q extends FrameLayout {
    public final int f679a = 0;
    public int f680b;
    public final Object f681c;
    public final Object d;
    public final us e;

    public q(w wVar, Context context) {
        super(context);
        this.e = wVar;
        this.f680b = -1;
        this.f681c = new Rect();
        this.d = new t5(this, 220L, gr.h);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f679a) {
            case 1:
                li.k kVar = (li.k) this.d;
                Path path = (Path) this.f681c;
                bi biVar = (bi) this.e;
                vg.f fVar = biVar.f24733v2;
                if (fVar != null) {
                    fVar.setBounds(0, (int) biVar.P3, getMeasuredWidth(), getMeasuredHeight());
                    biVar.f24733v2.draw(canvas);
                }
                float L = org.telegram.messenger.i0.L(20.0f);
                int L2 = org.telegram.messenger.i0.L(7.0f);
                int L3 = org.telegram.messenger.i0.L(7.0f);
                RectF rectF = org.telegram.messenger.i0.P;
                float f7 = L2;
                rectF.set(getPaddingLeft(), f7, getWidth() - getPaddingRight(), getHeight() - L3);
                path.rewind();
                path.addRoundRect(rectF, L, L, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF, 255, 31);
                super.dispatchDraw(canvas);
                rectF.set(getPaddingLeft(), f7, getWidth() - getPaddingRight(), org.telegram.messenger.i0.L(6.0f) + L2);
                kVar.o(canvas, rectF, 1, 1.0f);
                rectF.set(getPaddingLeft(), (getHeight() - L3) - org.telegram.messenger.i0.L(6.0f), getWidth() - getPaddingRight(), getHeight() - L3);
                kVar.o(canvas, rectF, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f679a) {
            case 0:
                float width = getWidth() / 2.0f;
                w wVar = (w) this.e;
                float e = ((t5) this.d).e(false, wVar.f762n.getWidth());
                Rect rect = (Rect) this.f681c;
                float f7 = e / 2.0f;
                rect.set((int) (width - (wVar.f762n.getScaleX() * f7)), (int) (((1.0f - wVar.f762n.getScaleY()) * wVar.f762n.getHeight()) + wVar.f762n.getY()), (int) ((wVar.f762n.getScaleX() * f7) + width), (int) (wVar.f762n.getY() + wVar.f762n.getHeight()));
                wVar.f763r.setBounds(rect);
                wVar.f763r.draw(canvas);
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f679a) {
            case 1:
                int i14 = this.f680b;
                bi biVar = (bi) this.e;
                int top = i14 - biVar.f24720s1.getTop();
                super.onLayout(z10, i10, i11, i12, i13);
                this.f680b = getHeight();
                if (biVar.f24720s1.getVisibility() == 0 && getHeight() - biVar.f24720s1.getTop() != top) {
                    biVar.f24720s1.setTranslationY(biVar.f24720s1.getTranslationY() + ((getHeight() - biVar.f24720s1.getTop()) - top));
                    biVar.f24720s1.animate().translationY(0.0f).setDuration(320L).setInterpolator(gr.h).start();
                    return;
                }
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f679a) {
            case 0:
                w wVar = (w) this.e;
                wVar.f762n.measure(i10, i11);
                invalidate();
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(this.f680b, org.telegram.messenger.i0.L(36.0f) + wVar.f762n.getMeasuredHeight()), 1073741824));
                if (this.f680b < 0) {
                    this.f680b = getMeasuredHeight();
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public q(bi biVar, Context context) {
        super(context);
        this.e = biVar;
        this.f681c = new Path();
        this.d = new li.k(23);
    }
}
