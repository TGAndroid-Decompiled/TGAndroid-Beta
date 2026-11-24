package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class f9 {
    public boolean a;
    public Object b;

    public f9(Context context, r63 r63Var, boolean z) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232582, z ? 1 : 0, r63Var, context);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new a7(this, (byte) 4));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new wm2(this, (byte) 13));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
        j(actionBarPopupWindow$ActionBarPopupWindowLayout);
        m8 m8Var = new m8(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.b = m8Var;
        m8Var.b = false;
        m8Var.setAnimationStyle(2131755193);
        m8Var.setOutsideTouchable(true);
        m8Var.setClippingEnabled(true);
        m8Var.setInputMethodMode(2);
        m8Var.setSoftInputMode(0);
        m8Var.getContentView().setFocusableInTouchMode(true);
        if (gm.A1()) {
            m8Var.setFocusable(true);
        }
        m8Var.setOnDismissListener(new x6(this, (byte) 4));
    }

    public final void a() {
        m8 m8Var = (m8) this.b;
        if (m8Var != null) {
            m8Var.d(true);
        }
    }

    public abstract void b();

    public abstract View c();

    public abstract y17 d();

    public abstract zdb e();

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
