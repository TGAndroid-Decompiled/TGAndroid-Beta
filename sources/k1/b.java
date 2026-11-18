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
import org.telegram.ui.Cells.c5;
import r0.i0;
import s0.c;
public abstract class b extends r0.b {
    public static final Rect f18103n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public final AccessibilityManager h;
    public final View f18107i;
    public a f18108j;
    public final Rect d = new Rect();
    public final Rect f18104e = new Rect();
    public final Rect f18105f = new Rect();
    public final int[] f18106g = new int[2];
    public int f18109k = Integer.MIN_VALUE;
    public int f18110l = Integer.MIN_VALUE;
    public int f18111m = Integer.MIN_VALUE;

    public b(View view) {
        this.f18107i = view;
        this.h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap weakHashMap = i0.f56244a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override
    public final c5 a(View view) {
        if (this.f18108j == null) {
            this.f18108j = new a(this);
        }
        return this.f18108j;
    }

    @Override
    public final void c(View view, c cVar) {
        this.f56216a.onInitializeAccessibilityNodeInfo(view, cVar.f56740a);
    }

    public final AccessibilityEvent e(int i7, int i10) {
        View view = this.f18107i;
        if (i7 != -1) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i10);
            c j3 = j(i7);
            obtain.getText().add(j3.g());
            AccessibilityNodeInfo accessibilityNodeInfo = j3.f56740a;
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
                if (action == 10 && (i7 = this.f18111m) != Integer.MIN_VALUE) {
                    if (i7 != Integer.MIN_VALUE) {
                        this.f18111m = Integer.MIN_VALUE;
                        m(Integer.MIN_VALUE, 128);
                        m(i7, 256);
                        return true;
                    }
                } else {
                    return false;
                }
            } else {
                int g10 = g(motionEvent.getX(), motionEvent.getY());
                int i10 = this.f18111m;
                if (i10 != g10) {
                    this.f18111m = g10;
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
        if (this.h.isEnabled() && (parent = (view = this.f18107i).getParent()) != null) {
            AccessibilityEvent e10 = e(-1, 2048);
            e10.setContentChangeTypes(1);
            parent.requestSendAccessibilityEvent(view, e10);
        }
    }

    public final c j(int i7) {
        boolean z10;
        View view = this.f18107i;
        if (i7 == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            c cVar = new c(obtain);
            WeakHashMap weakHashMap = i0.f56244a;
            view.onInitializeAccessibilityNodeInfo(obtain);
            ArrayList arrayList = new ArrayList();
            h(arrayList);
            if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                cVar.f56740a.addChild(view, ((Integer) arrayList.get(i10)).intValue());
            }
            return cVar;
        }
        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
        c cVar2 = new c(obtain2);
        obtain2.setEnabled(true);
        obtain2.setFocusable(true);
        cVar2.i("android.view.View");
        Rect rect = f18103n;
        cVar2.h(rect);
        obtain2.setBoundsInScreen(rect);
        obtain2.setParent(view);
        l(i7, cVar2);
        if (cVar2.g() == null && obtain2.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f18104e;
        obtain2.getBoundsInParent(rect2);
        if (!rect2.equals(rect)) {
            int actions = obtain2.getActions();
            if ((actions & 64) == 0) {
                if ((actions & 128) == 0) {
                    obtain2.setPackageName(view.getContext().getPackageName());
                    cVar2.f56741b = i7;
                    obtain2.setSource(view, i7);
                    if (this.f18109k == i7) {
                        obtain2.setAccessibilityFocused(true);
                        cVar2.a(128);
                    } else {
                        obtain2.setAccessibilityFocused(false);
                        cVar2.a(64);
                    }
                    if (this.f18110l == i7) {
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
                    int[] iArr = this.f18106g;
                    view.getLocationOnScreen(iArr);
                    Rect rect3 = this.d;
                    obtain2.getBoundsInScreen(rect3);
                    if (rect3.equals(rect)) {
                        obtain2.getBoundsInParent(rect3);
                        rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                    }
                    Rect rect4 = this.f18105f;
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

    public abstract boolean k(int i7, int i10);

    public abstract void l(int i7, c cVar);

    public final void m(int i7, int i10) {
        View view;
        ViewParent parent;
        if (i7 != Integer.MIN_VALUE && this.h.isEnabled() && (parent = (view = this.f18107i).getParent()) != null) {
            parent.requestSendAccessibilityEvent(view, e(i7, i10));
        }
    }
}
