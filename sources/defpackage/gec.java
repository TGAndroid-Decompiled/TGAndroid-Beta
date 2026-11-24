package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
public class gec extends ViewGroup {
    public static final int[] t0 = {16842931};
    public static final is6 u0 = new is6((byte) 10);
    public static final oe3 v0 = new oe3((byte) 5);
    public static final is6 w0 = new is6((byte) 11);
    public int E;
    public int F;
    public float G;
    public float H;
    public int I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public boolean N;
    public boolean O;
    public final int P;
    public int Q;
    public final int R;
    public float S;
    public float T;
    public float U;
    public float V;
    public int W;
    public int a;
    public VelocityTracker a0;
    public final ArrayList b;
    public final int b0;
    public final cec c;
    public final int c0;
    public final Rect d;
    public final int d0;
    public pr7 e;
    public final int e0;
    public int f;
    public boolean f0;
    public EdgeEffect g0;
    public int h;
    public EdgeEffect h0;
    public boolean i0;
    public boolean j0;
    public int k0;
    public ArrayList l0;
    public eec m0;
    public Parcelable n;
    public hza n0;
    public byte o0;
    public byte p0;
    public ArrayList q0;
    public Scroller r;
    public final xia r0;
    public boolean s;
    public int s0;
    public c43 w;
    public int x;
    public Drawable y;

    public gec(Context context) {
        super(context);
        this.b = new ArrayList();
        this.c = new Object();
        this.d = new Rect();
        this.h = -1;
        this.n = null;
        this.G = -3.4028235E38f;
        this.H = Float.MAX_VALUE;
        this.M = 1;
        this.W = -1;
        this.i0 = true;
        this.r0 = new xia(this, (byte) 12);
        this.s0 = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.r = new Scroller(context2, v0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f = context2.getResources().getDisplayMetrics().density;
        this.R = viewConfiguration.getScaledPagingTouchSlop();
        this.b0 = (int) (400.0f * f);
        this.c0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.g0 = new EdgeEffect(context2);
        this.h0 = new EdgeEffect(context2);
        this.d0 = (int) (25.0f * f);
        this.e0 = (int) (2.0f * f);
        this.P = (int) (f * 16.0f);
        jdc.k(this, new t49(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        bdc.i(this, new aec(this));
    }

    public static boolean d(int i, int i2, int i3, View view, boolean z) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && d(i, i5 - childAt.getLeft(), i4 - childAt.getTop(), childAt, true)) {
                    break;
                }
            }
        }
        if (z && view.canScrollHorizontally(-i)) {
            return true;
        }
        return false;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.K != z) {
            this.K = z;
        }
    }

    public final cec a(int i, int i2) {
        ?? obj = new Object();
        obj.b = i;
        obj.a = this.e.e(this, i);
        this.e.getClass();
        obj.d = 1.0f;
        ArrayList arrayList = this.b;
        if (i2 >= 0 && i2 < arrayList.size()) {
            arrayList.add(i2, obj);
            return obj;
        }
        arrayList.add(obj);
        return obj;
    }

    @Override
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        cec k;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (k = k(childAt)) != null && k.b == this.f) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override
    public final void addTouchables(ArrayList arrayList) {
        cec k;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (k = k(childAt)) != null && k.b == this.f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        boolean z;
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        dec decVar = (dec) layoutParams;
        boolean z2 = decVar.a;
        if (view.getClass().getAnnotation(bec.class) != null) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = z2 | z;
        decVar.a = z3;
        if (this.J) {
            if (!z3) {
                decVar.d = true;
                addViewInLayout(view, i, layoutParams);
                return;
            }
            sc8.j("Cannot add pager decor view during layout");
            return;
        }
        super.addView(view, i, layoutParams);
    }

    public final void b(eec eecVar) {
        ArrayList arrayList = this.l0;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.l0 = arrayList;
        }
        arrayList.add(eecVar);
    }

    public final boolean c(int r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gec.c(int):boolean");
    }

    @Override
    public final boolean canScrollHorizontally(int i) {
        if (this.e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX <= ((int) (clientWidth * this.G))) {
                return false;
            }
            return true;
        } else if (i <= 0 || scrollX >= ((int) (clientWidth * this.H))) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof dec) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override
    public final void computeScroll() {
        this.s = true;
        if (!this.r.isFinished() && this.r.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.r.getCurrX();
            int currY = this.r.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!q(currX)) {
                    this.r.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            WeakHashMap weakHashMap = jdc.a;
            postInvalidateOnAnimation();
            return;
        }
        e(true);
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gec.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        cec k;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (k = k(childAt)) != null && k.b == this.f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void draw(Canvas canvas) {
        pr7 pr7Var;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode != 0 && (overScrollMode != 1 || (pr7Var = this.e) == null || pr7Var.b() <= 1)) {
            this.g0.finish();
            this.h0.finish();
        } else {
            if (!this.g0.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.G * width);
                this.g0.setSize(height, width);
                z = this.g0.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.h0.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.H + 1.0f)) * width2);
                this.h0.setSize(height2, width2);
                z |= this.h0.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
        if (z) {
            WeakHashMap weakHashMap = jdc.a;
            postInvalidateOnAnimation();
        }
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.y;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public final void e(boolean z) {
        boolean z2;
        if (this.s0 == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.r.isFinished()) {
                this.r.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.r.getCurrX();
                int currY = this.r.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        q(currX);
                    }
                }
            }
        }
        this.L = false;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                break;
            }
            cec cecVar = (cec) arrayList.get(i);
            if (cecVar.c) {
                cecVar.c = false;
                z2 = true;
            }
            i++;
        }
        if (z2) {
            xia xiaVar = this.r0;
            if (z) {
                WeakHashMap weakHashMap = jdc.a;
                postOnAnimation(xiaVar);
                return;
            }
            xiaVar.run();
        }
    }

    public final void f() {
        boolean z;
        int b = this.e.b();
        this.a = b;
        ArrayList arrayList = this.b;
        if (arrayList.size() < (this.M << 1) + 1 && arrayList.size() < b) {
            z = true;
        } else {
            z = false;
        }
        int i = this.f;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < arrayList.size()) {
            cec cecVar = (cec) arrayList.get(i2);
            int c = this.e.c(cecVar.a);
            if (c != -1) {
                if (c == -2) {
                    arrayList.remove(i2);
                    i2--;
                    if (!z2) {
                        this.e.getClass();
                        z2 = true;
                    }
                    this.e.a(this, cecVar.a);
                    int i3 = this.f;
                    if (i3 == cecVar.b) {
                        i = Math.max(0, Math.min(i3, b - 1));
                    }
                } else {
                    int i4 = cecVar.b;
                    if (i4 != c) {
                        if (i4 == this.f) {
                            i = c;
                        }
                        cecVar.b = c;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.e.getClass();
        }
        Collections.sort(arrayList, u0);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                dec decVar = (dec) getChildAt(i5).getLayoutParams();
                if (!decVar.a) {
                    decVar.c = 0.0f;
                }
            }
            y(i, 0, false, true);
            requestLayout();
        }
    }

    public final int g(int i, int i2, float f, int i3) {
        float f2;
        if (Math.abs(i3) > this.d0 && Math.abs(i2) > this.b0) {
            if (i2 <= 0) {
                i++;
            }
        } else {
            if (i >= this.f) {
                f2 = 0.4f;
            } else {
                f2 = 0.6f;
            }
            i += (int) (f + f2);
        }
        ArrayList arrayList = this.b;
        if (arrayList.size() > 0) {
            return Math.max(((cec) arrayList.get(0)).b, Math.min(i, ((cec) b00.f(1, arrayList)).b));
        }
        return i;
    }

    @Override
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ?? layoutParams = new ViewGroup.LayoutParams(-1, -1);
        layoutParams.c = 0.0f;
        return layoutParams;
    }

    @Override
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? layoutParams = new ViewGroup.LayoutParams(context, attributeSet);
        layoutParams.c = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t0);
        layoutParams.b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    public pr7 getAdapter() {
        return this.e;
    }

    @Override
    public final int getChildDrawingOrder(int i, int i2) {
        if (this.p0 == 2) {
            i2 = (i - 1) - i2;
        }
        return ((dec) ((View) this.q0.get(i2)).getLayoutParams()).f;
    }

    public int getCurrentItem() {
        return this.f;
    }

    public int getOffscreenPageLimit() {
        return this.M;
    }

    public int getPageMargin() {
        return this.x;
    }

    public final void h(int i) {
        eec eecVar = this.m0;
        if (eecVar != null) {
            eecVar.a(i);
        }
        ArrayList arrayList = this.l0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                eec eecVar2 = (eec) this.l0.get(i2);
                if (eecVar2 != null) {
                    eecVar2.a(i);
                }
            }
        }
    }

    public final void i() {
        if (this.f0) {
            if (this.e != null) {
                VelocityTracker velocityTracker = this.a0;
                velocityTracker.computeCurrentVelocity(1000, this.c0);
                int xVelocity = (int) velocityTracker.getXVelocity(this.W);
                this.L = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                cec l = l();
                y(g(l.b, xVelocity, ((scrollX / clientWidth) - l.e) / l.d, (int) (this.S - this.U)), xVelocity, true, true);
            }
            this.N = false;
            this.O = false;
            VelocityTracker velocityTracker2 = this.a0;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.a0 = null;
            }
            this.f0 = false;
            return;
        }
        sc8.j("No fake drag in progress. Call beginFakeDrag first.");
    }

    public final Rect j(View view, Rect rect) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public final cec k(View view) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                cec cecVar = (cec) arrayList.get(i);
                if (this.e.f(view, cecVar.a)) {
                    return cecVar;
                }
                i++;
            } else {
                return null;
            }
        }
    }

    public final defpackage.cec l() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gec.l():cec");
    }

    public final cec m(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i2 < arrayList.size()) {
                cec cecVar = (cec) arrayList.get(i2);
                if (cecVar.b == i) {
                    return cecVar;
                }
                i2++;
            } else {
                return null;
            }
        }
    }

    public final void n(float r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gec.n(float, int, int):void");
    }

    public final void o(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.W) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.S = motionEvent.getX(i);
            this.W = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.a0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i0 = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        removeCallbacks(this.r0);
        Scroller scroller = this.r;
        if (scroller != null && !scroller.isFinished()) {
            this.r.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int width;
        int i;
        float f;
        ArrayList arrayList;
        int i2;
        super.onDraw(canvas);
        if (this.x > 0 && this.y != null) {
            ArrayList arrayList2 = this.b;
            if (arrayList2.size() > 0 && this.e != null) {
                int scrollX = getScrollX();
                float width2 = getWidth();
                float f2 = this.x / width2;
                int i3 = 0;
                cec cecVar = (cec) arrayList2.get(0);
                float f3 = cecVar.e;
                int size = arrayList2.size();
                int i4 = cecVar.b;
                int i5 = ((cec) arrayList2.get(size - 1)).b;
                while (i4 < i5) {
                    while (true) {
                        i = cecVar.b;
                        if (i4 <= i || i3 >= size) {
                            break;
                        }
                        i3++;
                        cecVar = (cec) arrayList2.get(i3);
                    }
                    if (i4 == i) {
                        float f4 = cecVar.e;
                        float f5 = cecVar.d;
                        f = (f4 + f5) * width2;
                        f3 = f4 + f5 + f2;
                    } else {
                        this.e.getClass();
                        f = (f3 + 1.0f) * width2;
                        f3 = 1.0f + f2 + f3;
                    }
                    if (this.x + f > scrollX) {
                        arrayList = arrayList2;
                        i2 = scrollX;
                        this.y.setBounds(Math.round(f), this.E, Math.round(this.x + f), this.F);
                        this.y.draw(canvas);
                    } else {
                        arrayList = arrayList2;
                        i2 = scrollX;
                    }
                    if (f <= i2 + width) {
                        i4++;
                        arrayList2 = arrayList;
                        scrollX = i2;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        int action = motionEvent.getAction() & 255;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.N) {
                    return true;
                }
                if (this.O) {
                    return false;
                }
                if (action != 2) {
                    if (action == 6) {
                        o(motionEvent);
                    }
                } else {
                    int i = this.W;
                    if (i != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i);
                        float x = motionEvent.getX(findPointerIndex);
                        float f2 = x - this.S;
                        float abs = Math.abs(f2);
                        float y = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y - this.V);
                        int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                        if (i2 != 0) {
                            float f3 = this.S;
                            if ((f3 >= this.Q || i2 <= 0) && ((f3 <= getWidth() - this.Q || f2 >= 0.0f) && d((int) f2, (int) x, (int) y, this, false))) {
                                this.S = x;
                                this.T = y;
                                this.O = true;
                                return false;
                            }
                        }
                        int i3 = this.R;
                        float f4 = i3;
                        if (abs > f4 && abs * 0.5f > abs2) {
                            this.N = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            setScrollState(1);
                            float f5 = this.U;
                            float f6 = i3;
                            if (i2 > 0) {
                                f = f5 + f6;
                            } else {
                                f = f5 - f6;
                            }
                            this.S = f;
                            this.T = y;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > f4) {
                            this.O = true;
                        }
                        if (this.N && r(x)) {
                            WeakHashMap weakHashMap = jdc.a;
                            postInvalidateOnAnimation();
                        }
                    }
                }
            } else {
                float x2 = motionEvent.getX();
                this.U = x2;
                this.S = x2;
                float y2 = motionEvent.getY();
                this.V = y2;
                this.T = y2;
                this.W = motionEvent.getPointerId(0);
                this.O = false;
                this.s = true;
                this.r.computeScrollOffset();
                if (this.s0 == 2 && Math.abs(this.r.getFinalX() - this.r.getCurrX()) > this.e0) {
                    this.r.abortAnimation();
                    this.L = false;
                    s();
                    this.N = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                } else {
                    e(false);
                    this.N = false;
                }
            }
            VelocityTracker velocityTracker = this.a0;
            if (velocityTracker == null) {
                velocityTracker = VelocityTracker.obtain();
                this.a0 = velocityTracker;
            }
            velocityTracker.addMovement(motionEvent);
            return this.N;
        }
        v();
        return false;
    }

    @Override
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gec.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public void onMeasure(int i, int i2) {
        dec decVar;
        dec decVar2;
        boolean z;
        int i3;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.Q = Math.min(measuredWidth / 10, this.P);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            boolean z2 = true;
            int i5 = 1073741824;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && (decVar2 = (dec) childAt.getLayoutParams()) != null && decVar2.a) {
                int i6 = decVar2.b;
                int i7 = i6 & 7;
                int i8 = i6 & 112;
                if (i8 != 48 && i8 != 80) {
                    z = false;
                } else {
                    z = true;
                }
                if (i7 != 3 && i7 != 5) {
                    z2 = false;
                }
                int i9 = Integer.MIN_VALUE;
                if (z) {
                    i3 = Integer.MIN_VALUE;
                    i9 = 1073741824;
                } else if (z2) {
                    i3 = 1073741824;
                } else {
                    i3 = Integer.MIN_VALUE;
                }
                int i10 = ((ViewGroup.LayoutParams) decVar2).width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = paddingLeft;
                    }
                    i9 = 1073741824;
                } else {
                    i10 = paddingLeft;
                }
                int i11 = ((ViewGroup.LayoutParams) decVar2).height;
                if (i11 != -2) {
                    if (i11 == -1) {
                        i11 = measuredHeight;
                    }
                } else {
                    i11 = measuredHeight;
                    i5 = i3;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i9), View.MeasureSpec.makeMeasureSpec(i11, i5));
                if (z) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z2) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i4++;
        }
        this.I = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.J = true;
        s();
        this.J = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((decVar = (dec) childAt2.getLayoutParams()) == null || !decVar.a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * decVar.c), 1073741824), this.I);
            }
        }
    }

    @Override
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        cec k;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = childCount;
            i2 = 0;
            i4 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (k = k(childAt)) != null && k.b == this.f && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i4;
        }
        return false;
    }

    @Override
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof fec)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        fec fecVar = (fec) parcelable;
        super.onRestoreInstanceState(fecVar.a);
        if (this.e != null) {
            y(fecVar.c, 0, false, true);
            return;
        }
        this.h = fecVar.c;
        this.n = fecVar.d;
    }

    @Override
    public final Parcelable onSaveInstanceState() {
        ?? w1Var = new w1(super.onSaveInstanceState());
        w1Var.c = this.f;
        if (this.e != null) {
            w1Var.d = null;
        }
        return w1Var;
    }

    @Override
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.x;
            u(i, i3, i5, i5);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        pr7 pr7Var;
        float f;
        if (!this.f0) {
            boolean z = false;
            if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (pr7Var = this.e) == null || pr7Var.b() == 0) {
                return false;
            }
            VelocityTracker velocityTracker = this.a0;
            if (velocityTracker == null) {
                velocityTracker = VelocityTracker.obtain();
                this.a0 = velocityTracker;
            }
            velocityTracker.addMovement(motionEvent);
            int action = motionEvent.getAction() & 255;
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action != 3) {
                            if (action != 5) {
                                if (action == 6) {
                                    o(motionEvent);
                                    this.S = motionEvent.getX(motionEvent.findPointerIndex(this.W));
                                }
                            } else {
                                int actionIndex = motionEvent.getActionIndex();
                                this.S = motionEvent.getX(actionIndex);
                                this.W = motionEvent.getPointerId(actionIndex);
                            }
                        } else if (this.N) {
                            w(this.f, 0, true, false);
                            z = v();
                        }
                    } else {
                        if (!this.N) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.W);
                            if (findPointerIndex == -1) {
                                z = v();
                            } else {
                                float x = motionEvent.getX(findPointerIndex);
                                float abs = Math.abs(x - this.S);
                                float y = motionEvent.getY(findPointerIndex);
                                float abs2 = Math.abs(y - this.T);
                                int i = this.R;
                                if (abs > i && abs > abs2) {
                                    this.N = true;
                                    ViewParent parent = getParent();
                                    if (parent != null) {
                                        parent.requestDisallowInterceptTouchEvent(true);
                                    }
                                    float f2 = this.U;
                                    if (x - f2 > 0.0f) {
                                        f = f2 + i;
                                    } else {
                                        f = f2 - i;
                                    }
                                    this.S = f;
                                    this.T = y;
                                    setScrollState(1);
                                    setScrollingCacheEnabled(true);
                                    ViewParent parent2 = getParent();
                                    if (parent2 != null) {
                                        parent2.requestDisallowInterceptTouchEvent(true);
                                    }
                                }
                            }
                        }
                        if (this.N) {
                            z = r(motionEvent.getX(motionEvent.findPointerIndex(this.W)));
                        }
                    }
                } else if (this.N) {
                    VelocityTracker velocityTracker2 = this.a0;
                    velocityTracker2.computeCurrentVelocity(1000, this.c0);
                    int xVelocity = (int) velocityTracker2.getXVelocity(this.W);
                    this.L = true;
                    int clientWidth = getClientWidth();
                    int scrollX = getScrollX();
                    cec l = l();
                    float f3 = clientWidth;
                    y(g(l.b, xVelocity, ((scrollX / f3) - l.e) / (l.d + (this.x / f3)), (int) (motionEvent.getX(motionEvent.findPointerIndex(this.W)) - this.U)), xVelocity, true, true);
                    z = v();
                }
            } else {
                this.r.abortAnimation();
                this.L = false;
                s();
                float x2 = motionEvent.getX();
                this.U = x2;
                this.S = x2;
                float y2 = motionEvent.getY();
                this.V = y2;
                this.T = y2;
                this.W = motionEvent.getPointerId(0);
            }
            if (z) {
                WeakHashMap weakHashMap = jdc.a;
                postInvalidateOnAnimation();
            }
        }
        return true;
    }

    public final boolean p() {
        pr7 pr7Var = this.e;
        if (pr7Var != null && this.f < pr7Var.b() - 1) {
            x(this.f + 1, true);
            return true;
        }
        return false;
    }

    public final boolean q(int i) {
        if (this.b.size() == 0) {
            if (!this.i0) {
                this.j0 = false;
                n(0.0f, 0, 0);
                if (!this.j0) {
                    sc8.j("onPageScrolled did not call superclass implementation");
                    return false;
                }
            }
            return false;
        }
        cec l = l();
        int clientWidth = getClientWidth();
        int i2 = this.x;
        int i3 = clientWidth + i2;
        float f = clientWidth;
        int i4 = l.b;
        float f2 = ((i / f) - l.e) / (l.d + (i2 / f));
        this.j0 = false;
        n(f2, i4, (int) (i3 * f2));
        if (this.j0) {
            return true;
        }
        sc8.j("onPageScrolled did not call superclass implementation");
        return false;
    }

    public final boolean r(float f) {
        boolean z;
        boolean z2;
        float f2 = this.S - f;
        this.S = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.G * clientWidth;
        float f4 = this.H * clientWidth;
        ArrayList arrayList = this.b;
        boolean z3 = false;
        cec cecVar = (cec) arrayList.get(0);
        cec cecVar2 = (cec) b00.f(1, arrayList);
        if (cecVar.b != 0) {
            f3 = cecVar.e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (cecVar2.b != this.e.b() - 1) {
            f4 = cecVar2.e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.g0.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.h0.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.S = (scrollX - i) + this.S;
        scrollTo(i, getScrollY());
        q(i);
        return z3;
    }

    @Override
    public final void removeView(View view) {
        if (this.J) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final void s() {
        t(this.f);
    }

    public void setAdapter(pr7 pr7Var) {
        ArrayList arrayList = this.b;
        pr7 pr7Var2 = this.e;
        if (pr7Var2 != null) {
            synchronized (pr7Var2) {
                pr7Var2.b = null;
            }
            this.e.getClass();
            for (int i = 0; i < arrayList.size(); i++) {
                cec cecVar = (cec) arrayList.get(i);
                pr7 pr7Var3 = this.e;
                int i2 = cecVar.b;
                pr7Var3.a(this, cecVar.a);
            }
            this.e.getClass();
            arrayList.clear();
            int i3 = 0;
            while (i3 < getChildCount()) {
                if (!((dec) getChildAt(i3).getLayoutParams()).a) {
                    removeViewAt(i3);
                    i3--;
                }
                i3++;
            }
            this.f = 0;
            scrollTo(0, 0);
        }
        this.e = pr7Var;
        this.a = 0;
        if (pr7Var != null) {
            c43 c43Var = this.w;
            if (c43Var == null) {
                c43Var = new c43(this, (byte) 3);
                this.w = c43Var;
            }
            this.e.i(c43Var);
            this.L = false;
            boolean z = this.i0;
            this.i0 = true;
            this.a = this.e.b();
            if (this.h >= 0) {
                this.e.getClass();
                y(this.h, 0, false, true);
                this.h = -1;
                this.n = null;
            } else if (!z) {
                s();
            } else {
                requestLayout();
            }
        }
    }

    public void setCurrentItem(int i) {
        this.L = false;
        y(i, 0, !this.i0, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.M) {
            this.M = i;
            s();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(eec eecVar) {
        this.m0 = eecVar;
    }

    public void setPageMargin(int i) {
        int i2 = this.x;
        this.x = i;
        int width = getWidth();
        u(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        boolean z;
        this.y = drawable;
        if (drawable != null) {
            refreshDrawableState();
            z = false;
        } else {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setScrollState(int i) {
        boolean z;
        byte b;
        if (this.s0 != i) {
            this.s0 = i;
            if (this.n0 != null) {
                if (i != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (z) {
                        b = this.o0;
                    } else {
                        b = 0;
                    }
                    getChildAt(i2).setLayerType(b, null);
                }
            }
            eec eecVar = this.m0;
            if (eecVar != null) {
                eecVar.c(i);
            }
            ArrayList arrayList = this.l0;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    eec eecVar2 = (eec) this.l0.get(i3);
                    if (eecVar2 != null) {
                        eecVar2.c(i);
                    }
                }
            }
        }
    }

    public final void t(int r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gec.t(int):void");
    }

    public final void u(int i, int i2, int i3, int i4) {
        float f;
        if (i2 > 0 && !this.b.isEmpty()) {
            if (!this.r.isFinished()) {
                this.r.setFinalX(getCurrentItem() * getClientWidth());
                return;
            }
            scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
            return;
        }
        cec m = m(this.f);
        if (m != null) {
            f = Math.min(m.e, this.H);
        } else {
            f = 0.0f;
        }
        int paddingLeft = (int) (f * ((i - getPaddingLeft()) - getPaddingRight()));
        if (paddingLeft != getScrollX()) {
            e(false);
            scrollTo(paddingLeft, getScrollY());
        }
    }

    public final boolean v() {
        this.W = -1;
        this.N = false;
        this.O = false;
        VelocityTracker velocityTracker = this.a0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.a0 = null;
        }
        this.g0.onRelease();
        this.h0.onRelease();
        if (!this.g0.isFinished() && !this.h0.isFinished()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.y) {
            return false;
        }
        return true;
    }

    public final void w(int i, int i2, boolean z, boolean z2) {
        int i3;
        int scrollX;
        int abs;
        cec m = m(i);
        if (m != null) {
            i3 = (int) (Math.max(this.G, Math.min(m.e, this.H)) * getClientWidth());
        } else {
            i3 = 0;
        }
        if (z) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                Scroller scroller = this.r;
                if (scroller != null && !scroller.isFinished()) {
                    boolean z3 = this.s;
                    Scroller scroller2 = this.r;
                    if (z3) {
                        scrollX = scroller2.getCurrX();
                    } else {
                        scrollX = scroller2.getStartX();
                    }
                    this.r.abortAnimation();
                    setScrollingCacheEnabled(false);
                } else {
                    scrollX = getScrollX();
                }
                int i4 = scrollX;
                int scrollY = getScrollY();
                int i5 = i3 - i4;
                int i6 = 0 - scrollY;
                if (i5 == 0 && i6 == 0) {
                    e(false);
                    s();
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int clientWidth = getClientWidth();
                    int i7 = clientWidth / 2;
                    float f = clientWidth;
                    float f2 = i7;
                    float sin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i5) * 1.0f) / f) - 0.5f) * 0.47123894f)) * f2) + f2;
                    int abs2 = Math.abs(i2);
                    if (abs2 > 0) {
                        abs = Math.round(Math.abs(sin / abs2) * 1000.0f) << 2;
                    } else {
                        this.e.getClass();
                        abs = (int) (((Math.abs(i5) / ((f * 1.0f) + this.x)) + 1.0f) * 100.0f);
                    }
                    int min = Math.min(abs, 600);
                    this.s = false;
                    this.r.startScroll(i4, scrollY, i5, i6, min);
                    WeakHashMap weakHashMap = jdc.a;
                    postInvalidateOnAnimation();
                }
            }
            if (z2) {
                h(i);
                return;
            }
            return;
        }
        if (z2) {
            h(i);
        }
        e(false);
        scrollTo(i3, 0);
        q(i3);
    }

    public void x(int i, boolean z) {
        this.L = false;
        y(i, 0, z, false);
    }

    public final void y(int i, int i2, boolean z, boolean z2) {
        pr7 pr7Var = this.e;
        boolean z3 = false;
        if (pr7Var != null && pr7Var.b() > 0) {
            ArrayList arrayList = this.b;
            if (!z2 && this.f == i && arrayList.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i < 0) {
                i = 0;
            } else if (i >= this.e.b()) {
                i = this.e.b() - 1;
            }
            int i3 = this.M;
            int i4 = this.f;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    ((cec) arrayList.get(i5)).c = true;
                }
            }
            if (this.f != i) {
                z3 = true;
            }
            if (this.i0) {
                this.f = i;
                if (z3) {
                    h(i);
                }
                requestLayout();
                return;
            }
            t(i);
            w(i, i2, z, z3);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    public final void z() {
        if (this.p0 != 0) {
            ArrayList arrayList = this.q0;
            if (arrayList == null) {
                this.q0 = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.q0.add(getChildAt(i));
            }
            Collections.sort(this.q0, w0);
        }
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getDrawable(i));
    }

    @Override
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }
}
