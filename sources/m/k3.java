package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class k3 implements View.OnClickListener {
    public final l.a f14481a;
    public final l3 f14482b;

    public k3(l3 l3Var) {
        this.f14482b = l3Var;
        Context context = l3Var.f14491a.getContext();
        CharSequence charSequence = l3Var.h;
        ?? obj = new Object();
        obj.e = 4096;
        obj.f13915g = 4096;
        obj.f13919l = null;
        obj.f13920m = null;
        obj.f13921n = false;
        obj.f13922o = false;
        obj.f13923p = 16;
        obj.f13916i = context;
        obj.f13911a = charSequence;
        this.f14481a = obj;
    }

    @Override
    public final void onClick(View view) {
        l3 l3Var = this.f14482b;
        Window.Callback callback = l3Var.f14498k;
        if (callback != null && l3Var.f14499l) {
            callback.onMenuItemSelected(0, this.f14481a);
        }
    }
}
