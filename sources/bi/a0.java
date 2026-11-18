package bi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.sa;
public final class a0 implements View.OnClickListener {
    public final int f3373a;
    public final long f3374b;
    public final Context f3375c;
    public final Object d;
    public final Object f3376e;
    public final Object f3377f;

    public a0(Context context, org.telegram.ui.ActionBar.i6 i6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f3373a = 2;
        this.f3375c = context;
        this.d = i6Var;
        this.f3374b = j3;
        this.f3377f = starGift;
        this.f3376e = arrayList;
    }

    @Override
    public final void onClick(android.view.View r23) {
        throw new UnsupportedOperationException("Method not decompiled: bi.a0.onClick(android.view.View):void");
    }

    public a0(a9 a9Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f3373a = 3;
        this.f3377f = a9Var;
        this.f3374b = j3;
        this.f3375c = context;
        this.f3376e = runnable;
        this.d = starGift;
    }

    public a0(sa saVar, long j3, Context context, org.telegram.ui.ActionBar.i6 i6Var, Runnable runnable, int i7) {
        this.f3373a = i7;
        this.f3377f = saVar;
        this.f3374b = j3;
        this.f3375c = context;
        this.d = i6Var;
        this.f3376e = runnable;
    }
}
