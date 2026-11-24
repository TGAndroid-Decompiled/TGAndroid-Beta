package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class g8 extends AnimatorListenerAdapter {
    public final byte a;
    public final m8 b;

    public g8(m8 m8Var, byte b) {
        this.a = b;
        this.b = m8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        float f;
        byte b = this.a;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = null;
        m8 m8Var = this.b;
        switch (b) {
            case 0:
                m8Var.a = null;
                ViewGroup viewGroup = (ViewGroup) m8Var.getContentView();
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                    actionBarPopupWindow$ActionBarPopupWindowLayout.n = false;
                } else {
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        if (viewGroup.getChildAt(i) instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                            actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup.getChildAt(i);
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.n = false;
                        }
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                }
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i2 = 0; i2 < itemsCount; i2++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i2);
                    if (!(childAt instanceof j8)) {
                        if (childAt.isEnabled()) {
                            f = 1.0f;
                        } else {
                            f = 0.5f;
                        }
                        childAt.setAlpha(f);
                    }
                }
                return;
            default:
                m8Var.a = null;
                m8Var.d = false;
                m8Var.setFocusable(false);
                try {
                    super/*android.widget.PopupWindow*/.dismiss();
                } catch (Exception unused) {
                }
                m8Var.j();
                if (m8Var.e) {
                    m8Var.j.e();
                    return;
                }
                return;
        }
    }
}
