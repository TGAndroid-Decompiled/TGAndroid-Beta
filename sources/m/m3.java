package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class m3 implements View.OnClickListener {
    public final l.a f17776a;
    public final n3 f17777b;

    public m3(n3 n3Var) {
        this.f17777b = n3Var;
        Context context = n3Var.f17785a.getContext();
        CharSequence charSequence = n3Var.h;
        ?? obj = new Object();
        obj.e = 4096;
        obj.f16675g = 4096;
        obj.f16679l = null;
        obj.f16680m = null;
        obj.f16681n = false;
        obj.f16682o = false;
        obj.f16683p = 16;
        obj.f16676i = context;
        obj.f16671a = charSequence;
        this.f17776a = obj;
    }

    @Override
    public final void onClick(View view) {
        n3 n3Var = this.f17777b;
        Window.Callback callback = n3Var.f17792k;
        if (callback != null && n3Var.f17793l) {
            callback.onMenuItemSelected(0, this.f17776a);
        }
    }
}
