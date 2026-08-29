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
import f2.a0;
import f2.o1;
import g9.l;
import j7.l1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import l4.s0;
import lh.m7;
import r0.b0;
import r0.j0;
public class g extends ViewGroup {
    public static final int[] f16779o0 = {16842931};
    public static final d2.a f16780p0 = new d2.a(3);
    public static final a0 f16781q0 = new a0(4);
    public static final d2.a f16782r0 = new d2.a(4);
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
    public int f16783a;
    public boolean f16784a0;
    public final ArrayList f16785b;
    public EdgeEffect f16786b0;
    public final c f16787c;
    public EdgeEffect f16788c0;
    public final Rect d;
    public boolean f16789d0;
    public a f16790e;
    public boolean f16791e0;
    public int f16792f;
    public int f16793f0;
    public ArrayList f16794g0;
    public int h;
    public e f16795h0;
    public s0 f16796i0;
    public int f16797j0;
    public int f16798k0;
    public ArrayList f16799l0;
    public final m7 m0;
    public Parcelable f16800n;
    public int f16801n0;
    public Scroller f16802r;
    public boolean f16803s;
    public h1.a v;
    public int f16804w;
    public Drawable f16805x;
    public int f16806y;

    public g(Context context) {
        super(context);
        this.f16785b = new ArrayList();
        this.f16787c = new Object();
        this.d = new Rect();
        this.h = -1;
        this.f16800n = null;
        this.B = -3.4028235E38f;
        this.C = Float.MAX_VALUE;
        this.H = 1;
        this.R = -1;
        this.f16789d0 = true;
        this.m0 = new m7(this, 4);
        this.f16801n0 = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.f16802r = new Scroller(context2, f16781q0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f9 = context2.getResources().getDisplayMetrics().density;
        this.M = viewConfiguration.getScaledPagingTouchSlop();
        this.T = (int) (400.0f * f9);
        this.U = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f16786b0 = new EdgeEffect(context2);
        this.f16788c0 = new EdgeEffect(context2);
        this.V = (int) (25.0f * f9);
        this.W = (int) (2.0f * f9);
        this.K = (int) (f9 * 16.0f);
        j0.k(this, new o1(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        b0.j(this, new l(this));
    }

    public static boolean d(int i10, int i11, int i12, View view, boolean z10) {
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
        if (z10 && view.canScrollHorizontally(-i10)) {
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

    public final c a(int i10, int i11) {
        ?? obj = new Object();
        obj.f16769b = i10;
        obj.f16768a = this.f16790e.e(this, i10);
        this.f16790e.getClass();
        obj.d = 1.0f;
        ArrayList arrayList = this.f16785b;
        if (i11 >= 0 && i11 < arrayList.size()) {
            arrayList.add(i11, obj);
            return obj;
        }
        arrayList.add(obj);
        return obj;
    }

    @Override
    public final void addFocusables(ArrayList arrayList, int i10, int i11) {
        c k9;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (k9 = k(childAt)) != null && k9.f16769b == this.f16792f) {
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
        c k9;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (k9 = k(childAt)) != null && k9.f16769b == this.f16792f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        boolean z10;
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        d dVar = (d) layoutParams;
        boolean z11 = dVar.f16772a;
        if (view.getClass().getAnnotation(b.class) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        dVar.f16772a = z12;
        if (this.E) {
            if (!z12) {
                dVar.d = true;
                addViewInLayout(view, i10, layoutParams);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        super.addView(view, i10, layoutParams);
    }

    public final void b(e eVar) {
        if (this.f16794g0 == null) {
            this.f16794g0 = new ArrayList();
        }
        this.f16794g0.add(eVar);
    }

    public final boolean c(int r8) {
        throw new UnsupportedOperationException("Method not decompiled: m2.g.c(int):boolean");
    }

    @Override
    public final boolean canScrollHorizontally(int i10) {
        if (this.f16790e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i10 < 0) {
            if (scrollX <= ((int) (clientWidth * this.B))) {
                return false;
            }
            return true;
        } else if (i10 <= 0 || scrollX >= ((int) (clientWidth * this.C))) {
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
        this.f16803s = true;
        if (!this.f16802r.isFinished() && this.f16802r.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f16802r.getCurrX();
            int currY = this.f16802r.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!q(currX)) {
                    this.f16802r.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            WeakHashMap weakHashMap = j0.f46829a;
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
        c k9;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (k9 = k(childAt)) != null && k9.f16769b == this.f16792f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
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
        if (overScrollMode != 0 && (overScrollMode != 1 || (aVar = this.f16790e) == null || aVar.b() <= 1)) {
            this.f16786b0.finish();
            this.f16788c0.finish();
        } else {
            if (!this.f16786b0.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.B * width);
                this.f16786b0.setSize(height, width);
                z10 = this.f16786b0.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f16788c0.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.C + 1.0f)) * width2);
                this.f16788c0.setSize(height2, width2);
                z10 |= this.f16788c0.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
        if (z10) {
            WeakHashMap weakHashMap = j0.f46829a;
            postInvalidateOnAnimation();
        }
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f16805x;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public final void e(boolean z10) {
        boolean z11;
        if (this.f16801n0 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.f16802r.isFinished()) {
                this.f16802r.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f16802r.getCurrX();
                int currY = this.f16802r.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        q(currX);
                    }
                }
            }
        }
        this.G = false;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f16785b;
            if (i10 >= arrayList.size()) {
                break;
            }
            c cVar = (c) arrayList.get(i10);
            if (cVar.f16770c) {
                cVar.f16770c = false;
                z11 = true;
            }
            i10++;
        }
        if (z11) {
            m7 m7Var = this.m0;
            if (z10) {
                WeakHashMap weakHashMap = j0.f46829a;
                postOnAnimation(m7Var);
                return;
            }
            m7Var.run();
        }
    }

    public final void f() {
        boolean z10;
        int b10 = this.f16790e.b();
        this.f16783a = b10;
        ArrayList arrayList = this.f16785b;
        if (arrayList.size() < (this.H * 2) + 1 && arrayList.size() < b10) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = this.f16792f;
        int i11 = 0;
        boolean z11 = false;
        while (i11 < arrayList.size()) {
            c cVar = (c) arrayList.get(i11);
            int c3 = this.f16790e.c(cVar.f16768a);
            if (c3 != -1) {
                if (c3 == -2) {
                    arrayList.remove(i11);
                    i11--;
                    if (!z11) {
                        this.f16790e.getClass();
                        z11 = true;
                    }
                    this.f16790e.a(this, cVar.f16768a);
                    int i12 = this.f16792f;
                    if (i12 == cVar.f16769b) {
                        i10 = Math.max(0, Math.min(i12, b10 - 1));
                    }
                } else {
                    int i13 = cVar.f16769b;
                    if (i13 != c3) {
                        if (i13 == this.f16792f) {
                            i10 = c3;
                        }
                        cVar.f16769b = c3;
                    }
                }
                z10 = true;
            }
            i11++;
        }
        if (z11) {
            this.f16790e.getClass();
        }
        Collections.sort(arrayList, f16780p0);
        if (z10) {
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                d dVar = (d) getChildAt(i14).getLayoutParams();
                if (!dVar.f16772a) {
                    dVar.f16774c = 0.0f;
                }
            }
            y(i10, 0, false, true);
            requestLayout();
        }
    }

    public final int g(int i10, int i11, float f9, int i12) {
        float f10;
        if (Math.abs(i12) > this.V && Math.abs(i11) > this.T) {
            if (i11 <= 0) {
                i10++;
            }
        } else {
            if (i10 >= this.f16792f) {
                f10 = 0.4f;
            } else {
                f10 = 0.6f;
            }
            i10 += (int) (f9 + f10);
        }
        ArrayList arrayList = this.f16785b;
        if (arrayList.size() > 0) {
            return Math.max(((c) arrayList.get(0)).f16769b, Math.min(i10, ((c) l1.i(1, arrayList)).f16769b));
        }
        return i10;
    }

    @Override
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ?? layoutParams = new ViewGroup.LayoutParams(-1, -1);
        layoutParams.f16774c = 0.0f;
        return layoutParams;
    }

    @Override
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public a getAdapter() {
        return this.f16790e;
    }

    @Override
    public final int getChildDrawingOrder(int i10, int i11) {
        if (this.f16798k0 == 2) {
            i11 = (i10 - 1) - i11;
        }
        return ((d) ((View) this.f16799l0.get(i11)).getLayoutParams()).f16776f;
    }

    public int getCurrentItem() {
        return this.f16792f;
    }

    public int getOffscreenPageLimit() {
        return this.H;
    }

    public int getPageMargin() {
        return this.f16804w;
    }

    public final void h(int i10) {
        e eVar = this.f16795h0;
        if (eVar != null) {
            eVar.a(i10);
        }
        ArrayList arrayList = this.f16794g0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                e eVar2 = (e) this.f16794g0.get(i11);
                if (eVar2 != null) {
                    eVar2.a(i10);
                }
            }
        }
    }

    public final void i() {
        if (this.f16784a0) {
            if (this.f16790e != null) {
                VelocityTracker velocityTracker = this.S;
                velocityTracker.computeCurrentVelocity(1000, this.U);
                int xVelocity = (int) velocityTracker.getXVelocity(this.R);
                this.G = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                c l10 = l();
                y(g(l10.f16769b, xVelocity, ((scrollX / clientWidth) - l10.f16771e) / l10.d, (int) (this.N - this.P)), xVelocity, true, true);
            }
            this.I = false;
            this.J = false;
            VelocityTracker velocityTracker2 = this.S;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.S = null;
            }
            this.f16784a0 = false;
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
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f16785b;
            if (i10 < arrayList.size()) {
                c cVar = (c) arrayList.get(i10);
                if (this.f16790e.f(view, cVar.f16768a)) {
                    return cVar;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public final m2.c l() {
        throw new UnsupportedOperationException("Method not decompiled: m2.g.l():m2.c");
    }

    public final c m(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f16785b;
            if (i11 < arrayList.size()) {
                c cVar = (c) arrayList.get(i11);
                if (cVar.f16769b == i10) {
                    return cVar;
                }
                i11++;
            } else {
                return null;
            }
        }
    }

    public final void n(float r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: m2.g.n(float, int, int):void");
    }

    public final void o(MotionEvent motionEvent) {
        int i10;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.R) {
            if (actionIndex == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.N = motionEvent.getX(i10);
            this.R = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.S;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f16789d0 = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        removeCallbacks(this.m0);
        Scroller scroller = this.f16802r;
        if (scroller != null && !scroller.isFinished()) {
            this.f16802r.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int width;
        int i10;
        float f9;
        ArrayList arrayList;
        int i11;
        super.onDraw(canvas);
        if (this.f16804w > 0 && this.f16805x != null) {
            ArrayList arrayList2 = this.f16785b;
            if (arrayList2.size() > 0 && this.f16790e != null) {
                int scrollX = getScrollX();
                float width2 = getWidth();
                float f10 = this.f16804w / width2;
                int i12 = 0;
                c cVar = (c) arrayList2.get(0);
                float f11 = cVar.f16771e;
                int size = arrayList2.size();
                int i13 = cVar.f16769b;
                int i14 = ((c) arrayList2.get(size - 1)).f16769b;
                while (i13 < i14) {
                    while (true) {
                        i10 = cVar.f16769b;
                        if (i13 <= i10 || i12 >= size) {
                            break;
                        }
                        i12++;
                        cVar = (c) arrayList2.get(i12);
                    }
                    if (i13 == i10) {
                        float f12 = cVar.f16771e;
                        float f13 = cVar.d;
                        f9 = (f12 + f13) * width2;
                        f11 = f12 + f13 + f10;
                    } else {
                        this.f16790e.getClass();
                        f9 = (f11 + 1.0f) * width2;
                        f11 = 1.0f + f10 + f11;
                    }
                    if (this.f16804w + f9 > scrollX) {
                        arrayList = arrayList2;
                        i11 = scrollX;
                        this.f16805x.setBounds(Math.round(f9), this.f16806y, Math.round(this.f16804w + f9), this.A);
                        this.f16805x.draw(canvas);
                    } else {
                        arrayList = arrayList2;
                        i11 = scrollX;
                    }
                    if (f9 <= i11 + width) {
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
        float f9;
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
                    int i10 = this.R;
                    if (i10 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i10);
                        float x4 = motionEvent.getX(findPointerIndex);
                        float f10 = x4 - this.N;
                        float abs = Math.abs(f10);
                        float y8 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y8 - this.Q);
                        int i11 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                        if (i11 != 0) {
                            float f11 = this.N;
                            if ((f11 >= this.L || i11 <= 0) && ((f11 <= getWidth() - this.L || f10 >= 0.0f) && d((int) f10, (int) x4, (int) y8, this, false))) {
                                this.N = x4;
                                this.O = y8;
                                this.J = true;
                                return false;
                            }
                        }
                        int i12 = this.M;
                        float f12 = i12;
                        if (abs > f12 && abs * 0.5f > abs2) {
                            this.I = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            setScrollState(1);
                            float f13 = this.P;
                            float f14 = i12;
                            if (i11 > 0) {
                                f9 = f13 + f14;
                            } else {
                                f9 = f13 - f14;
                            }
                            this.N = f9;
                            this.O = y8;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > f12) {
                            this.J = true;
                        }
                        if (this.I && r(x4)) {
                            WeakHashMap weakHashMap = j0.f46829a;
                            postInvalidateOnAnimation();
                        }
                    }
                }
            } else {
                float x10 = motionEvent.getX();
                this.P = x10;
                this.N = x10;
                float y10 = motionEvent.getY();
                this.Q = y10;
                this.O = y10;
                this.R = motionEvent.getPointerId(0);
                this.J = false;
                this.f16803s = true;
                this.f16802r.computeScrollOffset();
                if (this.f16801n0 == 2 && Math.abs(this.f16802r.getFinalX() - this.f16802r.getCurrX()) > this.W) {
                    this.f16802r.abortAnimation();
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
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        int i13;
        c k9;
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
            if (childAt.getVisibility() == 0 && (k9 = k(childAt)) != null && k9.f16769b == this.f16792f && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i13;
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
        super.onRestoreInstanceState(fVar.f8208a);
        if (this.f16790e != null) {
            y(fVar.f16777c, 0, false, true);
            return;
        }
        this.h = fVar.f16777c;
        this.f16800n = fVar.d;
    }

    @Override
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new i1.b(super.onSaveInstanceState());
        bVar.f16777c = this.f16792f;
        if (this.f16790e != null) {
            bVar.d = null;
        }
        return bVar;
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.f16804w;
            u(i10, i12, i14, i14);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        float f9;
        if (!this.f16784a0) {
            boolean z10 = false;
            if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.f16790e) == null || aVar.b() == 0) {
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
                            w(this.f16792f, 0, true, false);
                            z10 = v();
                        }
                    } else {
                        if (!this.I) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.R);
                            if (findPointerIndex == -1) {
                                z10 = v();
                            } else {
                                float x4 = motionEvent.getX(findPointerIndex);
                                float abs = Math.abs(x4 - this.N);
                                float y8 = motionEvent.getY(findPointerIndex);
                                float abs2 = Math.abs(y8 - this.O);
                                int i10 = this.M;
                                if (abs > i10 && abs > abs2) {
                                    this.I = true;
                                    ViewParent parent = getParent();
                                    if (parent != null) {
                                        parent.requestDisallowInterceptTouchEvent(true);
                                    }
                                    float f10 = this.P;
                                    if (x4 - f10 > 0.0f) {
                                        f9 = f10 + i10;
                                    } else {
                                        f9 = f10 - i10;
                                    }
                                    this.N = f9;
                                    this.O = y8;
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
                    float f11 = clientWidth;
                    y(g(l10.f16769b, xVelocity, ((scrollX / f11) - l10.f16771e) / (l10.d + (this.f16804w / f11)), (int) (motionEvent.getX(motionEvent.findPointerIndex(this.R)) - this.P)), xVelocity, true, true);
                    z10 = v();
                }
            } else {
                this.f16802r.abortAnimation();
                this.G = false;
                s();
                float x10 = motionEvent.getX();
                this.P = x10;
                this.N = x10;
                float y10 = motionEvent.getY();
                this.Q = y10;
                this.O = y10;
                this.R = motionEvent.getPointerId(0);
            }
            if (z10) {
                WeakHashMap weakHashMap = j0.f46829a;
                postInvalidateOnAnimation();
            }
        }
        return true;
    }

    public final boolean p() {
        a aVar = this.f16790e;
        if (aVar != null && this.f16792f < aVar.b() - 1) {
            x(this.f16792f + 1, true);
            return true;
        }
        return false;
    }

    public final boolean q(int i10) {
        if (this.f16785b.size() == 0) {
            if (!this.f16789d0) {
                this.f16791e0 = false;
                n(0.0f, 0, 0);
                if (!this.f16791e0) {
                    throw new IllegalStateException("onPageScrolled did not call superclass implementation");
                }
            }
            return false;
        }
        c l10 = l();
        int clientWidth = getClientWidth();
        int i11 = this.f16804w;
        int i12 = clientWidth + i11;
        float f9 = clientWidth;
        int i13 = l10.f16769b;
        float f10 = ((i10 / f9) - l10.f16771e) / (l10.d + (i11 / f9));
        this.f16791e0 = false;
        n(f10, i13, (int) (i12 * f10));
        if (this.f16791e0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean r(float f9) {
        boolean z10;
        boolean z11;
        float f10 = this.N - f9;
        this.N = f9;
        float scrollX = getScrollX() + f10;
        float clientWidth = getClientWidth();
        float f11 = this.B * clientWidth;
        float f12 = this.C * clientWidth;
        ArrayList arrayList = this.f16785b;
        boolean z12 = false;
        c cVar = (c) arrayList.get(0);
        c cVar2 = (c) l1.i(1, arrayList);
        if (cVar.f16769b != 0) {
            f11 = cVar.f16771e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (cVar2.f16769b != this.f16790e.b() - 1) {
            f12 = cVar2.f16771e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f11) {
            if (z10) {
                this.f16786b0.onPull(Math.abs(f11 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f11;
        } else if (scrollX > f12) {
            if (z11) {
                this.f16788c0.onPull(Math.abs(scrollX - f12) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        }
        int i10 = (int) scrollX;
        this.N = (scrollX - i10) + this.N;
        scrollTo(i10, getScrollY());
        q(i10);
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
        t(this.f16792f);
    }

    public void setAdapter(a aVar) {
        ArrayList arrayList = this.f16785b;
        a aVar2 = this.f16790e;
        if (aVar2 != null) {
            synchronized (aVar2) {
                aVar2.f16767b = null;
            }
            this.f16790e.getClass();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                c cVar = (c) arrayList.get(i10);
                a aVar3 = this.f16790e;
                int i11 = cVar.f16769b;
                aVar3.a(this, cVar.f16768a);
            }
            this.f16790e.getClass();
            arrayList.clear();
            int i12 = 0;
            while (i12 < getChildCount()) {
                if (!((d) getChildAt(i12).getLayoutParams()).f16772a) {
                    removeViewAt(i12);
                    i12--;
                }
                i12++;
            }
            this.f16792f = 0;
            scrollTo(0, 0);
        }
        this.f16790e = aVar;
        this.f16783a = 0;
        if (aVar != null) {
            if (this.v == null) {
                this.v = new h1.a(this, 2);
            }
            this.f16790e.i(this.v);
            this.G = false;
            boolean z10 = this.f16789d0;
            this.f16789d0 = true;
            this.f16783a = this.f16790e.b();
            if (this.h >= 0) {
                this.f16790e.getClass();
                y(this.h, 0, false, true);
                this.h = -1;
                this.f16800n = null;
            } else if (!z10) {
                s();
            } else {
                requestLayout();
            }
        }
    }

    public void setCurrentItem(int i10) {
        this.G = false;
        y(i10, 0, !this.f16789d0, false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.H) {
            this.H = i10;
            s();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(e eVar) {
        this.f16795h0 = eVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.f16804w;
        this.f16804w = i10;
        int width = getWidth();
        u(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f16805x = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i10) {
        boolean z10;
        int i11;
        if (this.f16801n0 != i10) {
            this.f16801n0 = i10;
            if (this.f16796i0 != null) {
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int childCount = getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    if (z10) {
                        i11 = this.f16797j0;
                    } else {
                        i11 = 0;
                    }
                    getChildAt(i12).setLayerType(i11, null);
                }
            }
            e eVar = this.f16795h0;
            if (eVar != null) {
                eVar.c(i10);
            }
            ArrayList arrayList = this.f16794g0;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    e eVar2 = (e) this.f16794g0.get(i13);
                    if (eVar2 != null) {
                        eVar2.c(i10);
                    }
                }
            }
        }
    }

    public final void t(int r18) {
        throw new UnsupportedOperationException("Method not decompiled: m2.g.t(int):void");
    }

    public final void u(int i10, int i11, int i12, int i13) {
        float f9;
        if (i11 > 0 && !this.f16785b.isEmpty()) {
            if (!this.f16802r.isFinished()) {
                this.f16802r.setFinalX(getCurrentItem() * getClientWidth());
                return;
            }
            scrollTo((int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)), getScrollY());
            return;
        }
        c m10 = m(this.f16792f);
        if (m10 != null) {
            f9 = Math.min(m10.f16771e, this.C);
        } else {
            f9 = 0.0f;
        }
        int paddingLeft = (int) (f9 * ((i10 - getPaddingLeft()) - getPaddingRight()));
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
        this.f16786b0.onRelease();
        this.f16788c0.onRelease();
        if (!this.f16786b0.isFinished() && !this.f16788c0.isFinished()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f16805x) {
            return false;
        }
        return true;
    }

    public final void w(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        int scrollX;
        int abs;
        c m10 = m(i10);
        if (m10 != null) {
            i12 = (int) (Math.max(this.B, Math.min(m10.f16771e, this.C)) * getClientWidth());
        } else {
            i12 = 0;
        }
        if (z10) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                Scroller scroller = this.f16802r;
                if (scroller != null && !scroller.isFinished()) {
                    if (this.f16803s) {
                        scrollX = this.f16802r.getCurrX();
                    } else {
                        scrollX = this.f16802r.getStartX();
                    }
                    this.f16802r.abortAnimation();
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
                    float f9 = clientWidth;
                    float f10 = i16;
                    float sin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i14) * 1.0f) / f9) - 0.5f) * 0.47123894f)) * f10) + f10;
                    int abs2 = Math.abs(i11);
                    if (abs2 > 0) {
                        abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
                    } else {
                        this.f16790e.getClass();
                        abs = (int) (((Math.abs(i14) / ((f9 * 1.0f) + this.f16804w)) + 1.0f) * 100.0f);
                    }
                    int min = Math.min(abs, 600);
                    this.f16803s = false;
                    this.f16802r.startScroll(i13, scrollY, i14, i15, min);
                    WeakHashMap weakHashMap = j0.f46829a;
                    postInvalidateOnAnimation();
                }
            }
            if (z11) {
                h(i10);
                return;
            }
            return;
        }
        if (z11) {
            h(i10);
        }
        e(false);
        scrollTo(i12, 0);
        q(i12);
    }

    public void x(int i10, boolean z10) {
        this.G = false;
        y(i10, 0, z10, false);
    }

    public final void y(int i10, int i11, boolean z10, boolean z11) {
        a aVar = this.f16790e;
        boolean z12 = false;
        if (aVar != null && aVar.b() > 0) {
            ArrayList arrayList = this.f16785b;
            if (!z11 && this.f16792f == i10 && arrayList.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i10 < 0) {
                i10 = 0;
            } else if (i10 >= this.f16790e.b()) {
                i10 = this.f16790e.b() - 1;
            }
            int i12 = this.H;
            int i13 = this.f16792f;
            if (i10 > i13 + i12 || i10 < i13 - i12) {
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    ((c) arrayList.get(i14)).f16770c = true;
                }
            }
            if (this.f16792f != i10) {
                z12 = true;
            }
            if (this.f16789d0) {
                this.f16792f = i10;
                if (z12) {
                    h(i10);
                }
                requestLayout();
                return;
            }
            t(i10);
            w(i10, i11, z10, z12);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    public final void z() {
        if (this.f16798k0 != 0) {
            ArrayList arrayList = this.f16799l0;
            if (arrayList == null) {
                this.f16799l0 = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f16799l0.add(getChildAt(i10));
            }
            Collections.sort(this.f16799l0, f16782r0);
        }
    }

    @Override
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? layoutParams = new ViewGroup.LayoutParams(context, attributeSet);
        layoutParams.f16774c = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f16779o0);
        layoutParams.f16773b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(getContext().getDrawable(i10));
    }
}
