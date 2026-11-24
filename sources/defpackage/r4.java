package defpackage;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
public final class r4 {
    public static final r4 d;
    public static final r4 e;
    public static final r4 f;
    public static final r4 g;
    public static final r4 h;
    public static final r4 i;
    public final Object a;
    public final int b;
    public final Class c;

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
        new r4(1, (String) null);
        new r4(2, (String) null);
        new r4(4, (String) null);
        new r4(8, (String) null);
        d = new r4(16, (String) null);
        new r4(32, (String) null);
        new r4(64, (String) null);
        new r4(128, (String) null);
        new r4(x4.class, 256);
        new r4(x4.class, 512);
        new r4(y4.class, 1024);
        new r4(y4.class, 2048);
        e = new r4(4096, (String) null);
        f = new r4(8192, (String) null);
        new r4(16384, (String) null);
        new r4(32768, (String) null);
        new r4(65536, (String) null);
        new r4(c5.class, 131072);
        new r4(262144, (String) null);
        new r4(524288, (String) null);
        new r4(1048576, (String) null);
        new r4(d5.class, 2097152);
        new r4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null, null, null);
        new r4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, null, null, a5.class);
        g = new r4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null, null);
        new r4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null, null, null);
        h = new r4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null, null);
        new r4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null, null, null);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
        } else {
            accessibilityAction = null;
        }
        new r4(accessibilityAction, 16908358, null, null, null);
        if (i2 >= 29) {
            accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
        } else {
            accessibilityAction2 = null;
        }
        new r4(accessibilityAction2, 16908359, null, null, null);
        if (i2 >= 29) {
            accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
        } else {
            accessibilityAction3 = null;
        }
        new r4(accessibilityAction3, 16908360, null, null, null);
        if (i2 >= 29) {
            accessibilityAction4 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
        } else {
            accessibilityAction4 = null;
        }
        new r4(accessibilityAction4, 16908361, null, null, null);
        new r4(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null, null, null);
        if (i2 >= 24) {
            accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
        } else {
            accessibilityAction5 = null;
        }
        i = new r4(accessibilityAction5, 16908349, null, null, b5.class);
        if (i2 >= 26) {
            accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        } else {
            accessibilityAction6 = null;
        }
        new r4(accessibilityAction6, 16908354, null, null, z4.class);
        if (i2 >= 28) {
            accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
        } else {
            accessibilityAction7 = null;
        }
        new r4(accessibilityAction7, 16908356, null, null, null);
        if (i2 >= 28) {
            accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
        } else {
            accessibilityAction8 = null;
        }
        new r4(accessibilityAction8, 16908357, null, null, null);
        if (i2 >= 30) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
        } else {
            accessibilityAction9 = null;
        }
        new r4(accessibilityAction9, 16908362, null, null, null);
        if (i2 >= 30) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
        } else {
            accessibilityAction10 = null;
        }
        new r4(accessibilityAction10, 16908372, null, null, null);
        if (i2 >= 32) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
        } else {
            accessibilityAction11 = null;
        }
        new r4(accessibilityAction11, 16908373, null, null, null);
        if (i2 >= 32) {
            accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
        } else {
            accessibilityAction12 = null;
        }
        new r4(accessibilityAction12, 16908374, null, null, null);
        if (i2 >= 32) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
        } else {
            accessibilityAction13 = null;
        }
        new r4(accessibilityAction13, 16908375, null, null, null);
        if (i2 >= 33) {
            accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
        } else {
            accessibilityAction14 = null;
        }
        new r4(accessibilityAction14, 16908376, null, null, null);
        if (i2 >= 34) {
            accessibilityAction15 = t4.e();
        }
        new r4(accessibilityAction15, 16908382, null, null, null);
    }

    public r4(Object obj, int i2, String str, ts2 ts2Var, Class cls) {
        this.b = i2;
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
        if (obj == null || !(obj instanceof r4)) {
            return false;
        }
        Object obj2 = ((r4) obj).a;
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
        String e2 = u4.e(this.b);
        if (e2.equals("ACTION_UNKNOWN")) {
            Object obj = this.a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                e2 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(e2);
        return sb.toString();
    }

    public r4(Class cls, int i2) {
        this(null, i2, null, null, cls);
    }

    public r4(int i2, String str) {
        this(null, i2, str, null, null);
    }
}
