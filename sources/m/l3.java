package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class l3 implements View.OnClickListener {
    public final l.a f15747a;
    public final m3 f15748b;

    public l3(m3 m3Var) {
        this.f15748b = m3Var;
        Context context = m3Var.f15760a.getContext();
        CharSequence charSequence = m3Var.h;
        ?? obj = new Object();
        obj.f15188e = 4096;
        obj.f15190g = 4096;
        obj.f15194l = null;
        obj.f15195m = null;
        obj.f15196n = false;
        obj.f15197o = false;
        obj.f15198p = 16;
        obj.f15191i = context;
        obj.f15185a = charSequence;
        this.f15747a = obj;
    }

    @Override
    public final void onClick(View view) {
        m3 m3Var = this.f15748b;
        Window.Callback callback = m3Var.f15768k;
        if (callback != null && m3Var.f15769l) {
            callback.onMenuItemSelected(0, this.f15747a);
        }
    }
}
