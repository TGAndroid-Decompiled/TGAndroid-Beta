package bi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ja;
public final class a0 implements View.OnClickListener {
    public final int f3368a;
    public final long f3369b;
    public final Context f3370c;
    public final Object d;
    public final Object f3371e;
    public final Object f3372f;

    public a0(Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f3368a = 2;
        this.f3370c = context;
        this.d = e6Var;
        this.f3369b = j3;
        this.f3372f = starGift;
        this.f3371e = arrayList;
    }

    @Override
    public final void onClick(android.view.View r23) {
        throw new UnsupportedOperationException("Method not decompiled: bi.a0.onClick(android.view.View):void");
    }

    public a0(u6 u6Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f3368a = 3;
        this.f3372f = u6Var;
        this.f3369b = j3;
        this.f3370c = context;
        this.f3371e = runnable;
        this.d = starGift;
    }

    public a0(ja jaVar, long j3, Context context, org.telegram.ui.ActionBar.e6 e6Var, Runnable runnable, int i7) {
        this.f3368a = i7;
        this.f3372f = jaVar;
        this.f3369b = j3;
        this.f3370c = context;
        this.d = e6Var;
        this.f3371e = runnable;
    }
}
