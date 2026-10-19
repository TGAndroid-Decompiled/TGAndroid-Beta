package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class n3 implements View.OnClickListener {
    public final l.a f16266a;
    public final o3 f16267b;

    public n3(o3 o3Var) {
        this.f16267b = o3Var;
        Context context = o3Var.f16275a.getContext();
        CharSequence charSequence = o3Var.h;
        ?? obj = new Object();
        obj.e = 4096;
        obj.f15709g = 4096;
        obj.f15713l = null;
        obj.f15714m = null;
        obj.f15715n = false;
        obj.f15716o = false;
        obj.f15717p = 16;
        obj.f15710i = context;
        obj.f15705a = charSequence;
        this.f16266a = obj;
    }

    @Override
    public final void onClick(View view) {
        o3 o3Var = this.f16267b;
        Window.Callback callback = o3Var.f16282k;
        if (callback != null && o3Var.f16283l) {
            callback.onMenuItemSelected(0, this.f16266a);
        }
    }
}
