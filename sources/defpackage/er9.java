package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.HashMap;
import java.util.Map;
public abstract class er9 extends HorizontalScrollView {
    public static final int u0 = 0;
    public int E;
    public final lm F;
    public final RectF G;
    public final float H;
    public final Paint I;
    public int J;
    public int K;
    public final GradientDrawable L;
    public final int M;
    public int N;
    public int O;
    public final wjb P;
    public final boolean Q;
    public final SparseArray R;
    public final SparseArray S;
    public boolean T;
    public int U;
    public int V;
    public float W;
    public int a;
    public float a0;
    public dr9 b;
    public float b0;
    public final LinearLayout.LayoutParams c;
    public boolean c0;
    public final LinearLayout.LayoutParams d;
    public float d0;
    public final pkb e;
    public float e0;
    public cr9 f;
    public final br9 f0;
    public boolean g0;
    public HashMap h;
    public boolean h0;
    public ValueAnimator i0;
    public float j0;
    public final float k0;
    public final float l0;
    public float m0;
    public HashMap n;
    public int n0;
    public final Paint o0;
    public boolean p0;
    public final lm q0;
    public final SparseArray r;
    public boolean r0;
    public View s;
    public long s0;
    public final br9 t0;
    public float w;
    public boolean x;
    public int y;

    public er9(wjb wjbVar, Context context, boolean z) {
        super(context);
        this.a = 1;
        this.b = dr9.a;
        this.h = new HashMap();
        this.n = new HashMap();
        this.r = new SparseArray();
        s33 s33Var = s33.h;
        this.F = new lm(350L, this, s33Var);
        this.G = new RectF();
        this.J = 436207616;
        this.L = new GradientDrawable();
        this.M = gl.L(33.0f);
        this.N = gl.L(2.0f);
        this.O = 0;
        this.R = new SparseArray();
        this.S = new SparseArray();
        this.f0 = new br9(this, (byte) 0);
        this.g0 = false;
        this.k0 = gl.L(64.0f);
        this.l0 = gl.L(33.0f);
        this.n0 = -1;
        this.o0 = new Paint();
        this.p0 = true;
        this.q0 = new lm(350L, this, s33Var);
        this.t0 = new br9(this, (byte) 1);
        this.P = wjbVar;
        this.Q = z;
        this.H = ViewConfiguration.get(context).getScaledTouchSlop();
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        pkb pkbVar = new pkb((byte) 15, context, this);
        this.e = pkbVar;
        pkbVar.setOrientation(0);
        pkbVar.setPadding(gl.L(9.5f), 0, gl.L(9.5f), 0);
        addView(pkbVar, new FrameLayout.LayoutParams(-1, -1, 16));
        Paint paint = new Paint();
        this.I = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.c = new LinearLayout.LayoutParams(gl.L(33.0f), -1);
        this.d = new LinearLayout.LayoutParams(0, -1, 1.0f);
    }

    public int getTabSize() {
        float f;
        if (this.h0) {
            f = 64.0f;
        } else {
            f = 33.0f;
        }
        return gl.L(f);
    }

    public final FrameLayout b(int i, Drawable drawable) {
        String k = de9.k(i, "tab");
        int i2 = this.y;
        this.y = i2 + 1;
        FrameLayout frameLayout = (FrameLayout) this.n.get(k);
        boolean z = false;
        if (frameLayout != null) {
            g(k, frameLayout, i2);
        } else {
            frameLayout = new FrameLayout(getContext());
            ImageView imageView = new ImageView(getContext());
            imageView.setImageDrawable(drawable);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout.addView(imageView, nme.e(24, 24, 17));
            frameLayout.setFocusable(true);
            frameLayout.setOnClickListener(new zq9(this, (byte) 0));
            this.e.addView(frameLayout, i2);
        }
        frameLayout.setTag(2131296463, Integer.valueOf(i2));
        if (i2 == this.E) {
            z = true;
        }
        frameLayout.setSelected(z);
        this.h.put(k, frameLayout);
        return frameLayout;
    }

    public final xza c(int i, Drawable drawable) {
        String k = de9.k(i, "tab");
        int i2 = this.y;
        this.y = i2 + 1;
        xza xzaVar = (xza) this.n.get(k);
        boolean z = true;
        if (xzaVar != null) {
            g(k, xzaVar, i2);
        } else {
            xzaVar = new xza(getContext(), 1);
            xzaVar.f.setImageDrawable(drawable);
            xzaVar.setFocusable(true);
            xzaVar.setOnClickListener(new zq9(this, (byte) 1));
            xzaVar.setExpanded(this.g0);
            xzaVar.a(this.j0);
            this.e.addView(xzaVar, i2);
        }
        xzaVar.d = false;
        xzaVar.setTag(2131296463, Integer.valueOf(i2));
        if (i2 != this.E) {
            z = false;
        }
        xzaVar.setSelected(z);
        this.h.put(k, xzaVar);
        return xzaVar;
    }

    @Override
    public final void cancelLongPress() {
        super.cancelLongPress();
        this.c0 = false;
        gl.r(this.f0);
    }

    public final void d(boolean z) {
        this.n = this.h;
        this.h = new HashMap();
        this.r.clear();
        this.y = 0;
        if (z) {
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setDuration(250L);
            autoTransition.setOrdering(0);
            autoTransition.addTransition(new u88(this, (byte) 1));
            TransitionManager.beginDelayedTransition(this.e, autoTransition);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.er9.dispatchDraw(android.graphics.Canvas):void");
    }

    public final boolean e(int i) {
        if (this.T && i >= 0) {
            pkb pkbVar = this.e;
            if (i < pkbVar.getChildCount()) {
                View childAt = pkbVar.getChildAt(i);
                if (childAt instanceof xza) {
                    xza xzaVar = (xza) childAt;
                    if (xzaVar.a == 0 && !xzaVar.d) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean f(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        br9 br9Var = this.f0;
        if (action == 0 && this.s == null) {
            this.c0 = true;
            gl.e3(br9Var, 500L);
            this.a0 = motionEvent.getX();
            this.b0 = motionEvent.getY();
        }
        if (this.c0 && motionEvent.getAction() == 2) {
            float abs = Math.abs(motionEvent.getX() - this.a0);
            float f = this.H;
            if (abs > f || Math.abs(motionEvent.getY() - this.b0) > f) {
                this.c0 = false;
                gl.r(br9Var);
            }
        }
        int action2 = motionEvent.getAction();
        br9 br9Var2 = this.t0;
        pkb pkbVar = this.e;
        if (action2 == 2 && this.s != null) {
            int ceil = ((int) Math.ceil((motionEvent.getX() + getScrollX()) / getTabSize())) - 1;
            int i = this.V;
            if (ceil != i) {
                if (ceil < i) {
                    while (!e(ceil) && ceil != this.V) {
                        ceil++;
                    }
                } else {
                    while (!e(ceil) && ceil != this.V) {
                        ceil--;
                    }
                }
            }
            if (this.V != ceil && e(ceil)) {
                for (int i2 = 0; i2 < pkbVar.getChildCount(); i2++) {
                    if (i2 != this.V) {
                        xza xzaVar = (xza) pkbVar.getChildAt(i2);
                        xzaVar.E = xzaVar.getLeft();
                        xzaVar.F = true;
                        xzaVar.invalidate();
                    }
                }
                this.W += (ceil - this.V) * getTabSize();
                this.V = ceil;
                pkbVar.removeView(this.s);
                pkbVar.addView(this.s, this.V);
                invalidate();
            }
            this.e0 = this.a0 - motionEvent.getX();
            float x = motionEvent.getX();
            if (x < this.s.getMeasuredWidth() / 2.0f) {
                this.r0 = false;
                if (this.s0 <= 0) {
                    this.s0 = System.currentTimeMillis();
                }
                gl.e3(br9Var2, 16L);
            } else if (x > getMeasuredWidth() - (this.s.getMeasuredWidth() / 2.0f)) {
                this.r0 = true;
                if (this.s0 <= 0) {
                    this.s0 = System.currentTimeMillis();
                }
                gl.e3(br9Var2, 16L);
            } else {
                this.s0 = -1L;
                gl.r(br9Var2);
            }
            pkbVar.invalidate();
            j();
            return true;
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        } else {
            this.s0 = -1L;
            gl.r(br9Var2);
            gl.r(br9Var);
            if (this.s != null) {
                int i3 = this.U;
                int i4 = this.V;
                if (i3 != i4) {
                    o(i3, i4);
                    for (int i5 = 0; i5 < pkbVar.getChildCount(); i5++) {
                        pkbVar.getChildAt(i5).setTag(2131296463, Integer.valueOf(i5));
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new x89(this, (byte) 8));
                ofFloat.addListener(new ng9(this, (byte) 2));
                ofFloat.start();
            }
            this.c0 = false;
            j();
            return false;
        }
    }

    public final void g(String str, FrameLayout frameLayout, int i) {
        HashMap hashMap = this.n;
        if (hashMap != null) {
            hashMap.remove(str);
        }
        this.r.put(i, frameLayout);
    }

    public int getCurrentPosition() {
        return this.E;
    }

    public float getExpandedOffset() {
        if (this.h0) {
            return gl.L(50.0f) * this.j0;
        }
        return 0.0f;
    }

    public dr9 getType() {
        return this.b;
    }

    public final void h() {
        HashMap hashMap = this.n;
        pkb pkbVar = this.e;
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                pkbVar.removeView((View) entry.getValue());
            }
            this.n.clear();
        }
        SparseArray sparseArray = this.r;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            View view = (View) sparseArray.valueAt(i);
            if (pkbVar.indexOfChild(view) != keyAt) {
                pkbVar.removeView(view);
                pkbVar.addView(view, keyAt);
            }
        }
        sparseArray.clear();
    }

    public final void i(final boolean z, final float f) {
        float f2;
        if (this.g0 != z) {
            this.g0 = z;
            if (!z) {
                fling(0);
            }
            ValueAnimator valueAnimator = this.i0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.i0.cancel();
            }
            float f3 = this.j0;
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f3, f2);
            this.i0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    er9 er9Var = er9.this;
                    pkb pkbVar = er9Var.e;
                    if (!z) {
                        float childCount = er9Var.l0 * pkbVar.getChildCount();
                        float f4 = f;
                        float scrollX = (er9Var.getScrollX() + f4) / (er9Var.k0 * pkbVar.getChildCount());
                        float measuredWidth = (childCount - er9Var.getMeasuredWidth()) / childCount;
                        if (scrollX > measuredWidth) {
                            scrollX = measuredWidth;
                            f4 = 0.0f;
                        }
                        float f5 = childCount * scrollX;
                        if (f5 - f4 < 0.0f) {
                            f5 = f4;
                        }
                        er9Var.m0 = (er9Var.getScrollX() + f4) - f5;
                    }
                    er9Var.j0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    for (int i = 0; i < pkbVar.getChildCount(); i++) {
                        pkbVar.getChildAt(i).invalidate();
                    }
                    pkbVar.invalidate();
                    er9Var.p();
                }
            });
            this.i0.addListener(new uy6(this, z, f, (byte) 1));
            this.i0.start();
            pkb pkbVar = this.e;
            if (z) {
                this.h0 = true;
                for (int i = 0; i < pkbVar.getChildCount(); i++) {
                    View childAt = pkbVar.getChildAt(i);
                    if (childAt instanceof xza) {
                        ((xza) childAt).setExpanded(true);
                    }
                    childAt.getLayoutParams().width = gl.L(64.0f);
                }
                pkbVar.requestLayout();
                getLayoutParams().height = gl.L(86.0f);
            }
            if (z) {
                float childCount = this.k0 * pkbVar.getChildCount() * ((getScrollX() + f) / (this.l0 * pkbVar.getChildCount()));
                this.m0 = childCount - (getScrollX() + f);
                this.n0 = (int) (childCount - f);
            }
        }
    }

    public final void k(int i, int i2) {
        int i3 = this.E;
        if (i3 != i) {
            pkb pkbVar = this.e;
            View childAt = pkbVar.getChildAt(i3);
            if (childAt != null) {
                childAt.getLeft();
                SystemClock.elapsedRealtime();
            }
            this.E = i;
            if (i >= pkbVar.getChildCount()) {
                return;
            }
            int i4 = 0;
            while (true) {
                boolean z = true;
                if (i4 >= pkbVar.getChildCount()) {
                    break;
                }
                View childAt2 = pkbVar.getChildAt(i4);
                if (i4 != i) {
                    z = false;
                }
                childAt2.setSelected(z);
                i4++;
            }
            if (this.i0 == null) {
                if (i2 == i && i > 1) {
                    l(i - 1);
                } else {
                    l(i);
                }
            }
            invalidate();
        }
    }

    public final void l(int i) {
        if (this.y != 0) {
            pkb pkbVar = this.e;
            if (pkbVar.getChildAt(i) != null) {
                int left = pkbVar.getChildAt(i).getLeft();
                int i2 = this.M;
                if (i > 0) {
                    left -= i2;
                }
                int scrollX = getScrollX();
                if (left != this.O) {
                    if (left < scrollX) {
                        this.O = left;
                        smoothScrollTo(left, 0);
                    } else if (left + i2 > (getWidth() + scrollX) - (i2 << 1)) {
                        int width = (i2 * 3) + (left - getWidth());
                        this.O = width;
                        smoothScrollTo(width, 0);
                    }
                }
            }
        }
    }

    public final void m(int i) {
        if (i >= 0 && i < this.y) {
            this.e.getChildAt(i).performClick();
        }
    }

    public final void n() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.er9.n():void");
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!f(motionEvent) && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        n();
        int i5 = this.n0;
        if (i5 >= 0) {
            scrollTo(i5, 0);
            this.n0 = -1;
        }
    }

    @Override
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        n();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!f(motionEvent) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public final void q() {
        for (int i = 0; i < this.y; i++) {
            View childAt = this.e.getChildAt(i);
            if (this.x) {
                childAt.setLayoutParams(this.d);
            } else {
                childAt.setLayoutParams(this.c);
            }
        }
    }

    public void setCurrentPosition(int i) {
        this.E = i;
    }

    public void setDelegate(cr9 cr9Var) {
        this.f = cr9Var;
    }

    public void setDragEnabled(boolean z) {
        this.T = z;
    }

    public void setImageReceiversLayerNum(int i) {
        this.a = i;
    }

    public void setIndicatorColor(int i) {
        invalidate();
    }

    public void setIndicatorHeight(int i) {
        this.K = i;
        invalidate();
    }

    public void setShouldExpand(boolean z) {
        this.x = z;
        requestLayout();
    }

    public void setType(dr9 dr9Var) {
        if (dr9Var != null && this.b != dr9Var) {
            this.b = dr9Var;
            int ordinal = dr9Var.ordinal();
            GradientDrawable gradientDrawable = this.L;
            if (ordinal != 0) {
                if (ordinal == 1) {
                    float N = gl.N(3.0f);
                    gradientDrawable.setCornerRadii(new float[]{N, N, N, N, 0.0f, 0.0f, 0.0f, 0.0f});
                    return;
                }
                return;
            }
            gradientDrawable.setCornerRadius(0.0f);
        }
    }

    public void setUnderlineColor(int i) {
        this.J = i;
        invalidate();
    }

    public void setUnderlineColorResource(int i) {
        this.J = getResources().getColor(i);
        invalidate();
    }

    public void setUnderlineHeight(int i) {
        if (this.N != i) {
            this.N = i;
            invalidate();
        }
    }

    public void j() {
    }

    public void p() {
    }

    public void o(int i, int i2) {
    }
}
