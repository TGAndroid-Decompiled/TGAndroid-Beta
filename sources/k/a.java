package k;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.Components.u;
import org.telegram.ui.Components.zj;
public abstract class a {
    public boolean f17102a;
    public Object f17103b;

    public a(Context context, f6 f6Var, boolean z9) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232565, z9 ? 1 : 0, context, f6Var);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new zj(this, 1));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new u(this, 27));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
        j(actionBarPopupWindow$ActionBarPopupWindowLayout);
        g1 g1Var = new g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f17103b = g1Var;
        g1Var.f27480b = false;
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
                aVar.k();
                aVar.f17102a = false;
            }
        });
    }

    public void a() {
        g1 g1Var = (g1) this.f17103b;
        if (g1Var != null) {
            g1Var.dismiss();
        }
    }

    public abstract void b();

    public abstract View c();

    public abstract l.k d();

    public abstract h e();

    public abstract CharSequence f();

    public abstract CharSequence g();

    public abstract void h();

    public abstract boolean i();

    public abstract void j(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout);

    public abstract void k();

    public abstract void l(View view);

    public abstract void m(int i7);

    public abstract void n(CharSequence charSequence);

    public abstract void o(int i7);

    public abstract void p(CharSequence charSequence);

    public abstract void q(boolean z9);
}
