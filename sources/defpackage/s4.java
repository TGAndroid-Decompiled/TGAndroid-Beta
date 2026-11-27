package defpackage;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
public final class s4 {
    public static final s4 e;
    public static final s4 f;
    public static final s4 g;
    public static final s4 h;
    public static final s4 i;
    public static final s4 j;
    public final Object a;
    public final int b;
    public final Class c;
    public final u34 d;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15 = null;
        new s4(1, (String) null);
        new s4(2, (String) null);
        new s4(4, (String) null);
        new s4(8, (String) null);
        e = new s4(16, (String) null);
        new s4(32, (String) null);
        new s4(64, (String) null);
        new s4(128, (String) null);
        new s4(y4.class, 256);
        new s4(y4.class, 512);
        new s4(z4.class, 1024);
        new s4(z4.class, 2048);
        f = new s4(4096, (String) null);
        g = new s4(8192, (String) null);
        new s4(16384, (String) null);
        new s4(32768, (String) null);
        new s4(65536, (String) null);
        new s4(d5.class, 131072);
        new s4(262144, (String) null);
        new s4(524288, (String) null);
        new s4(1048576, (String) null);
        new s4(e5.class, 2097152);
        new s4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null, null, null);
        new s4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, null, null, b5.class);
        h = new s4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null, null);
        new s4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null, null, null);
        i = new s4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null, null);
        new s4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null, null, null);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
        } else {
            accessibilityAction = null;
        }
        new s4(accessibilityAction, 16908358, null, null, null);
        if (i2 >= 29) {
            accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
        } else {
            accessibilityAction2 = null;
        }
        new s4(accessibilityAction2, 16908359, null, null, null);
        if (i2 >= 29) {
            accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
        } else {
            accessibilityAction3 = null;
        }
        new s4(accessibilityAction3, 16908360, null, null, null);
        if (i2 >= 29) {
            accessibilityAction4 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
        } else {
            accessibilityAction4 = null;
        }
        new s4(accessibilityAction4, 16908361, null, null, null);
        new s4(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null, null, null);
        if (i2 >= 24) {
            accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
        } else {
            accessibilityAction5 = null;
        }
        j = new s4(accessibilityAction5, 16908349, null, null, c5.class);
        if (i2 >= 26) {
            accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        } else {
            accessibilityAction6 = null;
        }
        new s4(accessibilityAction6, 16908354, null, null, a5.class);
        if (i2 >= 28) {
            accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
        } else {
            accessibilityAction7 = null;
        }
        new s4(accessibilityAction7, 16908356, null, null, null);
        if (i2 >= 28) {
            accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
        } else {
            accessibilityAction8 = null;
        }
        new s4(accessibilityAction8, 16908357, null, null, null);
        if (i2 >= 30) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
        } else {
            accessibilityAction9 = null;
        }
        new s4(accessibilityAction9, 16908362, null, null, null);
        if (i2 >= 30) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
        } else {
            accessibilityAction10 = null;
        }
        new s4(accessibilityAction10, 16908372, null, null, null);
        if (i2 >= 32) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
        } else {
            accessibilityAction11 = null;
        }
        new s4(accessibilityAction11, 16908373, null, null, null);
        if (i2 >= 32) {
            accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
        } else {
            accessibilityAction12 = null;
        }
        new s4(accessibilityAction12, 16908374, null, null, null);
        if (i2 >= 32) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
        } else {
            accessibilityAction13 = null;
        }
        new s4(accessibilityAction13, 16908375, null, null, null);
        if (i2 >= 33) {
            accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
        } else {
            accessibilityAction14 = null;
        }
        new s4(accessibilityAction14, 16908376, null, null, null);
        if (i2 >= 34) {
            accessibilityAction15 = u4.e();
        }
        new s4(accessibilityAction15, 16908382, null, null, null);
    }

    public s4(Object obj, int i2, String str, u34 u34Var, Class cls) {
        this.b = i2;
        this.d = u34Var;
        if (obj == null) {
            this.a = new AccessibilityNodeInfo.AccessibilityAction(i2, str);
        } else {
            this.a = obj;
        }
        this.c = cls;
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof s4)) {
            return false;
        }
        Object obj2 = ((s4) obj).a;
        Object obj3 = this.a;
        if (obj3 == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        } else if (!obj3.equals(obj2)) {
            return false;
        } else {
            return true;
        }
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String e2 = v4.e(this.b);
        if (e2.equals("ACTION_UNKNOWN")) {
            Object obj = this.a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                e2 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(e2);
        return sb.toString();
    }

    public s4(Class cls, int i2) {
        this(null, i2, null, null, cls);
    }

    public s4(int i2, String str) {
        this(null, i2, str, null, null);
    }
}
