package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class k3 implements View.OnClickListener {
    public final l.a f15586a;
    public final l3 f15587b;

    public k3(l3 l3Var) {
        this.f15587b = l3Var;
        Context context = l3Var.f15596a.getContext();
        CharSequence charSequence = l3Var.h;
        ?? obj = new Object();
        obj.f15084e = 4096;
        obj.f15086g = 4096;
        obj.f15090l = null;
        obj.f15091m = null;
        obj.f15092n = false;
        obj.f15093o = false;
        obj.f15094p = 16;
        obj.f15087i = context;
        obj.f15081a = charSequence;
        this.f15586a = obj;
    }

    @Override
    public final void onClick(View view) {
        l3 l3Var = this.f15587b;
        Window.Callback callback = l3Var.f15604k;
        if (callback != null && l3Var.f15605l) {
            callback.onMenuItemSelected(0, this.f15586a);
        }
    }
}
