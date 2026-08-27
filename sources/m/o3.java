package m;

import android.content.Context;
import android.view.View;
import android.view.Window;

public final class o3 implements View.OnClickListener {

    public final l.a f17401a;

    public final p3 f17402b;

    public o3(p3 p3Var) {
        this.f17402b = p3Var;
        Context context = p3Var.f17412a.getContext();
        CharSequence charSequence = p3Var.h;
        l.a aVar = new l.a();
        aVar.f15258e = 4096;
        aVar.f15260g = 4096;
        aVar.f15264l = null;
        aVar.f15265m = null;
        aVar.f15266n = false;
        aVar.f15267o = false;
        aVar.f15268p = 16;
        aVar.f15261i = context;
        aVar.f15255a = charSequence;
        this.f17401a = aVar;
    }

    @Override
    public final void onClick(View view) {
        p3 p3Var = this.f17402b;
        Window.Callback callback = p3Var.f17420k;
        if (callback == null || !p3Var.f17421l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f17401a);
    }
}
