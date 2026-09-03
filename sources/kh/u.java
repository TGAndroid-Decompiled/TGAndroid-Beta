package kh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.sa;
public final class u implements View.OnClickListener {
    public final int f10939a;
    public final long f10940b;
    public final Context f10941c;
    public final Object d;
    public final Object e;
    public final Object f10942f;

    public u(Context context, f6 f6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f10939a = 2;
        this.f10941c = context;
        this.d = f6Var;
        this.f10940b = j10;
        this.f10942f = starGift;
        this.e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f10939a) {
            case 0:
                f0.Q((f0) this.f10942f, this.f10940b, this.f10941c, (f6) this.d, (Runnable) this.e);
                return;
            case 1:
                m0 m0Var = (m0) this.f10942f;
                m0Var.getClass();
                r rVar = new r(this.f10940b, true, null);
                GiftAuctionController.Auction auction = m0Var.f10812a0;
                s sVar = new s(this.f10941c, (f6) this.d, rVar, auction);
                sVar.show();
                sVar.f10909k0 = (Runnable) this.e;
                m0Var.dismiss();
                return;
            case 2:
                new m0(this.f10941c, (f6) this.d, this.f10940b, (TL_stars.StarGift) this.f10942f, (ArrayList) this.e, null, true).show();
                return;
            default:
                d6.S((d6) this.f10942f, this.f10940b, this.f10941c, (Runnable) this.e, (TL_stars.StarGift) this.d);
                return;
        }
    }

    public u(d6 d6Var, long j10, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f10939a = 3;
        this.f10942f = d6Var;
        this.f10940b = j10;
        this.f10941c = context;
        this.e = runnable;
        this.d = starGift;
    }

    public u(sa saVar, long j10, Context context, f6 f6Var, Runnable runnable, int i10) {
        this.f10939a = i10;
        this.f10942f = saVar;
        this.f10940b = j10;
        this.f10941c = context;
        this.d = f6Var;
        this.e = runnable;
    }
}
