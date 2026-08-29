package ih;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.xa;
public final class v implements View.OnClickListener {
    public final int f9419a;
    public final long f9420b;
    public final Context f9421c;
    public final Object d;
    public final Object f9422e;
    public final Object f9423f;

    public v(Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f9419a = 2;
        this.f9421c = context;
        this.d = c6Var;
        this.f9420b = j10;
        this.f9423f = starGift;
        this.f9422e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f9419a) {
            case 0:
                g0.Q((g0) this.f9423f, this.f9420b, this.f9421c, (org.telegram.ui.ActionBar.c6) this.d, (Runnable) this.f9422e);
                return;
            case 1:
                n0 n0Var = (n0) this.f9423f;
                n0Var.getClass();
                s sVar = new s(this.f9420b, true, null);
                GiftAuctionController.Auction auction = n0Var.Z;
                t tVar = new t(this.f9421c, (org.telegram.ui.ActionBar.c6) this.d, sVar, auction);
                tVar.show();
                tVar.f9387j0 = (Runnable) this.f9422e;
                n0Var.dismiss();
                return;
            case 2:
                new n0(this.f9421c, (org.telegram.ui.ActionBar.c6) this.d, this.f9420b, (TL_stars.StarGift) this.f9423f, (ArrayList) this.f9422e, null, true).show();
                return;
            default:
                e6.S((e6) this.f9423f, this.f9420b, this.f9421c, (Runnable) this.f9422e, (TL_stars.StarGift) this.d);
                return;
        }
    }

    public v(e6 e6Var, long j10, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f9419a = 3;
        this.f9423f = e6Var;
        this.f9420b = j10;
        this.f9421c = context;
        this.f9422e = runnable;
        this.d = starGift;
    }

    public v(xa xaVar, long j10, Context context, org.telegram.ui.ActionBar.c6 c6Var, Runnable runnable, int i10) {
        this.f9419a = i10;
        this.f9423f = xaVar;
        this.f9420b = j10;
        this.f9421c = context;
        this.d = c6Var;
        this.f9422e = runnable;
    }
}
