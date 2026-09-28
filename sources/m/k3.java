package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class k3 implements View.OnClickListener {
    public final l.a f14455a;
    public final l3 f14456b;

    public k3(l3 l3Var) {
        this.f14456b = l3Var;
        Context context = l3Var.f14465a.getContext();
        CharSequence charSequence = l3Var.h;
        ?? obj = new Object();
        obj.e = 4096;
        obj.f13914g = 4096;
        obj.f13918l = null;
        obj.f13919m = null;
        obj.f13920n = false;
        obj.f13921o = false;
        obj.f13922p = 16;
        obj.f13915i = context;
        obj.f13910a = charSequence;
        this.f14455a = obj;
    }

    @Override
    public final void onClick(View view) {
        l3 l3Var = this.f14456b;
        Window.Callback callback = l3Var.f14472k;
        if (callback != null && l3Var.f14473l) {
            callback.onMenuItemSelected(0, this.f14455a);
        }
    }
}
