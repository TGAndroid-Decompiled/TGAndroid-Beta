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
import org.telegram.ui.Components.lw;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.l20;
import org.telegram.ui.ut;
public final class v extends wm0 {
    public final int V2 = 0;
    public final Object W2;
    public final KeyEvent.Callback X2;

    public v(y yVar, Context context) {
        super(context, null);
        this.X2 = yVar;
        this.W2 = new l20();
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
                l20 l20Var = (l20) obj;
                l20Var.b(canvas, rectF, 0, yVar.d);
                rectF.set(width - AndroidUtilities.dp(12.0f), 0.0f, width, getHeight());
                l20Var.b(canvas, rectF, 2, yVar.d);
                canvas.restore();
                canvas.restore();
                return;
            case 1:
                HashSet hashSet = org.telegram.ui.i4.f38620b1;
                ((org.telegram.ui.i4) obj).n();
                super.dispatchDraw(canvas);
                return;
            default:
                Paint paint = (Paint) obj;
                lw lwVar = (lw) callback;
                org.telegram.ui.Components.g6 g6Var = lwVar.M;
                if (g6Var != null && lwVar.K >= 0 && lwVar.L >= 0 && lwVar.f28291n != null && this.G) {
                    float d = g6Var.d(0.0f, false);
                    if (d > 0.0f) {
                        int i11 = Integer.MAX_VALUE;
                        int i12 = Integer.MIN_VALUE;
                        for (int i13 = 0; i13 < getChildCount(); i13++) {
                            View childAt = getChildAt(i13);
                            int R = RecyclerView.R(childAt);
                            if (R != -1 && R >= lwVar.K && R <= lwVar.L) {
                                i11 = Math.min(i11, childAt.getTop() + ((int) childAt.getTranslationY()));
                                i12 = Math.max(i12, childAt.getBottom() + ((int) childAt.getTranslationY()));
                            }
                        }
                        if (i11 < i12) {
                            paint.setColor(org.telegram.ui.ActionBar.h6.m1(d, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Ld, this.f32467n2)));
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
        org.telegram.ui.u3 u3Var;
        switch (this.V2) {
            case 1:
                org.telegram.ui.v3 v3Var = ((org.telegram.ui.i4) this.W2).K;
                if (v3Var != null && (u3Var = v3Var.f42655c) != null) {
                    u3Var.invalidate();
                    return;
                }
                return;
            case 2:
                lw lwVar = (lw) this.X2;
                lwVar.f28290f.a();
                lw.t(lwVar).invalidate();
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
                lw lwVar = (lw) this.X2;
                org.telegram.ui.Components.b6.release(lw.u(lwVar), lwVar.f28287b);
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
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.W2;
                if (i4Var.d != null && i4Var.f43069b == null && (((m1Var = i4Var.H) == null || !m1Var.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                    i4Var.f43069b = null;
                    i4Var.d = null;
                    i4Var.f43072f = null;
                } else if (i4Var.d != null && i4Var.f43069b != null && motionEvent.getAction() == 1 && (getAdapter() instanceof org.telegram.ui.g4)) {
                    motionEvent2 = motionEvent;
                    org.telegram.ui.i4.l(i4Var, (org.telegram.ui.g4) getAdapter(), motionEvent2, i4Var.f43072f, i4Var.d, 0, 0);
                    return super.onInterceptTouchEvent(motionEvent2);
                }
                motionEvent2 = motionEvent;
                return super.onInterceptTouchEvent(motionEvent2);
            default:
                ut q6 = ut.q();
                lw lwVar = (lw) this.X2;
                boolean r10 = q6.r(motionEvent, lwVar.h, lwVar.N, this.f32467n2);
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
                ((org.telegram.ui.m3) this.X2).I = -1.0f;
                return;
            case 2:
                super.onLayout(z10, i10, i11, i12, i13);
                ((lw) this.X2).f28290f.a();
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
                ((lw) this.X2).f28296y.y1(40);
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
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.W2;
                if (i4Var.d != null && i4Var.f43069b == null && (((m1Var = i4Var.H) == null || !m1Var.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                    i4Var.f43069b = null;
                    i4Var.d = null;
                    i4Var.f43072f = null;
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

    public v(lw lwVar, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.X2 = lwVar;
        this.W2 = new Paint(1);
    }

    public v(org.telegram.ui.m3 m3Var, Context context) {
        super(context, null);
        this.X2 = m3Var;
        this.W2 = m3Var.K;
    }
}
