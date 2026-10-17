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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.ti;
import org.telegram.ui.u10;
public final class j extends FrameLayout {
    public final int f12931a = 0;
    public int f12932b;
    public final Object f12933c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public j(m mVar, Context context) {
        super(context);
        this.e = mVar;
        this.f12932b = -1;
        this.f12933c = new Rect();
        this.d = new f6(this, 220L, bs.h);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f12931a) {
            case 1:
                u10 u10Var = (u10) this.d;
                Path path = (Path) this.f12933c;
                ti tiVar = (ti) this.e;
                dh.d dVar = tiVar.E0;
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
                u10Var.b(canvas, rectF, 1, 1.0f);
                rectF.set(getPaddingLeft(), (getHeight() - dp3) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - dp3);
                u10Var.b(canvas, rectF, 3, 1.0f);
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
        switch (this.f12931a) {
            case 0:
                float width = getWidth() / 2.0f;
                m mVar = (m) this.e;
                float d = ((f6) this.d).d(mVar.f12958n.getWidth(), false);
                Rect rect = (Rect) this.f12933c;
                float f7 = d / 2.0f;
                rect.set((int) (width - (mVar.f12958n.getScaleX() * f7)), (int) (((1.0f - mVar.f12958n.getScaleY()) * mVar.f12958n.getHeight()) + mVar.f12958n.getY()), (int) ((mVar.f12958n.getScaleX() * f7) + width), (int) (mVar.f12958n.getY() + mVar.f12958n.getHeight()));
                mVar.f12959r.setBounds(rect);
                mVar.f12959r.draw(canvas);
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f12931a) {
            case 1:
                int i14 = this.f12932b;
                ti tiVar = (ti) this.e;
                int top = i14 - tiVar.f30626w.getTop();
                super.onLayout(z10, i10, i11, i12, i13);
                this.f12932b = getHeight();
                if (tiVar.f30626w.getVisibility() == 0 && getHeight() - tiVar.f30626w.getTop() != top) {
                    tiVar.f30626w.setTranslationY(tiVar.f30626w.getTranslationY() + ((getHeight() - tiVar.f30626w.getTop()) - top));
                    tiVar.f30626w.animate().translationY(0.0f).setDuration(320L).setInterpolator(bs.h).start();
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
        switch (this.f12931a) {
            case 0:
                m mVar = (m) this.e;
                mVar.f12958n.measure(i10, i11);
                invalidate();
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(this.f12932b, AndroidUtilities.dp(36.0f) + mVar.f12958n.getMeasuredHeight()), 1073741824));
                if (this.f12932b < 0) {
                    this.f12932b = getMeasuredHeight();
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public j(ti tiVar, Context context) {
        super(context);
        this.e = tiVar;
        this.f12933c = new Path();
        this.d = new u10();
    }
}
