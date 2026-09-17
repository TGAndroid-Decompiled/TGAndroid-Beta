package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class k3 implements View.OnClickListener {
    public final l.a f14223a;
    public final l3 f14224b;

    public k3(l3 l3Var) {
        this.f14224b = l3Var;
        Context context = l3Var.f14233a.getContext();
        CharSequence charSequence = l3Var.h;
        ?? obj = new Object();
        obj.e = 4096;
        obj.f13702g = 4096;
        obj.f13706l = null;
        obj.f13707m = null;
        obj.f13708n = false;
        obj.f13709o = false;
        obj.f13710p = 16;
        obj.f13703i = context;
        obj.f13698a = charSequence;
        this.f14223a = obj;
    }

    @Override
    public final void onClick(View view) {
        l3 l3Var = this.f14224b;
        Window.Callback callback = l3Var.f14240k;
        if (callback != null && l3Var.f14241l) {
            callback.onMenuItemSelected(0, this.f14223a);
        }
    }
}
