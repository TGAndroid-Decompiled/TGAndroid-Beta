package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.LongSparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.kt;
import org.telegram.ui.v10;

public final class w extends zk0 {
    public final int T2 = 0;
    public final Object U2;
    public final KeyEvent.Callback V2;

    public w(z zVar, Context context) {
        super(context, null);
        this.V2 = zVar;
        this.U2 = new v10();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10 = this.T2;
        KeyEvent.Callback callback = this.V2;
        Object obj = this.U2;
        switch (i10) {
            case 0:
                z zVar = (z) callback;
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (zVar.d * 255.0f), 31);
                canvas.save();
                float paddingLeft = getPaddingLeft();
                float width = getWidth() - getPaddingRight();
                canvas.clipRect(paddingLeft, 0.0f, width, getHeight());
                canvas.translate((1.0f - zVar.d) * width, 0.0f);
                super.dispatchDraw(canvas);
                canvas.restore();
                canvas.save();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(paddingLeft, 0.0f, AndroidUtilities.dp(12.0f) + paddingLeft, getHeight());
                v10 v10Var = (v10) obj;
                v10Var.b(canvas, rectF, 0, zVar.d);
                rectF.set(width - AndroidUtilities.dp(12.0f), 0.0f, width, getHeight());
                v10Var.b(canvas, rectF, 2, zVar.d);
                canvas.restore();
                canvas.restore();
                break;
            case 1:
                HashSet hashSet = org.telegram.ui.m4.X0;
                ((org.telegram.ui.m4) obj).n();
                super.dispatchDraw(canvas);
                break;
            default:
                Paint paint = (Paint) obj;
                cv cvVar = (cv) callback;
                org.telegram.ui.Components.y5 y5Var = cvVar.I;
                if (y5Var != null && cvVar.G >= 0 && cvVar.H >= 0 && cvVar.f27551n != null && this.C) {
                    float fD = y5Var.d(0.0f, false);
                    if (fD > 0.0f) {
                        int iMin = Integer.MAX_VALUE;
                        int iMax = Integer.MIN_VALUE;
                        for (int i11 = 0; i11 < getChildCount(); i11++) {
                            View childAt = getChildAt(i11);
                            int iR = RecyclerView.R(childAt);
                            if (iR != -1 && iR >= cvVar.G && iR <= cvVar.H) {
                                iMin = Math.min(iMin, childAt.getTop() + ((int) childAt.getTranslationY()));
                                iMax = Math.max(iMax, childAt.getBottom() + ((int) childAt.getTranslationY()));
                            }
                        }
                        if (iMin < iMax) {
                            paint.setColor(org.telegram.ui.ActionBar.g6.l1(fD, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ld, this.f35277l2)));
                            canvas.drawRect(0.0f, iMin, getMeasuredWidth(), iMax, paint);
                        }
                        invalidate();
                    }
                }
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.T2) {
            case 0:
                if (motionEvent.getX() <= getPaddingLeft() || motionEvent.getX() >= getWidth() - getPaddingRight()) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.T2) {
            case 2:
                return false;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void k0(int i10, int i11) {
        org.telegram.ui.y3 y3Var;
        switch (this.T2) {
            case 1:
                org.telegram.ui.z3 z3Var = ((org.telegram.ui.m4) this.U2).G;
                if (z3Var != null && (y3Var = z3Var.f45005c) != null) {
                    y3Var.invalidate();
                    break;
                }
                break;
            case 2:
                cv cvVar = (cv) this.V2;
                cvVar.f27550f.a();
                ((org.telegram.ui.ActionBar.e3) cvVar).containerView.invalidate();
                break;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.T2) {
            case 2:
                super.onDetachedFromWindow();
                cv cvVar = (cv) this.V2;
                org.telegram.ui.Components.t5.release(((org.telegram.ui.ActionBar.e3) cvVar).containerView, (LongSparseArray<org.telegram.ui.Components.k5>) cvVar.f27547b);
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        org.telegram.ui.ActionBar.n1 n1Var;
        switch (this.T2) {
            case 0:
                if (motionEvent.getX() <= getPaddingLeft() || motionEvent.getX() >= getWidth() - getPaddingRight()) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                return super.onInterceptTouchEvent(motionEvent);
            case 1:
                org.telegram.ui.m4 m4Var = (org.telegram.ui.m4) this.U2;
                if (m4Var.d == null || m4Var.f37285b != null || (((n1Var = m4Var.D) != null && n1Var.isShowing()) || !(motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                    if (m4Var.d != null && m4Var.f37285b != null && motionEvent.getAction() == 1 && (getAdapter() instanceof org.telegram.ui.k4)) {
                        motionEvent2 = motionEvent;
                        org.telegram.ui.m4.l(m4Var, (org.telegram.ui.k4) getAdapter(), motionEvent2, m4Var.f37288f, m4Var.d, 0, 0);
                    }
                    return super.onInterceptTouchEvent(motionEvent2);
                }
                m4Var.f37285b = null;
                m4Var.d = null;
                m4Var.f37288f = null;
                motionEvent2 = motionEvent;
                return super.onInterceptTouchEvent(motionEvent2);
            default:
                kt ktVarQ = kt.q();
                cv cvVar = (cv) this.V2;
                return super.onInterceptTouchEvent(motionEvent) || ktVarQ.r(motionEvent, cvVar.h, cvVar.J, this.f35277l2);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.T2) {
            case 1:
                w1(z10, i10, i11, i12, i13);
                ((org.telegram.ui.q3) this.V2).E = -1.0f;
                break;
            case 2:
                super.onLayout(z10, i10, i11, i12, i13);
                ((cv) this.V2).f27550f.a();
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.T2) {
            case 2:
                View.MeasureSpec.getSize(i10);
                ((cv) this.V2).f27556y.y1(40);
                super.onMeasure(i10, i11);
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        switch (this.T2) {
            case 1:
                org.telegram.ui.m4 m4Var = (org.telegram.ui.m4) this.U2;
                if (m4Var.d != null && m4Var.f37285b == null && (((n1Var = m4Var.D) == null || !n1Var.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                    m4Var.f37285b = null;
                    m4Var.d = null;
                    m4Var.f37288f = null;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void w1(boolean z10, int i10, int i11, int i12, int i13) {
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

    public w(cv cvVar, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.V2 = cvVar;
        this.U2 = new Paint(1);
    }

    public w(org.telegram.ui.q3 q3Var, Context context) {
        super(context, null);
        this.V2 = q3Var;
        this.U2 = q3Var.G;
    }
}
