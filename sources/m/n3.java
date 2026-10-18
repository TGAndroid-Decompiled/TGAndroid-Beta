package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class n3 implements View.OnClickListener {
    public final l.a f16267a;
    public final o3 f16268b;

    public n3(o3 o3Var) {
        this.f16268b = o3Var;
        Context context = o3Var.f16276a.getContext();
        CharSequence charSequence = o3Var.h;
        ?? obj = new Object();
        obj.e = 4096;
        obj.f15710g = 4096;
        obj.f15714l = null;
        obj.f15715m = null;
        obj.f15716n = false;
        obj.f15717o = false;
        obj.f15718p = 16;
        obj.f15711i = context;
        obj.f15706a = charSequence;
        this.f16267a = obj;
    }

    @Override
    public final void onClick(View view) {
        o3 o3Var = this.f16268b;
        Window.Callback callback = o3Var.f16283k;
        if (callback != null && o3Var.f16284l) {
            callback.onMenuItemSelected(0, this.f16267a);
        }
    }
}
