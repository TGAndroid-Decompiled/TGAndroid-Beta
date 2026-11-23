package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class j3 implements View.OnClickListener {
    public final l.a f20091a;
    public final k3 f20092b;

    public j3(k3 k3Var) {
        this.f20092b = k3Var;
        Context context = k3Var.f20095a.getContext();
        CharSequence charSequence = k3Var.h;
        ?? obj = new Object();
        obj.f19123e = 4096;
        obj.f19125g = 4096;
        obj.f19129l = null;
        obj.f19130m = null;
        obj.f19131n = false;
        obj.f19132o = false;
        obj.f19133p = 16;
        obj.f19126i = context;
        obj.f19120a = charSequence;
        this.f20091a = obj;
    }

    @Override
    public final void onClick(View view) {
        k3 k3Var = this.f20092b;
        Window.Callback callback = k3Var.f20103k;
        if (callback != null && k3Var.f20104l) {
            callback.onMenuItemSelected(0, this.f20091a);
        }
    }
}
