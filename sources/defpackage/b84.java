package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.WeakHashMap;
public abstract class b84 extends q4 {
    public static final Rect n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public final AccessibilityManager h;
    public final View i;
    public a84 j;
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final Rect f = new Rect();
    public final int[] g = new int[2];
    public int k = Integer.MIN_VALUE;
    public int l = Integer.MIN_VALUE;
    public int m = Integer.MIN_VALUE;

    public b84(View view) {
        this.i = view;
        this.h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap weakHashMap = kfc.a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override
    public final ni6 a(View view) {
        a84 a84Var = this.j;
        if (a84Var == null) {
            a84 a84Var2 = new a84(this);
            this.j = a84Var2;
            return a84Var2;
        }
        return a84Var;
    }

    @Override
    public final void c(View view, u4 u4Var) {
        this.a.onInitializeAccessibilityNodeInfo(view, u4Var.a);
    }

    public final AccessibilityEvent e(int i, int i2) {
        View view = this.i;
        if (i != -1) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
            u4 j = j(i);
            obtain.getText().add(j.g());
            AccessibilityNodeInfo accessibilityNodeInfo = j.a;
            obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            obtain.setScrollable(accessibilityNodeInfo.isScrollable());
            obtain.setPassword(accessibilityNodeInfo.isPassword());
            obtain.setEnabled(accessibilityNodeInfo.isEnabled());
            obtain.setChecked(accessibilityNodeInfo.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                zo4.k("Callbacks must add text or a content description in populateEventForVirtualViewId()");
                return null;
            }
            obtain.setClassName(accessibilityNodeInfo.getClassName());
            obtain.setSource(view, i);
            obtain.setPackageName(view.getContext().getPackageName());
            return obtain;
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain(i2);
        view.onInitializeAccessibilityEvent(obtain2);
        return obtain2;
    }

    public final boolean f(MotionEvent motionEvent) {
        int i;
        AccessibilityManager accessibilityManager = this.h;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action == 10 && (i = this.m) != Integer.MIN_VALUE) {
                    if (i != Integer.MIN_VALUE) {
                        this.m = Integer.MIN_VALUE;
                        m(Integer.MIN_VALUE, 128);
                        m(i, 256);
                        return true;
                    }
                } else {
                    return false;
                }
            } else {
                int g = g(motionEvent.getX(), motionEvent.getY());
                int i2 = this.m;
                if (i2 != g) {
                    this.m = g;
                    m(g, 128);
                    m(i2, 256);
                }
                if (g == Integer.MIN_VALUE) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public abstract int g(float f, float f2);

    public abstract void h(ArrayList arrayList);

    public final void i() {
        View view;
        ViewParent parent;
        if (this.h.isEnabled() && (parent = (view = this.i).getParent()) != null) {
            AccessibilityEvent e = e(-1, 2048);
            e.setContentChangeTypes(1);
            parent.requestSendAccessibilityEvent(view, e);
        }
    }

    public final u4 j(int i) {
        boolean z;
        View view = this.i;
        if (i == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            u4 u4Var = new u4(obtain);
            WeakHashMap weakHashMap = kfc.a;
            view.onInitializeAccessibilityNodeInfo(obtain);
            ArrayList arrayList = new ArrayList();
            h(arrayList);
            if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
                zo4.k("Views cannot have both real and virtual children");
                return null;
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                u4Var.a.addChild(view, ((Integer) arrayList.get(i2)).intValue());
            }
            return u4Var;
        }
        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
        u4 u4Var2 = new u4(obtain2);
        obtain2.setEnabled(true);
        obtain2.setFocusable(true);
        u4Var2.i("android.view.View");
        Rect rect = n;
        u4Var2.h(rect);
        obtain2.setBoundsInScreen(rect);
        obtain2.setParent(view);
        l(i, u4Var2);
        if (u4Var2.g() == null && obtain2.getContentDescription() == null) {
            zo4.k("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
            return null;
        }
        Rect rect2 = this.e;
        obtain2.getBoundsInParent(rect2);
        if (!rect2.equals(rect)) {
            int actions = obtain2.getActions();
            if ((actions & 64) == 0) {
                if ((actions & 128) == 0) {
                    obtain2.setPackageName(view.getContext().getPackageName());
                    u4Var2.b = i;
                    obtain2.setSource(view, i);
                    if (this.k == i) {
                        obtain2.setAccessibilityFocused(true);
                        u4Var2.a(128);
                    } else {
                        obtain2.setAccessibilityFocused(false);
                        u4Var2.a(64);
                    }
                    if (this.l == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        u4Var2.a(2);
                    } else if (obtain2.isFocusable()) {
                        u4Var2.a(1);
                    }
                    obtain2.setFocused(z);
                    int[] iArr = this.g;
                    view.getLocationOnScreen(iArr);
                    Rect rect3 = this.d;
                    obtain2.getBoundsInScreen(rect3);
                    if (rect3.equals(rect)) {
                        obtain2.getBoundsInParent(rect3);
                        rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                    }
                    Rect rect4 = this.f;
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
                                        u4Var2.p(true);
                                    }
                                }
                            }
                        }
                    }
                    return u4Var2;
                }
                zo4.k("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
                return null;
            }
            zo4.k("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        zo4.k("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        return null;
    }

    public boolean k(int i, int i2) {
        return false;
    }

    public abstract void l(int i, u4 u4Var);

    public final void m(int i, int i2) {
        View view;
        ViewParent parent;
        if (i != Integer.MIN_VALUE && this.h.isEnabled() && (parent = (view = this.i).getParent()) != null) {
            parent.requestSendAccessibilityEvent(view, e(i, i2));
        }
    }
}
