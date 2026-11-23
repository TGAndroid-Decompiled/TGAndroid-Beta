package bi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.sa;
public final class a0 implements View.OnClickListener {
    public final int f3393a;
    public final long f3394b;
    public final Context f3395c;
    public final Object d;
    public final Object f3396e;
    public final Object f3397f;

    public a0(Context context, org.telegram.ui.ActionBar.h6 h6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f3393a = 2;
        this.f3395c = context;
        this.d = h6Var;
        this.f3394b = j3;
        this.f3397f = starGift;
        this.f3396e = arrayList;
    }

    @Override
    public final void onClick(android.view.View r23) {
        throw new UnsupportedOperationException("Method not decompiled: bi.a0.onClick(android.view.View):void");
    }

    public a0(c9 c9Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f3393a = 3;
        this.f3397f = c9Var;
        this.f3394b = j3;
        this.f3395c = context;
        this.f3396e = runnable;
        this.d = starGift;
    }

    public a0(sa saVar, long j3, Context context, org.telegram.ui.ActionBar.h6 h6Var, Runnable runnable, int i7) {
        this.f3393a = i7;
        this.f3397f = saVar;
        this.f3394b = j3;
        this.f3395c = context;
        this.d = h6Var;
        this.f3396e = runnable;
    }
}
