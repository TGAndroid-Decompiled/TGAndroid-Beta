package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class n3 implements View.OnClickListener {
    public final l.a f16260a;
    public final o3 f16261b;

    public n3(o3 o3Var) {
        this.f16261b = o3Var;
        Context context = o3Var.f16269a.getContext();
        CharSequence charSequence = o3Var.h;
        ?? obj = new Object();
        obj.e = 4096;
        obj.f15703g = 4096;
        obj.f15707l = null;
        obj.f15708m = null;
        obj.f15709n = false;
        obj.f15710o = false;
        obj.f15711p = 16;
        obj.f15704i = context;
        obj.f15699a = charSequence;
        this.f16260a = obj;
    }

    @Override
    public final void onClick(View view) {
        o3 o3Var = this.f16261b;
        Window.Callback callback = o3Var.f16276k;
        if (callback != null && o3Var.f16277l) {
            callback.onMenuItemSelected(0, this.f16260a);
        }
    }
}
