package bi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ja;
public final class a0 implements View.OnClickListener {
    public final int f3365a;
    public final long f3366b;
    public final Context f3367c;
    public final Object d;
    public final Object f3368e;
    public final Object f3369f;

    public a0(Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f3365a = 2;
        this.f3367c = context;
        this.d = e6Var;
        this.f3366b = j3;
        this.f3369f = starGift;
        this.f3368e = arrayList;
    }

    @Override
    public final void onClick(android.view.View r23) {
        throw new UnsupportedOperationException("Method not decompiled: bi.a0.onClick(android.view.View):void");
    }

    public a0(u6 u6Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f3365a = 3;
        this.f3369f = u6Var;
        this.f3366b = j3;
        this.f3367c = context;
        this.f3368e = runnable;
        this.d = starGift;
    }

    public a0(ja jaVar, long j3, Context context, org.telegram.ui.ActionBar.e6 e6Var, Runnable runnable, int i7) {
        this.f3365a = i7;
        this.f3369f = jaVar;
        this.f3366b = j3;
        this.f3367c = context;
        this.d = e6Var;
        this.f3368e = runnable;
    }
}
