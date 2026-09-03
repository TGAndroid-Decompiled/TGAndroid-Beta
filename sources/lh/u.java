package lh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.sa;
public final class u implements View.OnClickListener {
    public final int f12979a;
    public final long f12980b;
    public final Context f12981c;
    public final Object d;
    public final Object f12982e;
    public final Object f12983f;

    public u(Context context, g6 g6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f12979a = 2;
        this.f12981c = context;
        this.d = g6Var;
        this.f12980b = j10;
        this.f12983f = starGift;
        this.f12982e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f12979a) {
            case 0:
                f0.Q((f0) this.f12983f, this.f12980b, this.f12981c, (g6) this.d, (Runnable) this.f12982e);
                return;
            case 1:
                m0 m0Var = (m0) this.f12983f;
                m0Var.getClass();
                r rVar = new r(this.f12980b, true, null);
                GiftAuctionController.Auction auction = m0Var.f12849a0;
                s sVar = new s(this.f12981c, (g6) this.d, rVar, auction);
                sVar.show();
                sVar.f12949k0 = (Runnable) this.f12982e;
                m0Var.dismiss();
                return;
            case 2:
                new m0(this.f12981c, (g6) this.d, this.f12980b, (TL_stars.StarGift) this.f12983f, (ArrayList) this.f12982e, null, true).show();
                return;
            default:
                e6.S((e6) this.f12983f, this.f12980b, this.f12981c, (Runnable) this.f12982e, (TL_stars.StarGift) this.d);
                return;
        }
    }

    public u(e6 e6Var, long j10, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f12979a = 3;
        this.f12983f = e6Var;
        this.f12980b = j10;
        this.f12981c = context;
        this.f12982e = runnable;
        this.d = starGift;
    }

    public u(sa saVar, long j10, Context context, g6 g6Var, Runnable runnable, int i10) {
        this.f12979a = i10;
        this.f12983f = saVar;
        this.f12980b = j10;
        this.f12981c = context;
        this.d = g6Var;
        this.f12982e = runnable;
    }
}
