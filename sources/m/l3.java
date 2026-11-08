package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class l3 implements View.OnClickListener {
    public final l.a f19152a;
    public final m3 f19153b;

    public l3(m3 m3Var) {
        this.f19153b = m3Var;
        Context context = m3Var.f19162a.getContext();
        CharSequence charSequence = m3Var.h;
        ?? obj = new Object();
        obj.f17620e = 4096;
        obj.f17622g = 4096;
        obj.f17626l = null;
        obj.f17627m = null;
        obj.f17628n = false;
        obj.f17629o = false;
        obj.f17630p = 16;
        obj.f17623i = context;
        obj.f17617a = charSequence;
        this.f19152a = obj;
    }

    @Override
    public final void onClick(View view) {
        m3 m3Var = this.f19153b;
        Window.Callback callback = m3Var.f19170k;
        if (callback != null && m3Var.f19171l) {
            callback.onMenuItemSelected(0, this.f19152a);
        }
    }
}
