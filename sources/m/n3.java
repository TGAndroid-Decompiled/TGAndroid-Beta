package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class n3 implements View.OnClickListener {
    public final l.a f16265a;
    public final o3 f16266b;

    public n3(o3 o3Var) {
        this.f16266b = o3Var;
        Context context = o3Var.f16274a.getContext();
        CharSequence charSequence = o3Var.h;
        ?? obj = new Object();
        obj.e = 4096;
        obj.f15708g = 4096;
        obj.f15712l = null;
        obj.f15713m = null;
        obj.f15714n = false;
        obj.f15715o = false;
        obj.f15716p = 16;
        obj.f15709i = context;
        obj.f15704a = charSequence;
        this.f16265a = obj;
    }

    @Override
    public final void onClick(View view) {
        o3 o3Var = this.f16266b;
        Window.Callback callback = o3Var.f16281k;
        if (callback != null && o3Var.f16282l) {
            callback.onMenuItemSelected(0, this.f16265a);
        }
    }
}
