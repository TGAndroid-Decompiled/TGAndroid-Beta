package gg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.yi;
import org.telegram.ui.m20;
public final class j extends FrameLayout {
    public final int f8912a = 0;
    public int f8913b;
    public final Object f8914c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public j(n nVar, Context context) {
        super(context);
        this.e = nVar;
        this.f8913b = -1;
        this.f8914c = new Rect();
        this.d = new d6(this, 220L, wr.h);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f8912a) {
            case 1:
                m20 m20Var = (m20) this.d;
                Path path = (Path) this.f8914c;
                yi yiVar = (yi) this.e;
                bh.d dVar = yiVar.B0;
                if (dVar != null) {
                    dVar.setBounds(0, (int) yiVar.V1, getMeasuredWidth(), getMeasuredHeight());
                    yiVar.B0.draw(canvas);
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
                m20Var.b(canvas, rectF, 1, 1.0f);
                rectF.set(getPaddingLeft(), (getHeight() - dp3) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - dp3);
                m20Var.b(canvas, rectF, 3, 1.0f);
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
        switch (this.f8912a) {
            case 0:
                float width = getWidth() / 2.0f;
                n nVar = (n) this.e;
                float d = ((d6) this.d).d(nVar.f8956n.getWidth(), false);
                Rect rect = (Rect) this.f8914c;
                float f7 = d / 2.0f;
                rect.set((int) (width - (nVar.f8956n.getScaleX() * f7)), (int) (((1.0f - nVar.f8956n.getScaleY()) * nVar.f8956n.getHeight()) + nVar.f8956n.getY()), (int) ((nVar.f8956n.getScaleX() * f7) + width), (int) (nVar.f8956n.getY() + nVar.f8956n.getHeight()));
                nVar.f8957r.setBounds(rect);
                nVar.f8957r.draw(canvas);
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f8912a) {
            case 1:
                int i14 = this.f8913b;
                yi yiVar = (yi) this.e;
                int top = i14 - yiVar.f29418w.getTop();
                super.onLayout(z10, i10, i11, i12, i13);
                this.f8913b = getHeight();
                if (yiVar.f29418w.getVisibility() == 0 && getHeight() - yiVar.f29418w.getTop() != top) {
                    yiVar.f29418w.setTranslationY(yiVar.f29418w.getTranslationY() + ((getHeight() - yiVar.f29418w.getTop()) - top));
                    yiVar.f29418w.animate().translationY(0.0f).setDuration(320L).setInterpolator(wr.h).start();
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
        switch (this.f8912a) {
            case 0:
                n nVar = (n) this.e;
                nVar.f8956n.measure(i10, i11);
                invalidate();
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(this.f8913b, AndroidUtilities.dp(36.0f) + nVar.f8956n.getMeasuredHeight()), 1073741824));
                if (this.f8913b < 0) {
                    this.f8913b = getMeasuredHeight();
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public j(yi yiVar, Context context) {
        super(context);
        this.e = yiVar;
        this.f8914c = new Path();
        this.d = new m20();
    }
}
