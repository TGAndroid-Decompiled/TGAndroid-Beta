package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class k3 implements View.OnClickListener {
    public final l.a f14470a;
    public final l3 f14471b;

    public k3(l3 l3Var) {
        this.f14471b = l3Var;
        Context context = l3Var.f14480a.getContext();
        CharSequence charSequence = l3Var.h;
        ?? obj = new Object();
        obj.e = 4096;
        obj.f13929g = 4096;
        obj.f13933l = null;
        obj.f13934m = null;
        obj.f13935n = false;
        obj.f13936o = false;
        obj.f13937p = 16;
        obj.f13930i = context;
        obj.f13925a = charSequence;
        this.f14470a = obj;
    }

    @Override
    public final void onClick(View view) {
        l3 l3Var = this.f14471b;
        Window.Callback callback = l3Var.f14487k;
        if (callback != null && l3Var.f14488l) {
            callback.onMenuItemSelected(0, this.f14470a);
        }
    }
}
