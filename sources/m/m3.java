package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
public final class m3 implements View.OnClickListener {
    public final l.a f15483a;
    public final n3 f15484b;

    public m3(n3 n3Var) {
        this.f15484b = n3Var;
        Context context = n3Var.f15497a.getContext();
        CharSequence charSequence = n3Var.h;
        ?? obj = new Object();
        obj.f14933e = 4096;
        obj.f14935g = 4096;
        obj.f14939l = null;
        obj.f14940m = null;
        obj.f14941n = false;
        obj.f14942o = false;
        obj.f14943p = 16;
        obj.f14936i = context;
        obj.f14930a = charSequence;
        this.f15483a = obj;
    }

    @Override
    public final void onClick(View view) {
        n3 n3Var = this.f15484b;
        Window.Callback callback = n3Var.f15505k;
        if (callback != null && n3Var.f15506l) {
            callback.onMenuItemSelected(0, this.f15483a);
        }
    }
}
