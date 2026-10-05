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
public final class k extends FrameLayout {
    public final int f11239a = 0;
    public int f11240b;
    public final Object f11241c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate f11242e;

    public k(n nVar, Context context) {
        super(context);
        this.f11242e = nVar;
        this.f11240b = -1;
        this.f11241c = new Rect();
        this.d = new e6(this, 220L, tr.h);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f11239a) {
            case 1:
                k20 k20Var = (k20) this.d;
                Path path = (Path) this.f11241c;
                xi xiVar = (xi) this.f11242e;
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
        switch (this.f11239a) {
            case 0:
                float width = getWidth() / 2.0f;
                n nVar = (n) this.f11242e;
                float d = ((e6) this.d).d(nVar.f11270r.getWidth(), false);
                Rect rect = (Rect) this.f11241c;
                float f7 = d / 2.0f;
                rect.set((int) (width - (nVar.f11270r.getScaleX() * f7)), (int) (((1.0f - nVar.f11270r.getScaleY()) * nVar.f11270r.getHeight()) + nVar.f11270r.getY()), (int) ((nVar.f11270r.getScaleX() * f7) + width), (int) (nVar.f11270r.getY() + nVar.f11270r.getHeight()));
                nVar.f11271s.setBounds(rect);
                nVar.f11271s.draw(canvas);
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f11239a) {
            case 1:
                int i14 = this.f11240b;
                xi xiVar = (xi) this.f11242e;
                int top = i14 - xiVar.f32962w.getTop();
                super.onLayout(z10, i10, i11, i12, i13);
                this.f11240b = getHeight();
                if (xiVar.f32962w.getVisibility() == 0 && getHeight() - xiVar.f32962w.getTop() != top) {
                    xiVar.f32962w.setTranslationY(xiVar.f32962w.getTranslationY() + ((getHeight() - xiVar.f32962w.getTop()) - top));
                    xiVar.f32962w.animate().translationY(0.0f).setDuration(320L).setInterpolator(tr.h).start();
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
        switch (this.f11239a) {
            case 0:
                n nVar = (n) this.f11242e;
                nVar.f11270r.measure(i10, i11);
                invalidate();
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(this.f11240b, AndroidUtilities.dp(36.0f) + nVar.f11270r.getMeasuredHeight()), 1073741824));
                if (this.f11240b < 0) {
                    this.f11240b = getMeasuredHeight();
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public k(xi xiVar, Context context) {
        super(context);
        this.f11242e = xiVar;
        this.f11241c = new Path();
        this.d = new k20();
    }
}
