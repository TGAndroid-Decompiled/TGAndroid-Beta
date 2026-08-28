package m2;

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
import f2.c0;
import f2.r1;
import gh.i3;
import j3.r0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import r0.b0;
import r0.j0;
public class g extends ViewGroup {
    public static final int[] f17181o0 = {16842931};
    public static final d2.a f17182p0 = new d2.a(3);
    public static final c0 f17183q0 = new c0(4);
    public static final d2.a f17184r0 = new d2.a(4);
    public int A;
    public float B;
    public float C;
    public int D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public boolean I;
    public boolean J;
    public final int K;
    public int L;
    public final int M;
    public float N;
    public float O;
    public float P;
    public float Q;
    public int R;
    public VelocityTracker S;
    public final int T;
    public final int U;
    public final int V;
    public final int W;
    public int f17185a;
    public boolean f17186a0;
    public final ArrayList f17187b;
    public EdgeEffect f17188b0;
    public final c f17189c;
    public EdgeEffect f17190c0;
    public final Rect d;
    public boolean f17191d0;
    public a f17192e;
    public boolean f17193e0;
    public int f17194f;
    public int f17195f0;
    public ArrayList f17196g0;
    public int h;
    public e f17197h0;
    public i3 f17198i0;
    public int f17199j0;
    public int f17200k0;
    public ArrayList f17201l0;
    public final m.i3 m0;
    public Parcelable f17202n;
    public int f17203n0;
    public Scroller f17204r;
    public boolean f17205s;
    public h1.a v;
    public int f17206w;
    public Drawable f17207x;
    public int f17208y;

    public g(Context context) {
        super(context);
        this.f17187b = new ArrayList();
        this.f17189c = new Object();
        this.d = new Rect();
        this.h = -1;
        this.f17202n = null;
        this.B = -3.4028235E38f;
        this.C = Float.MAX_VALUE;
        this.H = 1;
        this.R = -1;
        this.f17191d0 = true;
        this.m0 = new m.i3(this, 1);
        this.f17203n0 = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.f17204r = new Scroller(context2, f17183q0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f10 = context2.getResources().getDisplayMetrics().density;
        this.M = viewConfiguration.getScaledPagingTouchSlop();
        this.T = (int) (400.0f * f10);
        this.U = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f17188b0 = new EdgeEffect(context2);
        this.f17190c0 = new EdgeEffect(context2);
        this.V = (int) (25.0f * f10);
        this.W = (int) (2.0f * f10);
        this.K = (int) (f10 * 16.0f);
        j0.k(this, new r1(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        b0.j(this, new g5.b(this));
    }

    public static boolean d(int i9, int i10, int i11, View view, boolean z10) {
        int i12;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i13 = i10 + scrollX;
                if (i13 >= childAt.getLeft() && i13 < childAt.getRight() && (i12 = i11 + scrollY) >= childAt.getTop() && i12 < childAt.getBottom() && d(i9, i13 - childAt.getLeft(), i12 - childAt.getTop(), childAt, true)) {
                    break;
                }
            }
        }
        if (z10 && view.canScrollHorizontally(-i9)) {
            return true;
        }
        return false;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.F != z10) {
            this.F = z10;
        }
    }

    public final c a(int i9, int i10) {
        ?? obj = new Object();
        obj.f17171b = i9;
        obj.f17170a = this.f17192e.e(this, i9);
        this.f17192e.getClass();
        obj.d = 1.0f;
        ArrayList arrayList = this.f17187b;
        if (i10 >= 0 && i10 < arrayList.size()) {
            arrayList.add(i10, obj);
            return obj;
        }
        arrayList.add(obj);
        return obj;
    }

    @Override
    public final void addFocusables(ArrayList arrayList, int i9, int i10) {
        c k10;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() == 0 && (k10 = k(childAt)) != null && k10.f17171b == this.f17194f) {
                    childAt.addFocusables(arrayList, i9, i10);
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
        c k10;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 0 && (k10 = k(childAt)) != null && k10.f17171b == this.f17194f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override
    public final void addView(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        boolean z10;
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        d dVar = (d) layoutParams;
        boolean z11 = dVar.f17174a;
        if (view.getClass().getAnnotation(b.class) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        dVar.f17174a = z12;
        if (this.E) {
            if (!z12) {
                dVar.d = true;
                addViewInLayout(view, i9, layoutParams);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        super.addView(view, i9, layoutParams);
    }

    public final void b(e eVar) {
        if (this.f17196g0 == null) {
            this.f17196g0 = new ArrayList();
        }
        this.f17196g0.add(eVar);
    }

    public final boolean c(int r8) {
        throw new UnsupportedOperationException("Method not decompiled: m2.g.c(int):boolean");
    }

    @Override
    public final boolean canScrollHorizontally(int i9) {
        if (this.f17192e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i9 < 0) {
            if (scrollX <= ((int) (clientWidth * this.B))) {
                return false;
            }
            return true;
        } else if (i9 <= 0 || scrollX >= ((int) (clientWidth * this.C))) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof d) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override
    public final void computeScroll() {
        this.f17205s = true;
        if (!this.f17204r.isFinished() && this.f17204r.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f17204r.getCurrX();
            int currY = this.f17204r.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!q(currX)) {
                    this.f17204r.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            WeakHashMap weakHashMap = j0.f46915a;
            postInvalidateOnAnimation();
            return;
        }
        e(true);
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: m2.g.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        c k10;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 0 && (k10 = k(childAt)) != null && k10.f17171b == this.f17194f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
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
        boolean z10 = false;
        if (overScrollMode != 0 && (overScrollMode != 1 || (aVar = this.f17192e) == null || aVar.b() <= 1)) {
            this.f17188b0.finish();
            this.f17190c0.finish();
        } else {
            if (!this.f17188b0.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.B * width);
                this.f17188b0.setSize(height, width);
                z10 = this.f17188b0.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f17190c0.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.C + 1.0f)) * width2);
                this.f17190c0.setSize(height2, width2);
                z10 |= this.f17190c0.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
        if (z10) {
            WeakHashMap weakHashMap = j0.f46915a;
            postInvalidateOnAnimation();
        }
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f17207x;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public final void e(boolean z10) {
        boolean z11;
        if (this.f17203n0 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.f17204r.isFinished()) {
                this.f17204r.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f17204r.getCurrX();
                int currY = this.f17204r.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        q(currX);
                    }
                }
            }
        }
        this.G = false;
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f17187b;
            if (i9 >= arrayList.size()) {
                break;
            }
            c cVar = (c) arrayList.get(i9);
            if (cVar.f17172c) {
                cVar.f17172c = false;
                z11 = true;
            }
            i9++;
        }
        if (z11) {
            m.i3 i3Var = this.m0;
            if (z10) {
                WeakHashMap weakHashMap = j0.f46915a;
                postOnAnimation(i3Var);
                return;
            }
            i3Var.run();
        }
    }

    public final void f() {
        boolean z10;
        int b10 = this.f17192e.b();
        this.f17185a = b10;
        ArrayList arrayList = this.f17187b;
        if (arrayList.size() < (this.H * 2) + 1 && arrayList.size() < b10) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i9 = this.f17194f;
        int i10 = 0;
        boolean z11 = false;
        while (i10 < arrayList.size()) {
            c cVar = (c) arrayList.get(i10);
            int c10 = this.f17192e.c(cVar.f17170a);
            if (c10 != -1) {
                if (c10 == -2) {
                    arrayList.remove(i10);
                    i10--;
                    if (!z11) {
                        this.f17192e.getClass();
                        z11 = true;
                    }
                    this.f17192e.a(this, cVar.f17170a);
                    int i11 = this.f17194f;
                    if (i11 == cVar.f17171b) {
                        i9 = Math.max(0, Math.min(i11, b10 - 1));
                    }
                } else {
                    int i12 = cVar.f17171b;
                    if (i12 != c10) {
                        if (i12 == this.f17194f) {
                            i9 = c10;
                        }
                        cVar.f17171b = c10;
                    }
                }
                z10 = true;
            }
            i10++;
        }
        if (z11) {
            this.f17192e.getClass();
        }
        Collections.sort(arrayList, f17182p0);
        if (z10) {
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                d dVar = (d) getChildAt(i13).getLayoutParams();
                if (!dVar.f17174a) {
                    dVar.f17176c = 0.0f;
                }
            }
            y(i9, 0, false, true);
            requestLayout();
        }
    }

    public final int g(int i9, int i10, float f10, int i11) {
        float f11;
        if (Math.abs(i11) > this.V && Math.abs(i10) > this.T) {
            if (i10 <= 0) {
                i9++;
            }
        } else {
            if (i9 >= this.f17194f) {
                f11 = 0.4f;
            } else {
                f11 = 0.6f;
            }
            i9 += (int) (f10 + f11);
        }
        ArrayList arrayList = this.f17187b;
        if (arrayList.size() > 0) {
            return Math.max(((c) arrayList.get(0)).f17171b, Math.min(i9, ((c) r0.j(1, arrayList)).f17171b));
        }
        return i9;
    }

    @Override
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ?? layoutParams = new ViewGroup.LayoutParams(-1, -1);
        layoutParams.f17176c = 0.0f;
        return layoutParams;
    }

    @Override
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public a getAdapter() {
        return this.f17192e;
    }

    @Override
    public final int getChildDrawingOrder(int i9, int i10) {
        if (this.f17200k0 == 2) {
            i10 = (i9 - 1) - i10;
        }
        return ((d) ((View) this.f17201l0.get(i10)).getLayoutParams()).f17178f;
    }

    public int getCurrentItem() {
        return this.f17194f;
    }

    public int getOffscreenPageLimit() {
        return this.H;
    }

    public int getPageMargin() {
        return this.f17206w;
    }

    public final void h(int i9) {
        e eVar = this.f17197h0;
        if (eVar != null) {
            eVar.b(i9);
        }
        ArrayList arrayList = this.f17196g0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar2 = (e) this.f17196g0.get(i10);
                if (eVar2 != null) {
                    eVar2.b(i9);
                }
            }
        }
    }

    public final void i() {
        if (this.f17186a0) {
            if (this.f17192e != null) {
                VelocityTracker velocityTracker = this.S;
                velocityTracker.computeCurrentVelocity(1000, this.U);
                int xVelocity = (int) velocityTracker.getXVelocity(this.R);
                this.G = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                c l10 = l();
                y(g(l10.f17171b, xVelocity, ((scrollX / clientWidth) - l10.f17173e) / l10.d, (int) (this.N - this.P)), xVelocity, true, true);
            }
            this.I = false;
            this.J = false;
            VelocityTracker velocityTracker2 = this.S;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.S = null;
            }
            this.f17186a0 = false;
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

    public final c k(View view) {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f17187b;
            if (i9 < arrayList.size()) {
                c cVar = (c) arrayList.get(i9);
                if (this.f17192e.f(view, cVar.f17170a)) {
                    return cVar;
                }
                i9++;
            } else {
                return null;
            }
        }
    }

    public final m2.c l() {
        throw new UnsupportedOperationException("Method not decompiled: m2.g.l():m2.c");
    }

    public final c m(int i9) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f17187b;
            if (i10 < arrayList.size()) {
                c cVar = (c) arrayList.get(i10);
                if (cVar.f17171b == i9) {
                    return cVar;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public final void n(float r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: m2.g.n(float, int, int):void");
    }

    public final void o(MotionEvent motionEvent) {
        int i9;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.R) {
            if (actionIndex == 0) {
                i9 = 1;
            } else {
                i9 = 0;
            }
            this.N = motionEvent.getX(i9);
            this.R = motionEvent.getPointerId(i9);
            VelocityTracker velocityTracker = this.S;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f17191d0 = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        removeCallbacks(this.m0);
        Scroller scroller = this.f17204r;
        if (scroller != null && !scroller.isFinished()) {
            this.f17204r.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int width;
        int i9;
        float f10;
        ArrayList arrayList;
        int i10;
        super.onDraw(canvas);
        if (this.f17206w > 0 && this.f17207x != null) {
            ArrayList arrayList2 = this.f17187b;
            if (arrayList2.size() > 0 && this.f17192e != null) {
                int scrollX = getScrollX();
                float width2 = getWidth();
                float f11 = this.f17206w / width2;
                int i11 = 0;
                c cVar = (c) arrayList2.get(0);
                float f12 = cVar.f17173e;
                int size = arrayList2.size();
                int i12 = cVar.f17171b;
                int i13 = ((c) arrayList2.get(size - 1)).f17171b;
                while (i12 < i13) {
                    while (true) {
                        i9 = cVar.f17171b;
                        if (i12 <= i9 || i11 >= size) {
                            break;
                        }
                        i11++;
                        cVar = (c) arrayList2.get(i11);
                    }
                    if (i12 == i9) {
                        float f13 = cVar.f17173e;
                        float f14 = cVar.d;
                        f10 = (f13 + f14) * width2;
                        f12 = f13 + f14 + f11;
                    } else {
                        this.f17192e.getClass();
                        f10 = (f12 + 1.0f) * width2;
                        f12 = 1.0f + f11 + f12;
                    }
                    if (this.f17206w + f10 > scrollX) {
                        arrayList = arrayList2;
                        i10 = scrollX;
                        this.f17207x.setBounds(Math.round(f10), this.f17208y, Math.round(this.f17206w + f10), this.A);
                        this.f17207x.draw(canvas);
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
                if (this.I) {
                    return true;
                }
                if (this.J) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        o(motionEvent);
                    }
                } else {
                    int i9 = this.R;
                    if (i9 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i9);
                        float x10 = motionEvent.getX(findPointerIndex);
                        float f11 = x10 - this.N;
                        float abs = Math.abs(f11);
                        float y10 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y10 - this.Q);
                        int i10 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
                        if (i10 != 0) {
                            float f12 = this.N;
                            if ((f12 >= this.L || i10 <= 0) && ((f12 <= getWidth() - this.L || f11 >= 0.0f) && d((int) f11, (int) x10, (int) y10, this, false))) {
                                this.N = x10;
                                this.O = y10;
                                this.J = true;
                                return false;
                            }
                        }
                        int i11 = this.M;
                        float f13 = i11;
                        if (abs > f13 && abs * 0.5f > abs2) {
                            this.I = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            setScrollState(1);
                            float f14 = this.P;
                            float f15 = i11;
                            if (i10 > 0) {
                                f10 = f14 + f15;
                            } else {
                                f10 = f14 - f15;
                            }
                            this.N = f10;
                            this.O = y10;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > f13) {
                            this.J = true;
                        }
                        if (this.I && r(x10)) {
                            WeakHashMap weakHashMap = j0.f46915a;
                            postInvalidateOnAnimation();
                        }
                    }
                }
            } else {
                float x11 = motionEvent.getX();
                this.P = x11;
                this.N = x11;
                float y11 = motionEvent.getY();
                this.Q = y11;
                this.O = y11;
                this.R = motionEvent.getPointerId(0);
                this.J = false;
                this.f17205s = true;
                this.f17204r.computeScrollOffset();
                if (this.f17203n0 == 2 && Math.abs(this.f17204r.getFinalX() - this.f17204r.getCurrX()) > this.W) {
                    this.f17204r.abortAnimation();
                    this.G = false;
                    s();
                    this.I = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                } else {
                    e(false);
                    this.I = false;
                }
            }
            if (this.S == null) {
                this.S = VelocityTracker.obtain();
            }
            this.S.addMovement(motionEvent);
            return this.I;
        }
        v();
        return false;
    }

    @Override
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: m2.g.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: m2.g.onMeasure(int, int):void");
    }

    @Override
    public final boolean onRequestFocusInDescendants(int i9, Rect rect) {
        int i10;
        int i11;
        int i12;
        c k10;
        int childCount = getChildCount();
        if ((i9 & 2) != 0) {
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
            if (childAt.getVisibility() == 0 && (k10 = k(childAt)) != null && k10.f17171b == this.f17194f && childAt.requestFocus(i9, rect)) {
                return true;
            }
            i10 += i12;
        }
        return false;
    }

    @Override
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.f10870a);
        if (this.f17192e != null) {
            y(fVar.f17179c, 0, false, true);
            return;
        }
        this.h = fVar.f17179c;
        this.f17202n = fVar.d;
    }

    @Override
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new i1.b(super.onSaveInstanceState());
        bVar.f17179c = this.f17194f;
        if (this.f17192e != null) {
            bVar.d = null;
        }
        return bVar;
    }

    @Override
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        if (i9 != i11) {
            int i13 = this.f17206w;
            u(i9, i11, i13, i13);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        float f10;
        if (!this.f17186a0) {
            boolean z10 = false;
            if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.f17192e) == null || aVar.b() == 0) {
                return false;
            }
            if (this.S == null) {
                this.S = VelocityTracker.obtain();
            }
            this.S.addMovement(motionEvent);
            int action = motionEvent.getAction() & 255;
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action != 3) {
                            if (action != 5) {
                                if (action == 6) {
                                    o(motionEvent);
                                    this.N = motionEvent.getX(motionEvent.findPointerIndex(this.R));
                                }
                            } else {
                                int actionIndex = motionEvent.getActionIndex();
                                this.N = motionEvent.getX(actionIndex);
                                this.R = motionEvent.getPointerId(actionIndex);
                            }
                        } else if (this.I) {
                            w(this.f17194f, 0, true, false);
                            z10 = v();
                        }
                    } else {
                        if (!this.I) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.R);
                            if (findPointerIndex == -1) {
                                z10 = v();
                            } else {
                                float x10 = motionEvent.getX(findPointerIndex);
                                float abs = Math.abs(x10 - this.N);
                                float y10 = motionEvent.getY(findPointerIndex);
                                float abs2 = Math.abs(y10 - this.O);
                                int i9 = this.M;
                                if (abs > i9 && abs > abs2) {
                                    this.I = true;
                                    ViewParent parent = getParent();
                                    if (parent != null) {
                                        parent.requestDisallowInterceptTouchEvent(true);
                                    }
                                    float f11 = this.P;
                                    if (x10 - f11 > 0.0f) {
                                        f10 = f11 + i9;
                                    } else {
                                        f10 = f11 - i9;
                                    }
                                    this.N = f10;
                                    this.O = y10;
                                    setScrollState(1);
                                    setScrollingCacheEnabled(true);
                                    ViewParent parent2 = getParent();
                                    if (parent2 != null) {
                                        parent2.requestDisallowInterceptTouchEvent(true);
                                    }
                                }
                            }
                        }
                        if (this.I) {
                            z10 = r(motionEvent.getX(motionEvent.findPointerIndex(this.R)));
                        }
                    }
                } else if (this.I) {
                    VelocityTracker velocityTracker = this.S;
                    velocityTracker.computeCurrentVelocity(1000, this.U);
                    int xVelocity = (int) velocityTracker.getXVelocity(this.R);
                    this.G = true;
                    int clientWidth = getClientWidth();
                    int scrollX = getScrollX();
                    c l10 = l();
                    float f12 = clientWidth;
                    y(g(l10.f17171b, xVelocity, ((scrollX / f12) - l10.f17173e) / (l10.d + (this.f17206w / f12)), (int) (motionEvent.getX(motionEvent.findPointerIndex(this.R)) - this.P)), xVelocity, true, true);
                    z10 = v();
                }
            } else {
                this.f17204r.abortAnimation();
                this.G = false;
                s();
                float x11 = motionEvent.getX();
                this.P = x11;
                this.N = x11;
                float y11 = motionEvent.getY();
                this.Q = y11;
                this.O = y11;
                this.R = motionEvent.getPointerId(0);
            }
            if (z10) {
                WeakHashMap weakHashMap = j0.f46915a;
                postInvalidateOnAnimation();
            }
        }
        return true;
    }

    public final boolean p() {
        a aVar = this.f17192e;
        if (aVar != null && this.f17194f < aVar.b() - 1) {
            x(this.f17194f + 1, true);
            return true;
        }
        return false;
    }

    public final boolean q(int i9) {
        if (this.f17187b.size() == 0) {
            if (!this.f17191d0) {
                this.f17193e0 = false;
                n(0.0f, 0, 0);
                if (!this.f17193e0) {
                    throw new IllegalStateException("onPageScrolled did not call superclass implementation");
                }
            }
            return false;
        }
        c l10 = l();
        int clientWidth = getClientWidth();
        int i10 = this.f17206w;
        int i11 = clientWidth + i10;
        float f10 = clientWidth;
        int i12 = l10.f17171b;
        float f11 = ((i9 / f10) - l10.f17173e) / (l10.d + (i10 / f10));
        this.f17193e0 = false;
        n(f11, i12, (int) (i11 * f11));
        if (this.f17193e0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean r(float f10) {
        boolean z10;
        boolean z11;
        float f11 = this.N - f10;
        this.N = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.B * clientWidth;
        float f13 = this.C * clientWidth;
        ArrayList arrayList = this.f17187b;
        boolean z12 = false;
        c cVar = (c) arrayList.get(0);
        c cVar2 = (c) r0.j(1, arrayList);
        if (cVar.f17171b != 0) {
            f12 = cVar.f17173e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (cVar2.f17171b != this.f17192e.b() - 1) {
            f13 = cVar2.f17173e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f12) {
            if (z10) {
                this.f17188b0.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z11) {
                this.f17190c0.onPull(Math.abs(scrollX - f13) / clientWidth);
                z12 = true;
            }
            scrollX = f13;
        }
        int i9 = (int) scrollX;
        this.N = (scrollX - i9) + this.N;
        scrollTo(i9, getScrollY());
        q(i9);
        return z12;
    }

    @Override
    public final void removeView(View view) {
        if (this.E) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final void s() {
        t(this.f17194f);
    }

    public void setAdapter(a aVar) {
        ArrayList arrayList = this.f17187b;
        a aVar2 = this.f17192e;
        if (aVar2 != null) {
            synchronized (aVar2) {
                aVar2.f17169b = null;
            }
            this.f17192e.getClass();
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                c cVar = (c) arrayList.get(i9);
                a aVar3 = this.f17192e;
                int i10 = cVar.f17171b;
                aVar3.a(this, cVar.f17170a);
            }
            this.f17192e.getClass();
            arrayList.clear();
            int i11 = 0;
            while (i11 < getChildCount()) {
                if (!((d) getChildAt(i11).getLayoutParams()).f17174a) {
                    removeViewAt(i11);
                    i11--;
                }
                i11++;
            }
            this.f17194f = 0;
            scrollTo(0, 0);
        }
        this.f17192e = aVar;
        this.f17185a = 0;
        if (aVar != null) {
            if (this.v == null) {
                this.v = new h1.a(this, 2);
            }
            this.f17192e.i(this.v);
            this.G = false;
            boolean z10 = this.f17191d0;
            this.f17191d0 = true;
            this.f17185a = this.f17192e.b();
            if (this.h >= 0) {
                this.f17192e.getClass();
                y(this.h, 0, false, true);
                this.h = -1;
                this.f17202n = null;
            } else if (!z10) {
                s();
            } else {
                requestLayout();
            }
        }
    }

    public void setCurrentItem(int i9) {
        this.G = false;
        y(i9, 0, !this.f17191d0, false);
    }

    public void setOffscreenPageLimit(int i9) {
        if (i9 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i9 + " too small; defaulting to 1");
            i9 = 1;
        }
        if (i9 != this.H) {
            this.H = i9;
            s();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(e eVar) {
        this.f17197h0 = eVar;
    }

    public void setPageMargin(int i9) {
        int i10 = this.f17206w;
        this.f17206w = i9;
        int width = getWidth();
        u(width, width, i9, i10);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f17207x = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i9) {
        boolean z10;
        int i10;
        if (this.f17203n0 != i9) {
            this.f17203n0 = i9;
            if (this.f17198i0 != null) {
                if (i9 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int childCount = getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    if (z10) {
                        i10 = this.f17199j0;
                    } else {
                        i10 = 0;
                    }
                    getChildAt(i11).setLayerType(i10, null);
                }
            }
            e eVar = this.f17197h0;
            if (eVar != null) {
                eVar.d(i9);
            }
            ArrayList arrayList = this.f17196g0;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    e eVar2 = (e) this.f17196g0.get(i12);
                    if (eVar2 != null) {
                        eVar2.d(i9);
                    }
                }
            }
        }
    }

    public final void t(int r18) {
        throw new UnsupportedOperationException("Method not decompiled: m2.g.t(int):void");
    }

    public final void u(int i9, int i10, int i11, int i12) {
        float f10;
        if (i10 > 0 && !this.f17187b.isEmpty()) {
            if (!this.f17204r.isFinished()) {
                this.f17204r.setFinalX(getCurrentItem() * getClientWidth());
                return;
            }
            scrollTo((int) ((getScrollX() / (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)) * (((i9 - getPaddingLeft()) - getPaddingRight()) + i11)), getScrollY());
            return;
        }
        c m10 = m(this.f17194f);
        if (m10 != null) {
            f10 = Math.min(m10.f17173e, this.C);
        } else {
            f10 = 0.0f;
        }
        int paddingLeft = (int) (f10 * ((i9 - getPaddingLeft()) - getPaddingRight()));
        if (paddingLeft != getScrollX()) {
            e(false);
            scrollTo(paddingLeft, getScrollY());
        }
    }

    public final boolean v() {
        this.R = -1;
        this.I = false;
        this.J = false;
        VelocityTracker velocityTracker = this.S;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.S = null;
        }
        this.f17188b0.onRelease();
        this.f17190c0.onRelease();
        if (!this.f17188b0.isFinished() && !this.f17190c0.isFinished()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f17207x) {
            return false;
        }
        return true;
    }

    public final void w(int i9, int i10, boolean z10, boolean z11) {
        int i11;
        int scrollX;
        int abs;
        c m10 = m(i9);
        if (m10 != null) {
            i11 = (int) (Math.max(this.B, Math.min(m10.f17173e, this.C)) * getClientWidth());
        } else {
            i11 = 0;
        }
        if (z10) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                Scroller scroller = this.f17204r;
                if (scroller != null && !scroller.isFinished()) {
                    if (this.f17205s) {
                        scrollX = this.f17204r.getCurrX();
                    } else {
                        scrollX = this.f17204r.getStartX();
                    }
                    this.f17204r.abortAnimation();
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
                        this.f17192e.getClass();
                        abs = (int) (((Math.abs(i13) / ((f10 * 1.0f) + this.f17206w)) + 1.0f) * 100.0f);
                    }
                    int min = Math.min(abs, 600);
                    this.f17205s = false;
                    this.f17204r.startScroll(i12, scrollY, i13, i14, min);
                    WeakHashMap weakHashMap = j0.f46915a;
                    postInvalidateOnAnimation();
                }
            }
            if (z11) {
                h(i9);
                return;
            }
            return;
        }
        if (z11) {
            h(i9);
        }
        e(false);
        scrollTo(i11, 0);
        q(i11);
    }

    public void x(int i9, boolean z10) {
        this.G = false;
        y(i9, 0, z10, false);
    }

    public final void y(int i9, int i10, boolean z10, boolean z11) {
        a aVar = this.f17192e;
        boolean z12 = false;
        if (aVar != null && aVar.b() > 0) {
            ArrayList arrayList = this.f17187b;
            if (!z11 && this.f17194f == i9 && arrayList.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i9 < 0) {
                i9 = 0;
            } else if (i9 >= this.f17192e.b()) {
                i9 = this.f17192e.b() - 1;
            }
            int i11 = this.H;
            int i12 = this.f17194f;
            if (i9 > i12 + i11 || i9 < i12 - i11) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    ((c) arrayList.get(i13)).f17172c = true;
                }
            }
            if (this.f17194f != i9) {
                z12 = true;
            }
            if (this.f17191d0) {
                this.f17194f = i9;
                if (z12) {
                    h(i9);
                }
                requestLayout();
                return;
            }
            t(i9);
            w(i9, i10, z10, z12);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    public final void z() {
        if (this.f17200k0 != 0) {
            ArrayList arrayList = this.f17201l0;
            if (arrayList == null) {
                this.f17201l0 = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                this.f17201l0.add(getChildAt(i9));
            }
            Collections.sort(this.f17201l0, f17184r0);
        }
    }

    @Override
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? layoutParams = new ViewGroup.LayoutParams(context, attributeSet);
        layoutParams.f17176c = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f17181o0);
        layoutParams.f17175b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    public void setPageMarginDrawable(int i9) {
        setPageMarginDrawable(getContext().getDrawable(i9));
    }
}
