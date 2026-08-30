package kh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.sa;
public final class u implements View.OnClickListener {
    public final int f10832a;
    public final long f10833b;
    public final Context f10834c;
    public final Object d;
    public final Object e;
    public final Object f10835f;

    public u(Context context, org.telegram.ui.ActionBar.f6 f6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f10832a = 2;
        this.f10834c = context;
        this.d = f6Var;
        this.f10833b = j10;
        this.f10835f = starGift;
        this.e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f10832a) {
            case 0:
                f0.Q((f0) this.f10835f, this.f10833b, this.f10834c, (org.telegram.ui.ActionBar.f6) this.d, (Runnable) this.e);
                return;
            case 1:
                m0 m0Var = (m0) this.f10835f;
                m0Var.getClass();
                r rVar = new r(this.f10833b, true, null);
                GiftAuctionController.Auction auction = m0Var.f10703a0;
                s sVar = new s(this.f10834c, (org.telegram.ui.ActionBar.f6) this.d, rVar, auction);
                sVar.show();
                sVar.f10800k0 = (Runnable) this.e;
                m0Var.dismiss();
                return;
            case 2:
                new m0(this.f10834c, (org.telegram.ui.ActionBar.f6) this.d, this.f10833b, (TL_stars.StarGift) this.f10835f, (ArrayList) this.e, null, true).show();
                return;
            default:
                e6.S((e6) this.f10835f, this.f10833b, this.f10834c, (Runnable) this.e, (TL_stars.StarGift) this.d);
                return;
        }
    }

    public u(e6 e6Var, long j10, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f10832a = 3;
        this.f10835f = e6Var;
        this.f10833b = j10;
        this.f10834c = context;
        this.e = runnable;
        this.d = starGift;
    }

    public u(sa saVar, long j10, Context context, org.telegram.ui.ActionBar.f6 f6Var, Runnable runnable, int i10) {
        this.f10832a = i10;
        this.f10835f = saVar;
        this.f10833b = j10;
        this.f10834c = context;
        this.d = f6Var;
        this.e = runnable;
    }
}
