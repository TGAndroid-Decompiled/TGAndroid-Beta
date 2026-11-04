package ai;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ma;
public final class g0 implements View.OnClickListener {
    public final int f651a;
    public final long f652b;
    public final Context f653c;
    public final Object d;
    public final Object f654e;
    public final Object f655f;

    public g0(d7 d7Var, long j10, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f651a = 3;
        this.f655f = d7Var;
        this.f652b = j10;
        this.f653c = context;
        this.f654e = runnable;
        this.d = starGift;
    }

    @Override
    public final void onClick(android.view.View r23) {
        throw new UnsupportedOperationException("Method not decompiled: ai.g0.onClick(android.view.View):void");
    }

    public g0(Context context, org.telegram.ui.ActionBar.e6 e6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f651a = 2;
        this.f653c = context;
        this.d = e6Var;
        this.f652b = j10;
        this.f655f = starGift;
        this.f654e = arrayList;
    }

    public g0(ma maVar, long j10, Context context, org.telegram.ui.ActionBar.e6 e6Var, Runnable runnable, int i3) {
        this.f651a = i3;
        this.f655f = maVar;
        this.f652b = j10;
        this.f653c = context;
        this.d = e6Var;
        this.f654e = runnable;
    }
}
