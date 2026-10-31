package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class k3 implements View.OnClickListener {
    public final l.a f12448a;
    public final l3 f12449b;

    public k3(l3 l3Var) {
        this.f12449b = l3Var;
        Context context = l3Var.f12458a.getContext();
        CharSequence charSequence = l3Var.h;
        ?? obj = new Object();
        obj.e = 4096;
        obj.f11450g = 4096;
        obj.f11454l = null;
        obj.f11455m = null;
        obj.f11456n = false;
        obj.f11457o = false;
        obj.f11458p = 16;
        obj.f11451i = context;
        obj.f11446a = charSequence;
        this.f12448a = obj;
    }

    @Override
    public final void onClick(View view) {
        l3 l3Var = this.f12449b;
        Window.Callback callback = l3Var.f12465k;
        if (callback != null && l3Var.f12466l) {
            callback.onMenuItemSelected(0, this.f12448a);
        }
    }
}
