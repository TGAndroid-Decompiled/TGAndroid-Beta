package m2;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import f2.b0;
import f2.p1;
import h3.x;
import hh.y9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import jh.e4;
import jh.p7;
import jh.y8;
import m.i3;
import org.telegram.messenger.AndroidUtilities;
import r0.j0;

public class g extends ViewGroup {

    public static final int[] f17557o0 = {16842931};

    public static final d2.a f17558p0 = new d2.a(3);

    public static final b0 f17559q0;

    public static final d2.a f17560r0;
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

    public int f17561a;

    public boolean f17562a0;

    public final ArrayList f17563b;

    public EdgeEffect f17564b0;

    public final c f17565c;

    public EdgeEffect f17566c0;
    public final Rect d;

    public boolean f17567d0;

    public a f17568e;

    public boolean f17569e0;

    public int f17570f;

    public int f17571f0;

    public ArrayList f17572g0;
    public int h;

    public e f17573h0;

    public x f17574i0;

    public int f17575j0;

    public int f17576k0;

    public ArrayList f17577l0;
    public final i3 m0;

    public Parcelable f17578n;

    public int f17579n0;

    public Scroller f17580r;

    public boolean f17581s;
    public h1.a v;

    public int f17582w;

    public Drawable f17583x;

    public int f17584y;

    static {
        int i10 = 4;
        f17559q0 = new b0(i10);
        f17560r0 = new d2.a(i10);
    }

    public g(Context context) {
        super(context);
        this.f17563b = new ArrayList();
        this.f17565c = new c();
        this.d = new Rect();
        this.h = -1;
        this.f17578n = null;
        this.B = -3.4028235E38f;
        this.C = Float.MAX_VALUE;
        this.H = 1;
        this.R = -1;
        this.f17567d0 = true;
        this.m0 = new i3(this, 1);
        this.f17579n0 = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.f17580r = new Scroller(context2, f17559q0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f10 = context2.getResources().getDisplayMetrics().density;
        this.M = viewConfiguration.getScaledPagingTouchSlop();
        this.T = (int) (400.0f * f10);
        this.U = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f17564b0 = new EdgeEffect(context2);
        this.f17566c0 = new EdgeEffect(context2);
        this.V = (int) (25.0f * f10);
        this.W = (int) (2.0f * f10);
        this.K = (int) (f10 * 16.0f);
        j0.k(this, new p1(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        r0.b0.j(this, new g5.b(this));
    }

    public static boolean d(int i10, int i11, int i12, View view, boolean z10) {
        int i13;
        if (!(view instanceof ViewGroup)) {
            return z10 ? false : false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int scrollX = view.getScrollX();
        int scrollY = view.getScrollY();
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            int i14 = i11 + scrollX;
            if (i14 < childAt.getLeft() || i14 >= childAt.getRight() || (i13 = i12 + scrollY) < childAt.getTop() || i13 >= childAt.getBottom() || !d(i10, i14 - childAt.getLeft(), i13 - childAt.getTop(), childAt, true)) {
            }
        }
        if (z10 || !view.canScrollHorizontally(-i10)) {
        }
        return true;
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
        c cVar = new c();
        cVar.f17547b = i10;
        cVar.f17546a = this.f17568e.e(this, i10);
        this.f17568e.getClass();
        cVar.d = 1.0f;
        ArrayList arrayList = this.f17563b;
        if (i11 < 0 || i11 >= arrayList.size()) {
            arrayList.add(cVar);
            return cVar;
        }
        arrayList.add(i11, cVar);
        return cVar;
    }

    @Override
    public final void addFocusables(ArrayList arrayList, int i10, int i11) {
        c cVarK;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (cVarK = k(childAt)) != null && cVarK.f17547b == this.f17570f) {
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
        c cVarK;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (cVarK = k(childAt)) != null && cVarK.f17547b == this.f17570f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        d dVar = (d) layoutParams;
        boolean z10 = dVar.f17550a | (view.getClass().getAnnotation(b.class) != null);
        dVar.f17550a = z10;
        if (!this.E) {
            super.addView(view, i10, layoutParams);
        } else {
            if (z10) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            dVar.d = true;
            addViewInLayout(view, i10, layoutParams);
        }
    }

    public final void b(e eVar) {
        if (this.f17572g0 == null) {
            this.f17572g0 = new ArrayList();
        }
        this.f17572g0.add(eVar);
    }

    public final boolean c(int i10) {
        boolean zRequestFocus;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
            break;
        }
        if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(viewFindFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb2.append(" => ");
                        sb2.append(parent2.getClass().getSimpleName());
                    }
                    Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb2.toString());
                    viewFindFocus = null;
                    break;
                }
                if (parent == this) {
                    break;
                }
                parent = parent.getParent();
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i10);
        boolean z10 = true;
        boolean zP = false;
        if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
            Rect rect = this.d;
            if (i10 == 17) {
                int i11 = j(viewFindNextFocus, rect).left;
                int i12 = j(viewFindFocus, rect).left;
                if (viewFindFocus == null || i11 < i12) {
                    zRequestFocus = viewFindNextFocus.requestFocus();
                } else {
                    int i13 = this.f17570f;
                    if (i13 > 0) {
                        x(i13 - 1, true);
                    } else {
                        z10 = false;
                    }
                    zP = z10;
                }
            } else if (i10 == 66) {
                zRequestFocus = (viewFindFocus == null || j(viewFindNextFocus, rect).left > j(viewFindFocus, rect).left) ? viewFindNextFocus.requestFocus() : p();
            }
            zP = zRequestFocus;
        } else if (i10 == 17 || i10 == 1) {
            int i14 = this.f17570f;
            if (i14 > 0) {
                x(i14 - 1, true);
            } else {
                z10 = false;
            }
            zP = z10;
        } else if (i10 == 66 || i10 == 2) {
            zP = p();
        }
        if (zP) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i10));
        }
        return zP;
    }

    @Override
    public final boolean canScrollHorizontally(int i10) {
        if (this.f17568e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i10 < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.B));
        }
        return i10 > 0 && scrollX < ((int) (((float) clientWidth) * this.C));
    }

    @Override
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof d) && super.checkLayoutParams(layoutParams);
    }

    @Override
    public final void computeScroll() {
        this.f17581s = true;
        if (this.f17580r.isFinished() || !this.f17580r.computeScrollOffset()) {
            e(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f17580r.getCurrX();
        int currY = this.f17580r.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!q(currX)) {
                this.f17580r.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap weakHashMap = j0.f46605a;
        postInvalidateOnAnimation();
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zC;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() != 0) {
                zC = false;
            } else {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 21) {
                    if (keyCode == 22) {
                        zC = keyEvent.hasModifiers(2) ? p() : c(66);
                    } else if (keyCode != 61) {
                        zC = false;
                    } else if (keyEvent.hasNoModifiers()) {
                        zC = c(2);
                    } else if (keyEvent.hasModifiers(1)) {
                        zC = c(1);
                    } else {
                        zC = false;
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    int i10 = this.f17570f;
                    if (i10 > 0) {
                        x(i10 - 1, true);
                        zC = true;
                    } else {
                        zC = false;
                    }
                } else {
                    zC = c(17);
                }
            }
            if (!zC) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        c cVarK;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (cVarK = k(childAt)) != null && cVarK.f17547b == this.f17570f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
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
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f17568e) != null && aVar.b() > 1)) {
            if (!this.f17564b0.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.B * width);
                this.f17564b0.setSize(height, width);
                zDraw = this.f17564b0.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.f17566c0.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.C + 1.0f)) * width2);
                this.f17566c0.setSize(height2, width2);
                zDraw |= this.f17566c0.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.f17564b0.finish();
            this.f17566c0.finish();
        }
        if (zDraw) {
            WeakHashMap weakHashMap = j0.f46605a;
            postInvalidateOnAnimation();
        }
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f17583x;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void e(boolean z10) {
        boolean z11 = this.f17579n0 == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.f17580r.isFinished()) {
                this.f17580r.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f17580r.getCurrX();
                int currY = this.f17580r.getCurrY();
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
            ArrayList arrayList = this.f17563b;
            if (i10 >= arrayList.size()) {
                break;
            }
            c cVar = (c) arrayList.get(i10);
            if (cVar.f17548c) {
                cVar.f17548c = false;
                z11 = true;
            }
            i10++;
        }
        if (z11) {
            i3 i3Var = this.m0;
            if (!z10) {
                i3Var.run();
            } else {
                WeakHashMap weakHashMap = j0.f46605a;
                postOnAnimation(i3Var);
            }
        }
    }

    public final void f() {
        int iB = this.f17568e.b();
        this.f17561a = iB;
        ArrayList arrayList = this.f17563b;
        boolean z10 = arrayList.size() < (this.H * 2) + 1 && arrayList.size() < iB;
        int iMax = this.f17570f;
        int i10 = 0;
        boolean z11 = false;
        while (i10 < arrayList.size()) {
            c cVar = (c) arrayList.get(i10);
            int iC = this.f17568e.c(cVar.f17546a);
            if (iC != -1) {
                if (iC == -2) {
                    arrayList.remove(i10);
                    i10--;
                    if (!z11) {
                        this.f17568e.getClass();
                        z11 = true;
                    }
                    this.f17568e.a(this, cVar.f17546a);
                    int i11 = this.f17570f;
                    if (i11 == cVar.f17547b) {
                        iMax = Math.max(0, Math.min(i11, iB - 1));
                    }
                } else {
                    int i12 = cVar.f17547b;
                    if (i12 != iC) {
                        if (i12 == this.f17570f) {
                            iMax = iC;
                        }
                        cVar.f17547b = iC;
                    }
                }
                z10 = true;
            }
            i10++;
        }
        if (z11) {
            this.f17568e.getClass();
        }
        Collections.sort(arrayList, f17558p0);
        if (z10) {
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                d dVar = (d) getChildAt(i13).getLayoutParams();
                if (!dVar.f17550a) {
                    dVar.f17552c = 0.0f;
                }
            }
            y(iMax, 0, false, true);
            requestLayout();
        }
    }

    public final int g(int i10, int i11, float f10, int i12) {
        if (Math.abs(i12) <= this.V || Math.abs(i11) <= this.T) {
            i10 += (int) (f10 + (i10 >= this.f17570f ? 0.4f : 0.6f));
        } else if (i11 <= 0) {
            i10++;
        }
        ArrayList arrayList = this.f17563b;
        if (arrayList.size() > 0) {
            return Math.max(((c) arrayList.get(0)).f17547b, Math.min(i10, ((c) i0.a.i(1, arrayList)).f17547b));
        }
        return i10;
    }

    @Override
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        d dVar = new d(-1, -1);
        dVar.f17552c = 0.0f;
        return dVar;
    }

    @Override
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public a getAdapter() {
        return this.f17568e;
    }

    @Override
    public final int getChildDrawingOrder(int i10, int i11) {
        if (this.f17576k0 == 2) {
            i11 = (i10 - 1) - i11;
        }
        return ((d) ((View) this.f17577l0.get(i11)).getLayoutParams()).f17554f;
    }

    public int getCurrentItem() {
        return this.f17570f;
    }

    public int getOffscreenPageLimit() {
        return this.H;
    }

    public int getPageMargin() {
        return this.f17582w;
    }

    public final void h(int i10) {
        e eVar = this.f17573h0;
        if (eVar != null) {
            eVar.b(i10);
        }
        ArrayList arrayList = this.f17572g0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                e eVar2 = (e) this.f17572g0.get(i11);
                if (eVar2 != null) {
                    eVar2.b(i10);
                }
            }
        }
    }

    public final void i() {
        if (!this.f17562a0) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.f17568e != null) {
            VelocityTracker velocityTracker = this.S;
            velocityTracker.computeCurrentVelocity(1000, this.U);
            int xVelocity = (int) velocityTracker.getXVelocity(this.R);
            this.G = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            c cVarL = l();
            y(g(cVarL.f17547b, xVelocity, ((scrollX / clientWidth) - cVarL.f17549e) / cVarL.d, (int) (this.N - this.P)), xVelocity, true, true);
        }
        this.I = false;
        this.J = false;
        VelocityTracker velocityTracker2 = this.S;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.S = null;
        }
        this.f17562a0 = false;
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
            ArrayList arrayList = this.f17563b;
            if (i10 >= arrayList.size()) {
                return null;
            }
            c cVar = (c) arrayList.get(i10);
            if (this.f17568e.f(view, cVar.f17546a)) {
                return cVar;
            }
            i10++;
        }
    }

    public final c l() {
        c cVar;
        int i10;
        int clientWidth = getClientWidth();
        float f10 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f11 = clientWidth > 0 ? this.f17582w / clientWidth : 0.0f;
        c cVar2 = null;
        float f12 = 0.0f;
        int i11 = -1;
        int i12 = 0;
        boolean z10 = true;
        while (true) {
            ArrayList arrayList = this.f17563b;
            if (i12 >= arrayList.size()) {
                break;
            }
            c cVar3 = (c) arrayList.get(i12);
            if (z10 || cVar3.f17547b == (i10 = i11 + 1)) {
                cVar = cVar3;
            } else {
                float f13 = f10 + f12 + f11;
                c cVar4 = this.f17565c;
                cVar4.f17549e = f13;
                cVar4.f17547b = i10;
                this.f17568e.getClass();
                cVar4.d = 1.0f;
                i12--;
                cVar = cVar4;
            }
            f10 = cVar.f17549e;
            float f14 = cVar.d + f10 + f11;
            if (!z10 && scrollX < f10) {
                break;
            }
            if (scrollX < f14 || i12 == arrayList.size() - 1) {
                return cVar;
            }
            int i13 = cVar.f17547b;
            float f15 = cVar.d;
            i12++;
            c cVar5 = cVar;
            i11 = i13;
            f12 = f15;
            cVar2 = cVar5;
            z10 = false;
        }
        return cVar2;
    }

    public final c m(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f17563b;
            if (i11 >= arrayList.size()) {
                return null;
            }
            c cVar = (c) arrayList.get(i11);
            if (cVar.f17547b == i10) {
                return cVar;
            }
            i11++;
        }
    }

    public final void n(float f10, int i10, int i11) {
        int iMax;
        int width;
        int left;
        if (this.f17571f0 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.f17550a) {
                    int i13 = dVar.f17551b & 7;
                    if (i13 != 1) {
                        if (i13 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i13 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    } else {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i14 = iMax;
                    width = paddingLeft;
                    paddingLeft = i14;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        e eVar = this.f17573h0;
        if (eVar != null) {
            eVar.c(f10, i10, i11);
        }
        ArrayList arrayList = this.f17572g0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i15 = 0; i15 < size; i15++) {
                e eVar2 = (e) this.f17572g0.get(i15);
                if (eVar2 != null) {
                    eVar2.c(f10, i10, i11);
                }
            }
        }
        if (this.f17574i0 != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i16 = 0; i16 < childCount2; i16++) {
                View childAt2 = getChildAt(i16);
                if (!((d) childAt2.getLayoutParams()).f17550a) {
                    float left2 = (childAt2.getLeft() - scrollX2) / getClientWidth();
                    y8 y8Var = (y8) this.f17574i0.f8237b;
                    p7 p7Var = (p7) childAt2;
                    if (Math.abs(left2) >= 1.0f) {
                        p7Var.a(false);
                        AndroidUtilities.runOnUIThread(new y9(p7Var, 22), 16L);
                    } else {
                        if (!p7Var.d) {
                            p7Var.a(true);
                            if (y8Var.f13864t0 != null) {
                                e4 e4Var = p7Var.f13828a;
                                long j10 = p7Var.f13829b;
                                ArrayList arrayList2 = p7Var.f13830c;
                                e4Var.f13291x1 = j10;
                                e4Var.f13283v1 = arrayList2;
                                e4Var.o0(-1);
                            } else {
                                p7Var.f13828a.U0(-1, p7Var.f13829b);
                            }
                        }
                        p7Var.f13828a.setOffset(left2);
                        childAt2.setCameraDistance(childAt2.getWidth() * 15);
                        childAt2.setPivotX(left2 < 0.0f ? childAt2.getWidth() : 0.0f);
                        childAt2.setPivotY(childAt2.getHeight() * 0.5f);
                        childAt2.setRotationY(left2 * 90.0f);
                    }
                }
            }
        }
        this.f17569e0 = true;
    }

    public final void o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.R) {
            int i10 = actionIndex == 0 ? 1 : 0;
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
        this.f17567d0 = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        removeCallbacks(this.m0);
        Scroller scroller = this.f17580r;
        if (scroller != null && !scroller.isFinished()) {
            this.f17580r.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f10;
        super.onDraw(canvas);
        if (this.f17582w <= 0 || this.f17583x == null) {
            return;
        }
        ArrayList arrayList = this.f17563b;
        if (arrayList.size() <= 0 || this.f17568e == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f11 = width;
        float f12 = this.f17582w / f11;
        int i11 = 0;
        c cVar = (c) arrayList.get(0);
        float f13 = cVar.f17549e;
        int size = arrayList.size();
        int i12 = cVar.f17547b;
        int i13 = ((c) arrayList.get(size - 1)).f17547b;
        while (i12 < i13) {
            while (true) {
                i10 = cVar.f17547b;
                if (i12 <= i10 || i11 >= size) {
                    break;
                }
                i11++;
                cVar = (c) arrayList.get(i11);
            }
            if (i12 == i10) {
                float f14 = cVar.f17549e;
                float f15 = cVar.d;
                f10 = (f14 + f15) * f11;
                f13 = f14 + f15 + f12;
            } else {
                this.f17568e.getClass();
                f10 = (f13 + 1.0f) * f11;
                f13 = 1.0f + f12 + f13;
            }
            if (this.f17582w + f10 > scrollX) {
                this.f17583x.setBounds(Math.round(f10), this.f17584y, Math.round(this.f17582w + f10), this.A);
                this.f17583x.draw(canvas);
            }
            if (f10 > scrollX + width) {
                return;
            }
            i12++;
            arrayList = arrayList;
            scrollX = scrollX;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            v();
            return false;
        }
        if (action != 0) {
            if (this.I) {
                return true;
            }
            if (this.J) {
                return false;
            }
        }
        if (action == 0) {
            float x8 = motionEvent.getX();
            this.P = x8;
            this.N = x8;
            float y10 = motionEvent.getY();
            this.Q = y10;
            this.O = y10;
            this.R = motionEvent.getPointerId(0);
            this.J = false;
            this.f17581s = true;
            this.f17580r.computeScrollOffset();
            if (this.f17579n0 != 2 || Math.abs(this.f17580r.getFinalX() - this.f17580r.getCurrX()) <= this.W) {
                e(false);
                this.I = false;
            } else {
                this.f17580r.abortAnimation();
                this.G = false;
                s();
                this.I = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i10 = this.R;
            if (i10 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i10);
                float x10 = motionEvent.getX(iFindPointerIndex);
                float f10 = x10 - this.N;
                float fAbs = Math.abs(f10);
                float y11 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y11 - this.Q);
                if (f10 != 0.0f) {
                    float f11 = this.N;
                    if ((f11 >= this.L || f10 <= 0.0f) && ((f11 <= getWidth() - this.L || f10 >= 0.0f) && d((int) f10, (int) x10, (int) y11, this, false))) {
                        this.N = x10;
                        this.O = y11;
                        this.J = true;
                        return false;
                    }
                }
                int i11 = this.M;
                float f12 = i11;
                if (fAbs > f12 && fAbs * 0.5f > fAbs2) {
                    this.I = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f13 = this.P;
                    float f14 = i11;
                    this.N = f10 > 0.0f ? f13 + f14 : f13 - f14;
                    this.O = y11;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > f12) {
                    this.J = true;
                }
                if (this.I && r(x10)) {
                    WeakHashMap weakHashMap = j0.f46605a;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            o(motionEvent);
        }
        if (this.S == null) {
            this.S = VelocityTracker.obtain();
        }
        this.S.addMovement(motionEvent);
        return this.I;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        c cVarK;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.f17550a) {
                    int i18 = dVar.f17551b;
                    int i19 = i18 & 7;
                    int i20 = i18 & 112;
                    if (i19 != 1) {
                        if (i19 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i19 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i14 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i20 != 16) {
                            if (i20 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i20 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i15 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i21 = paddingLeft + scrollX;
                            childAt.layout(i21, paddingTop, childAt.getMeasuredWidth() + i21, childAt.getMeasuredHeight() + paddingTop);
                            i16++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i15 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i22 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i22;
                        int i23 = paddingLeft + scrollX;
                        childAt.layout(i23, paddingTop, childAt.getMeasuredWidth() + i23, childAt.getMeasuredHeight() + paddingTop);
                        i16++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i14 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i24 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i24;
                    if (i20 != 16) {
                        if (i20 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i20 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i15 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i25 = paddingLeft + scrollX;
                        childAt.layout(i25, paddingTop, childAt.getMeasuredWidth() + i25, childAt.getMeasuredHeight() + paddingTop);
                        i16++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax2 = Math.max((i15 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i26 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i26;
                    int i27 = paddingLeft + scrollX;
                    childAt.layout(i27, paddingTop, childAt.getMeasuredWidth() + i27, childAt.getMeasuredHeight() + paddingTop);
                    i16++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i28 = (i14 - paddingLeft) - paddingRight;
        for (int i29 = 0; i29 < childCount; i29++) {
            View childAt2 = getChildAt(i29);
            if (childAt2.getVisibility() != 8) {
                d dVar2 = (d) childAt2.getLayoutParams();
                if (!dVar2.f17550a && (cVarK = k(childAt2)) != null) {
                    float f10 = i28;
                    int i30 = ((int) (cVarK.f17549e * f10)) + paddingLeft;
                    if (dVar2.d) {
                        dVar2.d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f10 * dVar2.f17552c), 1073741824), View.MeasureSpec.makeMeasureSpec((i15 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i30, paddingTop, childAt2.getMeasuredWidth() + i30, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f17584y = paddingTop;
        this.A = i15 - paddingBottom;
        this.f17571f0 = i16;
        if (this.f17567d0) {
            z11 = false;
            w(this.f17570f, 0, false, false);
        } else {
            z11 = false;
        }
        this.f17567d0 = z11;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        d dVar;
        d dVar2;
        int i12;
        int i13;
        int i14;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.L = Math.min(measuredWidth / 10, this.K);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i15 = 0;
        while (true) {
            boolean z10 = true;
            int i16 = 1073741824;
            if (i15 >= childCount) {
                break;
            }
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8 && (dVar2 = (d) childAt.getLayoutParams()) != null && dVar2.f17550a) {
                int i17 = dVar2.f17551b;
                int i18 = i17 & 7;
                int i19 = i17 & 112;
                boolean z11 = i19 == 48 || i19 == 80;
                if (i18 != 3 && i18 != 5) {
                    z10 = false;
                }
                int i20 = Integer.MIN_VALUE;
                if (z11) {
                    i20 = 1073741824;
                } else {
                    i12 = z10 ? 1073741824 : Integer.MIN_VALUE;
                    i13 = ((ViewGroup.LayoutParams) dVar2).width;
                    if (i13 != -2) {
                        if (i13 == -1) {
                            i13 = paddingLeft;
                        }
                        i20 = 1073741824;
                    } else {
                        i13 = paddingLeft;
                    }
                    i14 = ((ViewGroup.LayoutParams) dVar2).height;
                    if (i14 != -2) {
                        i14 = measuredHeight;
                        i16 = i12;
                    } else if (i14 == -1) {
                        i14 = measuredHeight;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i13, i20), View.MeasureSpec.makeMeasureSpec(i14, i16));
                    if (z11) {
                        measuredHeight -= childAt.getMeasuredHeight();
                    } else if (z10) {
                        paddingLeft -= childAt.getMeasuredWidth();
                    }
                }
                i13 = ((ViewGroup.LayoutParams) dVar2).width;
                if (i13 != -2) {
                    if (i13 == -1) {
                        i13 = paddingLeft;
                    }
                    i20 = 1073741824;
                } else {
                    i13 = paddingLeft;
                }
                i14 = ((ViewGroup.LayoutParams) dVar2).height;
                if (i14 != -2) {
                    i14 = measuredHeight;
                    i16 = i12;
                } else if (i14 == -1) {
                    i14 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i13, i20), View.MeasureSpec.makeMeasureSpec(i14, i16));
                if (z11) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z10) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i15++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.D = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.E = true;
        s();
        this.E = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((dVar = (d) childAt2.getLayoutParams()) == null || !dVar.f17550a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * dVar.f17552c), 1073741824), this.D);
            }
        }
    }

    @Override
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        int i13;
        c cVarK;
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
            if (childAt.getVisibility() == 0 && (cVarK = k(childAt)) != null && cVarK.f17547b == this.f17570f && childAt.requestFocus(i10, rect)) {
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
        super.onRestoreInstanceState(fVar.f10511a);
        if (this.f17568e != null) {
            y(fVar.f17555c, 0, false, true);
        } else {
            this.h = fVar.f17555c;
            this.f17578n = fVar.d;
        }
    }

    @Override
    public final Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        fVar.f17555c = this.f17570f;
        if (this.f17568e != null) {
            fVar.d = null;
        }
        return fVar;
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.f17582w;
            u(i10, i12, i14, i14);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (!this.f17562a0) {
            boolean zV = false;
            if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.f17568e) == null || aVar.b() == 0) {
                return false;
            }
            if (this.S == null) {
                this.S = VelocityTracker.obtain();
            }
            this.S.addMovement(motionEvent);
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                this.f17580r.abortAnimation();
                this.G = false;
                s();
                float x8 = motionEvent.getX();
                this.P = x8;
                this.N = x8;
                float y10 = motionEvent.getY();
                this.Q = y10;
                this.O = y10;
                this.R = motionEvent.getPointerId(0);
            } else if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action == 5) {
                            int actionIndex = motionEvent.getActionIndex();
                            this.N = motionEvent.getX(actionIndex);
                            this.R = motionEvent.getPointerId(actionIndex);
                        } else if (action == 6) {
                            o(motionEvent);
                            this.N = motionEvent.getX(motionEvent.findPointerIndex(this.R));
                        }
                    } else if (this.I) {
                        w(this.f17570f, 0, true, false);
                        zV = v();
                    }
                } else if (!this.I) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.R);
                    if (iFindPointerIndex == -1) {
                        zV = v();
                    } else {
                        float x10 = motionEvent.getX(iFindPointerIndex);
                        float fAbs = Math.abs(x10 - this.N);
                        float y11 = motionEvent.getY(iFindPointerIndex);
                        float fAbs2 = Math.abs(y11 - this.O);
                        int i10 = this.M;
                        if (fAbs > i10 && fAbs > fAbs2) {
                            this.I = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            float f10 = this.P;
                            this.N = x10 - f10 > 0.0f ? f10 + i10 : f10 - i10;
                            this.O = y11;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                        if (this.I) {
                            zV = r(motionEvent.getX(motionEvent.findPointerIndex(this.R)));
                        }
                    }
                } else if (this.I) {
                    zV = r(motionEvent.getX(motionEvent.findPointerIndex(this.R)));
                }
            } else if (this.I) {
                VelocityTracker velocityTracker = this.S;
                velocityTracker.computeCurrentVelocity(1000, this.U);
                int xVelocity = (int) velocityTracker.getXVelocity(this.R);
                this.G = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                c cVarL = l();
                float f11 = clientWidth;
                y(g(cVarL.f17547b, xVelocity, ((scrollX / f11) - cVarL.f17549e) / (cVarL.d + (this.f17582w / f11)), (int) (motionEvent.getX(motionEvent.findPointerIndex(this.R)) - this.P)), xVelocity, true, true);
                zV = v();
            }
            if (zV) {
                WeakHashMap weakHashMap = j0.f46605a;
                postInvalidateOnAnimation();
            }
        }
        return true;
    }

    public final boolean p() {
        a aVar = this.f17568e;
        if (aVar == null || this.f17570f >= aVar.b() - 1) {
            return false;
        }
        x(this.f17570f + 1, true);
        return true;
    }

    public final boolean q(int i10) {
        if (this.f17563b.size() == 0) {
            if (!this.f17567d0) {
                this.f17569e0 = false;
                n(0.0f, 0, 0);
                if (!this.f17569e0) {
                    throw new IllegalStateException("onPageScrolled did not call superclass implementation");
                }
            }
            return false;
        }
        c cVarL = l();
        int clientWidth = getClientWidth();
        int i11 = this.f17582w;
        int i12 = clientWidth + i11;
        float f10 = clientWidth;
        int i13 = cVarL.f17547b;
        float f11 = ((i10 / f10) - cVarL.f17549e) / (cVarL.d + (i11 / f10));
        this.f17569e0 = false;
        n(f11, i13, (int) (i12 * f11));
        if (this.f17569e0) {
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
        ArrayList arrayList = this.f17563b;
        boolean z12 = false;
        c cVar = (c) arrayList.get(0);
        c cVar2 = (c) i0.a.i(1, arrayList);
        if (cVar.f17547b != 0) {
            f12 = cVar.f17549e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (cVar2.f17547b != this.f17568e.b() - 1) {
            f13 = cVar2.f17549e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f12) {
            if (z10) {
                this.f17564b0.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z11) {
                this.f17566c0.onPull(Math.abs(scrollX - f13) / clientWidth);
                z12 = true;
            }
            scrollX = f13;
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
        t(this.f17570f);
    }

    public void setAdapter(a aVar) {
        ArrayList arrayList = this.f17563b;
        a aVar2 = this.f17568e;
        if (aVar2 != null) {
            synchronized (aVar2) {
                aVar2.f17545b = null;
            }
            this.f17568e.getClass();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                c cVar = (c) arrayList.get(i10);
                a aVar3 = this.f17568e;
                int i11 = cVar.f17547b;
                aVar3.a(this, cVar.f17546a);
            }
            this.f17568e.getClass();
            arrayList.clear();
            int i12 = 0;
            while (i12 < getChildCount()) {
                if (!((d) getChildAt(i12).getLayoutParams()).f17550a) {
                    removeViewAt(i12);
                    i12--;
                }
                i12++;
            }
            this.f17570f = 0;
            scrollTo(0, 0);
        }
        this.f17568e = aVar;
        this.f17561a = 0;
        if (aVar != null) {
            if (this.v == null) {
                this.v = new h1.a(this, 2);
            }
            this.f17568e.i(this.v);
            this.G = false;
            boolean z10 = this.f17567d0;
            this.f17567d0 = true;
            this.f17561a = this.f17568e.b();
            if (this.h >= 0) {
                this.f17568e.getClass();
                y(this.h, 0, false, true);
                this.h = -1;
                this.f17578n = null;
                return;
            }
            if (z10) {
                requestLayout();
            } else {
                s();
            }
        }
    }

    public void setCurrentItem(int i10) {
        this.G = false;
        y(i10, 0, !this.f17567d0, false);
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
        this.f17573h0 = eVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.f17582w;
        this.f17582w = i10;
        int width = getWidth();
        u(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f17583x = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i10) {
        if (this.f17579n0 == i10) {
            return;
        }
        this.f17579n0 = i10;
        if (this.f17574i0 != null) {
            boolean z10 = i10 != 0;
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                getChildAt(i11).setLayerType(z10 ? this.f17575j0 : 0, null);
            }
        }
        e eVar = this.f17573h0;
        if (eVar != null) {
            eVar.d(i10);
        }
        ArrayList arrayList = this.f17572g0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                e eVar2 = (e) this.f17572g0.get(i12);
                if (eVar2 != null) {
                    eVar2.d(i10);
                }
            }
        }
    }

    public final void t(int i10) {
        c cVarM;
        String hexString;
        ArrayList arrayList;
        c cVarA;
        float f10;
        c cVarK;
        c cVarK2;
        int i11;
        int i12;
        c cVar;
        c cVar2;
        c cVar3;
        int i13 = this.f17570f;
        if (i13 != i10) {
            cVarM = m(i13);
            this.f17570f = i10;
        } else {
            cVarM = null;
        }
        if (this.f17568e == null) {
            z();
            return;
        }
        if (this.G) {
            z();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.f17568e.getClass();
        int i14 = this.H;
        int iMax = Math.max(0, this.f17570f - i14);
        int iB = this.f17568e.b();
        int iMin = Math.min(iB - 1, this.f17570f + i14);
        if (iB != this.f17561a) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            StringBuilder sb2 = new StringBuilder("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
            i0.a.x(sb2, this.f17561a, ", found: ", iB, " Pager id: ");
            sb2.append(hexString);
            sb2.append(" Pager class: ");
            sb2.append(getClass());
            sb2.append(" Problematic adapter: ");
            sb2.append(this.f17568e.getClass());
            throw new IllegalStateException(sb2.toString());
        }
        int i15 = 0;
        while (true) {
            arrayList = this.f17563b;
            if (i15 < arrayList.size()) {
                cVarA = (c) arrayList.get(i15);
                int i16 = cVarA.f17547b;
                int i17 = this.f17570f;
                if (i16 >= i17) {
                    if (i16 != i17) {
                        break;
                    } else {
                        break;
                    }
                }
                i15++;
            }
            cVarA = null;
            break;
        }
        if (cVarA == null && iB > 0) {
            cVarA = a(this.f17570f, i15);
        }
        if (cVarA != null) {
            int i18 = i15 - 1;
            c cVar4 = i18 >= 0 ? (c) arrayList.get(i18) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (getPaddingLeft() / clientWidth) + (2.0f - cVarA.d);
            float f11 = 0.0f;
            for (int i19 = this.f17570f - 1; i19 >= 0; i19--) {
                if (f11 < paddingLeft || i19 >= iMax) {
                    if (cVar4 == null || i19 != cVar4.f17547b) {
                        f11 += a(i19, i18 + 1).d;
                        i15++;
                        if (i18 >= 0) {
                            cVar3 = (c) arrayList.get(i18);
                        } else {
                            cVar3 = null;
                        }
                    } else {
                        f11 += cVar4.d;
                        i18--;
                        if (i18 >= 0) {
                            cVar3 = (c) arrayList.get(i18);
                        } else {
                            cVar3 = null;
                        }
                    }
                    cVar4 = cVar3;
                } else {
                    if (cVar4 == null) {
                        break;
                    }
                    if (i19 == cVar4.f17547b && !cVar4.f17548c) {
                        arrayList.remove(i18);
                        this.f17568e.a(this, cVar4.f17546a);
                        i18--;
                        i15--;
                        if (i18 >= 0) {
                            cVar3 = (c) arrayList.get(i18);
                        } else {
                            cVar3 = null;
                        }
                        cVar4 = cVar3;
                    }
                }
            }
            f10 = 0.0f;
            float f12 = cVarA.d;
            int i20 = i15 + 1;
            if (f12 < 2.0f) {
                c cVar5 = i20 < arrayList.size() ? (c) arrayList.get(i20) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i21 = i20;
                for (int i22 = this.f17570f + 1; i22 < iB; i22++) {
                    if (f12 >= paddingRight && i22 > iMin) {
                        if (cVar5 == null) {
                            break;
                        }
                        if (i22 == cVar5.f17547b && !cVar5.f17548c) {
                            arrayList.remove(i21);
                            this.f17568e.a(this, cVar5.f17546a);
                            if (i21 < arrayList.size()) {
                                cVar5 = (c) arrayList.get(i21);
                            } else {
                                cVar5 = null;
                            }
                        }
                    } else if (cVar5 == null || i22 != cVar5.f17547b) {
                        c cVarA2 = a(i22, i21);
                        i21++;
                        f12 += cVarA2.d;
                        if (i21 < arrayList.size()) {
                            cVar5 = (c) arrayList.get(i21);
                        } else {
                            cVar5 = null;
                        }
                    } else {
                        f12 += cVar5.d;
                        i21++;
                        if (i21 < arrayList.size()) {
                            cVar5 = (c) arrayList.get(i21);
                        } else {
                            cVar5 = null;
                        }
                    }
                }
            }
            int iB2 = this.f17568e.b();
            int clientWidth2 = getClientWidth();
            float f13 = clientWidth2 > 0 ? this.f17582w / clientWidth2 : 0.0f;
            if (cVarM != null) {
                int i23 = cVarM.f17547b;
                int i24 = cVarA.f17547b;
                if (i23 < i24) {
                    float f14 = cVarM.f17549e + cVarM.d + f13;
                    int i25 = i23 + 1;
                    int i26 = 0;
                    while (i25 <= cVarA.f17547b && i26 < arrayList.size()) {
                        Object obj = arrayList.get(i26);
                        while (true) {
                            cVar2 = (c) obj;
                            if (i25 <= cVar2.f17547b || i26 >= arrayList.size() - 1) {
                                break;
                            }
                            i26++;
                            obj = arrayList.get(i26);
                        }
                        while (i25 < cVar2.f17547b) {
                            this.f17568e.getClass();
                            f14 += 1.0f + f13;
                            i25++;
                        }
                        cVar2.f17549e = f14;
                        f14 += cVar2.d + f13;
                        i25++;
                    }
                } else if (i23 > i24) {
                    int size = arrayList.size() - 1;
                    float f15 = cVarM.f17549e;
                    while (true) {
                        i23--;
                        if (i23 < cVarA.f17547b || size < 0) {
                            break;
                        }
                        Object obj2 = arrayList.get(size);
                        while (true) {
                            cVar = (c) obj2;
                            if (i23 >= cVar.f17547b || size <= 0) {
                                break;
                            }
                            size--;
                            obj2 = arrayList.get(size);
                        }
                        while (i23 > cVar.f17547b) {
                            this.f17568e.getClass();
                            f15 -= 1.0f + f13;
                            i23--;
                        }
                        f15 -= cVar.d + f13;
                        cVar.f17549e = f15;
                    }
                }
            }
            int size2 = arrayList.size();
            float f16 = cVarA.f17549e;
            int i27 = cVarA.f17547b;
            int i28 = i27 - 1;
            this.B = i27 == 0 ? f16 : -3.4028235E38f;
            int i29 = iB2 - 1;
            this.C = i27 == i29 ? (cVarA.d + f16) - 1.0f : Float.MAX_VALUE;
            int i30 = i15 - 1;
            while (i30 >= 0) {
                c cVar6 = (c) arrayList.get(i30);
                while (true) {
                    i12 = cVar6.f17547b;
                    if (i28 <= i12) {
                        break;
                    }
                    i28--;
                    this.f17568e.getClass();
                    f16 -= 1.0f + f13;
                }
                f16 -= cVar6.d + f13;
                cVar6.f17549e = f16;
                if (i12 == 0) {
                    this.B = f16;
                }
                i30--;
                i28--;
            }
            float f17 = cVarA.f17549e + cVarA.d + f13;
            int i31 = cVarA.f17547b;
            while (true) {
                i31++;
                if (i20 >= size2) {
                    break;
                }
                c cVar7 = (c) arrayList.get(i20);
                while (true) {
                    i11 = cVar7.f17547b;
                    if (i31 >= i11) {
                        break;
                    }
                    i31++;
                    this.f17568e.getClass();
                    f17 += 1.0f + f13;
                }
                if (i11 == i29) {
                    this.C = (cVar7.d + f17) - 1.0f;
                }
                cVar7.f17549e = f17;
                f17 += cVar7.d + f13;
                i20++;
            }
            this.f17568e.h(this.f17570f);
        } else {
            f10 = 0.0f;
        }
        this.f17568e.getClass();
        int childCount = getChildCount();
        for (int i32 = 0; i32 < childCount; i32++) {
            View childAt = getChildAt(i32);
            d dVar = (d) childAt.getLayoutParams();
            dVar.f17554f = i32;
            if (!dVar.f17550a && dVar.f17552c == f10 && (cVarK2 = k(childAt)) != null) {
                dVar.f17552c = cVarK2.d;
                dVar.f17553e = cVarK2.f17547b;
            }
        }
        z();
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            if (viewFindFocus == null) {
                cVarK = null;
                break;
            }
            while (true) {
                Object parent = viewFindFocus.getParent();
                if (parent == this) {
                    cVarK = k(viewFindFocus);
                    break;
                } else {
                    if (parent == null || !(parent instanceof View)) {
                        cVarK = null;
                        break;
                    }
                    viewFindFocus = (View) parent;
                }
            }
            if (cVarK == null || cVarK.f17547b != this.f17570f) {
                for (int i33 = 0; i33 < getChildCount(); i33++) {
                    View childAt2 = getChildAt(i33);
                    c cVarK3 = k(childAt2);
                    if (cVarK3 != null && cVarK3.f17547b == this.f17570f && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    public final void u(int i10, int i11, int i12, int i13) {
        if (i11 > 0 && !this.f17563b.isEmpty()) {
            if (!this.f17580r.isFinished()) {
                this.f17580r.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)), getScrollY());
                return;
            }
        }
        c cVarM = m(this.f17570f);
        int iMin = (int) ((cVarM != null ? Math.min(cVarM.f17549e, this.C) : 0.0f) * ((i10 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            e(false);
            scrollTo(iMin, getScrollY());
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
        this.f17564b0.onRelease();
        this.f17566c0.onRelease();
        return this.f17564b0.isFinished() || this.f17566c0.isFinished();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f17583x;
    }

    public final void w(int i10, int i11, boolean z10, boolean z11) {
        int iMax;
        int scrollX;
        int iAbs;
        c cVarM = m(i10);
        if (cVarM != null) {
            iMax = (int) (Math.max(this.B, Math.min(cVarM.f17549e, this.C)) * getClientWidth());
        } else {
            iMax = 0;
        }
        if (!z10) {
            if (z11) {
                h(i10);
            }
            e(false);
            scrollTo(iMax, 0);
            q(iMax);
            return;
        }
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
        } else {
            Scroller scroller = this.f17580r;
            if (scroller == null || scroller.isFinished()) {
                scrollX = getScrollX();
            } else {
                scrollX = this.f17581s ? this.f17580r.getCurrX() : this.f17580r.getStartX();
                this.f17580r.abortAnimation();
                setScrollingCacheEnabled(false);
            }
            int i12 = scrollX;
            int scrollY = getScrollY();
            int i13 = iMax - i12;
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
                float fSin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i13) * 1.0f) / f10) - 0.5f) * 0.47123894f)) * f11) + f11;
                int iAbs2 = Math.abs(i11);
                if (iAbs2 > 0) {
                    iAbs = Math.round(Math.abs(fSin / iAbs2) * 1000.0f) * 4;
                } else {
                    this.f17568e.getClass();
                    iAbs = (int) (((Math.abs(i13) / ((f10 * 1.0f) + this.f17582w)) + 1.0f) * 100.0f);
                }
                int iMin = Math.min(iAbs, 600);
                this.f17581s = false;
                this.f17580r.startScroll(i12, scrollY, i13, i14, iMin);
                WeakHashMap weakHashMap = j0.f46605a;
                postInvalidateOnAnimation();
            }
        }
        if (z11) {
            h(i10);
        }
    }

    public void x(int i10, boolean z10) {
        this.G = false;
        y(i10, 0, z10, false);
    }

    public final void y(int i10, int i11, boolean z10, boolean z11) {
        a aVar = this.f17568e;
        if (aVar == null || aVar.b() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        ArrayList arrayList = this.f17563b;
        if (!z11 && this.f17570f == i10 && arrayList.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        } else if (i10 >= this.f17568e.b()) {
            i10 = this.f17568e.b() - 1;
        }
        int i12 = this.H;
        int i13 = this.f17570f;
        if (i10 > i13 + i12 || i10 < i13 - i12) {
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                ((c) arrayList.get(i14)).f17548c = true;
            }
        }
        boolean z12 = this.f17570f != i10;
        if (!this.f17567d0) {
            t(i10);
            w(i10, i11, z10, z12);
        } else {
            this.f17570f = i10;
            if (z12) {
                h(i10);
            }
            requestLayout();
        }
    }

    public final void z() {
        if (this.f17576k0 != 0) {
            ArrayList arrayList = this.f17577l0;
            if (arrayList == null) {
                this.f17577l0 = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f17577l0.add(getChildAt(i10));
            }
            Collections.sort(this.f17577l0, f17560r0);
        }
    }

    @Override
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        d dVar = new d(context, attributeSet);
        dVar.f17552c = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f17557o0);
        dVar.f17551b = typedArrayObtainStyledAttributes.getInteger(0, 48);
        typedArrayObtainStyledAttributes.recycle();
        return dVar;
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(getContext().getDrawable(i10));
    }
}
