package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class k3 implements View.OnClickListener {
    public final l.a f12449a;
    public final l3 f12450b;

    public k3(l3 l3Var) {
        this.f12450b = l3Var;
        Context context = l3Var.f12459a.getContext();
        CharSequence charSequence = l3Var.h;
        ?? obj = new Object();
        obj.e = 4096;
        obj.f11451g = 4096;
        obj.f11455l = null;
        obj.f11456m = null;
        obj.f11457n = false;
        obj.f11458o = false;
        obj.f11459p = 16;
        obj.f11452i = context;
        obj.f11447a = charSequence;
        this.f12449a = obj;
    }

    @Override
    public final void onClick(View view) {
        l3 l3Var = this.f12450b;
        Window.Callback callback = l3Var.f12466k;
        if (callback != null && l3Var.f12467l) {
            callback.onMenuItemSelected(0, this.f12449a);
        }
    }
}
