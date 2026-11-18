package k;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.h1;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.b0;
import org.telegram.ui.Components.ok;
public abstract class a {
    public boolean f18055a;
    public Object f18056b;

    public a(Context context, i6 i6Var, boolean z10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232567, z10 ? 1 : 0, context, i6Var);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new ok(this, 1));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new b0(this, 26));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
        l(actionBarPopupWindow$ActionBarPopupWindowLayout);
        h1 h1Var = new h1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f18056b = h1Var;
        h1Var.f28989b = false;
        h1Var.setAnimationStyle(2131755193);
        h1Var.setOutsideTouchable(true);
        h1Var.setClippingEnabled(true);
        h1Var.setInputMethodMode(2);
        h1Var.setSoftInputMode(0);
        h1Var.getContentView().setFocusableInTouchMode(true);
        if (g0.C1()) {
            h1Var.setFocusable(true);
        }
        h1Var.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public final void onDismiss() {
                k.a aVar = k.a.this;
                aVar.m();
                aVar.f18055a = false;
            }
        });
    }

    public void a() {
        h1 h1Var = (h1) this.f18056b;
        if (h1Var != null) {
            h1Var.dismiss();
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
