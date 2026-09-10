package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class m3 implements View.OnClickListener {
    public final l.a f13069a;
    public final n3 f13070b;

    public m3(n3 n3Var) {
        this.f13070b = n3Var;
        Context context = n3Var.f13078a.getContext();
        CharSequence charSequence = n3Var.h;
        ?? obj = new Object();
        obj.e = 4096;
        obj.f12582g = 4096;
        obj.f12586l = null;
        obj.f12587m = null;
        obj.f12588n = false;
        obj.f12589o = false;
        obj.f12590p = 16;
        obj.f12583i = context;
        obj.f12578a = charSequence;
        this.f13069a = obj;
    }

    @Override
    public final void onClick(View view) {
        n3 n3Var = this.f13070b;
        Window.Callback callback = n3Var.f13085k;
        if (callback != null && n3Var.f13086l) {
            callback.onMenuItemSelected(0, this.f13069a);
        }
    }
}
