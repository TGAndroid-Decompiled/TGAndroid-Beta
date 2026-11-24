package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import org.telegram.ui.m;
import org.telegram.ui.o;
public final class hx extends r59 {
    public final byte f3 = 2;
    public final Object g3;
    public final KeyEvent.Callback h3;

    public hx(wl2 wl2Var, Activity activity) {
        super(activity, null);
        this.h3 = wl2Var;
        this.g3 = new in3((byte) 7);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        byte b = this.f3;
        KeyEvent.Callback callback = this.h3;
        Object obj = this.g3;
        switch (b) {
            case 0:
                HashSet hashSet = o.d1;
                ((o) obj).k();
                super.dispatchDraw(canvas);
                return;
            case 1:
                wl2 wl2Var = (wl2) callback;
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (wl2Var.d * 255.0f), 31);
                canvas.save();
                float paddingLeft = getPaddingLeft();
                float width = getWidth() - getPaddingRight();
                canvas.clipRect(paddingLeft, 0.0f, width, getHeight());
                canvas.translate((1.0f - wl2Var.d) * width, 0.0f);
                super.dispatchDraw(canvas);
                canvas.restore();
                canvas.save();
                RectF rectF = gm.P;
                rectF.set(paddingLeft, 0.0f, gm.L(12.0f) + paddingLeft, getHeight());
                in3 in3Var = (in3) obj;
                in3Var.r(canvas, rectF, 0, wl2Var.d);
                rectF.set(width - gm.L(12.0f), 0.0f, width, getHeight());
                in3Var.r(canvas, rectF, 2, wl2Var.d);
                canvas.restore();
                canvas.restore();
                return;
            default:
                Paint paint = (Paint) obj;
                az3 az3Var = (az3) callback;
                ln lnVar = az3Var.G1;
                if (lnVar != null && az3Var.E1 >= 0 && az3Var.F1 >= 0 && az3Var.r1 != null && this.H) {
                    float e = lnVar.e(false, 0.0f);
                    if (e > 0.0f) {
                        int i = Integer.MAX_VALUE;
                        int i2 = Integer.MIN_VALUE;
                        for (int i3 = 0; i3 < getChildCount(); i3++) {
                            View childAt = getChildAt(i3);
                            int R = RecyclerView.R(childAt);
                            if (R != -1 && R >= az3Var.E1 && R <= az3Var.F1) {
                                i = Math.min(i, childAt.getTop() + ((int) childAt.getTranslationY()));
                                i2 = Math.max(i2, childAt.getBottom() + ((int) childAt.getTranslationY()));
                            }
                        }
                        if (i < i2) {
                            paint.setColor(cmb.p1(e, cmb.v0(cmb.Be, this.o2)));
                            canvas.drawRect(0.0f, i, getMeasuredWidth(), i2, paint);
                        }
                        invalidate();
                    }
                }
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 1:
                if (motionEvent.getX() > getPaddingLeft() && motionEvent.getX() < getWidth() - getPaddingRight()) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        switch (this.f3) {
            case 2:
                return false;
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override
    public final void m0(int i) {
        rx rxVar;
        switch (this.f3) {
            case 0:
                sx sxVar = ((o) this.g3).L;
                if (sxVar != null && (rxVar = sxVar.c) != null) {
                    rxVar.invalidate();
                    return;
                }
                return;
            case 1:
            default:
                return;
            case 2:
                az3 az3Var = (az3) this.h3;
                az3Var.p1.a();
                az3Var.b.invalidate();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.f3) {
            case 2:
                super.onDetachedFromWindow();
                az3 az3Var = (az3) this.h3;
                gn.release(az3Var.b, az3Var.l1);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        m8 m8Var;
        switch (this.f3) {
            case 0:
                o oVar = (o) this.g3;
                if (oVar.d != null && oVar.b == null && (((m8Var = oVar.I) == null || !m8Var.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                    oVar.b = null;
                    oVar.d = null;
                    oVar.f = null;
                } else if (oVar.d != null && oVar.b != null && motionEvent.getAction() == 1 && (getAdapter() instanceof ey)) {
                    motionEvent2 = motionEvent;
                    o.i(oVar, (ey) getAdapter(), motionEvent2, oVar.f, oVar.d, 0, 0);
                    return super.onInterceptTouchEvent(motionEvent2);
                }
                motionEvent2 = motionEvent;
                return super.onInterceptTouchEvent(motionEvent2);
            case 1:
                if (motionEvent.getX() <= getPaddingLeft() || motionEvent.getX() >= getWidth() - getPaddingRight()) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                return super.onInterceptTouchEvent(motionEvent);
            default:
                hx2 e = hx2.e();
                az3 az3Var = (az3) this.h3;
                boolean g = e.g(motionEvent, az3Var.q1, az3Var.H1, this.o2);
                if (!super.onInterceptTouchEvent(motionEvent) && !g) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        byte b = this.f3;
        KeyEvent.Callback callback = this.h3;
        switch (b) {
            case 0:
                z1(z, i, i2, i3, i4);
                ((m) callback).K = -1.0f;
                return;
            case 1:
            default:
                super.onLayout(z, i, i2, i3, i4);
                return;
            case 2:
                super.onLayout(z, i, i2, i3, i4);
                ((az3) callback).p1.a();
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.f3) {
            case 2:
                View.MeasureSpec.getSize(i);
                ((az3) this.h3).x1.x1(40);
                super.onMeasure(i, i2);
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        m8 m8Var;
        switch (this.f3) {
            case 0:
                o oVar = (o) this.g3;
                if (oVar.d != null && oVar.b == null && (((m8Var = oVar.I) == null || !m8Var.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                    oVar.b = null;
                    oVar.d = null;
                    oVar.f = null;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public final void z1(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 90 && childAt.getBottom() < getMeasuredHeight()) {
                int measuredHeight = getMeasuredHeight();
                childAt.layout(0, measuredHeight - childAt.getMeasuredHeight(), childAt.getMeasuredWidth(), measuredHeight);
                return;
            }
        }
    }

    public hx(az3 az3Var, Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.h3 = az3Var;
        this.g3 = new Paint(1);
    }

    public hx(m mVar, Activity activity) {
        super(activity, null);
        this.h3 = mVar;
        this.g3 = mVar.M;
    }
}
