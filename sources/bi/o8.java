package bi;

import android.content.Context;
import org.telegram.messenger.v10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class o8 implements RequestDelegate {
    public final int f4476a = 1;
    public final ea f4477b;
    public final v10 f4478c;
    public final Context d;
    public final org.telegram.ui.ActionBar.f6 f4479e;
    public final long f4480f;
    public final String f4481g;
    public final long h;
    public final TLObject f4482i;
    public final TLObject f4483j;

    public o8(ea eaVar, v10 v10Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, String str, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f4477b = eaVar;
        this.f4478c = v10Var;
        this.d = context;
        this.f4479e = f6Var;
        this.f4480f = j3;
        this.f4481g = str;
        this.h = j10;
        this.f4482i = tLObject;
        this.f4483j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f4476a) {
            case 0:
                org.telegram.messenger.g0.h3(new s8(this.f4477b, tLObject, tL_error, this.f4478c, this.d, this.f4479e, this.f4480f, this.f4481g, (TLRPC.TL_payments_paymentFormStarGift) this.f4482i, (TL_stars.StarGift) this.f4483j, this.h));
                return;
            default:
                org.telegram.messenger.g0.h3(new s8(this.f4477b, tLObject, tL_error, this.f4478c, this.d, this.f4479e, this.f4480f, this.f4481g, this.h, this.f4482i, (TLRPC.TL_textWithEntities) this.f4483j));
                return;
        }
    }

    public o8(ea eaVar, v10 v10Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10) {
        this.f4477b = eaVar;
        this.f4478c = v10Var;
        this.d = context;
        this.f4479e = f6Var;
        this.f4480f = j3;
        this.f4481g = str;
        this.f4482i = tL_payments_paymentFormStarGift;
        this.f4483j = starGift;
        this.h = j10;
    }
}
