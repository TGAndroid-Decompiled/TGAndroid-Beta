package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class n3 implements View.OnClickListener {
    public final l.a f16329a;
    public final o3 f16330b;

    public n3(o3 o3Var) {
        this.f16330b = o3Var;
        Context context = o3Var.f16338a.getContext();
        CharSequence charSequence = o3Var.h;
        ?? obj = new Object();
        obj.e = 4096;
        obj.f15772g = 4096;
        obj.f15776l = null;
        obj.f15777m = null;
        obj.f15778n = false;
        obj.f15779o = false;
        obj.f15780p = 16;
        obj.f15773i = context;
        obj.f15768a = charSequence;
        this.f16329a = obj;
    }

    @Override
    public final void onClick(View view) {
        o3 o3Var = this.f16330b;
        Window.Callback callback = o3Var.f16345k;
        if (callback != null && o3Var.f16346l) {
            callback.onMenuItemSelected(0, this.f16329a);
        }
    }
}
