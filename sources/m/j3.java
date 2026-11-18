package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class j3 implements View.OnClickListener {
    public final l.a f20097a;
    public final k3 f20098b;

    public j3(k3 k3Var) {
        this.f20098b = k3Var;
        Context context = k3Var.f20101a.getContext();
        CharSequence charSequence = k3Var.h;
        ?? obj = new Object();
        obj.f19129e = 4096;
        obj.f19131g = 4096;
        obj.f19135l = null;
        obj.f19136m = null;
        obj.f19137n = false;
        obj.f19138o = false;
        obj.f19139p = 16;
        obj.f19132i = context;
        obj.f19126a = charSequence;
        this.f20097a = obj;
    }

    @Override
    public final void onClick(View view) {
        k3 k3Var = this.f20098b;
        Window.Callback callback = k3Var.f20109k;
        if (callback != null && k3Var.f20110l) {
            callback.onMenuItemSelected(0, this.f20097a);
        }
    }
}
