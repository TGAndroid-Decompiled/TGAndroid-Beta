package k;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.c0;
import org.telegram.ui.Components.qk;
public abstract class a {
    public boolean f18052a;
    public Object f18053b;

    public a(Context context, h6 h6Var, boolean z10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232567, z10 ? 1 : 0, context, h6Var);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new qk(this, 1));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new c0(this, 26));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
        l(actionBarPopupWindow$ActionBarPopupWindowLayout);
        g1 g1Var = new g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f18053b = g1Var;
        g1Var.f28941b = false;
        g1Var.setAnimationStyle(2131755193);
        g1Var.setOutsideTouchable(true);
        g1Var.setClippingEnabled(true);
        g1Var.setInputMethodMode(2);
        g1Var.setSoftInputMode(0);
        g1Var.getContentView().setFocusableInTouchMode(true);
        if (g0.C1()) {
            g1Var.setFocusable(true);
        }
        g1Var.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public final void onDismiss() {
                k.a aVar = k.a.this;
                aVar.m();
                aVar.f18052a = false;
            }
        });
    }

    public void a() {
        g1 g1Var = (g1) this.f18053b;
        if (g1Var != null) {
            g1Var.dismiss();
        }
    }

    public abstract void c();

    public abstract View d();

    public abstract l.k e();

    public abstract h f();

    public abstract CharSequence g();

    public abstract CharSequence i();

    public abstract void j();

    public abstract boolean k();

    public abstract void l(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout);

    public abstract void m();

    public abstract void n(View view);

    public abstract void o(int i7);

    public abstract void p(CharSequence charSequence);

    public abstract void q(int i7);

    public abstract void r(CharSequence charSequence);

    public abstract void s(boolean z10);
}
