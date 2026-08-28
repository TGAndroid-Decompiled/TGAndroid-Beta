package kh;

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
import org.telegram.ui.Components.dv;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.ht;
import org.telegram.ui.s10;
public final class w extends wk0 {
    public final int T2 = 0;
    public final Object U2;
    public final KeyEvent.Callback V2;

    public w(z zVar, Context context) {
        super(context, null);
        this.V2 = zVar;
        this.U2 = new s10();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i9 = this.T2;
        KeyEvent.Callback callback = this.V2;
        Object obj = this.U2;
        switch (i9) {
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
                s10 s10Var = (s10) obj;
                s10Var.b(canvas, rectF, 0, zVar.d);
                rectF.set(width - AndroidUtilities.dp(12.0f), 0.0f, width, getHeight());
                s10Var.b(canvas, rectF, 2, zVar.d);
                canvas.restore();
                canvas.restore();
                return;
            case 1:
                HashSet hashSet = org.telegram.ui.l4.X0;
                ((org.telegram.ui.l4) obj).n();
                super.dispatchDraw(canvas);
                return;
            default:
                Paint paint = (Paint) obj;
                dv dvVar = (dv) callback;
                org.telegram.ui.Components.y5 y5Var = dvVar.I;
                if (y5Var != null && dvVar.G >= 0 && dvVar.H >= 0 && dvVar.f27818n != null && this.C) {
                    float d = y5Var.d(0.0f, false);
                    if (d > 0.0f) {
                        int i10 = Integer.MAX_VALUE;
                        int i11 = Integer.MIN_VALUE;
                        for (int i12 = 0; i12 < getChildCount(); i12++) {
                            View childAt = getChildAt(i12);
                            int R = RecyclerView.R(childAt);
                            if (R != -1 && R >= dvVar.G && R <= dvVar.H) {
                                i10 = Math.min(i10, childAt.getTop() + ((int) childAt.getTranslationY()));
                                i11 = Math.max(i11, childAt.getBottom() + ((int) childAt.getTranslationY()));
                            }
                        }
                        if (i10 < i11) {
                            paint.setColor(org.telegram.ui.ActionBar.f6.l1(d, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Ld, this.f34260l2)));
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
    public void k0(int i9, int i10) {
        org.telegram.ui.x3 x3Var;
        switch (this.T2) {
            case 1:
                org.telegram.ui.y3 y3Var = ((org.telegram.ui.l4) this.U2).G;
                if (y3Var != null && (x3Var = y3Var.f44700c) != null) {
                    x3Var.invalidate();
                    return;
                }
                return;
            case 2:
                dv dvVar = (dv) this.V2;
                dvVar.f27817f.a();
                dv.r(dvVar).invalidate();
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
                dv dvVar = (dv) this.V2;
                org.telegram.ui.Components.t5.release(dv.s(dvVar), dvVar.f27814b);
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
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) this.U2;
                if (l4Var.d != null && l4Var.f36374b == null && (((o1Var = l4Var.D) == null || !o1Var.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                    l4Var.f36374b = null;
                    l4Var.d = null;
                    l4Var.f36377f = null;
                } else if (l4Var.d != null && l4Var.f36374b != null && motionEvent.getAction() == 1 && (getAdapter() instanceof org.telegram.ui.j4)) {
                    motionEvent2 = motionEvent;
                    org.telegram.ui.l4.l(l4Var, (org.telegram.ui.j4) getAdapter(), motionEvent2, l4Var.f36377f, l4Var.d, 0, 0);
                    return super.onInterceptTouchEvent(motionEvent2);
                }
                motionEvent2 = motionEvent;
                return super.onInterceptTouchEvent(motionEvent2);
            default:
                ht q10 = ht.q();
                dv dvVar = (dv) this.V2;
                boolean r10 = q10.r(motionEvent, dvVar.h, dvVar.J, this.f34260l2);
                if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.T2) {
            case 1:
                w1(z10, i9, i10, i11, i12);
                ((org.telegram.ui.p3) this.V2).E = -1.0f;
                return;
            case 2:
                super.onLayout(z10, i9, i10, i11, i12);
                ((dv) this.V2).f27817f.a();
                return;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        switch (this.T2) {
            case 2:
                View.MeasureSpec.getSize(i9);
                ((dv) this.V2).f27823y.y1(40);
                super.onMeasure(i9, i10);
                return;
            default:
                super.onMeasure(i9, i10);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        switch (this.T2) {
            case 1:
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) this.U2;
                if (l4Var.d != null && l4Var.f36374b == null && (((o1Var = l4Var.D) == null || !o1Var.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                    l4Var.f36374b = null;
                    l4Var.d = null;
                    l4Var.f36377f = null;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public void w1(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
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

    public w(dv dvVar, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        this.V2 = dvVar;
        this.U2 = new Paint(1);
    }

    public w(org.telegram.ui.p3 p3Var, Context context) {
        super(context, null);
        this.V2 = p3Var;
        this.U2 = p3Var.G;
    }
}
