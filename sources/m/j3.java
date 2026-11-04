package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class j3 implements View.OnClickListener {
    public final l.a f18618a;
    public final k3 f18619b;

    public j3(k3 k3Var) {
        this.f18619b = k3Var;
        Context context = k3Var.f18622a.getContext();
        CharSequence charSequence = k3Var.h;
        ?? obj = new Object();
        obj.f17366e = 4096;
        obj.f17368g = 4096;
        obj.f17372l = null;
        obj.f17373m = null;
        obj.f17374n = false;
        obj.f17375o = false;
        obj.f17376p = 16;
        obj.f17369i = context;
        obj.f17363a = charSequence;
        this.f18618a = obj;
    }

    @Override
    public final void onClick(View view) {
        k3 k3Var = this.f18619b;
        Window.Callback callback = k3Var.f18630k;
        if (callback != null && k3Var.f18631l) {
            callback.onMenuItemSelected(0, this.f18618a);
        }
    }
}
