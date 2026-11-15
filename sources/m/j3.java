package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class j3 implements View.OnClickListener {
    public final l.a f19730a;
    public final k3 f19731b;

    public j3(k3 k3Var) {
        this.f19731b = k3Var;
        Context context = k3Var.f19734a.getContext();
        CharSequence charSequence = k3Var.h;
        ?? obj = new Object();
        obj.f18762e = 4096;
        obj.f18764g = 4096;
        obj.f18768l = null;
        obj.f18769m = null;
        obj.f18770n = false;
        obj.f18771o = false;
        obj.f18772p = 16;
        obj.f18765i = context;
        obj.f18759a = charSequence;
        this.f19730a = obj;
    }

    @Override
    public final void onClick(View view) {
        k3 k3Var = this.f19731b;
        Window.Callback callback = k3Var.f19742k;
        if (callback != null && k3Var.f19743l) {
            callback.onMenuItemSelected(0, this.f19730a);
        }
    }
}
