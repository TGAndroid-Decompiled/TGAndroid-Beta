package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class o3 implements View.OnClickListener {
    public final l.a f14915a;
    public final p3 f14916b;

    public o3(p3 p3Var) {
        this.f14916b = p3Var;
        Context context = p3Var.f14924a.getContext();
        CharSequence charSequence = p3Var.h;
        ?? obj = new Object();
        obj.e = 4096;
        obj.f14371g = 4096;
        obj.f14375l = null;
        obj.f14376m = null;
        obj.f14377n = false;
        obj.f14378o = false;
        obj.f14379p = 16;
        obj.f14372i = context;
        obj.f14367a = charSequence;
        this.f14915a = obj;
    }

    @Override
    public final void onClick(View view) {
        p3 p3Var = this.f14916b;
        Window.Callback callback = p3Var.f14931k;
        if (callback != null && p3Var.f14932l) {
            callback.onMenuItemSelected(0, this.f14915a);
        }
    }
}
