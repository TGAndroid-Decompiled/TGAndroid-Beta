package defpackage;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
public final class r4 {
    public static final r4 c;
    public static final r4 d;
    public static final r4 e;
    public static final r4 f;
    public static final r4 g;
    public static final r4 h;
    public final Object a;
    public final int b;

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
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
        new r4(null, 1, null, null);
        new r4(null, 2, null, null);
        new r4(null, 4, null, null);
        new r4(null, 8, null, null);
        c = new r4(null, 16, null, null);
        new r4(null, 32, null, null);
        new r4(null, 64, null, null);
        new r4(null, 128, null, null);
        new r4(null, 256, null, x4.class);
        new r4(null, 512, null, x4.class);
        new r4(null, 1024, null, y4.class);
        new r4(null, 2048, null, y4.class);
        d = new r4(null, 4096, null, null);
        e = new r4(null, 8192, null, null);
        new r4(null, 16384, null, null);
        new r4(null, 32768, null, null);
        new r4(null, 65536, null, null);
        new r4(null, 131072, null, c5.class);
        new r4(null, 262144, null, null);
        new r4(null, 524288, null, null);
        new r4(null, 1048576, null, null);
        new r4(null, 2097152, null, d5.class);
        new r4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null, null);
        new r4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, null, a5.class);
        f = new r4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null);
        new r4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null, null);
        g = new r4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null);
        new r4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null, null);
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
        } else {
            accessibilityAction = null;
        }
        new r4(accessibilityAction, 16908358, null, null);
        if (i >= 29) {
            accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
        } else {
            accessibilityAction2 = null;
        }
        new r4(accessibilityAction2, 16908359, null, null);
        if (i >= 29) {
            accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
        } else {
            accessibilityAction3 = null;
        }
        new r4(accessibilityAction3, 16908360, null, null);
        if (i >= 29) {
            accessibilityAction4 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
        } else {
            accessibilityAction4 = null;
        }
        new r4(accessibilityAction4, 16908361, null, null);
        new r4(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null, null);
        if (i >= 24) {
            accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
        } else {
            accessibilityAction5 = null;
        }
        h = new r4(accessibilityAction5, 16908349, null, b5.class);
        if (i >= 26) {
            accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        } else {
            accessibilityAction6 = null;
        }
        new r4(accessibilityAction6, 16908354, null, z4.class);
        if (i >= 28) {
            accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
        } else {
            accessibilityAction7 = null;
        }
        new r4(accessibilityAction7, 16908356, null, null);
        if (i >= 28) {
            accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
        } else {
            accessibilityAction8 = null;
        }
        new r4(accessibilityAction8, 16908357, null, null);
        if (i >= 30) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
        } else {
            accessibilityAction9 = null;
        }
        new r4(accessibilityAction9, 16908362, null, null);
        if (i >= 30) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
        } else {
            accessibilityAction10 = null;
        }
        new r4(accessibilityAction10, 16908372, null, null);
        if (i >= 32) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
        } else {
            accessibilityAction11 = null;
        }
        new r4(accessibilityAction11, 16908373, null, null);
        if (i >= 32) {
            accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
        } else {
            accessibilityAction12 = null;
        }
        new r4(accessibilityAction12, 16908374, null, null);
        if (i >= 32) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
        } else {
            accessibilityAction13 = null;
        }
        new r4(accessibilityAction13, 16908375, null, null);
        if (i >= 33) {
            accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
        } else {
            accessibilityAction14 = null;
        }
        new r4(accessibilityAction14, 16908376, null, null);
        if (i >= 34) {
            accessibilityAction15 = t4.e();
        } else {
            accessibilityAction15 = null;
        }
        new r4(accessibilityAction15, 16908382, null, null);
    }

    public r4(Object obj, int i, String str, Class cls) {
        this.b = i;
        if (obj == null) {
            this.a = new AccessibilityNodeInfo.AccessibilityAction(i, str);
        } else {
            this.a = obj;
        }
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
}
