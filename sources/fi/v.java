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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.aw;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.ht;
import org.telegram.ui.y10;
public final class v extends nm0 {
    public final int f11770f3 = 0;
    public final Object f11771g3;
    public final KeyEvent.Callback f11772h3;

    public v(y yVar, Context context) {
        super(context, null);
        this.f11772h3 = yVar;
        this.f11771g3 = new y10();
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
        int i10 = this.f11770f3;
        KeyEvent.Callback callback = this.f11772h3;
        Object obj = this.f11771g3;
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
                y10 y10Var = (y10) obj;
                y10Var.b(canvas, rectF, 0, yVar.d);
                rectF.set(width - AndroidUtilities.dp(12.0f), 0.0f, width, getHeight());
                y10Var.b(canvas, rectF, 2, yVar.d);
                canvas.restore();
                canvas.restore();
                return;
            case 1:
                HashSet hashSet = org.telegram.ui.j4.f40370c1;
                ((org.telegram.ui.j4) obj).n();
                super.dispatchDraw(canvas);
                return;
            default:
                Paint paint = (Paint) obj;
                aw awVar = (aw) callback;
                org.telegram.ui.Components.h6 h6Var = awVar.M;
                if (h6Var != null && awVar.K >= 0 && awVar.L >= 0 && awVar.f26676n != null && this.G) {
                    float d = h6Var.d(0.0f, false);
                    if (d > 0.0f) {
                        int i11 = Integer.MAX_VALUE;
                        int i12 = Integer.MIN_VALUE;
                        for (int i13 = 0; i13 < getChildCount(); i13++) {
                            View childAt = getChildAt(i13);
                            int R = RecyclerView.R(childAt);
                            if (R != -1 && R >= awVar.K && R <= awVar.L) {
                                i11 = Math.min(i11, childAt.getTop() + ((int) childAt.getTranslationY()));
                                i12 = Math.max(i12, childAt.getBottom() + ((int) childAt.getTranslationY()));
                            }
                        }
                        if (i11 < i12) {
                            paint.setColor(org.telegram.ui.ActionBar.y6.o1(d, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Ld, this.f30988n2)));
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
        switch (this.f11770f3) {
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
        switch (this.f11770f3) {
            case 2:
                return false;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void l0(int i10) {
        org.telegram.ui.u3 u3Var;
        switch (this.f11770f3) {
            case 1:
                org.telegram.ui.v3 v3Var = ((org.telegram.ui.j4) this.f11771g3).K;
                if (v3Var != null && (u3Var = v3Var.f44168c) != null) {
                    u3Var.invalidate();
                    return;
                }
                return;
            case 2:
                aw awVar = (aw) this.f11772h3;
                awVar.f26675f.a();
                aw.s(awVar).invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f11770f3) {
            case 2:
                super.onDetachedFromWindow();
                aw awVar = (aw) this.f11772h3;
                org.telegram.ui.Components.c6.release(aw.t(awVar), awVar.f26673b);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        org.telegram.ui.ActionBar.o1 o1Var;
        switch (this.f11770f3) {
            case 0:
                if (motionEvent.getX() > getPaddingLeft() && motionEvent.getX() < getWidth() - getPaddingRight()) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return super.onInterceptTouchEvent(motionEvent);
                }
                return false;
            case 1:
                org.telegram.ui.j4 j4Var = (org.telegram.ui.j4) this.f11771g3;
                if (j4Var.d != null && j4Var.f40449b == null && (((o1Var = j4Var.H) == null || !o1Var.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                    j4Var.f40449b = null;
                    j4Var.d = null;
                    j4Var.f40451f = null;
                } else if (j4Var.d != null && j4Var.f40449b != null && motionEvent.getAction() == 1 && (getAdapter() instanceof org.telegram.ui.h4)) {
                    motionEvent2 = motionEvent;
                    org.telegram.ui.j4.l(j4Var, (org.telegram.ui.h4) getAdapter(), motionEvent2, j4Var.f40451f, j4Var.d, 0, 0);
                    return super.onInterceptTouchEvent(motionEvent2);
                }
                motionEvent2 = motionEvent;
                return super.onInterceptTouchEvent(motionEvent2);
            default:
                ht o10 = ht.o();
                aw awVar = (aw) this.f11772h3;
                boolean p10 = o10.p(motionEvent, awVar.h, awVar.N, this.f30988n2);
                if (!super.onInterceptTouchEvent(motionEvent) && !p10) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f11770f3) {
            case 1:
                C1(z10, i10, i11, i12, i13);
                ((org.telegram.ui.m3) this.f11772h3).J = -1.0f;
                return;
            case 2:
                super.onLayout(z10, i10, i11, i12, i13);
                ((aw) this.f11772h3).f26675f.a();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f11770f3) {
            case 2:
                View.MeasureSpec.getSize(i10);
                ((aw) this.f11772h3).f26681y.z1(40);
                super.onMeasure(i10, i11);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        switch (this.f11770f3) {
            case 1:
                org.telegram.ui.j4 j4Var = (org.telegram.ui.j4) this.f11771g3;
                if (j4Var.d != null && j4Var.f40449b == null && (((o1Var = j4Var.H) == null || !o1Var.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                    j4Var.f40449b = null;
                    j4Var.d = null;
                    j4Var.f40451f = null;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public v(aw awVar, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.f11772h3 = awVar;
        this.f11771g3 = new Paint(1);
    }

    public v(org.telegram.ui.m3 m3Var, Context context) {
        super(context, null);
        this.f11772h3 = m3Var;
        this.f11771g3 = m3Var.L;
    }
}
