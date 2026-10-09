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
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.yi;
import org.telegram.ui.j20;
public final class k extends FrameLayout {
    public final int f11291a = 0;
    public int f11292b;
    public final Object f11293c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate f11294e;

    public k(n nVar, Context context) {
        super(context);
        this.f11294e = nVar;
        this.f11292b = -1;
        this.f11293c = new Rect();
        this.d = new g6(this, 220L, hs.h);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f11291a) {
            case 1:
                j20 j20Var = (j20) this.d;
                Path path = (Path) this.f11293c;
                yi yiVar = (yi) this.f11294e;
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
                j20Var.b(canvas, rectF, 1, 1.0f);
                rectF.set(getPaddingLeft(), (getHeight() - dp3) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - dp3);
                j20Var.b(canvas, rectF, 3, 1.0f);
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
        switch (this.f11291a) {
            case 0:
                float width = getWidth() / 2.0f;
                n nVar = (n) this.f11294e;
                float d = ((g6) this.d).d(nVar.f11321n.getWidth(), false);
                Rect rect = (Rect) this.f11293c;
                float f7 = d / 2.0f;
                rect.set((int) (width - (nVar.f11321n.getScaleX() * f7)), (int) (((1.0f - nVar.f11321n.getScaleY()) * nVar.f11321n.getHeight()) + nVar.f11321n.getY()), (int) ((nVar.f11321n.getScaleX() * f7) + width), (int) (nVar.f11321n.getY() + nVar.f11321n.getHeight()));
                nVar.f11322r.setBounds(rect);
                nVar.f11322r.draw(canvas);
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f11291a) {
            case 1:
                int i14 = this.f11292b;
                yi yiVar = (yi) this.f11294e;
                int top = i14 - yiVar.f33280w.getTop();
                super.onLayout(z10, i10, i11, i12, i13);
                this.f11292b = getHeight();
                if (yiVar.f33280w.getVisibility() == 0 && getHeight() - yiVar.f33280w.getTop() != top) {
                    yiVar.f33280w.setTranslationY(yiVar.f33280w.getTranslationY() + ((getHeight() - yiVar.f33280w.getTop()) - top));
                    yiVar.f33280w.animate().translationY(0.0f).setDuration(320L).setInterpolator(hs.h).start();
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
        switch (this.f11291a) {
            case 0:
                n nVar = (n) this.f11294e;
                nVar.f11321n.measure(i10, i11);
                invalidate();
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(this.f11292b, AndroidUtilities.dp(36.0f) + nVar.f11321n.getMeasuredHeight()), 1073741824));
                if (this.f11292b < 0) {
                    this.f11292b = getMeasuredHeight();
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
        this.f11294e = yiVar;
        this.f11293c = new Path();
        this.d = new j20();
    }
}
