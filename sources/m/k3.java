package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class k3 implements View.OnClickListener {
    public final l.a f15774a;
    public final l3 f15775b;

    public k3(l3 l3Var) {
        this.f15775b = l3Var;
        Context context = l3Var.f15784a.getContext();
        CharSequence charSequence = l3Var.h;
        ?? obj = new Object();
        obj.f15119e = 4096;
        obj.f15121g = 4096;
        obj.f15125l = null;
        obj.f15126m = null;
        obj.f15127n = false;
        obj.f15128o = false;
        obj.f15129p = 16;
        obj.f15122i = context;
        obj.f15116a = charSequence;
        this.f15774a = obj;
    }

    @Override
    public final void onClick(View view) {
        l3 l3Var = this.f15775b;
        Window.Callback callback = l3Var.f15792k;
        if (callback != null && l3Var.f15793l) {
            callback.onMenuItemSelected(0, this.f15774a);
        }
    }
}
