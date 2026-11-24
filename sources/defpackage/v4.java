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

    public v4(ni6 ni6Var) {
        this.b = ni6Var;
    }

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        nn8 nn8Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                u4 i2 = ((ni6) obj).i(i);
                if (i2 == null) {
                    return null;
                }
                return i2.a;
            default:
                int[] iArr = {0, 0};
                qn8 qn8Var = (qn8) obj;
                ArrayList arrayList = qn8Var.a;
                qn8Var.getLocationOnScreen(iArr);
                if (i == -1) {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(qn8Var);
                    qn8Var.onInitializeAccessibilityNodeInfo(obtain);
                    obtain.setEnabled(true);
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        obtain.addChild(qn8Var, ((nn8) arrayList.get(i3)).a);
                    }
                    return obtain;
                }
                int i4 = 0;
                while (true) {
                    if (i4 < arrayList.size()) {
                        if (((nn8) arrayList.get(i4)).a == i) {
                            nn8Var = (nn8) arrayList.get(i4);
                        } else {
                            i4++;
                        }
                    } else {
                        nn8Var = null;
                    }
                }
                if (nn8Var == null) {
                    return null;
                }
                RectF rectF = nn8Var.d;
                if (rectF.isEmpty()) {
                    return null;
                }
                AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
                obtain2.setSource(qn8Var, i);
                obtain2.setParent(qn8Var);
                obtain2.setPackageName(qn8Var.getContext().getPackageName());
                obtain2.addAction(16);
                obtain2.addAction(64);
                obtain2.setClickable(true);
                obtain2.setFocusable(true);
                obtain2.setEnabled(true);
                obtain2.setVisibleToUser(true);
                obtain2.setClassName(Button.class.getName());
                obtain2.setText(nn8Var.l.i());
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
                ((ni6) this.b).getClass();
                return null;
            default:
                return super.findAccessibilityNodeInfosByText(str, i);
        }
    }

    @Override
    public final AccessibilityNodeInfo findFocus(int i) {
        switch (this.a) {
            case 0:
                u4 j = ((ni6) this.b).j(i);
                if (j == null) {
                    return null;
                }
                return j.a;
            default:
                return super.findFocus(i);
        }
    }

    @Override
    public final boolean performAction(int i, int i2, Bundle bundle) {
        nn8 nn8Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((ni6) obj).C(i, i2, bundle);
            default:
                qn8 qn8Var = (qn8) obj;
                ArrayList arrayList = qn8Var.a;
                if (i == -1) {
                    return qn8Var.performAccessibilityAction(i2, bundle);
                }
                int i3 = 0;
                while (true) {
                    if (i3 < arrayList.size()) {
                        if (((nn8) arrayList.get(i3)).a == i) {
                            nn8Var = (nn8) arrayList.get(i3);
                        } else {
                            i3++;
                        }
                    } else {
                        nn8Var = null;
                    }
                }
                if (nn8Var != null) {
                    if (i2 == 64) {
                        if (((AccessibilityManager) qn8Var.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                            AccessibilityEvent obtain = AccessibilityEvent.obtain(32768);
                            obtain.setPackageName(qn8Var.getContext().getPackageName());
                            obtain.setSource(qn8Var, i);
                            if (qn8Var.getParent() != null) {
                                qn8Var.getParent().requestSendAccessibilityEvent(qn8Var, obtain);
                            }
                        }
                    } else if (i2 == 16) {
                        pn8 pn8Var = qn8Var.y;
                        if (pn8Var != null) {
                            ProfileActivity profileActivity = ((tn8) pn8Var).b;
                            RectF rectF = ProfileActivity.e7;
                            profileActivity.w2(0.0f, 0.0f, i);
                        }
                    }
                    return true;
                }
                return false;
        }
    }

    public v4(qn8 qn8Var) {
        this.b = qn8Var;
    }
}
