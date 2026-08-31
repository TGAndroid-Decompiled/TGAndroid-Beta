package lh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.sa;
public final class u implements View.OnClickListener {
    public final int f12977a;
    public final long f12978b;
    public final Context f12979c;
    public final Object d;
    public final Object f12980e;
    public final Object f12981f;

    public u(Context context, g6 g6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f12977a = 2;
        this.f12979c = context;
        this.d = g6Var;
        this.f12978b = j10;
        this.f12981f = starGift;
        this.f12980e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f12977a) {
            case 0:
                f0.Q((f0) this.f12981f, this.f12978b, this.f12979c, (g6) this.d, (Runnable) this.f12980e);
                return;
            case 1:
                m0 m0Var = (m0) this.f12981f;
                m0Var.getClass();
                r rVar = new r(this.f12978b, true, null);
                GiftAuctionController.Auction auction = m0Var.f12847a0;
                s sVar = new s(this.f12979c, (g6) this.d, rVar, auction);
                sVar.show();
                sVar.f12947k0 = (Runnable) this.f12980e;
                m0Var.dismiss();
                return;
            case 2:
                new m0(this.f12979c, (g6) this.d, this.f12978b, (TL_stars.StarGift) this.f12981f, (ArrayList) this.f12980e, null, true).show();
                return;
            default:
                e6.S((e6) this.f12981f, this.f12978b, this.f12979c, (Runnable) this.f12980e, (TL_stars.StarGift) this.d);
                return;
        }
    }

    public u(e6 e6Var, long j10, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f12977a = 3;
        this.f12981f = e6Var;
        this.f12978b = j10;
        this.f12979c = context;
        this.f12980e = runnable;
        this.d = starGift;
    }

    public u(sa saVar, long j10, Context context, g6 g6Var, Runnable runnable, int i10) {
        this.f12977a = i10;
        this.f12981f = saVar;
        this.f12978b = j10;
        this.f12979c = context;
        this.d = g6Var;
        this.f12980e = runnable;
    }
}
