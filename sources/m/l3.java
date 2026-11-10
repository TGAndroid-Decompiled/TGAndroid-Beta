package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class l3 implements View.OnClickListener {
    public final l.a f19157a;
    public final m3 f19158b;

    public l3(m3 m3Var) {
        this.f19158b = m3Var;
        Context context = m3Var.f19167a.getContext();
        CharSequence charSequence = m3Var.h;
        ?? obj = new Object();
        obj.f17623e = 4096;
        obj.f17625g = 4096;
        obj.f17629l = null;
        obj.f17630m = null;
        obj.f17631n = false;
        obj.f17632o = false;
        obj.f17633p = 16;
        obj.f17626i = context;
        obj.f17620a = charSequence;
        this.f19157a = obj;
    }

    @Override
    public final void onClick(View view) {
        m3 m3Var = this.f19158b;
        Window.Callback callback = m3Var.f19175k;
        if (callback != null && m3Var.f19176l) {
            callback.onMenuItemSelected(0, this.f19157a);
        }
    }
}
