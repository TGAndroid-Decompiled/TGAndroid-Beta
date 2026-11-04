package ci;

import android.content.Context;
import org.telegram.messenger.n10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class p7 implements RequestDelegate {
    public final int f5753a = 1;
    public final e9 f5754b;
    public final n10 f5755c;
    public final Context d;
    public final org.telegram.ui.ActionBar.e6 f5756e;
    public final long f5757f;
    public final String f5758g;
    public final long h;
    public final TLObject f5759i;
    public final TLObject f5760j;

    public p7(e9 e9Var, n10 n10Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j10, String str, long j11, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f5754b = e9Var;
        this.f5755c = n10Var;
        this.d = context;
        this.f5756e = e6Var;
        this.f5757f = j10;
        this.f5758g = str;
        this.h = j11;
        this.f5759i = tLObject;
        this.f5760j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5753a) {
            case 0:
                org.telegram.messenger.g0.h3(new t7(this.f5754b, tLObject, tL_error, this.f5755c, this.d, this.f5756e, this.f5757f, this.f5758g, (TLRPC.TL_payments_paymentFormStarGift) this.f5759i, (TL_stars.StarGift) this.f5760j, this.h));
                return;
            default:
                org.telegram.messenger.g0.h3(new t7(this.f5754b, tLObject, tL_error, this.f5755c, this.d, this.f5756e, this.f5757f, this.f5758g, this.h, this.f5759i, (TLRPC.TL_textWithEntities) this.f5760j));
                return;
        }
    }

    public p7(e9 e9Var, n10 n10Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j10, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j11) {
        this.f5754b = e9Var;
        this.f5755c = n10Var;
        this.d = context;
        this.f5756e = e6Var;
        this.f5757f = j10;
        this.f5758g = str;
        this.f5759i = tL_payments_paymentFormStarGift;
        this.f5760j = starGift;
        this.h = j11;
    }
}
