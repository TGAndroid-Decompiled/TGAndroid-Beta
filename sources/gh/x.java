package gh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.qa;

public final class x implements View.OnClickListener {

    public final int f7609a;

    public final long f7610b;

    public final Context f7611c;
    public final Object d;

    public final Object f7612e;

    public final Object f7613f;

    public x(Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f7609a = 2;
        this.f7611c = context;
        this.d = c6Var;
        this.f7610b = j10;
        this.f7613f = starGift;
        this.f7612e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f7609a) {
            case 0:
                i0.Q((i0) this.f7613f, this.f7610b, this.f7611c, (org.telegram.ui.ActionBar.c6) this.d, (Runnable) this.f7612e);
                break;
            case 1:
                p0 p0Var = (p0) this.f7613f;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.d;
                Runnable runnable = (Runnable) this.f7612e;
                p0Var.getClass();
                v vVar = new v(this.f7611c, c6Var, new u(this.f7610b, true, null), p0Var.Z);
                vVar.show();
                vVar.f7574j0 = runnable;
                p0Var.dismiss();
                break;
            case 2:
                new p0(this.f7611c, (org.telegram.ui.ActionBar.c6) this.d, this.f7610b, (TL_stars.StarGift) this.f7613f, (ArrayList) this.f7612e, null, true).show();
                break;
            default:
                m6.S((m6) this.f7613f, this.f7610b, this.f7611c, (Runnable) this.f7612e, (TL_stars.StarGift) this.d);
                break;
        }
    }

    public x(m6 m6Var, long j10, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f7609a = 3;
        this.f7613f = m6Var;
        this.f7610b = j10;
        this.f7611c = context;
        this.f7612e = runnable;
        this.d = starGift;
    }

    public x(qa qaVar, long j10, Context context, org.telegram.ui.ActionBar.c6 c6Var, Runnable runnable, int i10) {
        this.f7609a = i10;
        this.f7613f = qaVar;
        this.f7610b = j10;
        this.f7611c = context;
        this.d = c6Var;
        this.f7612e = runnable;
    }
}
