package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.widget.Button;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.ProfileActivity;
public class v4 extends AccessibilityNodeProvider {
    public final byte a = 0;
    public final Object b;

    public v4(l69 l69Var) {
        this.b = l69Var;
    }

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        ml8 ml8Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                u4 u = ((l69) obj).u(i);
                if (u == null) {
                    return null;
                }
                return u.a;
            default:
                int[] iArr = {0, 0};
                pl8 pl8Var = (pl8) obj;
                ArrayList arrayList = pl8Var.a;
                pl8Var.getLocationOnScreen(iArr);
                if (i == -1) {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(pl8Var);
                    pl8Var.onInitializeAccessibilityNodeInfo(obtain);
                    obtain.setEnabled(true);
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        obtain.addChild(pl8Var, ((ml8) arrayList.get(i2)).a);
                    }
                    return obtain;
                }
                int i3 = 0;
                while (true) {
                    if (i3 < arrayList.size()) {
                        if (((ml8) arrayList.get(i3)).a == i) {
                            ml8Var = (ml8) arrayList.get(i3);
                        } else {
                            i3++;
                        }
                    } else {
                        ml8Var = null;
                    }
                }
                if (ml8Var == null) {
                    return null;
                }
                RectF rectF = ml8Var.d;
                if (rectF.isEmpty()) {
                    return null;
                }
                AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
                obtain2.setSource(pl8Var, i);
                obtain2.setParent(pl8Var);
                obtain2.setPackageName(pl8Var.getContext().getPackageName());
                obtain2.addAction(16);
                obtain2.addAction(64);
                obtain2.setClickable(true);
                obtain2.setFocusable(true);
                obtain2.setEnabled(true);
                obtain2.setVisibleToUser(true);
                obtain2.setClassName(Button.class.getName());
                obtain2.setText(ml8Var.l.i());
                Rect rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                obtain2.setBoundsInParent(rect);
                rect.offset(iArr[0], iArr[1]);
                obtain2.setBoundsInScreen(rect);
                return obtain2;
        }
    }

    @Override
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        switch (this.a) {
            case 0:
                ((l69) this.b).getClass();
                return null;
            default:
                return super.findAccessibilityNodeInfosByText(str, i);
        }
    }

    @Override
    public final AccessibilityNodeInfo findFocus(int i) {
        switch (this.a) {
            case 0:
                u4 w = ((l69) this.b).w(i);
                if (w == null) {
                    return null;
                }
                return w.a;
            default:
                return super.findFocus(i);
        }
    }

    @Override
    public final boolean performAction(int i, int i2, Bundle bundle) {
        ml8 ml8Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((l69) obj).E(i, i2, bundle);
            default:
                pl8 pl8Var = (pl8) obj;
                ArrayList arrayList = pl8Var.a;
                if (i == -1) {
                    return pl8Var.performAccessibilityAction(i2, bundle);
                }
                int i3 = 0;
                while (true) {
                    if (i3 < arrayList.size()) {
                        if (((ml8) arrayList.get(i3)).a == i) {
                            ml8Var = (ml8) arrayList.get(i3);
                        } else {
                            i3++;
                        }
                    } else {
                        ml8Var = null;
                    }
                }
                if (ml8Var != null) {
                    if (i2 == 64) {
                        if (((AccessibilityManager) pl8Var.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                            AccessibilityEvent obtain = AccessibilityEvent.obtain(32768);
                            obtain.setPackageName(pl8Var.getContext().getPackageName());
                            obtain.setSource(pl8Var, i);
                            if (pl8Var.getParent() != null) {
                                pl8Var.getParent().requestSendAccessibilityEvent(pl8Var, obtain);
                            }
                        }
                    } else if (i2 == 16) {
                        ol8 ol8Var = pl8Var.y;
                        if (ol8Var != null) {
                            ProfileActivity profileActivity = ((ql8) ol8Var).b;
                            RectF rectF = ProfileActivity.Z6;
                            profileActivity.t2(0.0f, 0.0f, i);
                        }
                    }
                    return true;
                }
                return false;
        }
    }

    public v4(pl8 pl8Var) {
        this.b = pl8Var;
    }
}
