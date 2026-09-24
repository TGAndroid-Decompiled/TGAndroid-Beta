package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class k3 implements View.OnClickListener {
    public final l.a f14439a;
    public final l3 f14440b;

    public k3(l3 l3Var) {
        this.f14440b = l3Var;
        Context context = l3Var.f14449a.getContext();
        CharSequence charSequence = l3Var.h;
        ?? obj = new Object();
        obj.e = 4096;
        obj.f13898g = 4096;
        obj.f13902l = null;
        obj.f13903m = null;
        obj.f13904n = false;
        obj.f13905o = false;
        obj.f13906p = 16;
        obj.f13899i = context;
        obj.f13894a = charSequence;
        this.f14439a = obj;
    }

    @Override
    public final void onClick(View view) {
        l3 l3Var = this.f14440b;
        Window.Callback callback = l3Var.f14456k;
        if (callback != null && l3Var.f14457l) {
            callback.onMenuItemSelected(0, this.f14439a);
        }
    }
}
