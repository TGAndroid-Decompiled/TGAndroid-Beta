package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class g9 {
    public boolean a;
    public Object b;

    public g9(Context context, x53 x53Var, boolean z) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232581, z ? 1 : 0, x53Var, context);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new b7(this, (byte) 4));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new ht2(this, (byte) 12));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
        j(actionBarPopupWindow$ActionBarPopupWindowLayout);
        n8 n8Var = new n8(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.b = n8Var;
        n8Var.b = false;
        n8Var.setAnimationStyle(2131755193);
        n8Var.setOutsideTouchable(true);
        n8Var.setClippingEnabled(true);
        n8Var.setInputMethodMode(2);
        n8Var.setSoftInputMode(0);
        n8Var.getContentView().setFocusableInTouchMode(true);
        if (hl.A1()) {
            n8Var.setFocusable(true);
        }
        n8Var.setOnDismissListener(new y6(this, (byte) 4));
    }

    public final void a() {
        n8 n8Var = (n8) this.b;
        if (n8Var != null) {
            n8Var.dismiss();
        }
    }

    public abstract void b();

    public abstract View c();

    public abstract f27 d();

    public abstract tfb e();

    public abstract CharSequence f();

    public abstract CharSequence g();

    public abstract void h();

    public abstract boolean i();

    public abstract void j(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout);

    public abstract void l(View view);

    public abstract void m(int i);

    public abstract void n(CharSequence charSequence);

    public abstract void o(int i);

    public abstract void p(CharSequence charSequence);

    public abstract void q(boolean z);

    public void k() {
    }
}
