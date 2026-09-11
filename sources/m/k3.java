package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class k3 implements View.OnClickListener {
    public final l.a f15559a;
    public final l3 f15560b;

    public k3(l3 l3Var) {
        this.f15560b = l3Var;
        Context context = l3Var.f15569a.getContext();
        CharSequence charSequence = l3Var.h;
        ?? obj = new Object();
        obj.f15058e = 4096;
        obj.f15060g = 4096;
        obj.f15064l = null;
        obj.f15065m = null;
        obj.f15066n = false;
        obj.f15067o = false;
        obj.f15068p = 16;
        obj.f15061i = context;
        obj.f15055a = charSequence;
        this.f15559a = obj;
    }

    @Override
    public final void onClick(View view) {
        l3 l3Var = this.f15560b;
        Window.Callback callback = l3Var.f15577k;
        if (callback != null && l3Var.f15578l) {
            callback.onMenuItemSelected(0, this.f15559a);
        }
    }
}
