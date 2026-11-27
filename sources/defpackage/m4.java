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
public abstract class m4 extends AccessibilityNodeProvider {
    public final o4 a;
    public final AccessibilityManager d;
    public final Rect c = new Rect();
    public int e = -1;
    public final byte b = 2;

    public m4(o4 o4Var) {
        this.a = o4Var;
        this.d = (AccessibilityManager) o4Var.getContext().getSystemService(AccessibilityManager.class);
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
        o4 o4Var = this.a;
        if (i == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(o4Var);
            obtain.setPackageName(o4Var.getContext().getPackageName());
            for (int i2 = 0; i2 < this.b; i2++) {
                obtain.addChild(o4Var, i2);
            }
            return obtain;
        }
        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain(o4Var, i);
        obtain2.setPackageName(o4Var.getContext().getPackageName());
        obtain2.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
        l4 l4Var = (l4) this;
        o4 o4Var2 = l4Var.g;
        if (i == 0) {
            if (o4Var2.S) {
                StaticLayout staticLayout2 = o4Var2.h;
                if (staticLayout2 != null) {
                    text = staticLayout2.getText();
                }
                text = null;
            } else {
                StaticLayout staticLayout3 = o4Var2.e;
                if (staticLayout3 != null) {
                    text = staticLayout3.getText();
                }
                text = null;
            }
        } else {
            if (i == 1 && (staticLayout = o4Var2.f) != null) {
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
        obtain2.setParent(o4Var);
        Rect rect = this.c;
        if (i == 0) {
            rect.set(o4Var2.N);
        } else if (i == 1) {
            rect.set(o4Var2.O);
        } else {
            rect.setEmpty();
        }
        int[] iArr = l4Var.f;
        o4Var2.getLocationOnScreen(iArr);
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
            n4 n4Var = ((l4) this).g.R;
            if (n4Var != null) {
                if (i == 0) {
                    ((kkc) n4Var).a();
                    return true;
                } else if (i == 1) {
                    ((kkc) n4Var).b();
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
