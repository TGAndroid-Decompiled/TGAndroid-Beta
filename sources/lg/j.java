package lg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.cs;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.xq;
public final class j extends FrameLayout {
    public final int f18334a = 0;
    public int f18335b;
    public final Object f18336c;
    public final Object d;
    public final cs f18337e;

    public j(m mVar, Context context) {
        super(context);
        this.f18337e = mVar;
        this.f18335b = -1;
        this.f18336c = new Rect();
        this.d = new u5(this, 220L, xq.h);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f18334a) {
            case 1:
                k4.j jVar = (k4.j) this.d;
                Path path = (Path) this.f18336c;
                bi biVar = (bi) this.f18337e;
                gh.g gVar = biVar.f32287w2;
                if (gVar != null) {
                    gVar.setBounds(0, (int) biVar.Q3, getMeasuredWidth(), getMeasuredHeight());
                    biVar.f32287w2.draw(canvas);
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
                jVar.w(canvas, rectF, 1, 1.0f);
                rectF.set(getPaddingLeft(), (getHeight() - L3) - org.telegram.messenger.g0.L(6.0f), getWidth() - getPaddingRight(), getHeight() - L3);
                jVar.w(canvas, rectF, 3, 1.0f);
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
        switch (this.f18334a) {
            case 0:
                float width = getWidth() / 2.0f;
                m mVar = (m) this.f18337e;
                float e10 = ((u5) this.d).e(false, mVar.f18359n.getWidth());
                Rect rect = (Rect) this.f18336c;
                float f10 = e10 / 2.0f;
                rect.set((int) (width - (mVar.f18359n.getScaleX() * f10)), (int) (((1.0f - mVar.f18359n.getScaleY()) * mVar.f18359n.getHeight()) + mVar.f18359n.getY()), (int) ((mVar.f18359n.getScaleX() * f10) + width), (int) (mVar.f18359n.getY() + mVar.f18359n.getHeight()));
                mVar.f18360r.setBounds(rect);
                mVar.f18360r.draw(canvas);
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.f18334a) {
            case 1:
                int i13 = this.f18335b;
                bi biVar = (bi) this.f18337e;
                int top = i13 - biVar.f32274t1.getTop();
                super.onLayout(z10, i3, i10, i11, i12);
                this.f18335b = getHeight();
                if (biVar.f32274t1.getVisibility() == 0 && getHeight() - biVar.f32274t1.getTop() != top) {
                    biVar.f32274t1.setTranslationY(biVar.f32274t1.getTranslationY() + ((getHeight() - biVar.f32274t1.getTop()) - top));
                    biVar.f32274t1.animate().translationY(0.0f).setDuration(320L).setInterpolator(xq.h).start();
                    return;
                }
                return;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        switch (this.f18334a) {
            case 0:
                m mVar = (m) this.f18337e;
                mVar.f18359n.measure(i3, i10);
                invalidate();
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(Math.max(this.f18335b, org.telegram.messenger.g0.L(36.0f) + mVar.f18359n.getMeasuredHeight()), 1073741824));
                if (this.f18335b < 0) {
                    this.f18335b = getMeasuredHeight();
                    return;
                }
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    public j(bi biVar, Context context) {
        super(context);
        this.f18337e = biVar;
        this.f18336c = new Path();
        this.d = new k4.j(24);
    }
}
