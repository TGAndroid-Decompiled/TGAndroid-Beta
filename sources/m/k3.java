package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class k3 implements View.OnClickListener {
    public final l.a f14211a;
    public final l3 f14212b;

    public k3(l3 l3Var) {
        this.f14212b = l3Var;
        Context context = l3Var.f14221a.getContext();
        CharSequence charSequence = l3Var.h;
        ?? obj = new Object();
        obj.e = 4096;
        obj.f13690g = 4096;
        obj.f13694l = null;
        obj.f13695m = null;
        obj.f13696n = false;
        obj.f13697o = false;
        obj.f13698p = 16;
        obj.f13691i = context;
        obj.f13686a = charSequence;
        this.f14211a = obj;
    }

    @Override
    public final void onClick(View view) {
        l3 l3Var = this.f14212b;
        Window.Callback callback = l3Var.f14228k;
        if (callback != null && l3Var.f14229l) {
            callback.onMenuItemSelected(0, this.f14211a);
        }
    }
}
