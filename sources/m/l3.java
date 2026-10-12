package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class l3 implements View.OnClickListener {
    public final l.a f15152a;
    public final m3 f15153b;

    public l3(m3 m3Var) {
        this.f15153b = m3Var;
        Context context = m3Var.f15164a.getContext();
        CharSequence charSequence = m3Var.h;
        ?? obj = new Object();
        obj.e = 4096;
        obj.f14369g = 4096;
        obj.f14373l = null;
        obj.f14374m = null;
        obj.f14375n = false;
        obj.f14376o = false;
        obj.f14377p = 16;
        obj.f14370i = context;
        obj.f14365a = charSequence;
        this.f15152a = obj;
    }

    @Override
    public final void onClick(View view) {
        m3 m3Var = this.f15153b;
        Window.Callback callback = m3Var.f15171k;
        if (callback != null && m3Var.f15172l) {
            callback.onMenuItemSelected(0, this.f15152a);
        }
    }
}
