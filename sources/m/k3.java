package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class k3 implements View.OnClickListener {
    public final l.a f14449a;
    public final l3 f14450b;

    public k3(l3 l3Var) {
        this.f14450b = l3Var;
        Context context = l3Var.f14459a.getContext();
        CharSequence charSequence = l3Var.h;
        ?? obj = new Object();
        obj.e = 4096;
        obj.f13900g = 4096;
        obj.f13904l = null;
        obj.f13905m = null;
        obj.f13906n = false;
        obj.f13907o = false;
        obj.f13908p = 16;
        obj.f13901i = context;
        obj.f13896a = charSequence;
        this.f14449a = obj;
    }

    @Override
    public final void onClick(View view) {
        l3 l3Var = this.f14450b;
        Window.Callback callback = l3Var.f14466k;
        if (callback != null && l3Var.f14467l) {
            callback.onMenuItemSelected(0, this.f14449a);
        }
    }
}
