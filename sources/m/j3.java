package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class j3 implements View.OnClickListener {
    public final l.a f20125a;
    public final k3 f20126b;

    public j3(k3 k3Var) {
        this.f20126b = k3Var;
        Context context = k3Var.f20129a.getContext();
        CharSequence charSequence = k3Var.h;
        ?? obj = new Object();
        obj.f19157e = 4096;
        obj.f19159g = 4096;
        obj.f19163l = null;
        obj.f19164m = null;
        obj.f19165n = false;
        obj.f19166o = false;
        obj.f19167p = 16;
        obj.f19160i = context;
        obj.f19154a = charSequence;
        this.f20125a = obj;
    }

    @Override
    public final void onClick(View view) {
        k3 k3Var = this.f20126b;
        Window.Callback callback = k3Var.f20137k;
        if (callback != null && k3Var.f20138l) {
            callback.onMenuItemSelected(0, this.f20125a);
        }
    }
}
