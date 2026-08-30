package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class n3 implements View.OnClickListener {
    public final l.a f13573a;
    public final o3 f13574b;

    public n3(o3 o3Var) {
        this.f13574b = o3Var;
        Context context = o3Var.f13582a.getContext();
        CharSequence charSequence = o3Var.h;
        ?? obj = new Object();
        obj.e = 4096;
        obj.f10996g = 4096;
        obj.f11000l = null;
        obj.f11001m = null;
        obj.f11002n = false;
        obj.f11003o = false;
        obj.f11004p = 16;
        obj.f10997i = context;
        obj.f10992a = charSequence;
        this.f13573a = obj;
    }

    @Override
    public final void onClick(View view) {
        o3 o3Var = this.f13574b;
        Window.Callback callback = o3Var.f13589k;
        if (callback != null && o3Var.f13590l) {
            callback.onMenuItemSelected(0, this.f13573a);
        }
    }
}
