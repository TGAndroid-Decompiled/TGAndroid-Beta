package bi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ra;
public final class a0 implements View.OnClickListener {
    public final int f3344a;
    public final long f3345b;
    public final Context f3346c;
    public final Object d;
    public final Object f3347e;
    public final Object f3348f;

    public a0(Context context, org.telegram.ui.ActionBar.i6 i6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f3344a = 2;
        this.f3346c = context;
        this.d = i6Var;
        this.f3345b = j3;
        this.f3348f = starGift;
        this.f3347e = arrayList;
    }

    @Override
    public final void onClick(android.view.View r23) {
        throw new UnsupportedOperationException("Method not decompiled: bi.a0.onClick(android.view.View):void");
    }

    public a0(f9 f9Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f3344a = 3;
        this.f3348f = f9Var;
        this.f3345b = j3;
        this.f3346c = context;
        this.f3347e = runnable;
        this.d = starGift;
    }

    public a0(ra raVar, long j3, Context context, org.telegram.ui.ActionBar.i6 i6Var, Runnable runnable, int i7) {
        this.f3344a = i7;
        this.f3348f = raVar;
        this.f3345b = j3;
        this.f3346c = context;
        this.d = i6Var;
        this.f3347e = runnable;
    }
}
