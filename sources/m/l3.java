package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class l3 implements View.OnClickListener {
    public final l.a f14221a;
    public final m3 f14222b;

    public l3(m3 m3Var) {
        this.f14222b = m3Var;
        Context context = m3Var.f14233a.getContext();
        CharSequence charSequence = m3Var.h;
        ?? obj = new Object();
        obj.e = 4096;
        obj.f13692g = 4096;
        obj.f13696l = null;
        obj.f13697m = null;
        obj.f13698n = false;
        obj.f13699o = false;
        obj.f13700p = 16;
        obj.f13693i = context;
        obj.f13688a = charSequence;
        this.f14221a = obj;
    }

    @Override
    public final void onClick(View view) {
        m3 m3Var = this.f14222b;
        Window.Callback callback = m3Var.f14240k;
        if (callback != null && m3Var.f14241l) {
            callback.onMenuItemSelected(0, this.f14221a);
        }
    }
}
