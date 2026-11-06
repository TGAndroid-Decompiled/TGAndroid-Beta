package c5;

import a8.ra;
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
import bi.sd;
import di.q4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import q4.q;
import r0.a0;
import r0.i0;
public class k extends ViewGroup {
    public static final int[] f5323s0 = {16842931};
    public static final b f5324t0 = new b(0);
    public static final sd f5325u0 = new sd(1);
    public static final b f5326v0 = new b(1);
    public int D;
    public int E;
    public float F;
    public float G;
    public int H;
    public boolean I;
    public boolean J;
    public boolean K;
    public int L;
    public boolean M;
    public boolean N;
    public final int O;
    public int P;
    public final int Q;
    public float R;
    public float S;
    public float T;
    public float U;
    public int V;
    public VelocityTracker W;
    public int f5327a;
    public final int f5328a0;
    public final ArrayList f5329b;
    public final int f5330b0;
    public final d f5331c;
    public final int f5332c0;
    public final Rect d;
    public final int f5333d0;
    public a f5334e;
    public boolean f5335e0;
    public int f5336f;
    public EdgeEffect f5337f0;
    public EdgeEffect f5338g0;
    public int h;
    public boolean f5339h0;
    public boolean f5340i0;
    public int f5341j0;
    public ArrayList f5342k0;
    public g f5343l0;
    public q4 m0;
    public Parcelable f5344n;
    public int f5345n0;
    public int f5346o0;
    public ArrayList f5347p0;
    public final ra f5348q0;
    public Scroller f5349r;
    public int f5350r0;
    public boolean f5351s;
    public h f5352w;
    public int f5353x;
    public Drawable f5354y;

    public k(Context context) {
        super(context);
        this.f5329b = new ArrayList();
        this.f5331c = new Object();
        this.d = new Rect();
        this.h = -1;
        this.f5344n = null;
        this.F = -3.4028235E38f;
        this.G = Float.MAX_VALUE;
        this.L = 1;
        this.V = -1;
        this.f5339h0 = true;
        this.f5348q0 = new ra(this, 13);
        this.f5350r0 = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.f5349r = new Scroller(context2, f5325u0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f10 = context2.getResources().getDisplayMetrics().density;
        this.Q = viewConfiguration.getScaledPagingTouchSlop();
        this.f5328a0 = (int) (400.0f * f10);
        this.f5330b0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f5337f0 = new EdgeEffect(context2);
        this.f5338g0 = new EdgeEffect(context2);
        this.f5332c0 = (int) (25.0f * f10);
        this.f5333d0 = (int) (2.0f * f10);
        this.O = (int) (f10 * 16.0f);
        i0.j(this, new f(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        a0.i(this, new q(this));
    }

    public static boolean d(int i7, int i10, int i11, View view, boolean z9) {
        int i12;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i13 = i10 + scrollX;
                if (i13 >= childAt.getLeft() && i13 < childAt.getRight() && (i12 = i11 + scrollY) >= childAt.getTop() && i12 < childAt.getBottom() && d(i7, i13 - childAt.getLeft(), i12 - childAt.getTop(), childAt, true)) {
                    break;
                }
            }
        }
        if (z9 && view.canScrollHorizontally(-i7)) {
            return true;
        }
        return false;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z9) {
        if (this.J != z9) {
            this.J = z9;
        }
    }

    public final d a(int i7, int i10) {
        ?? obj = new Object();
        obj.f5309b = i7;
        obj.f5308a = this.f5334e.e(this, i7);
        this.f5334e.getClass();
        obj.d = 1.0f;
        ArrayList arrayList = this.f5329b;
        if (i10 >= 0 && i10 < arrayList.size()) {
            arrayList.add(i10, obj);
            return obj;
        }
        arrayList.add(obj);
        return obj;
    }

    @Override
    public final void addFocusables(ArrayList arrayList, int i7, int i10) {
        d k10;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() == 0 && (k10 = k(childAt)) != null && k10.f5309b == this.f5336f) {
                    childAt.addFocusables(arrayList, i7, i10);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i10 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override
    public final void addTouchables(ArrayList arrayList) {
        d k10;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 0 && (k10 = k(childAt)) != null && k10.f5309b == this.f5336f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        boolean z9;
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        e eVar = (e) layoutParams;
        boolean z10 = eVar.f5312a;
        if (view.getClass().getAnnotation(c.class) != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z11 = z10 | z9;
        eVar.f5312a = z11;
        if (this.I) {
            if (!z11) {
                eVar.d = true;
                addViewInLayout(view, i7, layoutParams);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        super.addView(view, i7, layoutParams);
    }

    public final void b(g gVar) {
        if (this.f5342k0 == null) {
            this.f5342k0 = new ArrayList();
        }
        this.f5342k0.add(gVar);
    }

    public final boolean c(int r8) {
        throw new UnsupportedOperationException("Method not decompiled: c5.k.c(int):boolean");
    }

    @Override
    public final boolean canScrollHorizontally(int i7) {
        if (this.f5334e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i7 < 0) {
            if (scrollX <= ((int) (clientWidth * this.F))) {
                return false;
            }
            return true;
        } else if (i7 <= 0 || scrollX >= ((int) (clientWidth * this.G))) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof e) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override
    public final void computeScroll() {
        this.f5351s = true;
        if (!this.f5349r.isFinished() && this.f5349r.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f5349r.getCurrX();
            int currY = this.f5349r.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!q(currX)) {
                    this.f5349r.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            WeakHashMap weakHashMap = i0.f54098a;
            postInvalidateOnAnimation();
            return;
        }
        e(true);
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: c5.k.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        d k10;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 0 && (k10 = k(childAt)) != null && k10.f5309b == this.f5336f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void draw(Canvas canvas) {
        a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z9 = false;
        if (overScrollMode != 0 && (overScrollMode != 1 || (aVar = this.f5334e) == null || aVar.b() <= 1)) {
            this.f5337f0.finish();
            this.f5338g0.finish();
        } else {
            if (!this.f5337f0.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.F * width);
                this.f5337f0.setSize(height, width);
                z9 = this.f5337f0.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f5338g0.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.G + 1.0f)) * width2);
                this.f5338g0.setSize(height2, width2);
                z9 |= this.f5338g0.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
        if (z9) {
            WeakHashMap weakHashMap = i0.f54098a;
            postInvalidateOnAnimation();
        }
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f5354y;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public final void e(boolean z9) {
        boolean z10;
        if (this.f5350r0 == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            setScrollingCacheEnabled(false);
            if (!this.f5349r.isFinished()) {
                this.f5349r.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f5349r.getCurrX();
                int currY = this.f5349r.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        q(currX);
                    }
                }
            }
        }
        this.K = false;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f5329b;
            if (i7 >= arrayList.size()) {
                break;
            }
            d dVar = (d) arrayList.get(i7);
            if (dVar.f5310c) {
                dVar.f5310c = false;
                z10 = true;
            }
            i7++;
        }
        if (z10) {
            ra raVar = this.f5348q0;
            if (z9) {
                WeakHashMap weakHashMap = i0.f54098a;
                postOnAnimation(raVar);
                return;
            }
            raVar.run();
        }
    }

    public final void f() {
        boolean z9;
        int b10 = this.f5334e.b();
        this.f5327a = b10;
        ArrayList arrayList = this.f5329b;
        if (arrayList.size() < (this.L * 2) + 1 && arrayList.size() < b10) {
            z9 = true;
        } else {
            z9 = false;
        }
        int i7 = this.f5336f;
        int i10 = 0;
        boolean z10 = false;
        while (i10 < arrayList.size()) {
            d dVar = (d) arrayList.get(i10);
            int c10 = this.f5334e.c(dVar.f5308a);
            if (c10 != -1) {
                if (c10 == -2) {
                    arrayList.remove(i10);
                    i10--;
                    if (!z10) {
                        this.f5334e.getClass();
                        z10 = true;
                    }
                    this.f5334e.a(this, dVar.f5308a);
                    int i11 = this.f5336f;
                    if (i11 == dVar.f5309b) {
                        i7 = Math.max(0, Math.min(i11, b10 - 1));
                    }
                } else {
                    int i12 = dVar.f5309b;
                    if (i12 != c10) {
                        if (i12 == this.f5336f) {
                            i7 = c10;
                        }
                        dVar.f5309b = c10;
                    }
                }
                z9 = true;
            }
            i10++;
        }
        if (z10) {
            this.f5334e.getClass();
        }
        Collections.sort(arrayList, f5324t0);
        if (z9) {
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                e eVar = (e) getChildAt(i13).getLayoutParams();
                if (!eVar.f5312a) {
                    eVar.f5314c = 0.0f;
                }
            }
            y(i7, 0, false, true);
            requestLayout();
        }
    }

    public final int g(int i7, int i10, float f10, int i11) {
        float f11;
        if (Math.abs(i11) > this.f5332c0 && Math.abs(i10) > this.f5328a0) {
            if (i10 <= 0) {
                i7++;
            }
        } else {
            if (i7 >= this.f5336f) {
                f11 = 0.4f;
            } else {
                f11 = 0.6f;
            }
            i7 += (int) (f10 + f11);
        }
        ArrayList arrayList = this.f5329b;
        if (arrayList.size() > 0) {
            return Math.max(((d) arrayList.get(0)).f5309b, Math.min(i7, ((d) jg.g.i(1, arrayList)).f5309b));
        }
        return i7;
    }

    @Override
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ?? layoutParams = new ViewGroup.LayoutParams(-1, -1);
        layoutParams.f5314c = 0.0f;
        return layoutParams;
    }

    @Override
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public a getAdapter() {
        return this.f5334e;
    }

    @Override
    public final int getChildDrawingOrder(int i7, int i10) {
        if (this.f5346o0 == 2) {
            i10 = (i7 - 1) - i10;
        }
        return ((e) ((View) this.f5347p0.get(i10)).getLayoutParams()).f5316f;
    }

    public int getCurrentItem() {
        return this.f5336f;
    }

    public int getOffscreenPageLimit() {
        return this.L;
    }

    public int getPageMargin() {
        return this.f5353x;
    }

    public final void h(int i7) {
        g gVar = this.f5343l0;
        if (gVar != null) {
            gVar.a(i7);
        }
        ArrayList arrayList = this.f5342k0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                g gVar2 = (g) this.f5342k0.get(i10);
                if (gVar2 != null) {
                    gVar2.a(i7);
                }
            }
        }
    }

    public final void i() {
        if (this.f5335e0) {
            if (this.f5334e != null) {
                VelocityTracker velocityTracker = this.W;
                velocityTracker.computeCurrentVelocity(1000, this.f5330b0);
                int xVelocity = (int) velocityTracker.getXVelocity(this.V);
                this.K = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                d l10 = l();
                y(g(l10.f5309b, xVelocity, ((scrollX / clientWidth) - l10.f5311e) / l10.d, (int) (this.R - this.T)), xVelocity, true, true);
            }
            this.M = false;
            this.N = false;
            VelocityTracker velocityTracker2 = this.W;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.W = null;
            }
            this.f5335e0 = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
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

    public final d k(View view) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f5329b;
            if (i7 < arrayList.size()) {
                d dVar = (d) arrayList.get(i7);
                if (this.f5334e.f(view, dVar.f5308a)) {
                    return dVar;
                }
                i7++;
            } else {
                return null;
            }
        }
    }

    public final c5.d l() {
        throw new UnsupportedOperationException("Method not decompiled: c5.k.l():c5.d");
    }

    public final d m(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f5329b;
            if (i10 < arrayList.size()) {
                d dVar = (d) arrayList.get(i10);
                if (dVar.f5309b == i7) {
                    return dVar;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public final void n(float r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: c5.k.n(float, int, int):void");
    }

    public final void o(MotionEvent motionEvent) {
        int i7;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.V) {
            if (actionIndex == 0) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            this.R = motionEvent.getX(i7);
            this.V = motionEvent.getPointerId(i7);
            VelocityTracker velocityTracker = this.W;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5339h0 = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f5348q0);
        Scroller scroller = this.f5349r;
        if (scroller != null && !scroller.isFinished()) {
            this.f5349r.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int width;
        int i7;
        float f10;
        ArrayList arrayList;
        int i10;
        super.onDraw(canvas);
        if (this.f5353x > 0 && this.f5354y != null) {
            ArrayList arrayList2 = this.f5329b;
            if (arrayList2.size() > 0 && this.f5334e != null) {
                int scrollX = getScrollX();
                float width2 = getWidth();
                float f11 = this.f5353x / width2;
                int i11 = 0;
                d dVar = (d) arrayList2.get(0);
                float f12 = dVar.f5311e;
                int size = arrayList2.size();
                int i12 = dVar.f5309b;
                int i13 = ((d) arrayList2.get(size - 1)).f5309b;
                while (i12 < i13) {
                    while (true) {
                        i7 = dVar.f5309b;
                        if (i12 <= i7 || i11 >= size) {
                            break;
                        }
                        i11++;
                        dVar = (d) arrayList2.get(i11);
                    }
                    if (i12 == i7) {
                        float f13 = dVar.f5311e;
                        float f14 = dVar.d;
                        f10 = (f13 + f14) * width2;
                        f12 = f13 + f14 + f11;
                    } else {
                        this.f5334e.getClass();
                        f10 = (f12 + 1.0f) * width2;
                        f12 = 1.0f + f11 + f12;
                    }
                    if (this.f5353x + f10 > scrollX) {
                        arrayList = arrayList2;
                        i10 = scrollX;
                        this.f5354y.setBounds(Math.round(f10), this.D, Math.round(this.f5353x + f10), this.E);
                        this.f5354y.draw(canvas);
                    } else {
                        arrayList = arrayList2;
                        i10 = scrollX;
                    }
                    if (f10 <= i10 + width) {
                        i12++;
                        arrayList2 = arrayList;
                        scrollX = i10;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f10;
        int action = motionEvent.getAction() & 255;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.M) {
                    return true;
                }
                if (this.N) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        o(motionEvent);
                    }
                } else {
                    int i7 = this.V;
                    if (i7 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i7);
                        float x10 = motionEvent.getX(findPointerIndex);
                        float f11 = x10 - this.R;
                        float abs = Math.abs(f11);
                        float y10 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y10 - this.U);
                        int i10 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
                        if (i10 != 0) {
                            float f12 = this.R;
                            if ((f12 >= this.P || i10 <= 0) && ((f12 <= getWidth() - this.P || f11 >= 0.0f) && d((int) f11, (int) x10, (int) y10, this, false))) {
                                this.R = x10;
                                this.S = y10;
                                this.N = true;
                                return false;
                            }
                        }
                        int i11 = this.Q;
                        float f13 = i11;
                        if (abs > f13 && abs * 0.5f > abs2) {
                            this.M = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            setScrollState(1);
                            float f14 = this.T;
                            float f15 = i11;
                            if (i10 > 0) {
                                f10 = f14 + f15;
                            } else {
                                f10 = f14 - f15;
                            }
                            this.R = f10;
                            this.S = y10;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > f13) {
                            this.N = true;
                        }
                        if (this.M && r(x10)) {
                            WeakHashMap weakHashMap = i0.f54098a;
                            postInvalidateOnAnimation();
                        }
                    }
                }
            } else {
                float x11 = motionEvent.getX();
                this.T = x11;
                this.R = x11;
                float y11 = motionEvent.getY();
                this.U = y11;
                this.S = y11;
                this.V = motionEvent.getPointerId(0);
                this.N = false;
                this.f5351s = true;
                this.f5349r.computeScrollOffset();
                if (this.f5350r0 == 2 && Math.abs(this.f5349r.getFinalX() - this.f5349r.getCurrX()) > this.f5333d0) {
                    this.f5349r.abortAnimation();
                    this.K = false;
                    s();
                    this.M = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                } else {
                    e(false);
                    this.M = false;
                }
            }
            if (this.W == null) {
                this.W = VelocityTracker.obtain();
            }
            this.W.addMovement(motionEvent);
            return this.M;
        }
        v();
        return false;
    }

    @Override
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: c5.k.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: c5.k.onMeasure(int, int):void");
    }

    @Override
    public final boolean onRequestFocusInDescendants(int i7, Rect rect) {
        int i10;
        int i11;
        int i12;
        d k10;
        int childCount = getChildCount();
        if ((i7 & 2) != 0) {
            i11 = childCount;
            i10 = 0;
            i12 = 1;
        } else {
            i10 = childCount - 1;
            i11 = -1;
            i12 = -1;
        }
        while (i10 != i11) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (k10 = k(childAt)) != null && k10.f5309b == this.f5336f && childAt.requestFocus(i7, rect)) {
                return true;
            }
            i10 += i12;
        }
        return false;
    }

    @Override
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.f16402a);
        if (this.f5334e != null) {
            y(jVar.f5321c, 0, false, true);
            return;
        }
        this.h = jVar.f5321c;
        this.f5344n = jVar.d;
    }

    @Override
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new j1.b(super.onSaveInstanceState());
        bVar.f5321c = this.f5336f;
        if (this.f5334e != null) {
            bVar.d = null;
        }
        return bVar;
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (i7 != i11) {
            int i13 = this.f5353x;
            u(i7, i11, i13, i13);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        float f10;
        if (!this.f5335e0) {
            boolean z9 = false;
            if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.f5334e) == null || aVar.b() == 0) {
                return false;
            }
            if (this.W == null) {
                this.W = VelocityTracker.obtain();
            }
            this.W.addMovement(motionEvent);
            int action = motionEvent.getAction() & 255;
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action != 3) {
                            if (action != 5) {
                                if (action == 6) {
                                    o(motionEvent);
                                    this.R = motionEvent.getX(motionEvent.findPointerIndex(this.V));
                                }
                            } else {
                                int actionIndex = motionEvent.getActionIndex();
                                this.R = motionEvent.getX(actionIndex);
                                this.V = motionEvent.getPointerId(actionIndex);
                            }
                        } else if (this.M) {
                            w(this.f5336f, 0, true, false);
                            z9 = v();
                        }
                    } else {
                        if (!this.M) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.V);
                            if (findPointerIndex == -1) {
                                z9 = v();
                            } else {
                                float x10 = motionEvent.getX(findPointerIndex);
                                float abs = Math.abs(x10 - this.R);
                                float y10 = motionEvent.getY(findPointerIndex);
                                float abs2 = Math.abs(y10 - this.S);
                                int i7 = this.Q;
                                if (abs > i7 && abs > abs2) {
                                    this.M = true;
                                    ViewParent parent = getParent();
                                    if (parent != null) {
                                        parent.requestDisallowInterceptTouchEvent(true);
                                    }
                                    float f11 = this.T;
                                    if (x10 - f11 > 0.0f) {
                                        f10 = f11 + i7;
                                    } else {
                                        f10 = f11 - i7;
                                    }
                                    this.R = f10;
                                    this.S = y10;
                                    setScrollState(1);
                                    setScrollingCacheEnabled(true);
                                    ViewParent parent2 = getParent();
                                    if (parent2 != null) {
                                        parent2.requestDisallowInterceptTouchEvent(true);
                                    }
                                }
                            }
                        }
                        if (this.M) {
                            z9 = r(motionEvent.getX(motionEvent.findPointerIndex(this.V)));
                        }
                    }
                } else if (this.M) {
                    VelocityTracker velocityTracker = this.W;
                    velocityTracker.computeCurrentVelocity(1000, this.f5330b0);
                    int xVelocity = (int) velocityTracker.getXVelocity(this.V);
                    this.K = true;
                    int clientWidth = getClientWidth();
                    int scrollX = getScrollX();
                    d l10 = l();
                    float f12 = clientWidth;
                    y(g(l10.f5309b, xVelocity, ((scrollX / f12) - l10.f5311e) / (l10.d + (this.f5353x / f12)), (int) (motionEvent.getX(motionEvent.findPointerIndex(this.V)) - this.T)), xVelocity, true, true);
                    z9 = v();
                }
            } else {
                this.f5349r.abortAnimation();
                this.K = false;
                s();
                float x11 = motionEvent.getX();
                this.T = x11;
                this.R = x11;
                float y11 = motionEvent.getY();
                this.U = y11;
                this.S = y11;
                this.V = motionEvent.getPointerId(0);
            }
            if (z9) {
                WeakHashMap weakHashMap = i0.f54098a;
                postInvalidateOnAnimation();
            }
        }
        return true;
    }

    public final boolean p() {
        a aVar = this.f5334e;
        if (aVar != null && this.f5336f < aVar.b() - 1) {
            x(this.f5336f + 1, true);
            return true;
        }
        return false;
    }

    public final boolean q(int i7) {
        if (this.f5329b.size() == 0) {
            if (!this.f5339h0) {
                this.f5340i0 = false;
                n(0.0f, 0, 0);
                if (!this.f5340i0) {
                    throw new IllegalStateException("onPageScrolled did not call superclass implementation");
                }
            }
            return false;
        }
        d l10 = l();
        int clientWidth = getClientWidth();
        int i10 = this.f5353x;
        int i11 = clientWidth + i10;
        float f10 = clientWidth;
        int i12 = l10.f5309b;
        float f11 = ((i7 / f10) - l10.f5311e) / (l10.d + (i10 / f10));
        this.f5340i0 = false;
        n(f11, i12, (int) (i11 * f11));
        if (this.f5340i0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean r(float f10) {
        boolean z9;
        boolean z10;
        float f11 = this.R - f10;
        this.R = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.F * clientWidth;
        float f13 = this.G * clientWidth;
        ArrayList arrayList = this.f5329b;
        boolean z11 = false;
        d dVar = (d) arrayList.get(0);
        d dVar2 = (d) jg.g.i(1, arrayList);
        if (dVar.f5309b != 0) {
            f12 = dVar.f5311e * clientWidth;
            z9 = false;
        } else {
            z9 = true;
        }
        if (dVar2.f5309b != this.f5334e.b() - 1) {
            f13 = dVar2.f5311e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (scrollX < f12) {
            if (z9) {
                this.f5337f0.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z11 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z10) {
                this.f5338g0.onPull(Math.abs(scrollX - f13) / clientWidth);
                z11 = true;
            }
            scrollX = f13;
        }
        int i7 = (int) scrollX;
        this.R = (scrollX - i7) + this.R;
        scrollTo(i7, getScrollY());
        q(i7);
        return z11;
    }

    @Override
    public final void removeView(View view) {
        if (this.I) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final void s() {
        t(this.f5336f);
    }

    public void setAdapter(a aVar) {
        ArrayList arrayList = this.f5329b;
        a aVar2 = this.f5334e;
        if (aVar2 != null) {
            synchronized (aVar2) {
                aVar2.f5304b = null;
            }
            this.f5334e.getClass();
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                d dVar = (d) arrayList.get(i7);
                a aVar3 = this.f5334e;
                int i10 = dVar.f5309b;
                aVar3.a(this, dVar.f5308a);
            }
            this.f5334e.getClass();
            arrayList.clear();
            int i11 = 0;
            while (i11 < getChildCount()) {
                if (!((e) getChildAt(i11).getLayoutParams()).f5312a) {
                    removeViewAt(i11);
                    i11--;
                }
                i11++;
            }
            this.f5336f = 0;
            scrollTo(0, 0);
        }
        this.f5334e = aVar;
        this.f5327a = 0;
        if (aVar != null) {
            if (this.f5352w == null) {
                this.f5352w = new h(this, 0);
            }
            this.f5334e.i(this.f5352w);
            this.K = false;
            boolean z9 = this.f5339h0;
            this.f5339h0 = true;
            this.f5327a = this.f5334e.b();
            if (this.h >= 0) {
                this.f5334e.getClass();
                y(this.h, 0, false, true);
                this.h = -1;
                this.f5344n = null;
            } else if (!z9) {
                s();
            } else {
                requestLayout();
            }
        }
    }

    public void setCurrentItem(int i7) {
        this.K = false;
        y(i7, 0, !this.f5339h0, false);
    }

    public void setOffscreenPageLimit(int i7) {
        if (i7 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i7 + " too small; defaulting to 1");
            i7 = 1;
        }
        if (i7 != this.L) {
            this.L = i7;
            s();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(g gVar) {
        this.f5343l0 = gVar;
    }

    public void setPageMargin(int i7) {
        int i10 = this.f5353x;
        this.f5353x = i7;
        int width = getWidth();
        u(width, width, i7, i10);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f5354y = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i7) {
        boolean z9;
        int i10;
        if (this.f5350r0 != i7) {
            this.f5350r0 = i7;
            if (this.m0 != null) {
                if (i7 != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                int childCount = getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    if (z9) {
                        i10 = this.f5345n0;
                    } else {
                        i10 = 0;
                    }
                    getChildAt(i11).setLayerType(i10, null);
                }
            }
            g gVar = this.f5343l0;
            if (gVar != null) {
                gVar.c(i7);
            }
            ArrayList arrayList = this.f5342k0;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    g gVar2 = (g) this.f5342k0.get(i12);
                    if (gVar2 != null) {
                        gVar2.c(i7);
                    }
                }
            }
        }
    }

    public final void t(int r18) {
        throw new UnsupportedOperationException("Method not decompiled: c5.k.t(int):void");
    }

    public final void u(int i7, int i10, int i11, int i12) {
        float f10;
        if (i10 > 0 && !this.f5329b.isEmpty()) {
            if (!this.f5349r.isFinished()) {
                this.f5349r.setFinalX(getCurrentItem() * getClientWidth());
                return;
            }
            scrollTo((int) ((getScrollX() / (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)) * (((i7 - getPaddingLeft()) - getPaddingRight()) + i11)), getScrollY());
            return;
        }
        d m10 = m(this.f5336f);
        if (m10 != null) {
            f10 = Math.min(m10.f5311e, this.G);
        } else {
            f10 = 0.0f;
        }
        int paddingLeft = (int) (f10 * ((i7 - getPaddingLeft()) - getPaddingRight()));
        if (paddingLeft != getScrollX()) {
            e(false);
            scrollTo(paddingLeft, getScrollY());
        }
    }

    public final boolean v() {
        this.V = -1;
        this.M = false;
        this.N = false;
        VelocityTracker velocityTracker = this.W;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.W = null;
        }
        this.f5337f0.onRelease();
        this.f5338g0.onRelease();
        if (!this.f5337f0.isFinished() && !this.f5338g0.isFinished()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f5354y) {
            return false;
        }
        return true;
    }

    public final void w(int i7, int i10, boolean z9, boolean z10) {
        int i11;
        int scrollX;
        int abs;
        d m10 = m(i7);
        if (m10 != null) {
            i11 = (int) (Math.max(this.F, Math.min(m10.f5311e, this.G)) * getClientWidth());
        } else {
            i11 = 0;
        }
        if (z9) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                Scroller scroller = this.f5349r;
                if (scroller != null && !scroller.isFinished()) {
                    if (this.f5351s) {
                        scrollX = this.f5349r.getCurrX();
                    } else {
                        scrollX = this.f5349r.getStartX();
                    }
                    this.f5349r.abortAnimation();
                    setScrollingCacheEnabled(false);
                } else {
                    scrollX = getScrollX();
                }
                int i12 = scrollX;
                int scrollY = getScrollY();
                int i13 = i11 - i12;
                int i14 = 0 - scrollY;
                if (i13 == 0 && i14 == 0) {
                    e(false);
                    s();
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int clientWidth = getClientWidth();
                    int i15 = clientWidth / 2;
                    float f10 = clientWidth;
                    float f11 = i15;
                    float sin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i13) * 1.0f) / f10) - 0.5f) * 0.47123894f)) * f11) + f11;
                    int abs2 = Math.abs(i10);
                    if (abs2 > 0) {
                        abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
                    } else {
                        this.f5334e.getClass();
                        abs = (int) (((Math.abs(i13) / ((f10 * 1.0f) + this.f5353x)) + 1.0f) * 100.0f);
                    }
                    int min = Math.min(abs, 600);
                    this.f5351s = false;
                    this.f5349r.startScroll(i12, scrollY, i13, i14, min);
                    WeakHashMap weakHashMap = i0.f54098a;
                    postInvalidateOnAnimation();
                }
            }
            if (z10) {
                h(i7);
                return;
            }
            return;
        }
        if (z10) {
            h(i7);
        }
        e(false);
        scrollTo(i11, 0);
        q(i11);
    }

    public void x(int i7, boolean z9) {
        this.K = false;
        y(i7, 0, z9, false);
    }

    public final void y(int i7, int i10, boolean z9, boolean z10) {
        a aVar = this.f5334e;
        boolean z11 = false;
        if (aVar != null && aVar.b() > 0) {
            ArrayList arrayList = this.f5329b;
            if (!z10 && this.f5336f == i7 && arrayList.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i7 < 0) {
                i7 = 0;
            } else if (i7 >= this.f5334e.b()) {
                i7 = this.f5334e.b() - 1;
            }
            int i11 = this.L;
            int i12 = this.f5336f;
            if (i7 > i12 + i11 || i7 < i12 - i11) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    ((d) arrayList.get(i13)).f5310c = true;
                }
            }
            if (this.f5336f != i7) {
                z11 = true;
            }
            if (this.f5339h0) {
                this.f5336f = i7;
                if (z11) {
                    h(i7);
                }
                requestLayout();
                return;
            }
            t(i7);
            w(i7, i10, z9, z11);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    public final void z() {
        if (this.f5346o0 != 0) {
            ArrayList arrayList = this.f5347p0;
            if (arrayList == null) {
                this.f5347p0 = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                this.f5347p0.add(getChildAt(i7));
            }
            Collections.sort(this.f5347p0, f5326v0);
        }
    }

    @Override
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? layoutParams = new ViewGroup.LayoutParams(context, attributeSet);
        layoutParams.f5314c = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5323s0);
        layoutParams.f5313b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    public void setPageMarginDrawable(int i7) {
        setPageMarginDrawable(getContext().getDrawable(i7));
    }
}
