package fh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.sa;
public final class z implements View.OnClickListener {
    public final int f6892a;
    public final long f6893b;
    public final Context f6894c;
    public final Object d;
    public final Object f6895e;
    public final Object f6896f;

    public z(Context context, org.telegram.ui.ActionBar.b6 b6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.f6892a = 2;
        this.f6894c = context;
        this.d = b6Var;
        this.f6893b = j10;
        this.f6896f = starGift;
        this.f6895e = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f6892a) {
            case 0:
                k0.P((k0) this.f6896f, this.f6893b, this.f6894c, (org.telegram.ui.ActionBar.b6) this.d, (Runnable) this.f6895e);
                return;
            case 1:
                r0 r0Var = (r0) this.f6896f;
                r0Var.getClass();
                w wVar = new w(this.f6893b, true, null);
                GiftAuctionController.Auction auction = r0Var.Z;
                x xVar = new x(this.f6894c, (org.telegram.ui.ActionBar.b6) this.d, wVar, auction);
                xVar.show();
                xVar.f6849j0 = (Runnable) this.f6895e;
                r0Var.dismiss();
                return;
            case 2:
                new r0(this.f6894c, (org.telegram.ui.ActionBar.b6) this.d, this.f6893b, (TL_stars.StarGift) this.f6896f, (ArrayList) this.f6895e, null, true).show();
                return;
            default:
                u6.R((u6) this.f6896f, this.f6893b, this.f6894c, (Runnable) this.f6895e, (TL_stars.StarGift) this.d);
                return;
        }
    }

    public z(u6 u6Var, long j10, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.f6892a = 3;
        this.f6896f = u6Var;
        this.f6893b = j10;
        this.f6894c = context;
        this.f6895e = runnable;
        this.d = starGift;
    }

    public z(sa saVar, long j10, Context context, org.telegram.ui.ActionBar.b6 b6Var, Runnable runnable, int i9) {
        this.f6892a = i9;
        this.f6896f = saVar;
        this.f6893b = j10;
        this.f6894c = context;
        this.d = b6Var;
        this.f6895e = runnable;
    }
}
