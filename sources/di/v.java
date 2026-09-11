package di;

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
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.rv;
import org.telegram.ui.l20;
import org.telegram.ui.st;
public final class v extends ll0 {
    public final int X2 = 0;
    public final Object Y2;
    public final KeyEvent.Callback Z2;

    public v(y yVar, Context context) {
        super(context, null);
        this.Z2 = yVar;
        this.Y2 = new l20();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10 = this.X2;
        KeyEvent.Callback callback = this.Z2;
        Object obj = this.Y2;
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
                HashSet hashSet = org.telegram.ui.i4.f37188b1;
                ((org.telegram.ui.i4) obj).n();
                super.dispatchDraw(canvas);
                return;
            default:
                Paint paint = (Paint) obj;
                rv rvVar = (rv) callback;
                org.telegram.ui.Components.e6 e6Var = rvVar.M;
                if (e6Var != null && rvVar.K >= 0 && rvVar.L >= 0 && rvVar.f30097n != null && this.G) {
                    float d = e6Var.d(0.0f, false);
                    if (d > 0.0f) {
                        int i11 = Integer.MAX_VALUE;
                        int i12 = Integer.MIN_VALUE;
                        for (int i13 = 0; i13 < getChildCount(); i13++) {
                            View childAt = getChildAt(i13);
                            int R = RecyclerView.R(childAt);
                            if (R != -1 && R >= rvVar.K && R <= rvVar.L) {
                                i11 = Math.min(i11, childAt.getTop() + ((int) childAt.getTranslationY()));
                                i12 = Math.max(i12, childAt.getBottom() + ((int) childAt.getTranslationY()));
                            }
                        }
                        if (i11 < i12) {
                            paint.setColor(org.telegram.ui.ActionBar.j6.l1(d, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ld, this.f28224p2)));
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
        switch (this.X2) {
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
        switch (this.X2) {
            case 2:
                return false;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void k0(int i10, int i11) {
        org.telegram.ui.u3 u3Var;
        switch (this.X2) {
            case 1:
                org.telegram.ui.v3 v3Var = ((org.telegram.ui.i4) this.Y2).K;
                if (v3Var != null && (u3Var = v3Var.f41395c) != null) {
                    u3Var.invalidate();
                    return;
                }
                return;
            case 2:
                rv rvVar = (rv) this.Z2;
                rvVar.f30096f.a();
                rv.r(rvVar).invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.X2) {
            case 2:
                super.onDetachedFromWindow();
                rv rvVar = (rv) this.Z2;
                org.telegram.ui.Components.z5.release(rv.s(rvVar), rvVar.f30093b);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        org.telegram.ui.ActionBar.n1 n1Var;
        switch (this.X2) {
            case 0:
                if (motionEvent.getX() > getPaddingLeft() && motionEvent.getX() < getWidth() - getPaddingRight()) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return super.onInterceptTouchEvent(motionEvent);
                }
                return false;
            case 1:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.Y2;
                if (i4Var.d != null && i4Var.f41434b == null && (((n1Var = i4Var.H) == null || !n1Var.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                    i4Var.f41434b = null;
                    i4Var.d = null;
                    i4Var.f41437f = null;
                } else if (i4Var.d != null && i4Var.f41434b != null && motionEvent.getAction() == 1 && (getAdapter() instanceof org.telegram.ui.g4)) {
                    motionEvent2 = motionEvent;
                    org.telegram.ui.i4.l(i4Var, (org.telegram.ui.g4) getAdapter(), motionEvent2, i4Var.f41437f, i4Var.d, 0, 0);
                    return super.onInterceptTouchEvent(motionEvent2);
                }
                motionEvent2 = motionEvent;
                return super.onInterceptTouchEvent(motionEvent2);
            default:
                st q6 = st.q();
                rv rvVar = (rv) this.Z2;
                boolean r10 = q6.r(motionEvent, rvVar.h, rvVar.N, this.f28224p2);
                if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.X2) {
            case 1:
                v1(z10, i10, i11, i12, i13);
                ((org.telegram.ui.m3) this.Z2).I = -1.0f;
                return;
            case 2:
                super.onLayout(z10, i10, i11, i12, i13);
                ((rv) this.Z2).f30096f.a();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.X2) {
            case 2:
                View.MeasureSpec.getSize(i10);
                ((rv) this.Z2).f30102y.y1(40);
                super.onMeasure(i10, i11);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        switch (this.X2) {
            case 1:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.Y2;
                if (i4Var.d != null && i4Var.f41434b == null && (((n1Var = i4Var.H) == null || !n1Var.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                    i4Var.f41434b = null;
                    i4Var.d = null;
                    i4Var.f41437f = null;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public void v1(boolean z10, int i10, int i11, int i12, int i13) {
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

    public v(rv rvVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.Z2 = rvVar;
        this.Y2 = new Paint(1);
    }

    public v(org.telegram.ui.m3 m3Var, Context context) {
        super(context, null);
        this.Z2 = m3Var;
        this.Y2 = m3Var.K;
    }
}
