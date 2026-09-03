package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class n3 implements View.OnClickListener {
    public final l.a f13557a;
    public final o3 f13558b;

    public n3(o3 o3Var) {
        this.f13558b = o3Var;
        Context context = o3Var.f13566a.getContext();
        CharSequence charSequence = o3Var.h;
        ?? obj = new Object();
        obj.e = 4096;
        obj.f11106g = 4096;
        obj.f11110l = null;
        obj.f11111m = null;
        obj.f11112n = false;
        obj.f11113o = false;
        obj.f11114p = 16;
        obj.f11107i = context;
        obj.f11102a = charSequence;
        this.f13557a = obj;
    }

    @Override
    public final void onClick(View view) {
        o3 o3Var = this.f13558b;
        Window.Callback callback = o3Var.f13573k;
        if (callback != null && o3Var.f13574l) {
            callback.onMenuItemSelected(0, this.f13557a);
        }
    }
}
