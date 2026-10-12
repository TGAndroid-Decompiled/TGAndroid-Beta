package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class m3 implements View.OnClickListener {
    public final l.a f15484a;
    public final n3 f15485b;

    public m3(n3 n3Var) {
        this.f15485b = n3Var;
        Context context = n3Var.f15498a.getContext();
        CharSequence charSequence = n3Var.h;
        ?? obj = new Object();
        obj.f14934e = 4096;
        obj.f14936g = 4096;
        obj.f14940l = null;
        obj.f14941m = null;
        obj.f14942n = false;
        obj.f14943o = false;
        obj.f14944p = 16;
        obj.f14937i = context;
        obj.f14931a = charSequence;
        this.f15484a = obj;
    }

    @Override
    public final void onClick(View view) {
        n3 n3Var = this.f15485b;
        Window.Callback callback = n3Var.f15506k;
        if (callback != null && n3Var.f15507l) {
            callback.onMenuItemSelected(0, this.f15484a);
        }
    }
}
