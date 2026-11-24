package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.StaticLayout;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.widget.Button;
public abstract class l4 extends AccessibilityNodeProvider {
    public final n4 a;
    public final AccessibilityManager d;
    public final Rect c = new Rect();
    public int e = -1;
    public final byte b = 2;

    public l4(n4 n4Var) {
        this.a = n4Var;
        this.d = (AccessibilityManager) n4Var.getContext().getSystemService(AccessibilityManager.class);
    }

    public final void a(int i) {
        View view;
        ViewParent parent;
        if (this.d.isTouchExplorationEnabled() && (parent = (view = this.a).getParent()) != null) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(32768);
            obtain.setPackageName(view.getContext().getPackageName());
            obtain.setSource(view, i);
            parent.requestSendAccessibilityEvent(view, obtain);
        }
    }

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        StaticLayout staticLayout;
        CharSequence text;
        n4 n4Var = this.a;
        if (i == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(n4Var);
            obtain.setPackageName(n4Var.getContext().getPackageName());
            for (int i2 = 0; i2 < this.b; i2++) {
                obtain.addChild(n4Var, i2);
            }
            return obtain;
        }
        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain(n4Var, i);
        obtain2.setPackageName(n4Var.getContext().getPackageName());
        obtain2.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
        k4 k4Var = (k4) this;
        n4 n4Var2 = k4Var.g;
        if (i == 0) {
            if (n4Var2.S) {
                StaticLayout staticLayout2 = n4Var2.h;
                if (staticLayout2 != null) {
                    text = staticLayout2.getText();
                }
                text = null;
            } else {
                StaticLayout staticLayout3 = n4Var2.e;
                if (staticLayout3 != null) {
                    text = staticLayout3.getText();
                }
                text = null;
            }
        } else {
            if (i == 1 && (staticLayout = n4Var2.f) != null) {
                text = staticLayout.getText();
            }
            text = null;
        }
        obtain2.setText(text);
        obtain2.setClassName(Button.class.getName());
        if (Build.VERSION.SDK_INT >= 24) {
            obtain2.setImportantForAccessibility(true);
        }
        obtain2.setVisibleToUser(true);
        obtain2.setClickable(true);
        obtain2.setEnabled(true);
        obtain2.setParent(n4Var);
        Rect rect = this.c;
        if (i == 0) {
            rect.set(n4Var2.N);
        } else if (i == 1) {
            rect.set(n4Var2.O);
        } else {
            rect.setEmpty();
        }
        int[] iArr = k4Var.f;
        n4Var2.getLocationOnScreen(iArr);
        rect.offset(iArr[0], iArr[1]);
        obtain2.setBoundsInScreen(rect);
        return obtain2;
    }

    @Override
    public final boolean performAction(int i, int i2, Bundle bundle) {
        if (i == -1) {
            return this.a.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 64) {
            a(i);
            return false;
        } else if (i2 == 16) {
            m4 m4Var = ((k4) this).g.R;
            if (m4Var != null) {
                if (i == 0) {
                    ((fgc) m4Var).a();
                    return true;
                } else if (i == 1) {
                    ((fgc) m4Var).b();
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
