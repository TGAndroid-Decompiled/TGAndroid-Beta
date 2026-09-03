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
import b7.r;
import f2.a0;
import f2.m1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import kf.k0;
import lh.m5;
import r0.b0;
import r0.j0;
public class h extends ViewGroup {
    public static final int[] f13707p0 = {16842931};
    public static final r f13708q0 = new r(4);
    public static final a0 f13709r0 = new a0(4);
    public static final r f13710s0 = new r(5);
    public int B;
    public float C;
    public float D;
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public boolean J;
    public boolean K;
    public final int L;
    public int M;
    public final int N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public int S;
    public VelocityTracker T;
    public final int U;
    public final int V;
    public final int W;
    public int f13711a;
    public final int f13712a0;
    public final ArrayList f13713b;
    public boolean f13714b0;
    public final d f13715c;
    public EdgeEffect f13716c0;
    public final Rect d;
    public EdgeEffect f13717d0;
    public a e;
    public boolean f13718e0;
    public int f13719f;
    public boolean f13720f0;
    public int f13721g0;
    public int h;
    public ArrayList f13722h0;
    public f f13723i0;
    public m5 f13724j0;
    public int f13725k0;
    public int f13726l0;
    public ArrayList m0;
    public Parcelable f13727n;
    public final b f13728n0;
    public int f13729o0;
    public Scroller f13730r;
    public boolean f13731s;
    public h1.a v;
    public int f13732w;
    public Drawable f13733x;
    public int f13734y;

    public h(Context context) {
        super(context);
        this.f13713b = new ArrayList();
        this.f13715c = new Object();
        this.d = new Rect();
        this.h = -1;
        this.f13727n = null;
        this.C = -3.4028235E38f;
        this.D = Float.MAX_VALUE;
        this.I = 1;
        this.S = -1;
        this.f13718e0 = true;
        this.f13728n0 = new b(this, 0);
        this.f13729o0 = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.f13730r = new Scroller(context2, f13709r0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f10 = context2.getResources().getDisplayMetrics().density;
        this.N = viewConfiguration.getScaledPagingTouchSlop();
        this.U = (int) (400.0f * f10);
        this.V = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f13716c0 = new EdgeEffect(context2);
        this.f13717d0 = new EdgeEffect(context2);
        this.W = (int) (25.0f * f10);
        this.f13712a0 = (int) (2.0f * f10);
        this.L = (int) (f10 * 16.0f);
        j0.k(this, new m1(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        b0.j(this, new f7.b(this));
    }

    public static boolean d(int i10, int i11, int i12, View view, boolean z4) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && d(i10, i14 - childAt.getLeft(), i13 - childAt.getTop(), childAt, true)) {
                    break;
                }
            }
        }
        if (z4 && view.canScrollHorizontally(-i10)) {
            return true;
        }
        return false;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z4) {
        if (this.G != z4) {
            this.G = z4;
        }
    }

    public final d a(int i10, int i11) {
        ?? obj = new Object();
        obj.f13700b = i10;
        obj.f13699a = this.e.e(this, i10);
        this.e.getClass();
        obj.d = 1.0f;
        ArrayList arrayList = this.f13713b;
        if (i11 >= 0 && i11 < arrayList.size()) {
            arrayList.add(i11, obj);
            return obj;
        }
        arrayList.add(obj);
        return obj;
    }

    @Override
    public final void addFocusables(ArrayList arrayList, int i10, int i11) {
        d k10;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (k10 = k(childAt)) != null && k10.f13700b == this.f13719f) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override
    public final void addTouchables(ArrayList arrayList) {
        d k10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (k10 = k(childAt)) != null && k10.f13700b == this.f13719f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        boolean z4;
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        e eVar = (e) layoutParams;
        boolean z10 = eVar.f13702a;
        if (view.getClass().getAnnotation(c.class) != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z11 = z10 | z4;
        eVar.f13702a = z11;
        if (this.F) {
            if (!z11) {
                eVar.d = true;
                addViewInLayout(view, i10, layoutParams);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        super.addView(view, i10, layoutParams);
    }

    public final void b(f fVar) {
        if (this.f13722h0 == null) {
            this.f13722h0 = new ArrayList();
        }
        this.f13722h0.add(fVar);
    }

    public final boolean c(int r8) {
        throw new UnsupportedOperationException("Method not decompiled: m2.h.c(int):boolean");
    }

    @Override
    public final boolean canScrollHorizontally(int i10) {
        if (this.e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i10 < 0) {
            if (scrollX <= ((int) (clientWidth * this.C))) {
                return false;
            }
            return true;
        } else if (i10 <= 0 || scrollX >= ((int) (clientWidth * this.D))) {
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
        this.f13731s = true;
        if (!this.f13730r.isFinished() && this.f13730r.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f13730r.getCurrX();
            int currY = this.f13730r.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!q(currX)) {
                    this.f13730r.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            WeakHashMap weakHashMap = j0.f43142a;
            postInvalidateOnAnimation();
            return;
        }
        e(true);
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: m2.h.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        d k10;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (k10 = k(childAt)) != null && k10.f13700b == this.f13719f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
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
        boolean z4 = false;
        if (overScrollMode != 0 && (overScrollMode != 1 || (aVar = this.e) == null || aVar.b() <= 1)) {
            this.f13716c0.finish();
            this.f13717d0.finish();
        } else {
            if (!this.f13716c0.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.C * width);
                this.f13716c0.setSize(height, width);
                z4 = this.f13716c0.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f13717d0.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.D + 1.0f)) * width2);
                this.f13717d0.setSize(height2, width2);
                z4 |= this.f13717d0.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
        if (z4) {
            WeakHashMap weakHashMap = j0.f43142a;
            postInvalidateOnAnimation();
        }
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f13733x;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public final void e(boolean z4) {
        boolean z10;
        if (this.f13729o0 == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            setScrollingCacheEnabled(false);
            if (!this.f13730r.isFinished()) {
                this.f13730r.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f13730r.getCurrX();
                int currY = this.f13730r.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        q(currX);
                    }
                }
            }
        }
        this.H = false;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f13713b;
            if (i10 >= arrayList.size()) {
                break;
            }
            d dVar = (d) arrayList.get(i10);
            if (dVar.f13701c) {
                dVar.f13701c = false;
                z10 = true;
            }
            i10++;
        }
        if (z10) {
            b bVar = this.f13728n0;
            if (z4) {
                WeakHashMap weakHashMap = j0.f43142a;
                postOnAnimation(bVar);
                return;
            }
            bVar.run();
        }
    }

    public final void f() {
        boolean z4;
        int b10 = this.e.b();
        this.f13711a = b10;
        ArrayList arrayList = this.f13713b;
        if (arrayList.size() < (this.I * 2) + 1 && arrayList.size() < b10) {
            z4 = true;
        } else {
            z4 = false;
        }
        int i10 = this.f13719f;
        int i11 = 0;
        boolean z10 = false;
        while (i11 < arrayList.size()) {
            d dVar = (d) arrayList.get(i11);
            int c3 = this.e.c(dVar.f13699a);
            if (c3 != -1) {
                if (c3 == -2) {
                    arrayList.remove(i11);
                    i11--;
                    if (!z10) {
                        this.e.getClass();
                        z10 = true;
                    }
                    this.e.a(this, dVar.f13699a);
                    int i12 = this.f13719f;
                    if (i12 == dVar.f13700b) {
                        i10 = Math.max(0, Math.min(i12, b10 - 1));
                    }
                } else {
                    int i13 = dVar.f13700b;
                    if (i13 != c3) {
                        if (i13 == this.f13719f) {
                            i10 = c3;
                        }
                        dVar.f13700b = c3;
                    }
                }
                z4 = true;
            }
            i11++;
        }
        if (z10) {
            this.e.getClass();
        }
        Collections.sort(arrayList, f13708q0);
        if (z4) {
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                e eVar = (e) getChildAt(i14).getLayoutParams();
                if (!eVar.f13702a) {
                    eVar.f13704c = 0.0f;
                }
            }
            y(i10, 0, false, true);
            requestLayout();
        }
    }

    public final int g(int i10, int i11, float f10, int i12) {
        float f11;
        if (Math.abs(i12) > this.W && Math.abs(i11) > this.U) {
            if (i11 <= 0) {
                i10++;
            }
        } else {
            if (i10 >= this.f13719f) {
                f11 = 0.4f;
            } else {
                f11 = 0.6f;
            }
            i10 += (int) (f10 + f11);
        }
        ArrayList arrayList = this.f13713b;
        if (arrayList.size() > 0) {
            return Math.max(((d) arrayList.get(0)).f13700b, Math.min(i10, ((d) k0.i(1, arrayList)).f13700b));
        }
        return i10;
    }

    @Override
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ?? layoutParams = new ViewGroup.LayoutParams(-1, -1);
        layoutParams.f13704c = 0.0f;
        return layoutParams;
    }

    @Override
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public a getAdapter() {
        return this.e;
    }

    @Override
    public final int getChildDrawingOrder(int i10, int i11) {
        if (this.f13726l0 == 2) {
            i11 = (i10 - 1) - i11;
        }
        return ((e) ((View) this.m0.get(i11)).getLayoutParams()).f13705f;
    }

    public int getCurrentItem() {
        return this.f13719f;
    }

    public int getOffscreenPageLimit() {
        return this.I;
    }

    public int getPageMargin() {
        return this.f13732w;
    }

    public final void h(int i10) {
        f fVar = this.f13723i0;
        if (fVar != null) {
            fVar.a(i10);
        }
        ArrayList arrayList = this.f13722h0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                f fVar2 = (f) this.f13722h0.get(i11);
                if (fVar2 != null) {
                    fVar2.a(i10);
                }
            }
        }
    }

    public final void i() {
        if (this.f13714b0) {
            if (this.e != null) {
                VelocityTracker velocityTracker = this.T;
                velocityTracker.computeCurrentVelocity(1000, this.V);
                int xVelocity = (int) velocityTracker.getXVelocity(this.S);
                this.H = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                d l10 = l();
                y(g(l10.f13700b, xVelocity, ((scrollX / clientWidth) - l10.e) / l10.d, (int) (this.O - this.Q)), xVelocity, true, true);
            }
            this.J = false;
            this.K = false;
            VelocityTracker velocityTracker2 = this.T;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.T = null;
            }
            this.f13714b0 = false;
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
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f13713b;
            if (i10 < arrayList.size()) {
                d dVar = (d) arrayList.get(i10);
                if (this.e.f(view, dVar.f13699a)) {
                    return dVar;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public final m2.d l() {
        throw new UnsupportedOperationException("Method not decompiled: m2.h.l():m2.d");
    }

    public final d m(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f13713b;
            if (i11 < arrayList.size()) {
                d dVar = (d) arrayList.get(i11);
                if (dVar.f13700b == i10) {
                    return dVar;
                }
                i11++;
            } else {
                return null;
            }
        }
    }

    public final void n(float r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: m2.h.n(float, int, int):void");
    }

    public final void o(MotionEvent motionEvent) {
        int i10;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.S) {
            if (actionIndex == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.O = motionEvent.getX(i10);
            this.S = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.T;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f13718e0 = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f13728n0);
        Scroller scroller = this.f13730r;
        if (scroller != null && !scroller.isFinished()) {
            this.f13730r.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int width;
        int i10;
        float f10;
        ArrayList arrayList;
        int i11;
        super.onDraw(canvas);
        if (this.f13732w > 0 && this.f13733x != null) {
            ArrayList arrayList2 = this.f13713b;
            if (arrayList2.size() > 0 && this.e != null) {
                int scrollX = getScrollX();
                float width2 = getWidth();
                float f11 = this.f13732w / width2;
                int i12 = 0;
                d dVar = (d) arrayList2.get(0);
                float f12 = dVar.e;
                int size = arrayList2.size();
                int i13 = dVar.f13700b;
                int i14 = ((d) arrayList2.get(size - 1)).f13700b;
                while (i13 < i14) {
                    while (true) {
                        i10 = dVar.f13700b;
                        if (i13 <= i10 || i12 >= size) {
                            break;
                        }
                        i12++;
                        dVar = (d) arrayList2.get(i12);
                    }
                    if (i13 == i10) {
                        float f13 = dVar.e;
                        float f14 = dVar.d;
                        f10 = (f13 + f14) * width2;
                        f12 = f13 + f14 + f11;
                    } else {
                        this.e.getClass();
                        f10 = (f12 + 1.0f) * width2;
                        f12 = 1.0f + f11 + f12;
                    }
                    if (this.f13732w + f10 > scrollX) {
                        arrayList = arrayList2;
                        i11 = scrollX;
                        this.f13733x.setBounds(Math.round(f10), this.f13734y, Math.round(this.f13732w + f10), this.B);
                        this.f13733x.draw(canvas);
                    } else {
                        arrayList = arrayList2;
                        i11 = scrollX;
                    }
                    if (f10 <= i11 + width) {
                        i13++;
                        arrayList2 = arrayList;
                        scrollX = i11;
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
                if (this.J) {
                    return true;
                }
                if (this.K) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        o(motionEvent);
                    }
                } else {
                    int i10 = this.S;
                    if (i10 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i10);
                        float x10 = motionEvent.getX(findPointerIndex);
                        float f11 = x10 - this.O;
                        float abs = Math.abs(f11);
                        float y10 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y10 - this.R);
                        int i11 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
                        if (i11 != 0) {
                            float f12 = this.O;
                            if ((f12 >= this.M || i11 <= 0) && ((f12 <= getWidth() - this.M || f11 >= 0.0f) && d((int) f11, (int) x10, (int) y10, this, false))) {
                                this.O = x10;
                                this.P = y10;
                                this.K = true;
                                return false;
                            }
                        }
                        int i12 = this.N;
                        float f13 = i12;
                        if (abs > f13 && abs * 0.5f > abs2) {
                            this.J = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            setScrollState(1);
                            float f14 = this.Q;
                            float f15 = i12;
                            if (i11 > 0) {
                                f10 = f14 + f15;
                            } else {
                                f10 = f14 - f15;
                            }
                            this.O = f10;
                            this.P = y10;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > f13) {
                            this.K = true;
                        }
                        if (this.J && r(x10)) {
                            WeakHashMap weakHashMap = j0.f43142a;
                            postInvalidateOnAnimation();
                        }
                    }
                }
            } else {
                float x11 = motionEvent.getX();
                this.Q = x11;
                this.O = x11;
                float y11 = motionEvent.getY();
                this.R = y11;
                this.P = y11;
                this.S = motionEvent.getPointerId(0);
                this.K = false;
                this.f13731s = true;
                this.f13730r.computeScrollOffset();
                if (this.f13729o0 == 2 && Math.abs(this.f13730r.getFinalX() - this.f13730r.getCurrX()) > this.f13712a0) {
                    this.f13730r.abortAnimation();
                    this.H = false;
                    s();
                    this.J = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                } else {
                    e(false);
                    this.J = false;
                }
            }
            if (this.T == null) {
                this.T = VelocityTracker.obtain();
            }
            this.T.addMovement(motionEvent);
            return this.J;
        }
        v();
        return false;
    }

    @Override
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: m2.h.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: m2.h.onMeasure(int, int):void");
    }

    @Override
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        int i13;
        d k10;
        int childCount = getChildCount();
        if ((i10 & 2) != 0) {
            i12 = childCount;
            i11 = 0;
            i13 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (k10 = k(childAt)) != null && k10.f13700b == this.f13719f && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i13;
        }
        return false;
    }

    @Override
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.f7217a);
        if (this.e != null) {
            y(gVar.f13706c, 0, false, true);
            return;
        }
        this.h = gVar.f13706c;
        this.f13727n = gVar.d;
    }

    @Override
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new i1.b(super.onSaveInstanceState());
        bVar.f13706c = this.f13719f;
        if (this.e != null) {
            bVar.d = null;
        }
        return bVar;
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.f13732w;
            u(i10, i12, i14, i14);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        float f10;
        if (!this.f13714b0) {
            boolean z4 = false;
            if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.e) == null || aVar.b() == 0) {
                return false;
            }
            if (this.T == null) {
                this.T = VelocityTracker.obtain();
            }
            this.T.addMovement(motionEvent);
            int action = motionEvent.getAction() & 255;
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action != 3) {
                            if (action != 5) {
                                if (action == 6) {
                                    o(motionEvent);
                                    this.O = motionEvent.getX(motionEvent.findPointerIndex(this.S));
                                }
                            } else {
                                int actionIndex = motionEvent.getActionIndex();
                                this.O = motionEvent.getX(actionIndex);
                                this.S = motionEvent.getPointerId(actionIndex);
                            }
                        } else if (this.J) {
                            w(this.f13719f, 0, true, false);
                            z4 = v();
                        }
                    } else {
                        if (!this.J) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.S);
                            if (findPointerIndex == -1) {
                                z4 = v();
                            } else {
                                float x10 = motionEvent.getX(findPointerIndex);
                                float abs = Math.abs(x10 - this.O);
                                float y10 = motionEvent.getY(findPointerIndex);
                                float abs2 = Math.abs(y10 - this.P);
                                int i10 = this.N;
                                if (abs > i10 && abs > abs2) {
                                    this.J = true;
                                    ViewParent parent = getParent();
                                    if (parent != null) {
                                        parent.requestDisallowInterceptTouchEvent(true);
                                    }
                                    float f11 = this.Q;
                                    if (x10 - f11 > 0.0f) {
                                        f10 = f11 + i10;
                                    } else {
                                        f10 = f11 - i10;
                                    }
                                    this.O = f10;
                                    this.P = y10;
                                    setScrollState(1);
                                    setScrollingCacheEnabled(true);
                                    ViewParent parent2 = getParent();
                                    if (parent2 != null) {
                                        parent2.requestDisallowInterceptTouchEvent(true);
                                    }
                                }
                            }
                        }
                        if (this.J) {
                            z4 = r(motionEvent.getX(motionEvent.findPointerIndex(this.S)));
                        }
                    }
                } else if (this.J) {
                    VelocityTracker velocityTracker = this.T;
                    velocityTracker.computeCurrentVelocity(1000, this.V);
                    int xVelocity = (int) velocityTracker.getXVelocity(this.S);
                    this.H = true;
                    int clientWidth = getClientWidth();
                    int scrollX = getScrollX();
                    d l10 = l();
                    float f12 = clientWidth;
                    y(g(l10.f13700b, xVelocity, ((scrollX / f12) - l10.e) / (l10.d + (this.f13732w / f12)), (int) (motionEvent.getX(motionEvent.findPointerIndex(this.S)) - this.Q)), xVelocity, true, true);
                    z4 = v();
                }
            } else {
                this.f13730r.abortAnimation();
                this.H = false;
                s();
                float x11 = motionEvent.getX();
                this.Q = x11;
                this.O = x11;
                float y11 = motionEvent.getY();
                this.R = y11;
                this.P = y11;
                this.S = motionEvent.getPointerId(0);
            }
            if (z4) {
                WeakHashMap weakHashMap = j0.f43142a;
                postInvalidateOnAnimation();
            }
        }
        return true;
    }

    public final boolean p() {
        a aVar = this.e;
        if (aVar != null && this.f13719f < aVar.b() - 1) {
            x(this.f13719f + 1, true);
            return true;
        }
        return false;
    }

    public final boolean q(int i10) {
        if (this.f13713b.size() == 0) {
            if (!this.f13718e0) {
                this.f13720f0 = false;
                n(0.0f, 0, 0);
                if (!this.f13720f0) {
                    throw new IllegalStateException("onPageScrolled did not call superclass implementation");
                }
            }
            return false;
        }
        d l10 = l();
        int clientWidth = getClientWidth();
        int i11 = this.f13732w;
        int i12 = clientWidth + i11;
        float f10 = clientWidth;
        int i13 = l10.f13700b;
        float f11 = ((i10 / f10) - l10.e) / (l10.d + (i11 / f10));
        this.f13720f0 = false;
        n(f11, i13, (int) (i12 * f11));
        if (this.f13720f0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean r(float f10) {
        boolean z4;
        boolean z10;
        float f11 = this.O - f10;
        this.O = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.C * clientWidth;
        float f13 = this.D * clientWidth;
        ArrayList arrayList = this.f13713b;
        boolean z11 = false;
        d dVar = (d) arrayList.get(0);
        d dVar2 = (d) k0.i(1, arrayList);
        if (dVar.f13700b != 0) {
            f12 = dVar.e * clientWidth;
            z4 = false;
        } else {
            z4 = true;
        }
        if (dVar2.f13700b != this.e.b() - 1) {
            f13 = dVar2.e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (scrollX < f12) {
            if (z4) {
                this.f13716c0.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z11 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z10) {
                this.f13717d0.onPull(Math.abs(scrollX - f13) / clientWidth);
                z11 = true;
            }
            scrollX = f13;
        }
        int i10 = (int) scrollX;
        this.O = (scrollX - i10) + this.O;
        scrollTo(i10, getScrollY());
        q(i10);
        return z11;
    }

    @Override
    public final void removeView(View view) {
        if (this.F) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final void s() {
        t(this.f13719f);
    }

    public void setAdapter(a aVar) {
        ArrayList arrayList = this.f13713b;
        a aVar2 = this.e;
        if (aVar2 != null) {
            synchronized (aVar2) {
                aVar2.f13696b = null;
            }
            this.e.getClass();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                d dVar = (d) arrayList.get(i10);
                a aVar3 = this.e;
                int i11 = dVar.f13700b;
                aVar3.a(this, dVar.f13699a);
            }
            this.e.getClass();
            arrayList.clear();
            int i12 = 0;
            while (i12 < getChildCount()) {
                if (!((e) getChildAt(i12).getLayoutParams()).f13702a) {
                    removeViewAt(i12);
                    i12--;
                }
                i12++;
            }
            this.f13719f = 0;
            scrollTo(0, 0);
        }
        this.e = aVar;
        this.f13711a = 0;
        if (aVar != null) {
            if (this.v == null) {
                this.v = new h1.a(this, 2);
            }
            this.e.i(this.v);
            this.H = false;
            boolean z4 = this.f13718e0;
            this.f13718e0 = true;
            this.f13711a = this.e.b();
            if (this.h >= 0) {
                this.e.getClass();
                y(this.h, 0, false, true);
                this.h = -1;
                this.f13727n = null;
            } else if (!z4) {
                s();
            } else {
                requestLayout();
            }
        }
    }

    public void setCurrentItem(int i10) {
        this.H = false;
        y(i10, 0, !this.f13718e0, false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.I) {
            this.I = i10;
            s();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(f fVar) {
        this.f13723i0 = fVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.f13732w;
        this.f13732w = i10;
        int width = getWidth();
        u(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f13733x = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i10) {
        boolean z4;
        int i11;
        if (this.f13729o0 != i10) {
            this.f13729o0 = i10;
            if (this.f13724j0 != null) {
                if (i10 != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                int childCount = getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    if (z4) {
                        i11 = this.f13725k0;
                    } else {
                        i11 = 0;
                    }
                    getChildAt(i12).setLayerType(i11, null);
                }
            }
            f fVar = this.f13723i0;
            if (fVar != null) {
                fVar.c(i10);
            }
            ArrayList arrayList = this.f13722h0;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    f fVar2 = (f) this.f13722h0.get(i13);
                    if (fVar2 != null) {
                        fVar2.c(i10);
                    }
                }
            }
        }
    }

    public final void t(int r18) {
        throw new UnsupportedOperationException("Method not decompiled: m2.h.t(int):void");
    }

    public final void u(int i10, int i11, int i12, int i13) {
        float f10;
        if (i11 > 0 && !this.f13713b.isEmpty()) {
            if (!this.f13730r.isFinished()) {
                this.f13730r.setFinalX(getCurrentItem() * getClientWidth());
                return;
            }
            scrollTo((int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)), getScrollY());
            return;
        }
        d m9 = m(this.f13719f);
        if (m9 != null) {
            f10 = Math.min(m9.e, this.D);
        } else {
            f10 = 0.0f;
        }
        int paddingLeft = (int) (f10 * ((i10 - getPaddingLeft()) - getPaddingRight()));
        if (paddingLeft != getScrollX()) {
            e(false);
            scrollTo(paddingLeft, getScrollY());
        }
    }

    public final boolean v() {
        this.S = -1;
        this.J = false;
        this.K = false;
        VelocityTracker velocityTracker = this.T;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.T = null;
        }
        this.f13716c0.onRelease();
        this.f13717d0.onRelease();
        if (!this.f13716c0.isFinished() && !this.f13717d0.isFinished()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f13733x) {
            return false;
        }
        return true;
    }

    public final void w(int i10, int i11, boolean z4, boolean z10) {
        int i12;
        int scrollX;
        int abs;
        d m9 = m(i10);
        if (m9 != null) {
            i12 = (int) (Math.max(this.C, Math.min(m9.e, this.D)) * getClientWidth());
        } else {
            i12 = 0;
        }
        if (z4) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                Scroller scroller = this.f13730r;
                if (scroller != null && !scroller.isFinished()) {
                    if (this.f13731s) {
                        scrollX = this.f13730r.getCurrX();
                    } else {
                        scrollX = this.f13730r.getStartX();
                    }
                    this.f13730r.abortAnimation();
                    setScrollingCacheEnabled(false);
                } else {
                    scrollX = getScrollX();
                }
                int i13 = scrollX;
                int scrollY = getScrollY();
                int i14 = i12 - i13;
                int i15 = 0 - scrollY;
                if (i14 == 0 && i15 == 0) {
                    e(false);
                    s();
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int clientWidth = getClientWidth();
                    int i16 = clientWidth / 2;
                    float f10 = clientWidth;
                    float f11 = i16;
                    float sin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i14) * 1.0f) / f10) - 0.5f) * 0.47123894f)) * f11) + f11;
                    int abs2 = Math.abs(i11);
                    if (abs2 > 0) {
                        abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
                    } else {
                        this.e.getClass();
                        abs = (int) (((Math.abs(i14) / ((f10 * 1.0f) + this.f13732w)) + 1.0f) * 100.0f);
                    }
                    int min = Math.min(abs, 600);
                    this.f13731s = false;
                    this.f13730r.startScroll(i13, scrollY, i14, i15, min);
                    WeakHashMap weakHashMap = j0.f43142a;
                    postInvalidateOnAnimation();
                }
            }
            if (z10) {
                h(i10);
                return;
            }
            return;
        }
        if (z10) {
            h(i10);
        }
        e(false);
        scrollTo(i12, 0);
        q(i12);
    }

    public void x(int i10, boolean z4) {
        this.H = false;
        y(i10, 0, z4, false);
    }

    public final void y(int i10, int i11, boolean z4, boolean z10) {
        a aVar = this.e;
        boolean z11 = false;
        if (aVar != null && aVar.b() > 0) {
            ArrayList arrayList = this.f13713b;
            if (!z10 && this.f13719f == i10 && arrayList.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i10 < 0) {
                i10 = 0;
            } else if (i10 >= this.e.b()) {
                i10 = this.e.b() - 1;
            }
            int i12 = this.I;
            int i13 = this.f13719f;
            if (i10 > i13 + i12 || i10 < i13 - i12) {
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    ((d) arrayList.get(i14)).f13701c = true;
                }
            }
            if (this.f13719f != i10) {
                z11 = true;
            }
            if (this.f13718e0) {
                this.f13719f = i10;
                if (z11) {
                    h(i10);
                }
                requestLayout();
                return;
            }
            t(i10);
            w(i10, i11, z4, z11);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    public final void z() {
        if (this.f13726l0 != 0) {
            ArrayList arrayList = this.m0;
            if (arrayList == null) {
                this.m0 = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.m0.add(getChildAt(i10));
            }
            Collections.sort(this.m0, f13710s0);
        }
    }

    @Override
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? layoutParams = new ViewGroup.LayoutParams(context, attributeSet);
        layoutParams.f13704c = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f13707p0);
        layoutParams.f13703b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(getContext().getDrawable(i10));
    }
}
