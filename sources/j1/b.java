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
import org.telegram.ui.Components.n;
import r0.j0;
import s0.c;
public abstract class b extends r0.b {
    public static final Rect f10360n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public final AccessibilityManager h;
    public final View f10364i;
    public a f10365j;
    public final Rect d = new Rect();
    public final Rect f10361e = new Rect();
    public final Rect f10362f = new Rect();
    public final int[] f10363g = new int[2];
    public int f10366k = Integer.MIN_VALUE;
    public int f10367l = Integer.MIN_VALUE;
    public int f10368m = Integer.MIN_VALUE;

    public b(View view) {
        this.f10364i = view;
        this.h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap weakHashMap = j0.f46829a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override
    public final n a(View view) {
        if (this.f10365j == null) {
            this.f10365j = new a(this);
        }
        return this.f10365j;
    }

    @Override
    public final void c(View view, c cVar) {
        this.f46792a.onInitializeAccessibilityNodeInfo(view, cVar.f47482a);
    }

    public final AccessibilityEvent e(int i10, int i11) {
        View view = this.f10364i;
        if (i10 != -1) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i11);
            c j10 = j(i10);
            obtain.getText().add(j10.g());
            AccessibilityNodeInfo accessibilityNodeInfo = j10.f47482a;
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
                if (action == 10 && (i10 = this.f10368m) != Integer.MIN_VALUE) {
                    if (i10 != Integer.MIN_VALUE) {
                        this.f10368m = Integer.MIN_VALUE;
                        m(Integer.MIN_VALUE, 128);
                        m(i10, 256);
                        return true;
                    }
                } else {
                    return false;
                }
            } else {
                int g10 = g(motionEvent.getX(), motionEvent.getY());
                int i11 = this.f10368m;
                if (i11 != g10) {
                    this.f10368m = g10;
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

    public abstract int g(float f9, float f10);

    public abstract void h(ArrayList arrayList);

    public final void i() {
        View view;
        ViewParent parent;
        if (this.h.isEnabled() && (parent = (view = this.f10364i).getParent()) != null) {
            AccessibilityEvent e10 = e(-1, 2048);
            e10.setContentChangeTypes(1);
            parent.requestSendAccessibilityEvent(view, e10);
        }
    }

    public final c j(int i10) {
        boolean z10;
        View view = this.f10364i;
        if (i10 == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            c cVar = new c(obtain);
            WeakHashMap weakHashMap = j0.f46829a;
            view.onInitializeAccessibilityNodeInfo(obtain);
            ArrayList arrayList = new ArrayList();
            h(arrayList);
            if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                cVar.f47482a.addChild(view, ((Integer) arrayList.get(i11)).intValue());
            }
            return cVar;
        }
        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
        c cVar2 = new c(obtain2);
        obtain2.setEnabled(true);
        obtain2.setFocusable(true);
        cVar2.i("android.view.View");
        Rect rect = f10360n;
        cVar2.h(rect);
        obtain2.setBoundsInScreen(rect);
        obtain2.setParent(view);
        l(i10, cVar2);
        if (cVar2.g() == null && obtain2.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f10361e;
        obtain2.getBoundsInParent(rect2);
        if (!rect2.equals(rect)) {
            int actions = obtain2.getActions();
            if ((actions & 64) == 0) {
                if ((actions & 128) == 0) {
                    obtain2.setPackageName(view.getContext().getPackageName());
                    cVar2.f47483b = i10;
                    obtain2.setSource(view, i10);
                    if (this.f10366k == i10) {
                        obtain2.setAccessibilityFocused(true);
                        cVar2.a(128);
                    } else {
                        obtain2.setAccessibilityFocused(false);
                        cVar2.a(64);
                    }
                    if (this.f10367l == i10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        cVar2.a(2);
                    } else if (obtain2.isFocusable()) {
                        cVar2.a(1);
                    }
                    obtain2.setFocused(z10);
                    int[] iArr = this.f10363g;
                    view.getLocationOnScreen(iArr);
                    Rect rect3 = this.d;
                    obtain2.getBoundsInScreen(rect3);
                    if (rect3.equals(rect)) {
                        obtain2.getBoundsInParent(rect3);
                        rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                    }
                    Rect rect4 = this.f10362f;
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
                                        cVar2.p(true);
                                    }
                                }
                            }
                        }
                    }
                    return cVar2;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    public abstract boolean k(int i10, int i11);

    public abstract void l(int i10, c cVar);

    public final void m(int i10, int i11) {
        View view;
        ViewParent parent;
        if (i10 != Integer.MIN_VALUE && this.h.isEnabled() && (parent = (view = this.f10364i).getParent()) != null) {
            parent.requestSendAccessibilityEvent(view, e(i10, i11));
        }
    }
}
