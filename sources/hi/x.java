package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.ev;
import org.telegram.ui.ns;
public final class x extends ek0 {
    public final int f15726f3 = 0;
    public final Object f15727g3;
    public final KeyEvent.Callback f15728h3;

    public x(a0 a0Var, Context context) {
        super(context, null);
        this.f15728h3 = a0Var;
        this.f15727g3 = new h6.m(29);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7 = this.f15726f3;
        KeyEvent.Callback callback = this.f15728h3;
        Object obj = this.f15727g3;
        switch (i7) {
            case 0:
                a0 a0Var = (a0) callback;
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (a0Var.d * 255.0f), 31);
                canvas.save();
                float paddingLeft = getPaddingLeft();
                float width = getWidth() - getPaddingRight();
                canvas.clipRect(paddingLeft, 0.0f, width, getHeight());
                canvas.translate((1.0f - a0Var.d) * width, 0.0f);
                super.dispatchDraw(canvas);
                canvas.restore();
                canvas.save();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(paddingLeft, 0.0f, org.telegram.messenger.g0.L(12.0f) + paddingLeft, getHeight());
                h6.m mVar = (h6.m) obj;
                mVar.n(canvas, rectF, 0, a0Var.d);
                rectF.set(width - org.telegram.messenger.g0.L(12.0f), 0.0f, width, getHeight());
                mVar.n(canvas, rectF, 2, a0Var.d);
                canvas.restore();
                canvas.restore();
                return;
            case 1:
                HashSet hashSet = org.telegram.ui.g4.f47925d1;
                ((org.telegram.ui.g4) obj).l();
                super.dispatchDraw(canvas);
                return;
            default:
                Paint paint = (Paint) obj;
                ev evVar = (ev) callback;
                org.telegram.ui.Components.d6 d6Var = evVar.H1;
                if (d6Var != null && evVar.F1 >= 0 && evVar.G1 >= 0 && evVar.f34997s1 != null && this.H) {
                    float e10 = d6Var.e(false, 0.0f);
                    if (e10 > 0.0f) {
                        int i10 = Integer.MAX_VALUE;
                        int i11 = Integer.MIN_VALUE;
                        for (int i12 = 0; i12 < getChildCount(); i12++) {
                            View childAt = getChildAt(i12);
                            int R = RecyclerView.R(childAt);
                            if (R != -1 && R >= evVar.F1 && R <= evVar.G1) {
                                i10 = Math.min(i10, childAt.getTop() + ((int) childAt.getTranslationY()));
                                i11 = Math.max(i11, childAt.getBottom() + ((int) childAt.getTranslationY()));
                            }
                        }
                        if (i10 < i11) {
                            paint.setColor(org.telegram.ui.ActionBar.m6.r1(e10, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ce, this.f34875o2)));
                            canvas.drawRect(0.0f, i10, getMeasuredWidth(), i11, paint);
                        }
                        invalidate();
                    }
                }
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f15726f3) {
            case 0:
                if (motionEvent.getX() > getPaddingLeft() && motionEvent.getX() < getWidth() - getPaddingRight()) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f15726f3) {
            case 2:
                return false;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void l0(int i7) {
        org.telegram.ui.s3 s3Var;
        switch (this.f15726f3) {
            case 1:
                org.telegram.ui.t3 t3Var = ((org.telegram.ui.g4) this.f15727g3).L;
                if (t3Var != null && (s3Var = t3Var.f52190c) != null) {
                    s3Var.invalidate();
                    return;
                }
                return;
            case 2:
                ev evVar = (ev) this.f15728h3;
                evVar.f34995q1.a();
                evVar.f30173b.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f15726f3) {
            case 2:
                super.onDetachedFromWindow();
                ev evVar = (ev) this.f15728h3;
                org.telegram.ui.Components.y5.release(evVar.f30173b, evVar.f34992m1);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        org.telegram.ui.ActionBar.g1 g1Var;
        switch (this.f15726f3) {
            case 0:
                if (motionEvent.getX() > getPaddingLeft() && motionEvent.getX() < getWidth() - getPaddingRight()) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return super.onInterceptTouchEvent(motionEvent);
                }
                return false;
            case 1:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) this.f15727g3;
                if (g4Var.d != null && g4Var.f50748b == null && (((g1Var = g4Var.I) == null || !g1Var.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                    g4Var.f50748b = null;
                    g4Var.d = null;
                    g4Var.f50751f = null;
                } else if (g4Var.d != null && g4Var.f50748b != null && motionEvent.getAction() == 1 && (getAdapter() instanceof org.telegram.ui.e4)) {
                    motionEvent2 = motionEvent;
                    org.telegram.ui.g4.j(g4Var, (org.telegram.ui.e4) getAdapter(), motionEvent2, g4Var.f50751f, g4Var.d, 0, 0);
                    return super.onInterceptTouchEvent(motionEvent2);
                }
                motionEvent2 = motionEvent;
                return super.onInterceptTouchEvent(motionEvent2);
            default:
                ns p10 = ns.p();
                ev evVar = (ev) this.f15728h3;
                boolean q10 = p10.q(motionEvent, evVar.f34996r1, evVar.I1, this.f34875o2);
                if (!super.onInterceptTouchEvent(motionEvent) && !q10) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f15726f3) {
            case 1:
                z1(z10, i7, i10, i11, i12);
                ((org.telegram.ui.k3) this.f15728h3).K = -1.0f;
                return;
            case 2:
                super.onLayout(z10, i7, i10, i11, i12);
                ((ev) this.f15728h3).f34995q1.a();
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f15726f3) {
            case 2:
                View.MeasureSpec.getSize(i7);
                ((ev) this.f15728h3).f35003y1.y1(40);
                super.onMeasure(i7, i10);
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        switch (this.f15726f3) {
            case 1:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) this.f15727g3;
                if (g4Var.d != null && g4Var.f50748b == null && (((g1Var = g4Var.I) == null || !g1Var.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                    g4Var.f50748b = null;
                    g4Var.d = null;
                    g4Var.f50751f = null;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public void z1(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 90 && childAt.getBottom() < getMeasuredHeight()) {
                int measuredHeight = getMeasuredHeight();
                childAt.layout(0, measuredHeight - childAt.getMeasuredHeight(), childAt.getMeasuredWidth(), measuredHeight);
                return;
            }
        }
    }

    public x(ev evVar, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.f15728h3 = evVar;
        this.f15727g3 = new Paint(1);
    }

    public x(org.telegram.ui.k3 k3Var, Context context) {
        super(context, null);
        this.f15728h3 = k3Var;
        this.f15727g3 = k3Var.M;
    }
}
