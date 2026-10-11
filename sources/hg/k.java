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
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.yi;
import org.telegram.ui.i20;
public final class k extends FrameLayout {
    public final int f11290a = 0;
    public int f11291b;
    public final Object f11292c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate f11293e;

    public k(n nVar, Context context) {
        super(context);
        this.f11293e = nVar;
        this.f11291b = -1;
        this.f11292c = new Rect();
        this.d = new g6(this, 220L, is.h);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f11290a) {
            case 1:
                i20 i20Var = (i20) this.d;
                Path path = (Path) this.f11292c;
                yi yiVar = (yi) this.f11293e;
                ch.d dVar = yiVar.E0;
                if (dVar != null) {
                    dVar.setBounds(0, (int) yiVar.Y1, getMeasuredWidth(), getMeasuredHeight());
                    yiVar.E0.draw(canvas);
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
                i20Var.b(canvas, rectF, 1, 1.0f);
                rectF.set(getPaddingLeft(), (getHeight() - dp3) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - dp3);
                i20Var.b(canvas, rectF, 3, 1.0f);
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
        switch (this.f11290a) {
            case 0:
                float width = getWidth() / 2.0f;
                n nVar = (n) this.f11293e;
                float d = ((g6) this.d).d(nVar.f11320n.getWidth(), false);
                Rect rect = (Rect) this.f11292c;
                float f7 = d / 2.0f;
                rect.set((int) (width - (nVar.f11320n.getScaleX() * f7)), (int) (((1.0f - nVar.f11320n.getScaleY()) * nVar.f11320n.getHeight()) + nVar.f11320n.getY()), (int) ((nVar.f11320n.getScaleX() * f7) + width), (int) (nVar.f11320n.getY() + nVar.f11320n.getHeight()));
                nVar.f11321r.setBounds(rect);
                nVar.f11321r.draw(canvas);
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f11290a) {
            case 1:
                int i14 = this.f11291b;
                yi yiVar = (yi) this.f11293e;
                int top = i14 - yiVar.f33268w.getTop();
                super.onLayout(z10, i10, i11, i12, i13);
                this.f11291b = getHeight();
                if (yiVar.f33268w.getVisibility() == 0 && getHeight() - yiVar.f33268w.getTop() != top) {
                    yiVar.f33268w.setTranslationY(yiVar.f33268w.getTranslationY() + ((getHeight() - yiVar.f33268w.getTop()) - top));
                    yiVar.f33268w.animate().translationY(0.0f).setDuration(320L).setInterpolator(is.h).start();
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
        switch (this.f11290a) {
            case 0:
                n nVar = (n) this.f11293e;
                nVar.f11320n.measure(i10, i11);
                invalidate();
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(this.f11291b, AndroidUtilities.dp(36.0f) + nVar.f11320n.getMeasuredHeight()), 1073741824));
                if (this.f11291b < 0) {
                    this.f11291b = getMeasuredHeight();
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public k(yi yiVar, Context context) {
        super(context);
        this.f11293e = yiVar;
        this.f11292c = new Path();
        this.d = new i20();
    }
}
