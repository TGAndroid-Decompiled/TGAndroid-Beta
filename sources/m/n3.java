package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class n3 implements View.OnClickListener {
    public final l.a f16268a;
    public final o3 f16269b;

    public n3(o3 o3Var) {
        this.f16269b = o3Var;
        Context context = o3Var.f16277a.getContext();
        CharSequence charSequence = o3Var.h;
        ?? obj = new Object();
        obj.e = 4096;
        obj.f15711g = 4096;
        obj.f15715l = null;
        obj.f15716m = null;
        obj.f15717n = false;
        obj.f15718o = false;
        obj.f15719p = 16;
        obj.f15712i = context;
        obj.f15707a = charSequence;
        this.f16268a = obj;
    }

    @Override
    public final void onClick(View view) {
        o3 o3Var = this.f16269b;
        Window.Callback callback = o3Var.f16284k;
        if (callback != null && o3Var.f16285l) {
            callback.onMenuItemSelected(0, this.f16268a);
        }
    }
}
