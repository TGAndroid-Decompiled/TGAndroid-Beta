package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class n3 implements View.OnClickListener {
    public final l.a f16616a;
    public final o3 f16617b;

    public n3(o3 o3Var) {
        this.f16617b = o3Var;
        Context context = o3Var.f16625a.getContext();
        CharSequence charSequence = o3Var.h;
        ?? obj = new Object();
        obj.f13932e = 4096;
        obj.f13934g = 4096;
        obj.f13938l = null;
        obj.f13939m = null;
        obj.f13940n = false;
        obj.f13941o = false;
        obj.f13942p = 16;
        obj.f13935i = context;
        obj.f13929a = charSequence;
        this.f16616a = obj;
    }

    @Override
    public final void onClick(View view) {
        o3 o3Var = this.f16617b;
        Window.Callback callback = o3Var.f16633k;
        if (callback != null && o3Var.f16634l) {
            callback.onMenuItemSelected(0, this.f16616a);
        }
    }
}
