package nh;

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
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jv;
import org.telegram.ui.ht;
import org.telegram.ui.u10;
public final class v extends jl0 {
    public final int T2 = 0;
    public final Object U2;
    public final KeyEvent.Callback V2;

    public v(y yVar, Context context) {
        super(context, null);
        this.V2 = yVar;
        this.U2 = new u10();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10 = this.T2;
        KeyEvent.Callback callback = this.V2;
        Object obj = this.U2;
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
                u10 u10Var = (u10) obj;
                u10Var.b(canvas, rectF, 0, yVar.d);
                rectF.set(width - AndroidUtilities.dp(12.0f), 0.0f, width, getHeight());
                u10Var.b(canvas, rectF, 2, yVar.d);
                canvas.restore();
                canvas.restore();
                return;
            case 1:
                HashSet hashSet = org.telegram.ui.m4.X0;
                ((org.telegram.ui.m4) obj).n();
                super.dispatchDraw(canvas);
                return;
            default:
                Paint paint = (Paint) obj;
                jv jvVar = (jv) callback;
                org.telegram.ui.Components.d6 d6Var = jvVar.I;
                if (d6Var != null && jvVar.G >= 0 && jvVar.H >= 0 && jvVar.f29827n != null && this.C) {
                    float d = d6Var.d(0.0f, false);
                    if (d > 0.0f) {
                        int i11 = Integer.MAX_VALUE;
                        int i12 = Integer.MIN_VALUE;
                        for (int i13 = 0; i13 < getChildCount(); i13++) {
                            View childAt = getChildAt(i13);
                            int R = RecyclerView.R(childAt);
                            if (R != -1 && R >= jvVar.G && R <= jvVar.H) {
                                i11 = Math.min(i11, childAt.getTop() + ((int) childAt.getTranslationY()));
                                i12 = Math.max(i12, childAt.getBottom() + ((int) childAt.getTranslationY()));
                            }
                        }
                        if (i11 < i12) {
                            paint.setColor(org.telegram.ui.ActionBar.g6.l1(d, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ld, this.f29709l2)));
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
        switch (this.T2) {
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
                if (z3Var != null && (y3Var = z3Var.f45046c) != null) {
                    y3Var.invalidate();
                    return;
                }
                return;
            case 2:
                jv jvVar = (jv) this.V2;
                jvVar.f29826f.a();
                jv.r(jvVar).invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.T2) {
            case 2:
                super.onDetachedFromWindow();
                jv jvVar = (jv) this.V2;
                org.telegram.ui.Components.y5.release(jv.s(jvVar), jvVar.f29823b);
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
        switch (this.T2) {
            case 0:
                if (motionEvent.getX() > getPaddingLeft() && motionEvent.getX() < getWidth() - getPaddingRight()) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return super.onInterceptTouchEvent(motionEvent);
                }
                return false;
            case 1:
                org.telegram.ui.m4 m4Var = (org.telegram.ui.m4) this.U2;
                if (m4Var.d != null && m4Var.f37380b == null && (((o1Var = m4Var.D) == null || !o1Var.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                    m4Var.f37380b = null;
                    m4Var.d = null;
                    m4Var.f37383f = null;
                } else if (m4Var.d != null && m4Var.f37380b != null && motionEvent.getAction() == 1 && (getAdapter() instanceof org.telegram.ui.k4)) {
                    motionEvent2 = motionEvent;
                    org.telegram.ui.m4.l(m4Var, (org.telegram.ui.k4) getAdapter(), motionEvent2, m4Var.f37383f, m4Var.d, 0, 0);
                    return super.onInterceptTouchEvent(motionEvent2);
                }
                motionEvent2 = motionEvent;
                return super.onInterceptTouchEvent(motionEvent2);
            default:
                ht q6 = ht.q();
                jv jvVar = (jv) this.V2;
                boolean r6 = q6.r(motionEvent, jvVar.h, jvVar.J, this.f29709l2);
                if (!super.onInterceptTouchEvent(motionEvent) && !r6) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.T2) {
            case 1:
                w1(z10, i10, i11, i12, i13);
                ((org.telegram.ui.q3) this.V2).E = -1.0f;
                return;
            case 2:
                super.onLayout(z10, i10, i11, i12, i13);
                ((jv) this.V2).f29826f.a();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.T2) {
            case 2:
                View.MeasureSpec.getSize(i10);
                ((jv) this.V2).f29832y.y1(40);
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
        switch (this.T2) {
            case 1:
                org.telegram.ui.m4 m4Var = (org.telegram.ui.m4) this.U2;
                if (m4Var.d != null && m4Var.f37380b == null && (((o1Var = m4Var.D) == null || !o1Var.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                    m4Var.f37380b = null;
                    m4Var.d = null;
                    m4Var.f37383f = null;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
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

    public v(jv jvVar, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.V2 = jvVar;
        this.U2 = new Paint(1);
    }

    public v(org.telegram.ui.q3 q3Var, Context context) {
        super(context, null);
        this.V2 = q3Var;
        this.U2 = q3Var.G;
    }
}
