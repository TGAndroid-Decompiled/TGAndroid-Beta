package jg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.ti;
import org.telegram.ui.w10;
public final class k extends FrameLayout {
    public final int f15745a = 0;
    public int f15746b;
    public final Object f15747c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public k(n nVar, Context context) {
        super(context);
        this.e = nVar;
        this.f15746b = -1;
        this.f15747c = new Rect();
        this.d = new h6(this, 220L, ds.h);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f15745a) {
            case 1:
                w10 w10Var = (w10) this.d;
                Path path = (Path) this.f15747c;
                ti tiVar = (ti) this.e;
                eh.d dVar = tiVar.E0;
                if (dVar != null) {
                    dVar.setBounds(0, (int) tiVar.Y1, getMeasuredWidth(), getMeasuredHeight());
                    tiVar.E0.draw(canvas);
                }
                float dp = AndroidUtilities.dp(20.0f);
                int dp2 = AndroidUtilities.dp(7.0f);
                int dp3 = AndroidUtilities.dp(7.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                float f7 = dp2;
                rectF.set(getPaddingLeft(), f7, getWidth() - getPaddingRight(), getHeight() - dp3);
                path.rewind();
                path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF, 255, 31);
                super.dispatchDraw(canvas);
                rectF.set(getPaddingLeft(), f7, getWidth() - getPaddingRight(), AndroidUtilities.dp(6.0f) + dp2);
                w10Var.b(canvas, rectF, 1, 1.0f);
                rectF.set(getPaddingLeft(), (getHeight() - dp3) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - dp3);
                w10Var.b(canvas, rectF, 3, 1.0f);
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
        switch (this.f15745a) {
            case 0:
                float width = getWidth() / 2.0f;
                n nVar = (n) this.e;
                float d = ((h6) this.d).d(nVar.f15781n.getWidth(), false);
                Rect rect = (Rect) this.f15747c;
                float f7 = d / 2.0f;
                rect.set((int) (width - (nVar.f15781n.getScaleX() * f7)), (int) (((1.0f - nVar.f15781n.getScaleY()) * nVar.f15781n.getHeight()) + nVar.f15781n.getY()), (int) ((nVar.f15781n.getScaleX() * f7) + width), (int) (nVar.f15781n.getY() + nVar.f15781n.getHeight()));
                nVar.f15782r.setBounds(rect);
                nVar.f15782r.draw(canvas);
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f15745a) {
            case 1:
                int i14 = this.f15746b;
                ti tiVar = (ti) this.e;
                int top = i14 - tiVar.f33070w.getTop();
                super.onLayout(z10, i10, i11, i12, i13);
                this.f15746b = getHeight();
                if (tiVar.f33070w.getVisibility() == 0 && getHeight() - tiVar.f33070w.getTop() != top) {
                    tiVar.f33070w.setTranslationY(tiVar.f33070w.getTranslationY() + ((getHeight() - tiVar.f33070w.getTop()) - top));
                    tiVar.f33070w.animate().translationY(0.0f).setDuration(320L).setInterpolator(ds.h).start();
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
        switch (this.f15745a) {
            case 0:
                n nVar = (n) this.e;
                nVar.f15781n.measure(i10, i11);
                invalidate();
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(this.f15746b, AndroidUtilities.dp(36.0f) + nVar.f15781n.getMeasuredHeight()), 1073741824));
                if (this.f15746b < 0) {
                    this.f15746b = getMeasuredHeight();
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public k(ti tiVar, Context context) {
        super(context);
        this.e = tiVar;
        this.f15747c = new Path();
        this.d = new w10();
    }
}
