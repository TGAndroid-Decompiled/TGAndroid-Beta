package di;

import android.content.Context;
import org.telegram.messenger.s10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class h7 implements RequestDelegate {
    public final int f8700a = 1;
    public final v8 f8701b;
    public final s10 f8702c;
    public final Context d;
    public final org.telegram.ui.ActionBar.e6 f8703e;
    public final long f8704f;
    public final String f8705g;
    public final long h;
    public final TLObject f8706i;
    public final TLObject f8707j;

    public h7(v8 v8Var, s10 s10Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, String str, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f8701b = v8Var;
        this.f8702c = s10Var;
        this.d = context;
        this.f8703e = e6Var;
        this.f8704f = j3;
        this.f8705g = str;
        this.h = j10;
        this.f8706i = tLObject;
        this.f8707j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f8700a) {
            case 0:
                org.telegram.messenger.g0.h3(new l7(this.f8701b, tLObject, tL_error, this.f8702c, this.d, this.f8703e, this.f8704f, this.f8705g, (TLRPC.TL_payments_paymentFormStarGift) this.f8706i, (TL_stars.StarGift) this.f8707j, this.h));
                return;
            default:
                org.telegram.messenger.g0.h3(new l7(this.f8701b, tLObject, tL_error, this.f8702c, this.d, this.f8703e, this.f8704f, this.f8705g, this.h, this.f8706i, (TLRPC.TL_textWithEntities) this.f8707j));
                return;
        }
    }

    public h7(v8 v8Var, s10 s10Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10) {
        this.f8701b = v8Var;
        this.f8702c = s10Var;
        this.d = context;
        this.f8703e = e6Var;
        this.f8704f = j3;
        this.f8705g = str;
        this.f8706i = tL_payments_paymentFormStarGift;
        this.f8707j = starGift;
        this.h = j10;
    }
}
