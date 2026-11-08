package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.ru;
import org.telegram.ui.ks;
public final class v extends pj0 {
    public final int f12909e3 = 0;
    public final Object f12910f3;
    public final KeyEvent.Callback f12911g3;

    public v(y yVar, Context context) {
        super(context, null);
        this.f12911g3 = yVar;
        this.f12910f3 = new h6.m(28);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7 = this.f12909e3;
        KeyEvent.Callback callback = this.f12911g3;
        Object obj = this.f12910f3;
        switch (i7) {
            case 0:
                y yVar = (y) callback;
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (yVar.d * 255.0f), 31);
                canvas.save();
                float paddingLeft = getPaddingLeft();
                float width = getWidth() - getPaddingRight();
                canvas.clipRect(paddingLeft, 0.0f, width, getHeight());
                canvas.translate((1.0f - yVar.d) * width, 0.0f);
                super.dispatchDraw(canvas);
                canvas.restore();
                canvas.save();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(paddingLeft, 0.0f, org.telegram.messenger.g0.L(12.0f) + paddingLeft, getHeight());
                h6.m mVar = (h6.m) obj;
                mVar.m(canvas, rectF, 0, yVar.d);
                rectF.set(width - org.telegram.messenger.g0.L(12.0f), 0.0f, width, getHeight());
                mVar.m(canvas, rectF, 2, yVar.d);
                canvas.restore();
                canvas.restore();
                return;
            case 1:
                HashSet hashSet = org.telegram.ui.g4.f45776c1;
                ((org.telegram.ui.g4) obj).l();
                super.dispatchDraw(canvas);
                return;
            default:
                Paint paint = (Paint) obj;
                ru ruVar = (ru) callback;
                org.telegram.ui.Components.w5 w5Var = ruVar.D1;
                if (w5Var != null && ruVar.B1 >= 0 && ruVar.C1 >= 0 && ruVar.f37779o1 != null && this.G) {
                    float e10 = w5Var.e(false, 0.0f);
                    if (e10 > 0.0f) {
                        int i10 = Integer.MAX_VALUE;
                        int i11 = Integer.MIN_VALUE;
                        for (int i12 = 0; i12 < getChildCount(); i12++) {
                            View childAt = getChildAt(i12);
                            int R = RecyclerView.R(childAt);
                            if (R != -1 && R >= ruVar.B1 && R <= ruVar.C1) {
                                i10 = Math.min(i10, childAt.getTop() + ((int) childAt.getTranslationY()));
                                i11 = Math.max(i11, childAt.getBottom() + ((int) childAt.getTranslationY()));
                            }
                        }
                        if (i10 < i11) {
                            paint.setColor(org.telegram.ui.ActionBar.k6.r1(e10, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28269ze, this.f36981n2)));
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
        switch (this.f12909e3) {
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
        switch (this.f12909e3) {
            case 2:
                return false;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void l0(int i7) {
        org.telegram.ui.s3 s3Var;
        switch (this.f12909e3) {
            case 1:
                org.telegram.ui.t3 t3Var = ((org.telegram.ui.g4) this.f12910f3).K;
                if (t3Var != null && (s3Var = t3Var.f49894c) != null) {
                    s3Var.invalidate();
                    return;
                }
                return;
            case 2:
                ru ruVar = (ru) this.f12911g3;
                ruVar.f37778m1.a();
                ruVar.f28619b.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f12909e3) {
            case 2:
                super.onDetachedFromWindow();
                ru ruVar = (ru) this.f12911g3;
                org.telegram.ui.Components.r5.release(ruVar.f28619b, ruVar.f37775i1);
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
        switch (this.f12909e3) {
            case 0:
                if (motionEvent.getX() > getPaddingLeft() && motionEvent.getX() < getWidth() - getPaddingRight()) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return super.onInterceptTouchEvent(motionEvent);
                }
                return false;
            case 1:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) this.f12910f3;
                if (g4Var.d != null && g4Var.f48267b == null && (((g1Var = g4Var.H) == null || !g1Var.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                    g4Var.f48267b = null;
                    g4Var.d = null;
                    g4Var.f48270f = null;
                } else if (g4Var.d != null && g4Var.f48267b != null && motionEvent.getAction() == 1 && (getAdapter() instanceof org.telegram.ui.e4)) {
                    motionEvent2 = motionEvent;
                    org.telegram.ui.g4.j(g4Var, (org.telegram.ui.e4) getAdapter(), motionEvent2, g4Var.f48270f, g4Var.d, 0, 0);
                    return super.onInterceptTouchEvent(motionEvent2);
                }
                motionEvent2 = motionEvent;
                return super.onInterceptTouchEvent(motionEvent2);
            default:
                ks p10 = ks.p();
                ru ruVar = (ru) this.f12911g3;
                boolean q10 = p10.q(motionEvent, ruVar.n1, ruVar.E1, this.f36981n2);
                if (!super.onInterceptTouchEvent(motionEvent) && !q10) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.f12909e3) {
            case 1:
                z1(z9, i7, i10, i11, i12);
                ((org.telegram.ui.k3) this.f12911g3).J = -1.0f;
                return;
            case 2:
                super.onLayout(z9, i7, i10, i11, i12);
                ((ru) this.f12911g3).f37778m1.a();
                return;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f12909e3) {
            case 2:
                View.MeasureSpec.getSize(i7);
                ((ru) this.f12911g3).f37785u1.y1(40);
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
        switch (this.f12909e3) {
            case 1:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) this.f12910f3;
                if (g4Var.d != null && g4Var.f48267b == null && (((g1Var = g4Var.H) == null || !g1Var.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                    g4Var.f48267b = null;
                    g4Var.d = null;
                    g4Var.f48270f = null;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public void z1(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
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

    public v(ru ruVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.f12911g3 = ruVar;
        this.f12910f3 = new Paint(1);
    }

    public v(org.telegram.ui.k3 k3Var, Context context) {
        super(context, null);
        this.f12911g3 = k3Var;
        this.f12910f3 = k3Var.L;
    }
}
