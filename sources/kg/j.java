package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.ls;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.xq;
public final class j extends FrameLayout {
    public final int f17405a = 0;
    public int f17406b;
    public final Object f17407c;
    public final Object d;
    public final ls f17408e;

    public j(m mVar, Context context) {
        super(context);
        this.f17408e = mVar;
        this.f17406b = -1;
        this.f17407c = new Rect();
        this.d = new w5(this, 220L, xq.h);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f17405a) {
            case 1:
                h6.m mVar = (h6.m) this.d;
                Path path = (Path) this.f17407c;
                di diVar = (di) this.f17408e;
                fh.g gVar = diVar.f33059v2;
                if (gVar != null) {
                    gVar.setBounds(0, (int) diVar.P3, getMeasuredWidth(), getMeasuredHeight());
                    diVar.f33059v2.draw(canvas);
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
                mVar.m(canvas, rectF, 1, 1.0f);
                rectF.set(getPaddingLeft(), (getHeight() - L3) - org.telegram.messenger.g0.L(6.0f), getWidth() - getPaddingRight(), getHeight() - L3);
                mVar.m(canvas, rectF, 3, 1.0f);
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
        switch (this.f17405a) {
            case 0:
                float width = getWidth() / 2.0f;
                m mVar = (m) this.f17408e;
                float e10 = ((w5) this.d).e(false, mVar.f17430n.getWidth());
                Rect rect = (Rect) this.f17407c;
                float f10 = e10 / 2.0f;
                rect.set((int) (width - (mVar.f17430n.getScaleX() * f10)), (int) (((1.0f - mVar.f17430n.getScaleY()) * mVar.f17430n.getHeight()) + mVar.f17430n.getY()), (int) ((mVar.f17430n.getScaleX() * f10) + width), (int) (mVar.f17430n.getY() + mVar.f17430n.getHeight()));
                mVar.f17431r.setBounds(rect);
                mVar.f17431r.draw(canvas);
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.f17405a) {
            case 1:
                int i13 = this.f17406b;
                di diVar = (di) this.f17408e;
                int top = i13 - diVar.f33046s1.getTop();
                super.onLayout(z9, i7, i10, i11, i12);
                this.f17406b = getHeight();
                if (diVar.f33046s1.getVisibility() == 0 && getHeight() - diVar.f33046s1.getTop() != top) {
                    diVar.f33046s1.setTranslationY(diVar.f33046s1.getTranslationY() + ((getHeight() - diVar.f33046s1.getTop()) - top));
                    diVar.f33046s1.animate().translationY(0.0f).setDuration(320L).setInterpolator(xq.h).start();
                    return;
                }
                return;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f17405a) {
            case 0:
                m mVar = (m) this.f17408e;
                mVar.f17430n.measure(i7, i10);
                invalidate();
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(this.f17406b, org.telegram.messenger.g0.L(36.0f) + mVar.f17430n.getMeasuredHeight()), 1073741824));
                if (this.f17406b < 0) {
                    this.f17406b = getMeasuredHeight();
                    return;
                }
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    public j(di diVar, Context context) {
        super(context);
        this.f17408e = diVar;
        this.f17407c = new Path();
        this.d = new h6.m(28);
    }
}
