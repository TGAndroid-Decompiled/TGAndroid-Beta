package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class j3 implements View.OnClickListener {
    public final l.a f20122a;
    public final k3 f20123b;

    public j3(k3 k3Var) {
        this.f20123b = k3Var;
        Context context = k3Var.f20126a.getContext();
        CharSequence charSequence = k3Var.h;
        ?? obj = new Object();
        obj.f19154e = 4096;
        obj.f19156g = 4096;
        obj.f19160l = null;
        obj.f19161m = null;
        obj.f19162n = false;
        obj.f19163o = false;
        obj.f19164p = 16;
        obj.f19157i = context;
        obj.f19151a = charSequence;
        this.f20122a = obj;
    }

    @Override
    public final void onClick(View view) {
        k3 k3Var = this.f20123b;
        Window.Callback callback = k3Var.f20134k;
        if (callback != null && k3Var.f20135l) {
            callback.onMenuItemSelected(0, this.f20122a);
        }
    }
}
