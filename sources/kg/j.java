package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.is;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.u5;
public final class j extends FrameLayout {
    public final int f17968a = 0;
    public int f17969b;
    public final Object f17970c;
    public final Object d;
    public final is f17971e;

    public j(n nVar, Context context) {
        super(context);
        this.f17971e = nVar;
        this.f17969b = -1;
        this.f17970c = new Rect();
        this.d = new u5(this, 220L, er.h);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f17968a) {
            case 1:
                h6.m mVar = (h6.m) this.d;
                Path path = (Path) this.f17970c;
                ki kiVar = (ki) this.f17971e;
                fh.g gVar = kiVar.f36509z2;
                if (gVar != null) {
                    gVar.setBounds(0, (int) kiVar.T3, getMeasuredWidth(), getMeasuredHeight());
                    kiVar.f36509z2.draw(canvas);
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
        switch (this.f17968a) {
            case 0:
                float width = getWidth() / 2.0f;
                n nVar = (n) this.f17971e;
                float e10 = ((u5) this.d).e(false, nVar.f17999n.getWidth());
                Rect rect = (Rect) this.f17970c;
                float f10 = e10 / 2.0f;
                rect.set((int) (width - (nVar.f17999n.getScaleX() * f10)), (int) (((1.0f - nVar.f17999n.getScaleY()) * nVar.f17999n.getHeight()) + nVar.f17999n.getY()), (int) ((nVar.f17999n.getScaleX() * f10) + width), (int) (nVar.f17999n.getY() + nVar.f17999n.getHeight()));
                nVar.f18000r.setBounds(rect);
                nVar.f18000r.draw(canvas);
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f17968a) {
            case 1:
                int i13 = this.f17969b;
                ki kiVar = (ki) this.f17971e;
                int top = i13 - kiVar.f36496w1.getTop();
                super.onLayout(z10, i7, i10, i11, i12);
                this.f17969b = getHeight();
                if (kiVar.f36496w1.getVisibility() == 0 && getHeight() - kiVar.f36496w1.getTop() != top) {
                    kiVar.f36496w1.setTranslationY(kiVar.f36496w1.getTranslationY() + ((getHeight() - kiVar.f36496w1.getTop()) - top));
                    kiVar.f36496w1.animate().translationY(0.0f).setDuration(320L).setInterpolator(er.h).start();
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
        switch (this.f17968a) {
            case 0:
                n nVar = (n) this.f17971e;
                nVar.f17999n.measure(i7, i10);
                invalidate();
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(this.f17969b, org.telegram.messenger.g0.L(36.0f) + nVar.f17999n.getMeasuredHeight()), 1073741824));
                if (this.f17969b < 0) {
                    this.f17969b = getMeasuredHeight();
                    return;
                }
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    public j(ki kiVar, Context context) {
        super(context);
        this.f17971e = kiVar;
        this.f17970c = new Path();
        this.d = new h6.m(29);
    }
}
