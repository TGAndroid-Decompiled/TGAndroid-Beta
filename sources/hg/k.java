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
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.wi;
import org.telegram.ui.g20;
public final class k extends FrameLayout {
    public final int f10307a = 0;
    public int f10308b;
    public final Object f10309c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public k(n nVar, Context context) {
        super(context);
        this.e = nVar;
        this.f10308b = -1;
        this.f10309c = new Rect();
        this.d = new e6(this, 220L, sr.h);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f10307a) {
            case 1:
                g20 g20Var = (g20) this.d;
                Path path = (Path) this.f10309c;
                wi wiVar = (wi) this.e;
                ch.d dVar = wiVar.B0;
                if (dVar != null) {
                    dVar.setBounds(0, (int) wiVar.V1, getMeasuredWidth(), getMeasuredHeight());
                    wiVar.B0.draw(canvas);
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
                g20Var.b(canvas, rectF, 1, 1.0f);
                rectF.set(getPaddingLeft(), (getHeight() - dp3) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - dp3);
                g20Var.b(canvas, rectF, 3, 1.0f);
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
        switch (this.f10307a) {
            case 0:
                float width = getWidth() / 2.0f;
                n nVar = (n) this.e;
                float d = ((e6) this.d).d(nVar.f10346n.getWidth(), false);
                Rect rect = (Rect) this.f10309c;
                float f7 = d / 2.0f;
                rect.set((int) (width - (nVar.f10346n.getScaleX() * f7)), (int) (((1.0f - nVar.f10346n.getScaleY()) * nVar.f10346n.getHeight()) + nVar.f10346n.getY()), (int) ((nVar.f10346n.getScaleX() * f7) + width), (int) (nVar.f10346n.getY() + nVar.f10346n.getHeight()));
                nVar.f10347r.setBounds(rect);
                nVar.f10347r.draw(canvas);
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f10307a) {
            case 1:
                int i14 = this.f10308b;
                wi wiVar = (wi) this.e;
                int top = i14 - wiVar.f30072w.getTop();
                super.onLayout(z10, i10, i11, i12, i13);
                this.f10308b = getHeight();
                if (wiVar.f30072w.getVisibility() == 0 && getHeight() - wiVar.f30072w.getTop() != top) {
                    wiVar.f30072w.setTranslationY(wiVar.f30072w.getTranslationY() + ((getHeight() - wiVar.f30072w.getTop()) - top));
                    wiVar.f30072w.animate().translationY(0.0f).setDuration(320L).setInterpolator(sr.h).start();
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
        switch (this.f10307a) {
            case 0:
                n nVar = (n) this.e;
                nVar.f10346n.measure(i10, i11);
                invalidate();
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(this.f10308b, AndroidUtilities.dp(36.0f) + nVar.f10346n.getMeasuredHeight()), 1073741824));
                if (this.f10308b < 0) {
                    this.f10308b = getMeasuredHeight();
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public k(wi wiVar, Context context) {
        super(context);
        this.e = wiVar;
        this.f10309c = new Path();
        this.d = new g20();
    }
}
