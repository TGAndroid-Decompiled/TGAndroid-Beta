package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class l3 implements View.OnClickListener {
    public final l.a f15726a;
    public final m3 f15727b;

    public l3(m3 m3Var) {
        this.f15727b = m3Var;
        Context context = m3Var.f15739a.getContext();
        CharSequence charSequence = m3Var.h;
        ?? obj = new Object();
        obj.f15189e = 4096;
        obj.f15191g = 4096;
        obj.f15195l = null;
        obj.f15196m = null;
        obj.f15197n = false;
        obj.f15198o = false;
        obj.f15199p = 16;
        obj.f15192i = context;
        obj.f15186a = charSequence;
        this.f15726a = obj;
    }

    @Override
    public final void onClick(View view) {
        m3 m3Var = this.f15727b;
        Window.Callback callback = m3Var.f15747k;
        if (callback != null && m3Var.f15748l) {
            callback.onMenuItemSelected(0, this.f15726a);
        }
    }
}
