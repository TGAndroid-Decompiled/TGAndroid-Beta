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
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.js;
import org.telegram.ui.l20;
public final class k extends FrameLayout {
    public final int f11289a = 0;
    public int f11290b;
    public final Object f11291c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate f11292e;

    public k(n nVar, Context context) {
        super(context);
        this.f11292e = nVar;
        this.f11290b = -1;
        this.f11291c = new Rect();
        this.d = new g6(this, 220L, js.h);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f11289a) {
            case 1:
                l20 l20Var = (l20) this.d;
                Path path = (Path) this.f11291c;
                aj ajVar = (aj) this.f11292e;
                ch.d dVar = ajVar.E0;
                if (dVar != null) {
                    dVar.setBounds(0, (int) ajVar.Y1, getMeasuredWidth(), getMeasuredHeight());
                    ajVar.E0.draw(canvas);
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
        switch (this.f11289a) {
            case 0:
                float width = getWidth() / 2.0f;
                n nVar = (n) this.f11292e;
                float d = ((g6) this.d).d(nVar.f11319n.getWidth(), false);
                Rect rect = (Rect) this.f11291c;
                float f7 = d / 2.0f;
                rect.set((int) (width - (nVar.f11319n.getScaleX() * f7)), (int) (((1.0f - nVar.f11319n.getScaleY()) * nVar.f11319n.getHeight()) + nVar.f11319n.getY()), (int) ((nVar.f11319n.getScaleX() * f7) + width), (int) (nVar.f11319n.getY() + nVar.f11319n.getHeight()));
                nVar.f11320r.setBounds(rect);
                nVar.f11320r.draw(canvas);
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f11289a) {
            case 1:
                int i14 = this.f11290b;
                aj ajVar = (aj) this.f11292e;
                int top = i14 - ajVar.f24394w.getTop();
                super.onLayout(z10, i10, i11, i12, i13);
                this.f11290b = getHeight();
                if (ajVar.f24394w.getVisibility() == 0 && getHeight() - ajVar.f24394w.getTop() != top) {
                    ajVar.f24394w.setTranslationY(ajVar.f24394w.getTranslationY() + ((getHeight() - ajVar.f24394w.getTop()) - top));
                    ajVar.f24394w.animate().translationY(0.0f).setDuration(320L).setInterpolator(js.h).start();
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
        switch (this.f11289a) {
            case 0:
                n nVar = (n) this.f11292e;
                nVar.f11319n.measure(i10, i11);
                invalidate();
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(this.f11290b, AndroidUtilities.dp(36.0f) + nVar.f11319n.getMeasuredHeight()), 1073741824));
                if (this.f11290b < 0) {
                    this.f11290b = getMeasuredHeight();
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public k(aj ajVar, Context context) {
        super(context);
        this.f11292e = ajVar;
        this.f11291c = new Path();
        this.d = new l20();
    }
}
