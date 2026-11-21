package c5;

import a8.sa;
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
import di.v6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import q4.q;
import r0.a0;
import r0.i0;
public class l extends ViewGroup {
    public static final int[] f4456t0 = {16842931};
    public static final b f4457u0 = new b(0);
    public static final c f4458v0 = new c(0);
    public static final b f4459w0 = new b(1);
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
    public int f4460a;
    public VelocityTracker f4461a0;
    public final ArrayList f4462b;
    public final int f4463b0;
    public final e f4464c;
    public final int f4465c0;
    public final Rect d;
    public final int f4466d0;
    public a f4467e;
    public final int f4468e0;
    public int f4469f;
    public boolean f4470f0;
    public EdgeEffect f4471g0;
    public int h;
    public EdgeEffect f4472h0;
    public boolean f4473i0;
    public boolean f4474j0;
    public int f4475k0;
    public ArrayList f4476l0;
    public h m0;
    public Parcelable f4477n;
    public v6 f4478n0;
    public int f4479o0;
    public int f4480p0;
    public ArrayList f4481q0;
    public Scroller f4482r;
    public final sa f4483r0;
    public boolean f4484s;
    public int f4485s0;
    public i f4486w;
    public int f4487x;
    public Drawable f4488y;

    public l(Context context) {
        super(context);
        this.f4462b = new ArrayList();
        this.f4464c = new Object();
        this.d = new Rect();
        this.h = -1;
        this.f4477n = null;
        this.G = -3.4028235E38f;
        this.H = Float.MAX_VALUE;
        this.M = 1;
        this.W = -1;
        this.f4473i0 = true;
        this.f4483r0 = new sa(this, 15);
        this.f4485s0 = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.f4482r = new Scroller(context2, f4458v0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f10 = context2.getResources().getDisplayMetrics().density;
        this.R = viewConfiguration.getScaledPagingTouchSlop();
        this.f4463b0 = (int) (400.0f * f10);
        this.f4465c0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f4471g0 = new EdgeEffect(context2);
        this.f4472h0 = new EdgeEffect(context2);
        this.f4466d0 = (int) (25.0f * f10);
        this.f4468e0 = (int) (2.0f * f10);
        this.P = (int) (f10 * 16.0f);
        i0.j(this, new g(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        a0.i(this, new q(this));
    }

    public static boolean d(int i7, int i10, int i11, View view, boolean z10) {
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
        if (z10 && view.canScrollHorizontally(-i7)) {
            return true;
        }
        return false;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.K != z10) {
            this.K = z10;
        }
    }

    public final e a(int i7, int i10) {
        ?? obj = new Object();
        obj.f4442b = i7;
        obj.f4441a = this.f4467e.e(this, i7);
        this.f4467e.getClass();
        obj.d = 1.0f;
        ArrayList arrayList = this.f4462b;
        if (i10 >= 0 && i10 < arrayList.size()) {
            arrayList.add(i10, obj);
            return obj;
        }
        arrayList.add(obj);
        return obj;
    }

    @Override
    public final void addFocusables(ArrayList arrayList, int i7, int i10) {
        e k10;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() == 0 && (k10 = k(childAt)) != null && k10.f4442b == this.f4469f) {
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
        e k10;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 0 && (k10 = k(childAt)) != null && k10.f4442b == this.f4469f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        boolean z10;
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        f fVar = (f) layoutParams;
        boolean z11 = fVar.f4445a;
        if (view.getClass().getAnnotation(d.class) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        fVar.f4445a = z12;
        if (this.J) {
            if (!z12) {
                fVar.d = true;
                addViewInLayout(view, i7, layoutParams);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        super.addView(view, i7, layoutParams);
    }

    public final void b(h hVar) {
        if (this.f4476l0 == null) {
            this.f4476l0 = new ArrayList();
        }
        this.f4476l0.add(hVar);
    }

    public final boolean c(int r8) {
        throw new UnsupportedOperationException("Method not decompiled: c5.l.c(int):boolean");
    }

    @Override
    public final boolean canScrollHorizontally(int i7) {
        if (this.f4467e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i7 < 0) {
            if (scrollX <= ((int) (clientWidth * this.G))) {
                return false;
            }
            return true;
        } else if (i7 <= 0 || scrollX >= ((int) (clientWidth * this.H))) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof f) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override
    public final void computeScroll() {
        this.f4484s = true;
        if (!this.f4482r.isFinished() && this.f4482r.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f4482r.getCurrX();
            int currY = this.f4482r.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!q(currX)) {
                    this.f4482r.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            WeakHashMap weakHashMap = i0.f56285a;
            postInvalidateOnAnimation();
            return;
        }
        e(true);
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: c5.l.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        e k10;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 0 && (k10 = k(childAt)) != null && k10.f4442b == this.f4469f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
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
        if (overScrollMode != 0 && (overScrollMode != 1 || (aVar = this.f4467e) == null || aVar.b() <= 1)) {
            this.f4471g0.finish();
            this.f4472h0.finish();
        } else {
            if (!this.f4471g0.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.G * width);
                this.f4471g0.setSize(height, width);
                z10 = this.f4471g0.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f4472h0.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.H + 1.0f)) * width2);
                this.f4472h0.setSize(height2, width2);
                z10 |= this.f4472h0.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
        if (z10) {
            WeakHashMap weakHashMap = i0.f56285a;
            postInvalidateOnAnimation();
        }
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f4488y;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public final void e(boolean z10) {
        boolean z11;
        if (this.f4485s0 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.f4482r.isFinished()) {
                this.f4482r.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f4482r.getCurrX();
                int currY = this.f4482r.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        q(currX);
                    }
                }
            }
        }
        this.L = false;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f4462b;
            if (i7 >= arrayList.size()) {
                break;
            }
            e eVar = (e) arrayList.get(i7);
            if (eVar.f4443c) {
                eVar.f4443c = false;
                z11 = true;
            }
            i7++;
        }
        if (z11) {
            sa saVar = this.f4483r0;
            if (z10) {
                WeakHashMap weakHashMap = i0.f56285a;
                postOnAnimation(saVar);
                return;
            }
            saVar.run();
        }
    }

    public final void f() {
        boolean z10;
        int b10 = this.f4467e.b();
        this.f4460a = b10;
        ArrayList arrayList = this.f4462b;
        if (arrayList.size() < (this.M * 2) + 1 && arrayList.size() < b10) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i7 = this.f4469f;
        int i10 = 0;
        boolean z11 = false;
        while (i10 < arrayList.size()) {
            e eVar = (e) arrayList.get(i10);
            int c10 = this.f4467e.c(eVar.f4441a);
            if (c10 != -1) {
                if (c10 == -2) {
                    arrayList.remove(i10);
                    i10--;
                    if (!z11) {
                        this.f4467e.getClass();
                        z11 = true;
                    }
                    this.f4467e.a(this, eVar.f4441a);
                    int i11 = this.f4469f;
                    if (i11 == eVar.f4442b) {
                        i7 = Math.max(0, Math.min(i11, b10 - 1));
                    }
                } else {
                    int i12 = eVar.f4442b;
                    if (i12 != c10) {
                        if (i12 == this.f4469f) {
                            i7 = c10;
                        }
                        eVar.f4442b = c10;
                    }
                }
                z10 = true;
            }
            i10++;
        }
        if (z11) {
            this.f4467e.getClass();
        }
        Collections.sort(arrayList, f4457u0);
        if (z10) {
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                f fVar = (f) getChildAt(i13).getLayoutParams();
                if (!fVar.f4445a) {
                    fVar.f4447c = 0.0f;
                }
            }
            y(i7, 0, false, true);
            requestLayout();
        }
    }

    public final int g(int i7, int i10, float f10, int i11) {
        float f11;
        if (Math.abs(i11) > this.f4466d0 && Math.abs(i10) > this.f4463b0) {
            if (i10 <= 0) {
                i7++;
            }
        } else {
            if (i7 >= this.f4469f) {
                f11 = 0.4f;
            } else {
                f11 = 0.6f;
            }
            i7 += (int) (f10 + f11);
        }
        ArrayList arrayList = this.f4462b;
        if (arrayList.size() > 0) {
            return Math.max(((e) arrayList.get(0)).f4442b, Math.min(i7, ((e) i5.c.h(1, arrayList)).f4442b));
        }
        return i7;
    }

    @Override
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ?? layoutParams = new ViewGroup.LayoutParams(-1, -1);
        layoutParams.f4447c = 0.0f;
        return layoutParams;
    }

    @Override
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public a getAdapter() {
        return this.f4467e;
    }

    @Override
    public final int getChildDrawingOrder(int i7, int i10) {
        if (this.f4480p0 == 2) {
            i10 = (i7 - 1) - i10;
        }
        return ((f) ((View) this.f4481q0.get(i10)).getLayoutParams()).f4449f;
    }

    public int getCurrentItem() {
        return this.f4469f;
    }

    public int getOffscreenPageLimit() {
        return this.M;
    }

    public int getPageMargin() {
        return this.f4487x;
    }

    public final void h(int i7) {
        h hVar = this.m0;
        if (hVar != null) {
            hVar.a(i7);
        }
        ArrayList arrayList = this.f4476l0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                h hVar2 = (h) this.f4476l0.get(i10);
                if (hVar2 != null) {
                    hVar2.a(i7);
                }
            }
        }
    }

    public final void i() {
        if (this.f4470f0) {
            if (this.f4467e != null) {
                VelocityTracker velocityTracker = this.f4461a0;
                velocityTracker.computeCurrentVelocity(1000, this.f4465c0);
                int xVelocity = (int) velocityTracker.getXVelocity(this.W);
                this.L = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                e l10 = l();
                y(g(l10.f4442b, xVelocity, ((scrollX / clientWidth) - l10.f4444e) / l10.d, (int) (this.S - this.U)), xVelocity, true, true);
            }
            this.N = false;
            this.O = false;
            VelocityTracker velocityTracker2 = this.f4461a0;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f4461a0 = null;
            }
            this.f4470f0 = false;
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

    public final e k(View view) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f4462b;
            if (i7 < arrayList.size()) {
                e eVar = (e) arrayList.get(i7);
                if (this.f4467e.f(view, eVar.f4441a)) {
                    return eVar;
                }
                i7++;
            } else {
                return null;
            }
        }
    }

    public final c5.e l() {
        throw new UnsupportedOperationException("Method not decompiled: c5.l.l():c5.e");
    }

    public final e m(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f4462b;
            if (i10 < arrayList.size()) {
                e eVar = (e) arrayList.get(i10);
                if (eVar.f4442b == i7) {
                    return eVar;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public final void n(float r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: c5.l.n(float, int, int):void");
    }

    public final void o(MotionEvent motionEvent) {
        int i7;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.W) {
            if (actionIndex == 0) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            this.S = motionEvent.getX(i7);
            this.W = motionEvent.getPointerId(i7);
            VelocityTracker velocityTracker = this.f4461a0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4473i0 = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f4483r0);
        Scroller scroller = this.f4482r;
        if (scroller != null && !scroller.isFinished()) {
            this.f4482r.abortAnimation();
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
        if (this.f4487x > 0 && this.f4488y != null) {
            ArrayList arrayList2 = this.f4462b;
            if (arrayList2.size() > 0 && this.f4467e != null) {
                int scrollX = getScrollX();
                float width2 = getWidth();
                float f11 = this.f4487x / width2;
                int i11 = 0;
                e eVar = (e) arrayList2.get(0);
                float f12 = eVar.f4444e;
                int size = arrayList2.size();
                int i12 = eVar.f4442b;
                int i13 = ((e) arrayList2.get(size - 1)).f4442b;
                while (i12 < i13) {
                    while (true) {
                        i7 = eVar.f4442b;
                        if (i12 <= i7 || i11 >= size) {
                            break;
                        }
                        i11++;
                        eVar = (e) arrayList2.get(i11);
                    }
                    if (i12 == i7) {
                        float f13 = eVar.f4444e;
                        float f14 = eVar.d;
                        f10 = (f13 + f14) * width2;
                        f12 = f13 + f14 + f11;
                    } else {
                        this.f4467e.getClass();
                        f10 = (f12 + 1.0f) * width2;
                        f12 = 1.0f + f11 + f12;
                    }
                    if (this.f4487x + f10 > scrollX) {
                        arrayList = arrayList2;
                        i10 = scrollX;
                        this.f4488y.setBounds(Math.round(f10), this.E, Math.round(this.f4487x + f10), this.F);
                        this.f4488y.draw(canvas);
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
                if (this.N) {
                    return true;
                }
                if (this.O) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        o(motionEvent);
                    }
                } else {
                    int i7 = this.W;
                    if (i7 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i7);
                        float x10 = motionEvent.getX(findPointerIndex);
                        float f11 = x10 - this.S;
                        float abs = Math.abs(f11);
                        float y10 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y10 - this.V);
                        int i10 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
                        if (i10 != 0) {
                            float f12 = this.S;
                            if ((f12 >= this.Q || i10 <= 0) && ((f12 <= getWidth() - this.Q || f11 >= 0.0f) && d((int) f11, (int) x10, (int) y10, this, false))) {
                                this.S = x10;
                                this.T = y10;
                                this.O = true;
                                return false;
                            }
                        }
                        int i11 = this.R;
                        float f13 = i11;
                        if (abs > f13 && abs * 0.5f > abs2) {
                            this.N = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            setScrollState(1);
                            float f14 = this.U;
                            float f15 = i11;
                            if (i10 > 0) {
                                f10 = f14 + f15;
                            } else {
                                f10 = f14 - f15;
                            }
                            this.S = f10;
                            this.T = y10;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > f13) {
                            this.O = true;
                        }
                        if (this.N && r(x10)) {
                            WeakHashMap weakHashMap = i0.f56285a;
                            postInvalidateOnAnimation();
                        }
                    }
                }
            } else {
                float x11 = motionEvent.getX();
                this.U = x11;
                this.S = x11;
                float y11 = motionEvent.getY();
                this.V = y11;
                this.T = y11;
                this.W = motionEvent.getPointerId(0);
                this.O = false;
                this.f4484s = true;
                this.f4482r.computeScrollOffset();
                if (this.f4485s0 == 2 && Math.abs(this.f4482r.getFinalX() - this.f4482r.getCurrX()) > this.f4468e0) {
                    this.f4482r.abortAnimation();
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
            if (this.f4461a0 == null) {
                this.f4461a0 = VelocityTracker.obtain();
            }
            this.f4461a0.addMovement(motionEvent);
            return this.N;
        }
        v();
        return false;
    }

    @Override
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: c5.l.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: c5.l.onMeasure(int, int):void");
    }

    @Override
    public final boolean onRequestFocusInDescendants(int i7, Rect rect) {
        int i10;
        int i11;
        int i12;
        e k10;
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
            if (childAt.getVisibility() == 0 && (k10 = k(childAt)) != null && k10.f4442b == this.f4469f && childAt.requestFocus(i7, rect)) {
                return true;
            }
            i10 += i12;
        }
        return false;
    }

    @Override
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof k)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.f17166a);
        if (this.f4467e != null) {
            y(kVar.f4454c, 0, false, true);
            return;
        }
        this.h = kVar.f4454c;
        this.f4477n = kVar.d;
    }

    @Override
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new j1.b(super.onSaveInstanceState());
        bVar.f4454c = this.f4469f;
        if (this.f4467e != null) {
            bVar.d = null;
        }
        return bVar;
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (i7 != i11) {
            int i13 = this.f4487x;
            u(i7, i11, i13, i13);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        float f10;
        if (!this.f4470f0) {
            boolean z10 = false;
            if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.f4467e) == null || aVar.b() == 0) {
                return false;
            }
            if (this.f4461a0 == null) {
                this.f4461a0 = VelocityTracker.obtain();
            }
            this.f4461a0.addMovement(motionEvent);
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
                            w(this.f4469f, 0, true, false);
                            z10 = v();
                        }
                    } else {
                        if (!this.N) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.W);
                            if (findPointerIndex == -1) {
                                z10 = v();
                            } else {
                                float x10 = motionEvent.getX(findPointerIndex);
                                float abs = Math.abs(x10 - this.S);
                                float y10 = motionEvent.getY(findPointerIndex);
                                float abs2 = Math.abs(y10 - this.T);
                                int i7 = this.R;
                                if (abs > i7 && abs > abs2) {
                                    this.N = true;
                                    ViewParent parent = getParent();
                                    if (parent != null) {
                                        parent.requestDisallowInterceptTouchEvent(true);
                                    }
                                    float f11 = this.U;
                                    if (x10 - f11 > 0.0f) {
                                        f10 = f11 + i7;
                                    } else {
                                        f10 = f11 - i7;
                                    }
                                    this.S = f10;
                                    this.T = y10;
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
                            z10 = r(motionEvent.getX(motionEvent.findPointerIndex(this.W)));
                        }
                    }
                } else if (this.N) {
                    VelocityTracker velocityTracker = this.f4461a0;
                    velocityTracker.computeCurrentVelocity(1000, this.f4465c0);
                    int xVelocity = (int) velocityTracker.getXVelocity(this.W);
                    this.L = true;
                    int clientWidth = getClientWidth();
                    int scrollX = getScrollX();
                    e l10 = l();
                    float f12 = clientWidth;
                    y(g(l10.f4442b, xVelocity, ((scrollX / f12) - l10.f4444e) / (l10.d + (this.f4487x / f12)), (int) (motionEvent.getX(motionEvent.findPointerIndex(this.W)) - this.U)), xVelocity, true, true);
                    z10 = v();
                }
            } else {
                this.f4482r.abortAnimation();
                this.L = false;
                s();
                float x11 = motionEvent.getX();
                this.U = x11;
                this.S = x11;
                float y11 = motionEvent.getY();
                this.V = y11;
                this.T = y11;
                this.W = motionEvent.getPointerId(0);
            }
            if (z10) {
                WeakHashMap weakHashMap = i0.f56285a;
                postInvalidateOnAnimation();
            }
        }
        return true;
    }

    public final boolean p() {
        a aVar = this.f4467e;
        if (aVar != null && this.f4469f < aVar.b() - 1) {
            x(this.f4469f + 1, true);
            return true;
        }
        return false;
    }

    public final boolean q(int i7) {
        if (this.f4462b.size() == 0) {
            if (!this.f4473i0) {
                this.f4474j0 = false;
                n(0.0f, 0, 0);
                if (!this.f4474j0) {
                    throw new IllegalStateException("onPageScrolled did not call superclass implementation");
                }
            }
            return false;
        }
        e l10 = l();
        int clientWidth = getClientWidth();
        int i10 = this.f4487x;
        int i11 = clientWidth + i10;
        float f10 = clientWidth;
        int i12 = l10.f4442b;
        float f11 = ((i7 / f10) - l10.f4444e) / (l10.d + (i10 / f10));
        this.f4474j0 = false;
        n(f11, i12, (int) (i11 * f11));
        if (this.f4474j0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean r(float f10) {
        boolean z10;
        boolean z11;
        float f11 = this.S - f10;
        this.S = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.G * clientWidth;
        float f13 = this.H * clientWidth;
        ArrayList arrayList = this.f4462b;
        boolean z12 = false;
        e eVar = (e) arrayList.get(0);
        e eVar2 = (e) i5.c.h(1, arrayList);
        if (eVar.f4442b != 0) {
            f12 = eVar.f4444e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (eVar2.f4442b != this.f4467e.b() - 1) {
            f13 = eVar2.f4444e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f12) {
            if (z10) {
                this.f4471g0.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z11) {
                this.f4472h0.onPull(Math.abs(scrollX - f13) / clientWidth);
                z12 = true;
            }
            scrollX = f13;
        }
        int i7 = (int) scrollX;
        this.S = (scrollX - i7) + this.S;
        scrollTo(i7, getScrollY());
        q(i7);
        return z12;
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
        t(this.f4469f);
    }

    public void setAdapter(a aVar) {
        ArrayList arrayList = this.f4462b;
        a aVar2 = this.f4467e;
        if (aVar2 != null) {
            synchronized (aVar2) {
                aVar2.f4436b = null;
            }
            this.f4467e.getClass();
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                e eVar = (e) arrayList.get(i7);
                a aVar3 = this.f4467e;
                int i10 = eVar.f4442b;
                aVar3.a(this, eVar.f4441a);
            }
            this.f4467e.getClass();
            arrayList.clear();
            int i11 = 0;
            while (i11 < getChildCount()) {
                if (!((f) getChildAt(i11).getLayoutParams()).f4445a) {
                    removeViewAt(i11);
                    i11--;
                }
                i11++;
            }
            this.f4469f = 0;
            scrollTo(0, 0);
        }
        this.f4467e = aVar;
        this.f4460a = 0;
        if (aVar != null) {
            if (this.f4486w == null) {
                this.f4486w = new i(this, 0);
            }
            this.f4467e.i(this.f4486w);
            this.L = false;
            boolean z10 = this.f4473i0;
            this.f4473i0 = true;
            this.f4460a = this.f4467e.b();
            if (this.h >= 0) {
                this.f4467e.getClass();
                y(this.h, 0, false, true);
                this.h = -1;
                this.f4477n = null;
            } else if (!z10) {
                s();
            } else {
                requestLayout();
            }
        }
    }

    public void setCurrentItem(int i7) {
        this.L = false;
        y(i7, 0, !this.f4473i0, false);
    }

    public void setOffscreenPageLimit(int i7) {
        if (i7 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i7 + " too small; defaulting to 1");
            i7 = 1;
        }
        if (i7 != this.M) {
            this.M = i7;
            s();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(h hVar) {
        this.m0 = hVar;
    }

    public void setPageMargin(int i7) {
        int i10 = this.f4487x;
        this.f4487x = i7;
        int width = getWidth();
        u(width, width, i7, i10);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f4488y = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i7) {
        boolean z10;
        int i10;
        if (this.f4485s0 != i7) {
            this.f4485s0 = i7;
            if (this.f4478n0 != null) {
                if (i7 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int childCount = getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    if (z10) {
                        i10 = this.f4479o0;
                    } else {
                        i10 = 0;
                    }
                    getChildAt(i11).setLayerType(i10, null);
                }
            }
            h hVar = this.m0;
            if (hVar != null) {
                hVar.c(i7);
            }
            ArrayList arrayList = this.f4476l0;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    h hVar2 = (h) this.f4476l0.get(i12);
                    if (hVar2 != null) {
                        hVar2.c(i7);
                    }
                }
            }
        }
    }

    public final void t(int r18) {
        throw new UnsupportedOperationException("Method not decompiled: c5.l.t(int):void");
    }

    public final void u(int i7, int i10, int i11, int i12) {
        float f10;
        if (i10 > 0 && !this.f4462b.isEmpty()) {
            if (!this.f4482r.isFinished()) {
                this.f4482r.setFinalX(getCurrentItem() * getClientWidth());
                return;
            }
            scrollTo((int) ((getScrollX() / (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)) * (((i7 - getPaddingLeft()) - getPaddingRight()) + i11)), getScrollY());
            return;
        }
        e m10 = m(this.f4469f);
        if (m10 != null) {
            f10 = Math.min(m10.f4444e, this.H);
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
        this.W = -1;
        this.N = false;
        this.O = false;
        VelocityTracker velocityTracker = this.f4461a0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4461a0 = null;
        }
        this.f4471g0.onRelease();
        this.f4472h0.onRelease();
        if (!this.f4471g0.isFinished() && !this.f4472h0.isFinished()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f4488y) {
            return false;
        }
        return true;
    }

    public final void w(int i7, int i10, boolean z10, boolean z11) {
        int i11;
        int scrollX;
        int abs;
        e m10 = m(i7);
        if (m10 != null) {
            i11 = (int) (Math.max(this.G, Math.min(m10.f4444e, this.H)) * getClientWidth());
        } else {
            i11 = 0;
        }
        if (z10) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                Scroller scroller = this.f4482r;
                if (scroller != null && !scroller.isFinished()) {
                    if (this.f4484s) {
                        scrollX = this.f4482r.getCurrX();
                    } else {
                        scrollX = this.f4482r.getStartX();
                    }
                    this.f4482r.abortAnimation();
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
                        this.f4467e.getClass();
                        abs = (int) (((Math.abs(i13) / ((f10 * 1.0f) + this.f4487x)) + 1.0f) * 100.0f);
                    }
                    int min = Math.min(abs, 600);
                    this.f4484s = false;
                    this.f4482r.startScroll(i12, scrollY, i13, i14, min);
                    WeakHashMap weakHashMap = i0.f56285a;
                    postInvalidateOnAnimation();
                }
            }
            if (z11) {
                h(i7);
                return;
            }
            return;
        }
        if (z11) {
            h(i7);
        }
        e(false);
        scrollTo(i11, 0);
        q(i11);
    }

    public void x(int i7, boolean z10) {
        this.L = false;
        y(i7, 0, z10, false);
    }

    public final void y(int i7, int i10, boolean z10, boolean z11) {
        a aVar = this.f4467e;
        boolean z12 = false;
        if (aVar != null && aVar.b() > 0) {
            ArrayList arrayList = this.f4462b;
            if (!z11 && this.f4469f == i7 && arrayList.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i7 < 0) {
                i7 = 0;
            } else if (i7 >= this.f4467e.b()) {
                i7 = this.f4467e.b() - 1;
            }
            int i11 = this.M;
            int i12 = this.f4469f;
            if (i7 > i12 + i11 || i7 < i12 - i11) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    ((e) arrayList.get(i13)).f4443c = true;
                }
            }
            if (this.f4469f != i7) {
                z12 = true;
            }
            if (this.f4473i0) {
                this.f4469f = i7;
                if (z12) {
                    h(i7);
                }
                requestLayout();
                return;
            }
            t(i7);
            w(i7, i10, z10, z12);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    public final void z() {
        if (this.f4480p0 != 0) {
            ArrayList arrayList = this.f4481q0;
            if (arrayList == null) {
                this.f4481q0 = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                this.f4481q0.add(getChildAt(i7));
            }
            Collections.sort(this.f4481q0, f4459w0);
        }
    }

    @Override
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? layoutParams = new ViewGroup.LayoutParams(context, attributeSet);
        layoutParams.f4447c = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4456t0);
        layoutParams.f4446b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    public void setPageMarginDrawable(int i7) {
        setPageMarginDrawable(getContext().getDrawable(i7));
    }
}
