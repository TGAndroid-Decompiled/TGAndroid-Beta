package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class k3 implements View.OnClickListener {
    public final l.a f14454a;
    public final l3 f14455b;

    public k3(l3 l3Var) {
        this.f14455b = l3Var;
        Context context = l3Var.f14464a.getContext();
        CharSequence charSequence = l3Var.h;
        ?? obj = new Object();
        obj.e = 4096;
        obj.f13913g = 4096;
        obj.f13917l = null;
        obj.f13918m = null;
        obj.f13919n = false;
        obj.f13920o = false;
        obj.f13921p = 16;
        obj.f13914i = context;
        obj.f13909a = charSequence;
        this.f14454a = obj;
    }

    @Override
    public final void onClick(View view) {
        l3 l3Var = this.f14455b;
        Window.Callback callback = l3Var.f14471k;
        if (callback != null && l3Var.f14472l) {
            callback.onMenuItemSelected(0, this.f14454a);
        }
    }
}
