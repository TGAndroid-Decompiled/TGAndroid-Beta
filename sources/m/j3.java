package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class j3 implements View.OnClickListener {
    public final l.a f20094a;
    public final k3 f20095b;

    public j3(k3 k3Var) {
        this.f20095b = k3Var;
        Context context = k3Var.f20098a.getContext();
        CharSequence charSequence = k3Var.h;
        ?? obj = new Object();
        obj.f19126e = 4096;
        obj.f19128g = 4096;
        obj.f19132l = null;
        obj.f19133m = null;
        obj.f19134n = false;
        obj.f19135o = false;
        obj.f19136p = 16;
        obj.f19129i = context;
        obj.f19123a = charSequence;
        this.f20094a = obj;
    }

    @Override
    public final void onClick(View view) {
        k3 k3Var = this.f20095b;
        Window.Callback callback = k3Var.f20106k;
        if (callback != null && k3Var.f20107l) {
            callback.onMenuItemSelected(0, this.f20094a);
        }
    }
}
