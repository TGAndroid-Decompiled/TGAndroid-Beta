package hg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.vi;
import org.telegram.ui.n20;
public final class j extends FrameLayout {
    public final int f10322a = 0;
    public int f10323b;
    public final Object f10324c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public j(m mVar, Context context) {
        super(context);
        this.e = mVar;
        this.f10323b = -1;
        this.f10324c = new Rect();
        this.d = new c6(this, 220L, qr.h);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f10322a) {
            case 1:
                n20 n20Var = (n20) this.d;
                Path path = (Path) this.f10324c;
                vi viVar = (vi) this.e;
                ch.d dVar = viVar.B0;
                if (dVar != null) {
                    dVar.setBounds(0, (int) viVar.V1, getMeasuredWidth(), getMeasuredHeight());
                    viVar.B0.draw(canvas);
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
                n20Var.b(canvas, rectF, 1, 1.0f);
                rectF.set(getPaddingLeft(), (getHeight() - dp3) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - dp3);
                n20Var.b(canvas, rectF, 3, 1.0f);
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
        switch (this.f10322a) {
            case 0:
                float width = getWidth() / 2.0f;
                m mVar = (m) this.e;
                float d = ((c6) this.d).d(mVar.f10356r.getWidth(), false);
                Rect rect = (Rect) this.f10324c;
                float f7 = d / 2.0f;
                rect.set((int) (width - (mVar.f10356r.getScaleX() * f7)), (int) (((1.0f - mVar.f10356r.getScaleY()) * mVar.f10356r.getHeight()) + mVar.f10356r.getY()), (int) ((mVar.f10356r.getScaleX() * f7) + width), (int) (mVar.f10356r.getY() + mVar.f10356r.getHeight()));
                mVar.f10357s.setBounds(rect);
                mVar.f10357s.draw(canvas);
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f10322a) {
            case 1:
                int i14 = this.f10323b;
                vi viVar = (vi) this.e;
                int top = i14 - viVar.f28794w.getTop();
                super.onLayout(z10, i10, i11, i12, i13);
                this.f10323b = getHeight();
                if (viVar.f28794w.getVisibility() == 0 && getHeight() - viVar.f28794w.getTop() != top) {
                    viVar.f28794w.setTranslationY(viVar.f28794w.getTranslationY() + ((getHeight() - viVar.f28794w.getTop()) - top));
                    viVar.f28794w.animate().translationY(0.0f).setDuration(320L).setInterpolator(qr.h).start();
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
        switch (this.f10322a) {
            case 0:
                m mVar = (m) this.e;
                mVar.f10356r.measure(i10, i11);
                invalidate();
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(this.f10323b, AndroidUtilities.dp(36.0f) + mVar.f10356r.getMeasuredHeight()), 1073741824));
                if (this.f10323b < 0) {
                    this.f10323b = getMeasuredHeight();
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public j(vi viVar, Context context) {
        super(context);
        this.e = viVar;
        this.f10324c = new Path();
        this.d = new n20();
    }
}
