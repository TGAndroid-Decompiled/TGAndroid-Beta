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
import org.telegram.ui.l20;
public final class k extends FrameLayout {
    public final int f10321a = 0;
    public int f10322b;
    public final Object f10323c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public k(n nVar, Context context) {
        super(context);
        this.e = nVar;
        this.f10322b = -1;
        this.f10323c = new Rect();
        this.d = new c6(this, 220L, qr.h);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f10321a) {
            case 1:
                l20 l20Var = (l20) this.d;
                Path path = (Path) this.f10323c;
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
                l20Var.b(canvas, rectF, 1, 1.0f);
                rectF.set(getPaddingLeft(), (getHeight() - dp3) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - dp3);
                l20Var.b(canvas, rectF, 3, 1.0f);
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
        switch (this.f10321a) {
            case 0:
                float width = getWidth() / 2.0f;
                n nVar = (n) this.e;
                float d = ((c6) this.d).d(nVar.f10360n.getWidth(), false);
                Rect rect = (Rect) this.f10323c;
                float f7 = d / 2.0f;
                rect.set((int) (width - (nVar.f10360n.getScaleX() * f7)), (int) (((1.0f - nVar.f10360n.getScaleY()) * nVar.f10360n.getHeight()) + nVar.f10360n.getY()), (int) ((nVar.f10360n.getScaleX() * f7) + width), (int) (nVar.f10360n.getY() + nVar.f10360n.getHeight()));
                nVar.f10361r.setBounds(rect);
                nVar.f10361r.draw(canvas);
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f10321a) {
            case 1:
                int i14 = this.f10322b;
                vi viVar = (vi) this.e;
                int top = i14 - viVar.f28799w.getTop();
                super.onLayout(z10, i10, i11, i12, i13);
                this.f10322b = getHeight();
                if (viVar.f28799w.getVisibility() == 0 && getHeight() - viVar.f28799w.getTop() != top) {
                    viVar.f28799w.setTranslationY(viVar.f28799w.getTranslationY() + ((getHeight() - viVar.f28799w.getTop()) - top));
                    viVar.f28799w.animate().translationY(0.0f).setDuration(320L).setInterpolator(qr.h).start();
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
        switch (this.f10321a) {
            case 0:
                n nVar = (n) this.e;
                nVar.f10360n.measure(i10, i11);
                invalidate();
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(this.f10322b, AndroidUtilities.dp(36.0f) + nVar.f10360n.getMeasuredHeight()), 1073741824));
                if (this.f10322b < 0) {
                    this.f10322b = getMeasuredHeight();
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public k(vi viVar, Context context) {
        super(context);
        this.e = viVar;
        this.f10323c = new Path();
        this.d = new l20();
    }
}
