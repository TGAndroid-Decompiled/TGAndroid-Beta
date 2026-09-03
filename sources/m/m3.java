package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class m3 implements View.OnClickListener {
    public final l.a f13257a;
    public final n3 f13258b;

    public m3(n3 n3Var) {
        this.f13258b = n3Var;
        Context context = n3Var.f13266a.getContext();
        CharSequence charSequence = n3Var.h;
        ?? obj = new Object();
        obj.f11345e = 4096;
        obj.f11347g = 4096;
        obj.f11351l = null;
        obj.f11352m = null;
        obj.f11353n = false;
        obj.f11354o = false;
        obj.f11355p = 16;
        obj.f11348i = context;
        obj.f11342a = charSequence;
        this.f13257a = obj;
    }

    @Override
    public final void onClick(View view) {
        n3 n3Var = this.f13258b;
        Window.Callback callback = n3Var.f13274k;
        if (callback != null && n3Var.f13275l) {
            callback.onMenuItemSelected(0, this.f13257a);
        }
    }
}
