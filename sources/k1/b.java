package k1;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.ui.Components.n;
import r0.i0;
import s0.d;
public abstract class b extends r0.b {
    public static final Rect f17151n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public final AccessibilityManager h;
    public final View f17155i;
    public a f17156j;
    public final Rect d = new Rect();
    public final Rect f17152e = new Rect();
    public final Rect f17153f = new Rect();
    public final int[] f17154g = new int[2];
    public int f17157k = Integer.MIN_VALUE;
    public int f17158l = Integer.MIN_VALUE;
    public int f17159m = Integer.MIN_VALUE;

    public b(View view) {
        this.f17155i = view;
        this.h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap weakHashMap = i0.f54097a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override
    public final n a(View view) {
        if (this.f17156j == null) {
            this.f17156j = new a(this);
        }
        return this.f17156j;
    }

    @Override
    public final void c(View view, d dVar) {
        this.f54068a.onInitializeAccessibilityNodeInfo(view, dVar.f54508a);
    }

    public final AccessibilityEvent e(int i7, int i10) {
        View view = this.f17155i;
        if (i7 != -1) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i10);
            d j3 = j(i7);
            obtain.getText().add(j3.g());
            AccessibilityNodeInfo accessibilityNodeInfo = j3.f54508a;
            obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            obtain.setScrollable(accessibilityNodeInfo.isScrollable());
            obtain.setPassword(accessibilityNodeInfo.isPassword());
            obtain.setEnabled(accessibilityNodeInfo.isEnabled());
            obtain.setChecked(accessibilityNodeInfo.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(accessibilityNodeInfo.getClassName());
            obtain.setSource(view, i7);
            obtain.setPackageName(view.getContext().getPackageName());
            return obtain;
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain(i10);
        view.onInitializeAccessibilityEvent(obtain2);
        return obtain2;
    }

    public final boolean f(MotionEvent motionEvent) {
        int i7;
        AccessibilityManager accessibilityManager = this.h;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action == 10 && (i7 = this.f17159m) != Integer.MIN_VALUE) {
                    if (i7 != Integer.MIN_VALUE) {
                        this.f17159m = Integer.MIN_VALUE;
                        m(Integer.MIN_VALUE, 128);
                        m(i7, 256);
                        return true;
                    }
                } else {
                    return false;
                }
            } else {
                int g10 = g(motionEvent.getX(), motionEvent.getY());
                int i10 = this.f17159m;
                if (i10 != g10) {
                    this.f17159m = g10;
                    m(g10, 128);
                    m(i10, 256);
                }
                if (g10 == Integer.MIN_VALUE) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public abstract int g(float f10, float f11);

    public abstract void h(ArrayList arrayList);

    public final void i() {
        View view;
        ViewParent parent;
        if (this.h.isEnabled() && (parent = (view = this.f17155i).getParent()) != null) {
            AccessibilityEvent e10 = e(-1, 2048);
            e10.setContentChangeTypes(1);
            parent.requestSendAccessibilityEvent(view, e10);
        }
    }

    public final d j(int i7) {
        boolean z9;
        View view = this.f17155i;
        if (i7 == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            d dVar = new d(obtain);
            WeakHashMap weakHashMap = i0.f54097a;
            view.onInitializeAccessibilityNodeInfo(obtain);
            ArrayList arrayList = new ArrayList();
            h(arrayList);
            if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                dVar.f54508a.addChild(view, ((Integer) arrayList.get(i10)).intValue());
            }
            return dVar;
        }
        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
        d dVar2 = new d(obtain2);
        obtain2.setEnabled(true);
        obtain2.setFocusable(true);
        dVar2.i("android.view.View");
        Rect rect = f17151n;
        dVar2.h(rect);
        obtain2.setBoundsInScreen(rect);
        obtain2.setParent(view);
        l(i7, dVar2);
        if (dVar2.g() == null && obtain2.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f17152e;
        obtain2.getBoundsInParent(rect2);
        if (!rect2.equals(rect)) {
            int actions = obtain2.getActions();
            if ((actions & 64) == 0) {
                if ((actions & 128) == 0) {
                    obtain2.setPackageName(view.getContext().getPackageName());
                    dVar2.f54509b = i7;
                    obtain2.setSource(view, i7);
                    if (this.f17157k == i7) {
                        obtain2.setAccessibilityFocused(true);
                        dVar2.a(128);
                    } else {
                        obtain2.setAccessibilityFocused(false);
                        dVar2.a(64);
                    }
                    if (this.f17158l == i7) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        dVar2.a(2);
                    } else if (obtain2.isFocusable()) {
                        dVar2.a(1);
                    }
                    obtain2.setFocused(z9);
                    int[] iArr = this.f17154g;
                    view.getLocationOnScreen(iArr);
                    Rect rect3 = this.d;
                    obtain2.getBoundsInScreen(rect3);
                    if (rect3.equals(rect)) {
                        obtain2.getBoundsInParent(rect3);
                        rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                    }
                    Rect rect4 = this.f17153f;
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

    public abstract boolean k(int i7, int i10);

    public abstract void l(int i7, d dVar);

    public final void m(int i7, int i10) {
        View view;
        ViewParent parent;
        if (i7 != Integer.MIN_VALUE && this.h.isEnabled() && (parent = (view = this.f17155i).getParent()) != null) {
            parent.requestSendAccessibilityEvent(view, e(i7, i10));
        }
    }
}
