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
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.xi;
import org.telegram.ui.k20;
public final class j extends FrameLayout {
    public final int f11227a = 0;
    public int f11228b;
    public final Object f11229c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate f11230e;

    public j(m mVar, Context context) {
        super(context);
        this.f11230e = mVar;
        this.f11228b = -1;
        this.f11229c = new Rect();
        this.d = new e6(this, 220L, tr.h);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f11227a) {
            case 1:
                k20 k20Var = (k20) this.d;
                Path path = (Path) this.f11229c;
                xi xiVar = (xi) this.f11230e;
                ch.d dVar = xiVar.B0;
                if (dVar != null) {
                    dVar.setBounds(0, (int) xiVar.V1, getMeasuredWidth(), getMeasuredHeight());
                    xiVar.B0.draw(canvas);
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
                k20Var.b(canvas, rectF, 1, 1.0f);
                rectF.set(getPaddingLeft(), (getHeight() - dp3) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - dp3);
                k20Var.b(canvas, rectF, 3, 1.0f);
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
        switch (this.f11227a) {
            case 0:
                float width = getWidth() / 2.0f;
                m mVar = (m) this.f11230e;
                float d = ((e6) this.d).d(mVar.f11265r.getWidth(), false);
                Rect rect = (Rect) this.f11229c;
                float f7 = d / 2.0f;
                rect.set((int) (width - (mVar.f11265r.getScaleX() * f7)), (int) (((1.0f - mVar.f11265r.getScaleY()) * mVar.f11265r.getHeight()) + mVar.f11265r.getY()), (int) ((mVar.f11265r.getScaleX() * f7) + width), (int) (mVar.f11265r.getY() + mVar.f11265r.getHeight()));
                mVar.f11266s.setBounds(rect);
                mVar.f11266s.draw(canvas);
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f11227a) {
            case 1:
                int i14 = this.f11228b;
                xi xiVar = (xi) this.f11230e;
                int top = i14 - xiVar.f32864w.getTop();
                super.onLayout(z10, i10, i11, i12, i13);
                this.f11228b = getHeight();
                if (xiVar.f32864w.getVisibility() == 0 && getHeight() - xiVar.f32864w.getTop() != top) {
                    xiVar.f32864w.setTranslationY(xiVar.f32864w.getTranslationY() + ((getHeight() - xiVar.f32864w.getTop()) - top));
                    xiVar.f32864w.animate().translationY(0.0f).setDuration(320L).setInterpolator(tr.h).start();
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
        switch (this.f11227a) {
            case 0:
                m mVar = (m) this.f11230e;
                mVar.f11265r.measure(i10, i11);
                invalidate();
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(this.f11228b, AndroidUtilities.dp(36.0f) + mVar.f11265r.getMeasuredHeight()), 1073741824));
                if (this.f11228b < 0) {
                    this.f11228b = getMeasuredHeight();
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public j(xi xiVar, Context context) {
        super(context);
        this.f11230e = xiVar;
        this.f11229c = new Path();
        this.d = new k20();
    }
}
