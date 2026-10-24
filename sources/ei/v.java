package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.yv;
import org.telegram.ui.ht;
import org.telegram.ui.w10;
public final class v extends lm0 {
    public final int Y2 = 0;
    public final Object Z2;
    public final KeyEvent.Callback f9937a3;

    public v(y yVar, Context context) {
        super(context, null);
        this.f9937a3 = yVar;
        this.Z2 = new w10();
    }

    public void C1(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 90 && childAt.getBottom() < getMeasuredHeight()) {
                int measuredHeight = getMeasuredHeight();
                childAt.layout(0, measuredHeight - childAt.getMeasuredHeight(), childAt.getMeasuredWidth(), measuredHeight);
                return;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10 = this.Y2;
        KeyEvent.Callback callback = this.f9937a3;
        Object obj = this.Z2;
        switch (i10) {
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
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(paddingLeft, 0.0f, AndroidUtilities.dp(12.0f) + paddingLeft, getHeight());
                w10 w10Var = (w10) obj;
                w10Var.b(canvas, rectF, 0, yVar.d);
                rectF.set(width - AndroidUtilities.dp(12.0f), 0.0f, width, getHeight());
                w10Var.b(canvas, rectF, 2, yVar.d);
                canvas.restore();
                canvas.restore();
                return;
            case 1:
                HashSet hashSet = org.telegram.ui.k4.f38730c1;
                ((org.telegram.ui.k4) obj).n();
                super.dispatchDraw(canvas);
                return;
            default:
                Paint paint = (Paint) obj;
                yv yvVar = (yv) callback;
                org.telegram.ui.Components.d6 d6Var = yvVar.M;
                if (d6Var != null && yvVar.K >= 0 && yvVar.L >= 0 && yvVar.f33051n != null && this.G) {
                    float d = d6Var.d(0.0f, false);
                    if (d > 0.0f) {
                        int i11 = Integer.MAX_VALUE;
                        int i12 = Integer.MIN_VALUE;
                        for (int i13 = 0; i13 < getChildCount(); i13++) {
                            View childAt = getChildAt(i13);
                            int R = RecyclerView.R(childAt);
                            if (R != -1 && R >= yvVar.K && R <= yvVar.L) {
                                i11 = Math.min(i11, childAt.getTop() + ((int) childAt.getTranslationY()));
                                i12 = Math.max(i12, childAt.getBottom() + ((int) childAt.getTranslationY()));
                            }
                        }
                        if (i11 < i12) {
                            paint.setColor(org.telegram.ui.ActionBar.k6.o1(d, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ld, this.f28396n2)));
                            canvas.drawRect(0.0f, i11, getMeasuredWidth(), i12, paint);
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
        switch (this.Y2) {
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
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.Y2) {
            case 2:
                return false;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void k0(int i10, int i11) {
        org.telegram.ui.v3 v3Var;
        switch (this.Y2) {
            case 1:
                org.telegram.ui.w3 w3Var = ((org.telegram.ui.k4) this.Z2).K;
                if (w3Var != null && (v3Var = w3Var.f42886c) != null) {
                    v3Var.invalidate();
                    return;
                }
                return;
            case 2:
                yv yvVar = (yv) this.f9937a3;
                yvVar.f33050f.a();
                yv.t(yvVar).invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.Y2) {
            case 2:
                super.onDetachedFromWindow();
                yv yvVar = (yv) this.f9937a3;
                org.telegram.ui.Components.y5.release(yv.u(yvVar), yvVar.f33048b);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        org.telegram.ui.ActionBar.m1 m1Var;
        switch (this.Y2) {
            case 0:
                if (motionEvent.getX() > getPaddingLeft() && motionEvent.getX() < getWidth() - getPaddingRight()) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return super.onInterceptTouchEvent(motionEvent);
                }
                return false;
            case 1:
                org.telegram.ui.k4 k4Var = (org.telegram.ui.k4) this.Z2;
                if (k4Var.d != null && k4Var.f37215b == null && (((m1Var = k4Var.H) == null || !m1Var.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                    k4Var.f37215b = null;
                    k4Var.d = null;
                    k4Var.f37217f = null;
                } else if (k4Var.d != null && k4Var.f37215b != null && motionEvent.getAction() == 1 && (getAdapter() instanceof org.telegram.ui.i4)) {
                    motionEvent2 = motionEvent;
                    org.telegram.ui.k4.l(k4Var, (org.telegram.ui.i4) getAdapter(), motionEvent2, k4Var.f37217f, k4Var.d, 0, 0);
                    return super.onInterceptTouchEvent(motionEvent2);
                }
                motionEvent2 = motionEvent;
                return super.onInterceptTouchEvent(motionEvent2);
            default:
                ht o10 = ht.o();
                yv yvVar = (yv) this.f9937a3;
                boolean p5 = o10.p(motionEvent, yvVar.h, yvVar.N, this.f28396n2);
                if (!super.onInterceptTouchEvent(motionEvent) && !p5) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.Y2) {
            case 1:
                C1(z10, i10, i11, i12, i13);
                ((org.telegram.ui.n3) this.f9937a3).J = -1.0f;
                return;
            case 2:
                super.onLayout(z10, i10, i11, i12, i13);
                ((yv) this.f9937a3).f33050f.a();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.Y2) {
            case 2:
                View.MeasureSpec.getSize(i10);
                ((yv) this.f9937a3).f33056y.y1(40);
                super.onMeasure(i10, i11);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        switch (this.Y2) {
            case 1:
                org.telegram.ui.k4 k4Var = (org.telegram.ui.k4) this.Z2;
                if (k4Var.d != null && k4Var.f37215b == null && (((m1Var = k4Var.H) == null || !m1Var.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                    k4Var.f37215b = null;
                    k4Var.d = null;
                    k4Var.f37217f = null;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public v(yv yvVar, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.f9937a3 = yvVar;
        this.Z2 = new Paint(1);
    }

    public v(org.telegram.ui.n3 n3Var, Context context) {
        super(context, null);
        this.f9937a3 = n3Var;
        this.Z2 = n3Var.L;
    }
}
