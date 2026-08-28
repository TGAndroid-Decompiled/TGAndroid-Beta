package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class o3 implements View.OnClickListener {
    public final l.a f17026a;
    public final p3 f17027b;

    public o3(p3 p3Var) {
        this.f17027b = p3Var;
        Context context = p3Var.f17037a.getContext();
        CharSequence charSequence = p3Var.h;
        ?? obj = new Object();
        obj.f16504e = 4096;
        obj.f16506g = 4096;
        obj.f16510l = null;
        obj.f16511m = null;
        obj.f16512n = false;
        obj.f16513o = false;
        obj.f16514p = 16;
        obj.f16507i = context;
        obj.f16501a = charSequence;
        this.f17026a = obj;
    }

    @Override
    public final void onClick(View view) {
        p3 p3Var = this.f17027b;
        Window.Callback callback = p3Var.f17045k;
        if (callback != null && p3Var.f17046l) {
            callback.onMenuItemSelected(0, this.f17026a);
        }
    }
}
