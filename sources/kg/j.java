package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.fs;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.ui;
public final class j extends FrameLayout {
    public final int f18383a = 0;
    public int f18384b;
    public final Object f18385c;
    public final Object d;
    public final fs f18386e;

    public j(n nVar, Context context) {
        super(context);
        this.f18386e = nVar;
        this.f18384b = -1;
        this.f18385c = new Rect();
        this.d = new d6(this, 220L, nr.h);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f18383a) {
            case 1:
                h6.m mVar = (h6.m) this.d;
                Path path = (Path) this.f18385c;
                ui uiVar = (ui) this.f18386e;
                fh.g gVar = uiVar.f40460z2;
                if (gVar != null) {
                    gVar.setBounds(0, (int) uiVar.T3, getMeasuredWidth(), getMeasuredHeight());
                    uiVar.f40460z2.draw(canvas);
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
        switch (this.f18383a) {
            case 0:
                float width = getWidth() / 2.0f;
                n nVar = (n) this.f18386e;
                float e10 = ((d6) this.d).e(false, nVar.f18417n.getWidth());
                Rect rect = (Rect) this.f18385c;
                float f10 = e10 / 2.0f;
                rect.set((int) (width - (nVar.f18417n.getScaleX() * f10)), (int) (((1.0f - nVar.f18417n.getScaleY()) * nVar.f18417n.getHeight()) + nVar.f18417n.getY()), (int) ((nVar.f18417n.getScaleX() * f10) + width), (int) (nVar.f18417n.getY() + nVar.f18417n.getHeight()));
                nVar.f18418r.setBounds(rect);
                nVar.f18418r.draw(canvas);
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f18383a) {
            case 1:
                int i13 = this.f18384b;
                ui uiVar = (ui) this.f18386e;
                int top = i13 - uiVar.f40447w1.getTop();
                super.onLayout(z10, i7, i10, i11, i12);
                this.f18384b = getHeight();
                if (uiVar.f40447w1.getVisibility() == 0 && getHeight() - uiVar.f40447w1.getTop() != top) {
                    uiVar.f40447w1.setTranslationY(uiVar.f40447w1.getTranslationY() + ((getHeight() - uiVar.f40447w1.getTop()) - top));
                    uiVar.f40447w1.animate().translationY(0.0f).setDuration(320L).setInterpolator(nr.h).start();
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
        switch (this.f18383a) {
            case 0:
                n nVar = (n) this.f18386e;
                nVar.f18417n.measure(i7, i10);
                invalidate();
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(this.f18384b, org.telegram.messenger.g0.L(36.0f) + nVar.f18417n.getMeasuredHeight()), 1073741824));
                if (this.f18384b < 0) {
                    this.f18384b = getMeasuredHeight();
                    return;
                }
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    public j(ui uiVar, Context context) {
        super(context);
        this.f18386e = uiVar;
        this.f18385c = new Path();
        this.d = new h6.m(29);
    }
}
