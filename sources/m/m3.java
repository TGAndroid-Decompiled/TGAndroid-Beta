package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class m3 implements View.OnClickListener {
    public final l.a f17775a;
    public final n3 f17776b;

    public m3(n3 n3Var) {
        this.f17776b = n3Var;
        Context context = n3Var.f17784a.getContext();
        CharSequence charSequence = n3Var.h;
        ?? obj = new Object();
        obj.e = 4096;
        obj.f16674g = 4096;
        obj.f16678l = null;
        obj.f16679m = null;
        obj.f16680n = false;
        obj.f16681o = false;
        obj.f16682p = 16;
        obj.f16675i = context;
        obj.f16670a = charSequence;
        this.f17775a = obj;
    }

    @Override
    public final void onClick(View view) {
        n3 n3Var = this.f17776b;
        Window.Callback callback = n3Var.f17791k;
        if (callback != null && n3Var.f17792l) {
            callback.onMenuItemSelected(0, this.f17775a);
        }
    }
}
