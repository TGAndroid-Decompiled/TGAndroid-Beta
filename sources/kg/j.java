package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.fs;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.ti;
public final class j extends FrameLayout {
    public final int f18446a = 0;
    public int f18447b;
    public final Object f18448c;
    public final Object d;
    public final fs f18449e;

    public j(n nVar, Context context) {
        super(context);
        this.f18449e = nVar;
        this.f18447b = -1;
        this.f18448c = new Rect();
        this.d = new c6(this, 220L, kr.h);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f18446a) {
            case 1:
                i61 i61Var = (i61) this.d;
                Path path = (Path) this.f18448c;
                ti tiVar = (ti) this.f18449e;
                fh.g gVar = tiVar.f40041z2;
                if (gVar != null) {
                    gVar.setBounds(0, (int) tiVar.T3, getMeasuredWidth(), getMeasuredHeight());
                    tiVar.f40041z2.draw(canvas);
                }
                float L = org.telegram.messenger.g0.L(20.0f);
                int L2 = org.telegram.messenger.g0.L(7.0f);
                int L3 = org.telegram.messenger.g0.L(7.0f);
                RectF rectF = org.telegram.messenger.g0.P;
                float f10 = L2;
                rectF.set(getPaddingLeft(), f10, getWidth() - getPaddingRight(), getHeight() - L3);
                path.rewind();
                path.addRoundRect(rectF, L, L, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF, 255, 31);
                super.dispatchDraw(canvas);
                rectF.set(getPaddingLeft(), f10, getWidth() - getPaddingRight(), org.telegram.messenger.g0.L(6.0f) + L2);
                i61Var.u(canvas, rectF, 1, 1.0f);
                rectF.set(getPaddingLeft(), (getHeight() - L3) - org.telegram.messenger.g0.L(6.0f), getWidth() - getPaddingRight(), getHeight() - L3);
                i61Var.u(canvas, rectF, 3, 1.0f);
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
        switch (this.f18446a) {
            case 0:
                float width = getWidth() / 2.0f;
                n nVar = (n) this.f18449e;
                float e10 = ((c6) this.d).e(false, nVar.f18482n.getWidth());
                Rect rect = (Rect) this.f18448c;
                float f10 = e10 / 2.0f;
                rect.set((int) (width - (nVar.f18482n.getScaleX() * f10)), (int) (((1.0f - nVar.f18482n.getScaleY()) * nVar.f18482n.getHeight()) + nVar.f18482n.getY()), (int) ((nVar.f18482n.getScaleX() * f10) + width), (int) (nVar.f18482n.getY() + nVar.f18482n.getHeight()));
                nVar.f18483r.setBounds(rect);
                nVar.f18483r.draw(canvas);
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f18446a) {
            case 1:
                int i13 = this.f18447b;
                ti tiVar = (ti) this.f18449e;
                int top = i13 - tiVar.f40028w1.getTop();
                super.onLayout(z10, i7, i10, i11, i12);
                this.f18447b = getHeight();
                if (tiVar.f40028w1.getVisibility() == 0 && getHeight() - tiVar.f40028w1.getTop() != top) {
                    tiVar.f40028w1.setTranslationY(tiVar.f40028w1.getTranslationY() + ((getHeight() - tiVar.f40028w1.getTop()) - top));
                    tiVar.f40028w1.animate().translationY(0.0f).setDuration(320L).setInterpolator(kr.h).start();
                    return;
                }
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f18446a) {
            case 0:
                n nVar = (n) this.f18449e;
                nVar.f18482n.measure(i7, i10);
                invalidate();
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(this.f18447b, org.telegram.messenger.g0.L(36.0f) + nVar.f18482n.getMeasuredHeight()), 1073741824));
                if (this.f18447b < 0) {
                    this.f18447b = getMeasuredHeight();
                    return;
                }
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    public j(ti tiVar, Context context) {
        super(context);
        this.f18449e = tiVar;
        this.f18448c = new Path();
        this.d = new i61(1);
    }
}
