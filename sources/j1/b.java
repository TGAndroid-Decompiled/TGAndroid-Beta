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
import m5.o;
import r0.j0;
import s0.c;

public abstract class b extends r0.b {

    public static final Rect f12292n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public final AccessibilityManager h;

    public final View f12296i;

    public a f12297j;
    public final Rect d = new Rect();

    public final Rect f12293e = new Rect();

    public final Rect f12294f = new Rect();

    public final int[] f12295g = new int[2];

    public int f12298k = Integer.MIN_VALUE;

    public int f12299l = Integer.MIN_VALUE;

    public int f12300m = Integer.MIN_VALUE;

    public b(View view) {
        this.f12296i = view;
        this.h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap weakHashMap = j0.f46605a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override
    public final o a(View view) {
        if (this.f12297j == null) {
            this.f12297j = new a(this);
        }
        return this.f12297j;
    }

    @Override
    public final void c(View view, c cVar) {
        this.f46568a.onInitializeAccessibilityNodeInfo(view, cVar.f47656a);
    }

    public final AccessibilityEvent e(int i10, int i11) {
        View view = this.f12296i;
        if (i10 == -1) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i11);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
            return accessibilityEventObtain;
        }
        AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain(i11);
        c cVarJ = j(i10);
        accessibilityEventObtain2.getText().add(cVarJ.g());
        AccessibilityNodeInfo accessibilityNodeInfo = cVarJ.f47656a;
        accessibilityEventObtain2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityEventObtain2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityEventObtain2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityEventObtain2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityEventObtain2.setChecked(accessibilityNodeInfo.isChecked());
        if (accessibilityEventObtain2.getText().isEmpty() && accessibilityEventObtain2.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain2.setClassName(accessibilityNodeInfo.getClassName());
        accessibilityEventObtain2.setSource(view, i10);
        accessibilityEventObtain2.setPackageName(view.getContext().getPackageName());
        return accessibilityEventObtain2;
    }

    public final boolean f(MotionEvent motionEvent) {
        int i10;
        AccessibilityManager accessibilityManager = this.h;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iG = g(motionEvent.getX(), motionEvent.getY());
            int i11 = this.f12300m;
            if (i11 != iG) {
                this.f12300m = iG;
                m(iG, 128);
                m(i11, 256);
            }
            if (iG == Integer.MIN_VALUE) {
                return false;
            }
        } else {
            if (action != 10 || (i10 = this.f12300m) == Integer.MIN_VALUE) {
                return false;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f12300m = Integer.MIN_VALUE;
                m(Integer.MIN_VALUE, 128);
                m(i10, 256);
                return true;
            }
        }
        return true;
    }

    public abstract int g(float f10, float f11);

    public abstract void h(ArrayList arrayList);

    public final void i() {
        View view;
        ViewParent parent;
        if (!this.h.isEnabled() || (parent = (view = this.f12296i).getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventE = e(-1, 2048);
        accessibilityEventE.setContentChangeTypes(1);
        parent.requestSendAccessibilityEvent(view, accessibilityEventE);
    }

    public final c j(int i10) {
        View view = this.f12296i;
        if (i10 == -1) {
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(view);
            c cVar = new c(accessibilityNodeInfoObtain);
            WeakHashMap weakHashMap = j0.f46605a;
            view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
            ArrayList arrayList = new ArrayList();
            h(arrayList);
            if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                cVar.f47656a.addChild(view, ((Integer) arrayList.get(i11)).intValue());
            }
            return cVar;
        }
        AccessibilityNodeInfo accessibilityNodeInfoObtain2 = AccessibilityNodeInfo.obtain();
        c cVar2 = new c(accessibilityNodeInfoObtain2);
        accessibilityNodeInfoObtain2.setEnabled(true);
        accessibilityNodeInfoObtain2.setFocusable(true);
        cVar2.i("android.view.View");
        Rect rect = f12292n;
        cVar2.h(rect);
        accessibilityNodeInfoObtain2.setBoundsInScreen(rect);
        accessibilityNodeInfoObtain2.setParent(view);
        l(i10, cVar2);
        if (cVar2.g() == null && accessibilityNodeInfoObtain2.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f12293e;
        accessibilityNodeInfoObtain2.getBoundsInParent(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain2.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain2.setPackageName(view.getContext().getPackageName());
        cVar2.f47657b = i10;
        accessibilityNodeInfoObtain2.setSource(view, i10);
        if (this.f12298k == i10) {
            accessibilityNodeInfoObtain2.setAccessibilityFocused(true);
            cVar2.a(128);
        } else {
            accessibilityNodeInfoObtain2.setAccessibilityFocused(false);
            cVar2.a(64);
        }
        boolean z10 = this.f12299l == i10;
        if (z10) {
            cVar2.a(2);
        } else if (accessibilityNodeInfoObtain2.isFocusable()) {
            cVar2.a(1);
        }
        accessibilityNodeInfoObtain2.setFocused(z10);
        int[] iArr = this.f12295g;
        view.getLocationOnScreen(iArr);
        Rect rect3 = this.d;
        accessibilityNodeInfoObtain2.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            accessibilityNodeInfoObtain2.getBoundsInParent(rect3);
            rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
        }
        Rect rect4 = this.f12294f;
        if (view.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect4)) {
                accessibilityNodeInfoObtain2.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    Object parent = view.getParent();
                    while (parent instanceof View) {
                        View view2 = (View) parent;
                        if (view2.getAlpha() > 0.0f && view2.getVisibility() == 0) {
                            parent = view2.getParent();
                        }
                    }
                    if (parent != null) {
                        cVar2.p(true);
                    }
                }
            }
        }
        return cVar2;
    }

    public abstract boolean k(int i10, int i11);

    public abstract void l(int i10, c cVar);

    public final void m(int i10, int i11) {
        View view;
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = (view = this.f12296i).getParent()) == null) {
            return;
        }
        parent.requestSendAccessibilityEvent(view, e(i10, i11));
    }
}
