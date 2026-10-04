package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class k3 implements View.OnClickListener {
    public final l.a f15775a;
    public final l3 f15776b;

    public k3(l3 l3Var) {
        this.f15776b = l3Var;
        Context context = l3Var.f15785a.getContext();
        CharSequence charSequence = l3Var.h;
        ?? obj = new Object();
        obj.f15120e = 4096;
        obj.f15122g = 4096;
        obj.f15126l = null;
        obj.f15127m = null;
        obj.f15128n = false;
        obj.f15129o = false;
        obj.f15130p = 16;
        obj.f15123i = context;
        obj.f15117a = charSequence;
        this.f15775a = obj;
    }

    @Override
    public final void onClick(View view) {
        l3 l3Var = this.f15776b;
        Window.Callback callback = l3Var.f15793k;
        if (callback != null && l3Var.f15794l) {
            callback.onMenuItemSelected(0, this.f15775a);
        }
    }
}
