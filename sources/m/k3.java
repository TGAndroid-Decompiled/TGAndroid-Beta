package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class k3 implements View.OnClickListener {
    public final l.a f15779a;
    public final l3 f15780b;

    public k3(l3 l3Var) {
        this.f15780b = l3Var;
        Context context = l3Var.f15789a.getContext();
        CharSequence charSequence = l3Var.h;
        ?? obj = new Object();
        obj.f15121e = 4096;
        obj.f15123g = 4096;
        obj.f15127l = null;
        obj.f15128m = null;
        obj.f15129n = false;
        obj.f15130o = false;
        obj.f15131p = 16;
        obj.f15124i = context;
        obj.f15118a = charSequence;
        this.f15779a = obj;
    }

    @Override
    public final void onClick(View view) {
        l3 l3Var = this.f15780b;
        Window.Callback callback = l3Var.f15797k;
        if (callback != null && l3Var.f15798l) {
            callback.onMenuItemSelected(0, this.f15779a);
        }
    }
}
