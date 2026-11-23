package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class j3 implements View.OnClickListener {
    public final l.a f20188a;
    public final k3 f20189b;

    public j3(k3 k3Var) {
        this.f20189b = k3Var;
        Context context = k3Var.f20192a.getContext();
        CharSequence charSequence = k3Var.h;
        ?? obj = new Object();
        obj.f19222e = 4096;
        obj.f19224g = 4096;
        obj.f19228l = null;
        obj.f19229m = null;
        obj.f19230n = false;
        obj.f19231o = false;
        obj.f19232p = 16;
        obj.f19225i = context;
        obj.f19219a = charSequence;
        this.f20188a = obj;
    }

    @Override
    public final void onClick(View view) {
        k3 k3Var = this.f20189b;
        Window.Callback callback = k3Var.f20200k;
        if (callback != null && k3Var.f20201l) {
            callback.onMenuItemSelected(0, this.f20188a);
        }
    }
}
