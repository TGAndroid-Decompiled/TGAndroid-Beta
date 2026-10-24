package ig;

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
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.zr;
import org.telegram.ui.w10;
public final class j extends FrameLayout {
    public final int f12963a = 0;
    public int f12964b;
    public final Object f12965c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public j(m mVar, Context context) {
        super(context);
        this.e = mVar;
        this.f12964b = -1;
        this.f12965c = new Rect();
        this.d = new d6(this, 220L, zr.h);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f12963a) {
            case 1:
                w10 w10Var = (w10) this.d;
                Path path = (Path) this.f12965c;
                ri riVar = (ri) this.e;
                dh.d dVar = riVar.E0;
                if (dVar != null) {
                    dVar.setBounds(0, (int) riVar.Y1, getMeasuredWidth(), getMeasuredHeight());
                    riVar.E0.draw(canvas);
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
        switch (this.f12963a) {
            case 0:
                float width = getWidth() / 2.0f;
                m mVar = (m) this.e;
                float d = ((d6) this.d).d(mVar.v.getWidth(), false);
                Rect rect = (Rect) this.f12965c;
                float f7 = d / 2.0f;
                rect.set((int) (width - (mVar.v.getScaleX() * f7)), (int) (((1.0f - mVar.v.getScaleY()) * mVar.v.getHeight()) + mVar.v.getY()), (int) ((mVar.v.getScaleX() * f7) + width), (int) (mVar.v.getY() + mVar.v.getHeight()));
                mVar.f12995w.setBounds(rect);
                mVar.f12995w.draw(canvas);
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f12963a) {
            case 1:
                int i14 = this.f12964b;
                ri riVar = (ri) this.e;
                int top = i14 - riVar.f30198w.getTop();
                super.onLayout(z10, i10, i11, i12, i13);
                this.f12964b = getHeight();
                if (riVar.f30198w.getVisibility() == 0 && getHeight() - riVar.f30198w.getTop() != top) {
                    riVar.f30198w.setTranslationY(riVar.f30198w.getTranslationY() + ((getHeight() - riVar.f30198w.getTop()) - top));
                    riVar.f30198w.animate().translationY(0.0f).setDuration(320L).setInterpolator(zr.h).start();
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
        switch (this.f12963a) {
            case 0:
                m mVar = (m) this.e;
                mVar.v.measure(i10, i11);
                invalidate();
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(this.f12964b, AndroidUtilities.dp(36.0f) + mVar.v.getMeasuredHeight()), 1073741824));
                if (this.f12964b < 0) {
                    this.f12964b = getMeasuredHeight();
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public j(ri riVar, Context context) {
        super(context);
        this.e = riVar;
        this.f12965c = new Path();
        this.d = new w10();
    }
}
