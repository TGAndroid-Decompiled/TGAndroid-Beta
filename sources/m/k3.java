package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class k3 implements View.OnClickListener {
    public final l.a f14201a;
    public final l3 f14202b;

    public k3(l3 l3Var) {
        this.f14202b = l3Var;
        Context context = l3Var.f14211a.getContext();
        CharSequence charSequence = l3Var.h;
        ?? obj = new Object();
        obj.e = 4096;
        obj.f13678g = 4096;
        obj.f13682l = null;
        obj.f13683m = null;
        obj.f13684n = false;
        obj.f13685o = false;
        obj.f13686p = 16;
        obj.f13679i = context;
        obj.f13674a = charSequence;
        this.f14201a = obj;
    }

    @Override
    public final void onClick(View view) {
        l3 l3Var = this.f14202b;
        Window.Callback callback = l3Var.f14218k;
        if (callback != null && l3Var.f14219l) {
            callback.onMenuItemSelected(0, this.f14201a);
        }
    }
}
