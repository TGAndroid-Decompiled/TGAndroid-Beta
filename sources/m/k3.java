package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class k3 implements View.OnClickListener {
    public final l.a f14434a;
    public final l3 f14435b;

    public k3(l3 l3Var) {
        this.f14435b = l3Var;
        Context context = l3Var.f14444a.getContext();
        CharSequence charSequence = l3Var.h;
        ?? obj = new Object();
        obj.e = 4096;
        obj.f13887g = 4096;
        obj.f13891l = null;
        obj.f13892m = null;
        obj.f13893n = false;
        obj.f13894o = false;
        obj.f13895p = 16;
        obj.f13888i = context;
        obj.f13883a = charSequence;
        this.f14434a = obj;
    }

    @Override
    public final void onClick(View view) {
        l3 l3Var = this.f14435b;
        Window.Callback callback = l3Var.f14451k;
        if (callback != null && l3Var.f14452l) {
            callback.onMenuItemSelected(0, this.f14434a);
        }
    }
}
