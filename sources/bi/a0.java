package bi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.sa;
public final class a0 implements View.OnClickListener {
    public final int f3386a;
    public final long f3387b;
    public final Context f3388c;
    public final Object d;
    public final Object f3389e;
    public final Object f3390f;

    public a0(Context context, org.telegram.ui.ActionBar.h6 h6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f3386a = 2;
        this.f3388c = context;
        this.d = h6Var;
        this.f3387b = j3;
        this.f3390f = starGift;
        this.f3389e = arrayList;
    }

    @Override
    public final void onClick(android.view.View r23) {
        throw new UnsupportedOperationException("Method not decompiled: bi.a0.onClick(android.view.View):void");
    }

    public a0(d9 d9Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f3386a = 3;
        this.f3390f = d9Var;
        this.f3387b = j3;
        this.f3388c = context;
        this.f3389e = runnable;
        this.d = starGift;
    }

    public a0(sa saVar, long j3, Context context, org.telegram.ui.ActionBar.h6 h6Var, Runnable runnable, int i7) {
        this.f3386a = i7;
        this.f3390f = saVar;
        this.f3387b = j3;
        this.f3388c = context;
        this.d = h6Var;
        this.f3389e = runnable;
    }
}
