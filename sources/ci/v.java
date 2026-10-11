package ci;

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
import org.telegram.ui.Components.jw;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.i20;
import org.telegram.ui.qt;
public final class v extends sm0 {
    public final int V2 = 0;
    public final Object W2;
    public final KeyEvent.Callback X2;

    public v(y yVar, Context context) {
        super(context, null);
        this.X2 = yVar;
        this.W2 = new i20();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10 = this.V2;
        KeyEvent.Callback callback = this.X2;
        Object obj = this.W2;
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
                i20 i20Var = (i20) obj;
                i20Var.b(canvas, rectF, 0, yVar.d);
                rectF.set(width - AndroidUtilities.dp(12.0f), 0.0f, width, getHeight());
                i20Var.b(canvas, rectF, 2, yVar.d);
                canvas.restore();
                canvas.restore();
                return;
            case 1:
                HashSet hashSet = org.telegram.ui.h4.f38241b1;
                ((org.telegram.ui.h4) obj).n();
                super.dispatchDraw(canvas);
                return;
            default:
                Paint paint = (Paint) obj;
                jw jwVar = (jw) callback;
                org.telegram.ui.Components.g6 g6Var = jwVar.M;
                if (g6Var != null && jwVar.K >= 0 && jwVar.L >= 0 && jwVar.f27762n != null && this.G) {
                    float d = g6Var.d(0.0f, false);
                    if (d > 0.0f) {
                        int i11 = Integer.MAX_VALUE;
                        int i12 = Integer.MIN_VALUE;
                        for (int i13 = 0; i13 < getChildCount(); i13++) {
                            View childAt = getChildAt(i13);
                            int R = RecyclerView.R(childAt);
                            if (R != -1 && R >= jwVar.K && R <= jwVar.L) {
                                i11 = Math.min(i11, childAt.getTop() + ((int) childAt.getTranslationY()));
                                i12 = Math.max(i12, childAt.getBottom() + ((int) childAt.getTranslationY()));
                            }
                        }
                        if (i11 < i12) {
                            paint.setColor(org.telegram.ui.ActionBar.h6.m1(d, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Ld, this.f30807n2)));
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
        switch (this.V2) {
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
        switch (this.V2) {
            case 2:
                return false;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void k0(int i10, int i11) {
        org.telegram.ui.t3 t3Var;
        switch (this.V2) {
            case 1:
                org.telegram.ui.u3 u3Var = ((org.telegram.ui.h4) this.W2).K;
                if (u3Var != null && (t3Var = u3Var.f42336c) != null) {
                    t3Var.invalidate();
                    return;
                }
                return;
            case 2:
                jw jwVar = (jw) this.X2;
                jwVar.f27761f.a();
                jw.t(jwVar).invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.V2) {
            case 2:
                super.onDetachedFromWindow();
                jw jwVar = (jw) this.X2;
                org.telegram.ui.Components.b6.release(jw.u(jwVar), jwVar.f27758b);
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
        switch (this.V2) {
            case 0:
                if (motionEvent.getX() > getPaddingLeft() && motionEvent.getX() < getWidth() - getPaddingRight()) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return super.onInterceptTouchEvent(motionEvent);
                }
                return false;
            case 1:
                org.telegram.ui.h4 h4Var = (org.telegram.ui.h4) this.W2;
                if (h4Var.d != null && h4Var.f42097b == null && (((m1Var = h4Var.H) == null || !m1Var.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                    h4Var.f42097b = null;
                    h4Var.d = null;
                    h4Var.f42100f = null;
                } else if (h4Var.d != null && h4Var.f42097b != null && motionEvent.getAction() == 1 && (getAdapter() instanceof org.telegram.ui.f4)) {
                    motionEvent2 = motionEvent;
                    org.telegram.ui.h4.l(h4Var, (org.telegram.ui.f4) getAdapter(), motionEvent2, h4Var.f42100f, h4Var.d, 0, 0);
                    return super.onInterceptTouchEvent(motionEvent2);
                }
                motionEvent2 = motionEvent;
                return super.onInterceptTouchEvent(motionEvent2);
            default:
                qt q6 = qt.q();
                jw jwVar = (jw) this.X2;
                boolean r10 = q6.r(motionEvent, jwVar.h, jwVar.N, this.f30807n2);
                if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.V2) {
            case 1:
                x1(z10, i10, i11, i12, i13);
                ((org.telegram.ui.l3) this.X2).I = -1.0f;
                return;
            case 2:
                super.onLayout(z10, i10, i11, i12, i13);
                ((jw) this.X2).f27761f.a();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.V2) {
            case 2:
                View.MeasureSpec.getSize(i10);
                ((jw) this.X2).f27767y.y1(40);
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
        switch (this.V2) {
            case 1:
                org.telegram.ui.h4 h4Var = (org.telegram.ui.h4) this.W2;
                if (h4Var.d != null && h4Var.f42097b == null && (((m1Var = h4Var.H) == null || !m1Var.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                    h4Var.f42097b = null;
                    h4Var.d = null;
                    h4Var.f42100f = null;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public void x1(boolean z10, int i10, int i11, int i12, int i13) {
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

    public v(jw jwVar, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.X2 = jwVar;
        this.W2 = new Paint(1);
    }

    public v(org.telegram.ui.l3 l3Var, Context context) {
        super(context, null);
        this.X2 = l3Var;
        this.W2 = l3Var.K;
    }
}
