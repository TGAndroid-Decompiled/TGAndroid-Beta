package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class l3 implements View.OnClickListener {
    public final l.a f15783a;
    public final m3 f15784b;

    public l3(m3 m3Var) {
        this.f15784b = m3Var;
        Context context = m3Var.f15796a.getContext();
        CharSequence charSequence = m3Var.h;
        ?? obj = new Object();
        obj.f15224e = 4096;
        obj.f15226g = 4096;
        obj.f15230l = null;
        obj.f15231m = null;
        obj.f15232n = false;
        obj.f15233o = false;
        obj.f15234p = 16;
        obj.f15227i = context;
        obj.f15221a = charSequence;
        this.f15783a = obj;
    }

    @Override
    public final void onClick(View view) {
        m3 m3Var = this.f15784b;
        Window.Callback callback = m3Var.f15804k;
        if (callback != null && m3Var.f15805l) {
            callback.onMenuItemSelected(0, this.f15783a);
        }
    }
}
