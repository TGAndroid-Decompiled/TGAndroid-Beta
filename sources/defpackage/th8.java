package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseIntArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d;
public final class th8 extends FrameLayout {
    public boolean E;
    public float F;
    public ValueAnimator G;
    public int H;
    public po I;
    public ylb J;
    public int K;
    public rh8 L;
    public Rect M;
    public boolean N;
    public float O;
    public float P;
    public Runnable Q;
    public boolean R;
    public SparseIntArray a;
    public float b;
    public float c;
    public lj4 d;
    public boolean e;
    public boolean f;
    public boolean h;
    public Paint n;
    public Paint r;
    public int s;
    public Path w;
    public RectF x;
    public ArrayList y;

    public final void a(float f, float f2) {
        ValueAnimator duration = ValueAnimator.ofFloat(this.b, f).setDuration(Math.max(0.5f, Math.abs(this.b - f) - Math.min(0.2f, f2)) * 300.0f);
        duration.setInterpolator(d53.f);
        this.I.d();
        duration.addUpdateListener(new qh8(this, (byte) 0));
        duration.addListener(new t7(this, f, (byte) 4));
        duration.start();
    }

    @Override
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        c(true);
    }

    public final void b(boolean z) {
        if (this.f) {
            return;
        }
        if (!z) {
            this.H = -1;
            this.b = 0.0f;
            c(true);
            return;
        }
        a(0.0f, 0.0f);
    }

    public final void c(boolean z) {
        View view;
        float f;
        float f2;
        ArrayList arrayList = this.y;
        if (this.O != this.c || this.P != this.b) {
            if (!arrayList.isEmpty()) {
                for (int i = 0; i < arrayList.size(); i++) {
                    ((sh8) arrayList.get(i)).a(this.c, this.b);
                }
            }
            this.O = this.c;
            this.P = this.b;
        }
        View childAt = getChildAt(0);
        int i2 = this.H;
        if (i2 >= 0 && i2 < getChildCount()) {
            view = getChildAt(this.H);
        } else {
            view = null;
        }
        childAt.setTranslationX((-this.b) * getWidth() * 0.5f);
        float f3 = ((1.0f - this.b) * 0.05f) + 0.95f;
        childAt.setScaleX(f3);
        childAt.setScaleY(f3);
        if (view != null) {
            view.setTranslationX((1.0f - this.b) * getWidth());
        }
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt2 = getChildAt(i3);
            if (i3 == 0) {
                if (this.b == 1.0f && childAt2.getVisibility() != 4) {
                    childAt2.setVisibility(4);
                }
                if (this.b != 1.0f && childAt2.getVisibility() != 0) {
                    childAt2.setVisibility(0);
                }
            } else if (i3 == this.H) {
                if (this.b == 0.0f && childAt2.getVisibility() != 4) {
                    childAt2.setVisibility(4);
                }
                if (this.b != 0.0f && childAt2.getVisibility() != 0) {
                    childAt2.setVisibility(0);
                }
            } else {
                childAt2.setVisibility(4);
            }
        }
        float measuredWidth = childAt.getMeasuredWidth();
        float measuredHeight = childAt.getMeasuredHeight();
        if (view != null) {
            f = view.getMeasuredWidth();
            f2 = this.F;
            if (f2 == 0.0f) {
                f2 = view.getMeasuredHeight();
            }
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        if (childAt.getMeasuredWidth() != 0 && childAt.getMeasuredHeight() != 0) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) getParent();
            float f4 = this.b;
            float f5 = ((f - measuredWidth) * f4) + measuredWidth;
            float A = td4.A(f2, measuredHeight, f4, measuredHeight) + actionBarPopupWindow$ActionBarPopupWindowLayout.getPaddingBottom() + actionBarPopupWindow$ActionBarPopupWindowLayout.getPaddingTop();
            actionBarPopupWindow$ActionBarPopupWindowLayout.a = false;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleX((f5 + (actionBarPopupWindow$ActionBarPopupWindowLayout.getPaddingRight() + actionBarPopupWindow$ActionBarPopupWindowLayout.getPaddingLeft())) / actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
            if (z) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(Math.min(1.0f, A / actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight()));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a = true;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt3 = getChildAt(i4);
                childAt3.setPivotX(0.0f);
                childAt3.setPivotY(0.0f);
            }
            invalidate();
        }
    }

    public final boolean d(View view, MotionEvent motionEvent) {
        Rect rect = this.M;
        view.getHitRect(rect);
        if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (view.canScrollHorizontally(-1) || (view instanceof w7))) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (d(viewGroup.getChildAt(i), motionEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Path path = this.w;
        RectF rectF = this.x;
        if (getChildCount() != 0) {
            View childAt = getChildAt(0);
            float top = childAt.getTop();
            float measuredWidth = childAt.getMeasuredWidth();
            float measuredHeight = childAt.getMeasuredHeight();
            int i = this.H;
            if (i != -1 && i < getChildCount()) {
                View childAt2 = getChildAt(this.H);
                float top2 = childAt2.getTop();
                float measuredWidth2 = childAt2.getMeasuredWidth();
                float f = this.F;
                if (f == 0.0f) {
                    f = childAt2.getMeasuredHeight();
                }
                if (childAt.getMeasuredWidth() != 0 && childAt.getMeasuredHeight() != 0 && childAt2.getMeasuredWidth() != 0 && childAt2.getMeasuredHeight() != 0) {
                    top = gm.R1(top, top2, this.b);
                    measuredWidth = gm.R1(measuredWidth, measuredWidth2, this.b);
                    measuredHeight = gm.R1(measuredHeight, f, this.b);
                }
            }
            int save = canvas.save();
            path.rewind();
            int L = gm.L(12.0f);
            if (this.R) {
                rectF.set(getWidth() - measuredWidth, top, getWidth(), measuredHeight + top);
            } else {
                rectF.set(0.0f, top, measuredWidth, measuredHeight + top);
            }
            float f2 = L;
            path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
            canvas.clipPath(path);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
            if (this.L != null && this.K != rectF.height()) {
                rh8 rh8Var = this.L;
                int height = (int) rectF.height();
                this.K = height;
                d[] dVarArr = (d[]) ((wm2) rh8Var).b;
                d dVar = dVarArr[0];
                if (dVar != null && dVar.getFragmentView() != null && dVarArr[0].isInPreviewMode()) {
                    ViewGroup.LayoutParams layoutParams = dVarArr[0].getFragmentView().getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = gm.L(48.0f) + height;
                        dVarArr[0].getFragmentView().setLayoutParams(layoutParams);
                    }
                }
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        float f;
        RectF rectF = this.x;
        int action = motionEvent.getAction() & 255;
        if (this.f) {
            z = true;
        } else if (!((GestureDetector) this.d.a).onTouchEvent(motionEvent) && (action == 1 || action == 3)) {
            if (this.e) {
                this.e = false;
                this.h = false;
                if (this.b >= 0.5f) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                a(f, 0.0f);
            } else if (this.h) {
                this.e = false;
                this.h = false;
            }
            z = false;
        } else {
            z = this.e;
        }
        if (!z) {
            int actionMasked = motionEvent.getActionMasked();
            if (rectF != null) {
                rectF.contains(motionEvent.getX(), motionEvent.getY());
            }
            if (actionMasked == 0 && !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                callOnClick();
                return true;
            }
            int i = this.H;
            if (i >= 0 && i < getChildCount()) {
                View childAt = getChildAt(0);
                View childAt2 = getChildAt(this.H);
                if (this.b > 0.5f) {
                    childAt = childAt2;
                }
                if (!childAt.dispatchTouchEvent(motionEvent) && actionMasked != 0 && !onTouchEvent(motionEvent)) {
                    return false;
                }
            } else {
                return super.dispatchTouchEvent(motionEvent);
            }
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        float max;
        Paint paint = this.n;
        Paint paint2 = this.r;
        int indexOfChild = indexOfChild(view);
        if (this.N) {
            float f = this.b * 2.0f;
            if (indexOfChild == 0) {
                max = 1.0f - Math.min(1.0f, f);
            } else {
                max = Math.max(0.0f, f - 1.0f);
            }
            if (max <= 0.0f) {
                return false;
            }
            if (max >= 1.0f) {
                return super.drawChild(canvas, view, j);
            }
            int saveLayerAlpha = canvas.saveLayerAlpha(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight(), (int) (max * 255.0f));
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restoreToCount(saveLayerAlpha);
            return drawChild;
        }
        int save = canvas.save();
        if (indexOfChild != 0) {
            int i = this.s;
            if (i == 0) {
                paint2.setColor(cmb.v0(cmb.F8, this.J));
            } else {
                paint2.setColor(i);
            }
            canvas.drawRect(view.getX(), 0.0f, view.getMeasuredWidth() + view.getX(), getMeasuredHeight(), paint2);
        }
        boolean drawChild2 = super.drawChild(canvas, view, j);
        if (indexOfChild == 0) {
            paint.setAlpha((int) (this.b * 64.0f));
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        }
        canvas.restoreToCount(save);
        return drawChild2;
    }

    public final void e(int i) {
        if (this.f) {
            return;
        }
        this.H = i;
        this.F = this.a.get(i);
        a(1.0f, 0.0f);
    }

    public final void f(int i, int i2, boolean z) {
        this.a.put(i, i2);
        int i3 = this.H;
        if (i == i3 && i3 >= 0 && i3 < getChildCount()) {
            ValueAnimator valueAnimator = this.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.G = null;
            }
            if (z) {
                View childAt = getChildAt(this.H);
                float f = this.F;
                if (f == 0.0f) {
                    f = childAt.getMeasuredHeight();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(f, i2).setDuration(240L);
                duration.setInterpolator(vt3.e);
                duration.addUpdateListener(new qh8(this, (byte) 1));
                this.f = true;
                duration.addListener(new s38(this, (byte) 18));
                duration.start();
                this.G = duration;
                return;
            }
            this.F = i2;
            c(true);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if ((childAt.getLayoutParams() instanceof FrameLayout.LayoutParams) && ((FrameLayout.LayoutParams) childAt.getLayoutParams()).gravity == 80) {
                if (this.R) {
                    int i6 = i3 - i;
                    int i7 = i4 - i2;
                    childAt.layout(i6 - childAt.getMeasuredWidth(), i7 - childAt.getMeasuredHeight(), i6, i7);
                } else {
                    int i8 = i4 - i2;
                    childAt.layout(0, i8 - childAt.getMeasuredHeight(), childAt.getMeasuredWidth(), i8);
                }
            } else if (this.R) {
                int i9 = i3 - i;
                childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, childAt.getMeasuredHeight());
            } else {
                childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            }
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        c(true);
    }

    public void setForegroundColor(int i) {
        this.s = i;
    }

    public void setForegroundOnGlass(boolean z) {
        if (this.N != z) {
            this.N = z;
            invalidate();
        }
    }

    public void setOnForegroundOpenFinished(Runnable runnable) {
        this.Q = runnable;
    }

    public void setOnHeightUpdateListener(rh8 rh8Var) {
        this.L = rh8Var;
    }

    public void setStickToRight(boolean z) {
        this.R = z;
    }

    public void setSwipeBackDisallowed(boolean z) {
        this.E = z;
    }
}
