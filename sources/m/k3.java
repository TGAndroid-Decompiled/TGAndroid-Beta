package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class k3 implements View.OnClickListener {
    public final l.a f14398a;
    public final l3 f14399b;

    public k3(l3 l3Var) {
        this.f14399b = l3Var;
        Context context = l3Var.f14408a.getContext();
        CharSequence charSequence = l3Var.h;
        ?? obj = new Object();
        obj.e = 4096;
        obj.f13848g = 4096;
        obj.f13852l = null;
        obj.f13853m = null;
        obj.f13854n = false;
        obj.f13855o = false;
        obj.f13856p = 16;
        obj.f13849i = context;
        obj.f13844a = charSequence;
        this.f14398a = obj;
    }

    @Override
    public final void onClick(View view) {
        l3 l3Var = this.f14399b;
        Window.Callback callback = l3Var.f14415k;
        if (callback != null && l3Var.f14416l) {
            callback.onMenuItemSelected(0, this.f14398a);
        }
    }
}
