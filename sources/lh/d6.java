package lh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class d6 implements RequestDelegate {
    public final int f12304a = 1;
    public final t7 f12305b;
    public final Utilities.Callback2 f12306c;
    public final Context d;
    public final org.telegram.ui.ActionBar.f6 e;
    public final long f12307f;
    public final String f12308g;
    public final long h;
    public final TLObject f12309i;
    public final TLObject f12310j;

    public d6(t7 t7Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j10, String str, long j11, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f12305b = t7Var;
        this.f12306c = callback2;
        this.d = context;
        this.e = f6Var;
        this.f12307f = j10;
        this.f12308g = str;
        this.h = j11;
        this.f12309i = tLObject;
        this.f12310j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f12304a) {
            case 0:
                AndroidUtilities.runOnUIThread(new e6(this.f12305b, tLObject, tL_error, this.f12306c, this.d, this.e, this.f12307f, this.f12308g, (TLRPC.TL_payments_paymentFormStarGift) this.f12309i, (TL_stars.StarGift) this.f12310j, this.h));
                return;
            default:
                AndroidUtilities.runOnUIThread(new e6(this.f12305b, tLObject, tL_error, this.f12306c, this.d, this.e, this.f12307f, this.f12308g, this.h, this.f12309i, (TLRPC.TL_textWithEntities) this.f12310j));
                return;
        }
    }

    public d6(t7 t7Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j10, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j11) {
        this.f12305b = t7Var;
        this.f12306c = callback2;
        this.d = context;
        this.e = f6Var;
        this.f12307f = j10;
        this.f12308g = str;
        this.f12309i = tL_payments_paymentFormStarGift;
        this.f12310j = starGift;
        this.h = j11;
    }
}
