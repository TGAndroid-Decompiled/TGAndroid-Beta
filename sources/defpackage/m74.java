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
public abstract class m74 extends r4 {
    public static final Rect n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public final AccessibilityManager h;
    public final View i;
    public l74 j;
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final Rect f = new Rect();
    public final int[] g = new int[2];
    public int k = Integer.MIN_VALUE;
    public int l = Integer.MIN_VALUE;
    public int m = Integer.MIN_VALUE;

    public m74(View view) {
        this.i = view;
        this.h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap weakHashMap = ihc.a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override
    public final ri6 a(View view) {
        l74 l74Var = this.j;
        if (l74Var == null) {
            l74 l74Var2 = new l74(this);
            this.j = l74Var2;
            return l74Var2;
        }
        return l74Var;
    }

    @Override
    public final void c(View view, v4 v4Var) {
        this.a.onInitializeAccessibilityNodeInfo(view, v4Var.a);
    }

    public final AccessibilityEvent e(int i, int i2) {
        View view = this.i;
        if (i != -1) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
            v4 j = j(i);
            obtain.getText().add(j.g());
            AccessibilityNodeInfo accessibilityNodeInfo = j.a;
            obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            obtain.setScrollable(accessibilityNodeInfo.isScrollable());
            obtain.setPassword(accessibilityNodeInfo.isPassword());
            obtain.setEnabled(accessibilityNodeInfo.isEnabled());
            obtain.setChecked(accessibilityNodeInfo.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                xi4.l("Callbacks must add text or a content description in populateEventForVirtualViewId()");
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

    public final v4 j(int i) {
        boolean z;
        View view = this.i;
        if (i == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            v4 v4Var = new v4(obtain);
            WeakHashMap weakHashMap = ihc.a;
            view.onInitializeAccessibilityNodeInfo(obtain);
            ArrayList arrayList = new ArrayList();
            h(arrayList);
            if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
                xi4.l("Views cannot have both real and virtual children");
                return null;
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                v4Var.a.addChild(view, ((Integer) arrayList.get(i2)).intValue());
            }
            return v4Var;
        }
        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
        v4 v4Var2 = new v4(obtain2);
        obtain2.setEnabled(true);
        obtain2.setFocusable(true);
        v4Var2.i("android.view.View");
        Rect rect = n;
        v4Var2.h(rect);
        obtain2.setBoundsInScreen(rect);
        obtain2.setParent(view);
        l(i, v4Var2);
        if (v4Var2.g() == null && obtain2.getContentDescription() == null) {
            xi4.l("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
            return null;
        }
        Rect rect2 = this.e;
        obtain2.getBoundsInParent(rect2);
        if (!rect2.equals(rect)) {
            int actions = obtain2.getActions();
            if ((actions & 64) == 0) {
                if ((actions & 128) == 0) {
                    obtain2.setPackageName(view.getContext().getPackageName());
                    v4Var2.b = i;
                    obtain2.setSource(view, i);
                    if (this.k == i) {
                        obtain2.setAccessibilityFocused(true);
                        v4Var2.a(128);
                    } else {
                        obtain2.setAccessibilityFocused(false);
                        v4Var2.a(64);
                    }
                    if (this.l == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        v4Var2.a(2);
                    } else if (obtain2.isFocusable()) {
                        v4Var2.a(1);
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
                                        v4Var2.p(true);
                                    }
                                }
                            }
                        }
                    }
                    return v4Var2;
                }
                xi4.l("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
                return null;
            }
            xi4.l("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        xi4.l("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        return null;
    }

    public boolean k(int i, int i2) {
        return false;
    }

    public abstract void l(int i, v4 v4Var);

    public final void m(int i, int i2) {
        View view;
        ViewParent parent;
        if (i != Integer.MIN_VALUE && this.h.isEnabled() && (parent = (view = this.i).getParent()) != null) {
            parent.requestSendAccessibilityEvent(view, e(i, i2));
        }
    }
}
