package k;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f1;
import org.telegram.ui.Components.t;
import org.telegram.ui.Components.yj;
public abstract class a {
    public boolean f16384a;
    public Object f16385b;

    public a(Context context, e6 e6Var, boolean z10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232563, z10 ? 1 : 0, context, e6Var);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new yj(this, 1));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new t(this, 27));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
        k(actionBarPopupWindow$ActionBarPopupWindowLayout);
        f1 f1Var = new f1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f16385b = f1Var;
        f1Var.f27493b = false;
        f1Var.setAnimationStyle(2131755193);
        f1Var.setOutsideTouchable(true);
        f1Var.setClippingEnabled(true);
        f1Var.setInputMethodMode(2);
        f1Var.setSoftInputMode(0);
        f1Var.getContentView().setFocusableInTouchMode(true);
        if (g0.C1()) {
            f1Var.setFocusable(true);
        }
        f1Var.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public final void onDismiss() {
                k.a aVar = k.a.this;
                aVar.l();
                aVar.f16384a = false;
            }
        });
    }

    public void a() {
        f1 f1Var = (f1) this.f16385b;
        if (f1Var != null) {
            f1Var.dismiss();
        }
    }

    public abstract void c();

    public abstract View d();

    public abstract l.k e();

    public abstract h f();

    public abstract CharSequence g();

    public abstract CharSequence h();

    public abstract void i();

    public abstract boolean j();

    public abstract void k(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout);

    public abstract void l();

    public abstract void m(View view);

    public abstract void n(int i3);

    public abstract void o(CharSequence charSequence);

    public abstract void p(int i3);

    public abstract void q(CharSequence charSequence);

    public abstract void r(boolean z10);
}
