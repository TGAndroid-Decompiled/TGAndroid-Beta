package k;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.b0;
import org.telegram.ui.Components.ok;
public abstract class a {
    public boolean f18154a;
    public Object f18155b;

    public a(Context context, i6 i6Var, boolean z10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232570, z10 ? 1 : 0, context, i6Var);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new ok(this, 1));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new b0(this, 26));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
        k(actionBarPopupWindow$ActionBarPopupWindowLayout);
        g1 g1Var = new g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f18155b = g1Var;
        g1Var.f29034b = false;
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
                aVar.l();
                aVar.f18154a = false;
            }
        });
    }

    public void a() {
        g1 g1Var = (g1) this.f18155b;
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

    public abstract boolean j();

    public abstract void k(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout);

    public abstract void l();

    public abstract void m(View view);

    public abstract void n(int i7);

    public abstract void o(CharSequence charSequence);

    public abstract void q(int i7);

    public abstract void r(CharSequence charSequence);

    public abstract void s(boolean z10);
}
