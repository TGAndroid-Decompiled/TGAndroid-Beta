package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class l3 implements View.OnClickListener {
    public final l.a f15722a;
    public final m3 f15723b;

    public l3(m3 m3Var) {
        this.f15723b = m3Var;
        Context context = m3Var.f15735a.getContext();
        CharSequence charSequence = m3Var.h;
        ?? obj = new Object();
        obj.f15185e = 4096;
        obj.f15187g = 4096;
        obj.f15191l = null;
        obj.f15192m = null;
        obj.f15193n = false;
        obj.f15194o = false;
        obj.f15195p = 16;
        obj.f15188i = context;
        obj.f15182a = charSequence;
        this.f15722a = obj;
    }

    @Override
    public final void onClick(View view) {
        m3 m3Var = this.f15723b;
        Window.Callback callback = m3Var.f15743k;
        if (callback != null && m3Var.f15744l) {
            callback.onMenuItemSelected(0, this.f15722a);
        }
    }
}
