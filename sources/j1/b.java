package j1;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l2.h;
import r0.i0;
import s0.d;
public abstract class b extends r0.b {
    public static final Rect f11443n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public final AccessibilityManager h;
    public final View f11446i;
    public a f11447j;
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final Rect f11444f = new Rect();
    public final int[] f11445g = new int[2];
    public int f11448k = Integer.MIN_VALUE;
    public int f11449l = Integer.MIN_VALUE;
    public int f11450m = Integer.MIN_VALUE;

    public b(View view) {
        this.f11446i = view;
        this.h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap weakHashMap = i0.f41062a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override
    public final h a(View view) {
        if (this.f11447j == null) {
            this.f11447j = new a(this);
        }
        return this.f11447j;
    }

    @Override
    public final void c(View view, d dVar) {
        this.f41030a.onInitializeAccessibilityNodeInfo(view, dVar.f41559a);
    }

    public final AccessibilityEvent e(int i10, int i11) {
        View view = this.f11446i;
        if (i10 != -1) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i11);
            d j3 = j(i10);
            obtain.getText().add(j3.g());
            AccessibilityNodeInfo accessibilityNodeInfo = j3.f41559a;
            obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            obtain.setScrollable(accessibilityNodeInfo.isScrollable());
            obtain.setPassword(accessibilityNodeInfo.isPassword());
            obtain.setEnabled(accessibilityNodeInfo.isEnabled());
            obtain.setChecked(accessibilityNodeInfo.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(accessibilityNodeInfo.getClassName());
            obtain.setSource(view, i10);
            obtain.setPackageName(view.getContext().getPackageName());
            return obtain;
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain(i11);
        view.onInitializeAccessibilityEvent(obtain2);
        return obtain2;
    }

    public final boolean f(MotionEvent motionEvent) {
        int i10;
        AccessibilityManager accessibilityManager = this.h;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action == 10 && (i10 = this.f11450m) != Integer.MIN_VALUE) {
                    if (i10 != Integer.MIN_VALUE) {
                        this.f11450m = Integer.MIN_VALUE;
                        m(Integer.MIN_VALUE, 128);
                        m(i10, 256);
                        return true;
                    }
                } else {
                    return false;
                }
            } else {
                int g10 = g(motionEvent.getX(), motionEvent.getY());
                int i11 = this.f11450m;
                if (i11 != g10) {
                    this.f11450m = g10;
                    m(g10, 128);
                    m(i11, 256);
                }
                if (g10 == Integer.MIN_VALUE) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public abstract int g(float f7, float f10);

    public abstract void h(ArrayList arrayList);

    public final void i() {
        View view;
        ViewParent parent;
        if (this.h.isEnabled() && (parent = (view = this.f11446i).getParent()) != null) {
            AccessibilityEvent e = e(-1, 2048);
            e.setContentChangeTypes(1);
            parent.requestSendAccessibilityEvent(view, e);
        }
    }

    public final d j(int i10) {
        boolean z10;
        View view = this.f11446i;
        if (i10 == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            d dVar = new d(obtain);
            WeakHashMap weakHashMap = i0.f41062a;
            view.onInitializeAccessibilityNodeInfo(obtain);
            ArrayList arrayList = new ArrayList();
            h(arrayList);
            if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                dVar.f41559a.addChild(view, ((Integer) arrayList.get(i11)).intValue());
            }
            return dVar;
        }
        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
        d dVar2 = new d(obtain2);
        obtain2.setEnabled(true);
        obtain2.setFocusable(true);
        dVar2.i("android.view.View");
        Rect rect = f11443n;
        dVar2.h(rect);
        obtain2.setBoundsInScreen(rect);
        obtain2.setParent(view);
        l(i10, dVar2);
        if (dVar2.g() == null && obtain2.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.e;
        obtain2.getBoundsInParent(rect2);
        if (!rect2.equals(rect)) {
            int actions = obtain2.getActions();
            if ((actions & 64) == 0) {
                if ((actions & 128) == 0) {
                    obtain2.setPackageName(view.getContext().getPackageName());
                    dVar2.f41560b = i10;
                    obtain2.setSource(view, i10);
                    if (this.f11448k == i10) {
                        obtain2.setAccessibilityFocused(true);
                        dVar2.a(128);
                    } else {
                        obtain2.setAccessibilityFocused(false);
                        dVar2.a(64);
                    }
                    if (this.f11449l == i10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        dVar2.a(2);
                    } else if (obtain2.isFocusable()) {
                        dVar2.a(1);
                    }
                    obtain2.setFocused(z10);
                    int[] iArr = this.f11445g;
                    view.getLocationOnScreen(iArr);
                    Rect rect3 = this.d;
                    obtain2.getBoundsInScreen(rect3);
                    if (rect3.equals(rect)) {
                        obtain2.getBoundsInParent(rect3);
                        rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                    }
                    Rect rect4 = this.f11444f;
                    if (view.getLocalVisibleRect(rect4)) {
                        rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                        if (rect3.intersect(rect4)) {
                            obtain2.setBoundsInScreen(rect3);
                            if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                                ViewParent parent = view.getParent();
                                while (true) {
                                    if (parent instanceof View) {
                                        View view2 = (View) parent;
                                        if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                            break;
                                        }
                                        parent = view2.getParent();
                                    } else if (parent != null) {
                                        dVar2.p(true);
                                    }
                                }
                            }
                        }
                    }
                    return dVar2;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    public abstract boolean k(int i10, int i11);

    public abstract void l(int i10, d dVar);

    public final void m(int i10, int i11) {
        View view;
        ViewParent parent;
        if (i10 != Integer.MIN_VALUE && this.h.isEnabled() && (parent = (view = this.f11446i).getParent()) != null) {
            parent.requestSendAccessibilityEvent(view, e(i10, i11));
        }
    }
}
