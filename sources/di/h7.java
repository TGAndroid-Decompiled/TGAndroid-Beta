package di;

import android.content.Context;
import org.telegram.messenger.s10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class h7 implements RequestDelegate {
    public final int f8726a = 1;
    public final u8 f8727b;
    public final s10 f8728c;
    public final Context d;
    public final org.telegram.ui.ActionBar.e6 f8729e;
    public final long f8730f;
    public final String f8731g;
    public final long h;
    public final TLObject f8732i;
    public final TLObject f8733j;

    public h7(u8 u8Var, s10 s10Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, String str, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f8727b = u8Var;
        this.f8728c = s10Var;
        this.d = context;
        this.f8729e = e6Var;
        this.f8730f = j3;
        this.f8731g = str;
        this.h = j10;
        this.f8732i = tLObject;
        this.f8733j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f8726a) {
            case 0:
                org.telegram.messenger.g0.h3(new l7(this.f8727b, tLObject, tL_error, this.f8728c, this.d, this.f8729e, this.f8730f, this.f8731g, (TLRPC.TL_payments_paymentFormStarGift) this.f8732i, (TL_stars.StarGift) this.f8733j, this.h));
                return;
            default:
                org.telegram.messenger.g0.h3(new l7(this.f8727b, tLObject, tL_error, this.f8728c, this.d, this.f8729e, this.f8730f, this.f8731g, this.h, this.f8732i, (TLRPC.TL_textWithEntities) this.f8733j));
                return;
        }
    }

    public h7(u8 u8Var, s10 s10Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10) {
        this.f8727b = u8Var;
        this.f8728c = s10Var;
        this.d = context;
        this.f8729e = e6Var;
        this.f8730f = j3;
        this.f8731g = str;
        this.f8732i = tL_payments_paymentFormStarGift;
        this.f8733j = starGift;
        this.h = j10;
    }
}
