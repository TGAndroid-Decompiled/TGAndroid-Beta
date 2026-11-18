package bi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.sa;
public final class a0 implements View.OnClickListener {
    public final int f3374a;
    public final long f3375b;
    public final Context f3376c;
    public final Object d;
    public final Object f3377e;
    public final Object f3378f;

    public a0(Context context, org.telegram.ui.ActionBar.i6 i6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f3374a = 2;
        this.f3376c = context;
        this.d = i6Var;
        this.f3375b = j3;
        this.f3378f = starGift;
        this.f3377e = arrayList;
    }

    @Override
    public final void onClick(android.view.View r23) {
        throw new UnsupportedOperationException("Method not decompiled: bi.a0.onClick(android.view.View):void");
    }

    public a0(z8 z8Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f3374a = 3;
        this.f3378f = z8Var;
        this.f3375b = j3;
        this.f3376c = context;
        this.f3377e = runnable;
        this.d = starGift;
    }

    public a0(sa saVar, long j3, Context context, org.telegram.ui.ActionBar.i6 i6Var, Runnable runnable, int i7) {
        this.f3374a = i7;
        this.f3378f = saVar;
        this.f3375b = j3;
        this.f3376c = context;
        this.d = i6Var;
        this.f3377e = runnable;
    }
}
