package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.ls;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.v5;
import org.telegram.ui.Components.wq;
public final class j extends FrameLayout {
    public final int f17408a = 0;
    public int f17409b;
    public final Object f17410c;
    public final Object d;
    public final ls f17411e;

    public j(m mVar, Context context) {
        super(context);
        this.f17411e = mVar;
        this.f17409b = -1;
        this.f17410c = new Rect();
        this.d = new v5(this, 220L, wq.h);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f17408a) {
            case 1:
                h6.m mVar = (h6.m) this.d;
                Path path = (Path) this.f17410c;
                ci ciVar = (ci) this.f17411e;
                fh.g gVar = ciVar.f32672y2;
                if (gVar != null) {
                    gVar.setBounds(0, (int) ciVar.S3, getMeasuredWidth(), getMeasuredHeight());
                    ciVar.f32672y2.draw(canvas);
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
        switch (this.f17408a) {
            case 0:
                float width = getWidth() / 2.0f;
                m mVar = (m) this.f17411e;
                float e10 = ((v5) this.d).e(false, mVar.f17433n.getWidth());
                Rect rect = (Rect) this.f17410c;
                float f10 = e10 / 2.0f;
                rect.set((int) (width - (mVar.f17433n.getScaleX() * f10)), (int) (((1.0f - mVar.f17433n.getScaleY()) * mVar.f17433n.getHeight()) + mVar.f17433n.getY()), (int) ((mVar.f17433n.getScaleX() * f10) + width), (int) (mVar.f17433n.getY() + mVar.f17433n.getHeight()));
                mVar.f17434r.setBounds(rect);
                mVar.f17434r.draw(canvas);
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.f17408a) {
            case 1:
                int i13 = this.f17409b;
                ci ciVar = (ci) this.f17411e;
                int top = i13 - ciVar.f32659v1.getTop();
                super.onLayout(z9, i7, i10, i11, i12);
                this.f17409b = getHeight();
                if (ciVar.f32659v1.getVisibility() == 0 && getHeight() - ciVar.f32659v1.getTop() != top) {
                    ciVar.f32659v1.setTranslationY(ciVar.f32659v1.getTranslationY() + ((getHeight() - ciVar.f32659v1.getTop()) - top));
                    ciVar.f32659v1.animate().translationY(0.0f).setDuration(320L).setInterpolator(wq.h).start();
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
        switch (this.f17408a) {
            case 0:
                m mVar = (m) this.f17411e;
                mVar.f17433n.measure(i7, i10);
                invalidate();
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(this.f17409b, org.telegram.messenger.g0.L(36.0f) + mVar.f17433n.getMeasuredHeight()), 1073741824));
                if (this.f17409b < 0) {
                    this.f17409b = getMeasuredHeight();
                    return;
                }
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    public j(ci ciVar, Context context) {
        super(context);
        this.f17411e = ciVar;
        this.f17410c = new Path();
        this.d = new h6.m(28);
    }
}
