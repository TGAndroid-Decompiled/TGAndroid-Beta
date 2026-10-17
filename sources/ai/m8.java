package ai;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class m8 implements RequestDelegate {
    public final int f1854a = 1;
    public final fa f1855b;
    public final Utilities.Callback2 f1856c;
    public final Context d;
    public final org.telegram.ui.ActionBar.d6 e;
    public final long f1857f;
    public final String f1858g;
    public final long h;
    public final TLObject f1859i;
    public final TLObject f1860j;

    public m8(fa faVar, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j10, String str, long j11, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f1855b = faVar;
        this.f1856c = callback2;
        this.d = context;
        this.e = d6Var;
        this.f1857f = j10;
        this.f1858g = str;
        this.h = j11;
        this.f1859i = tLObject;
        this.f1860j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1854a) {
            case 0:
                AndroidUtilities.runOnUIThread(new n8(this.f1855b, tLObject, tL_error, this.f1856c, this.d, this.e, this.f1857f, this.f1858g, (TLRPC.TL_payments_paymentFormStarGift) this.f1859i, (TL_stars.StarGift) this.f1860j, this.h));
                return;
            default:
                AndroidUtilities.runOnUIThread(new n8(this.f1855b, tLObject, tL_error, this.f1856c, this.d, this.e, this.f1857f, this.f1858g, this.h, this.f1859i, (TLRPC.TL_textWithEntities) this.f1860j));
                return;
        }
    }

    public m8(fa faVar, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j10, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j11) {
        this.f1855b = faVar;
        this.f1856c = callback2;
        this.d = context;
        this.e = d6Var;
        this.f1857f = j10;
        this.f1858g = str;
        this.f1859i = tL_payments_paymentFormStarGift;
        this.f1860j = starGift;
        this.h = j11;
    }
}
