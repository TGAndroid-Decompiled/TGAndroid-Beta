package ai;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class m8 implements RequestDelegate {
    public final int f1840a = 1;
    public final ga f1841b;
    public final Utilities.Callback2 f1842c;
    public final Context d;
    public final org.telegram.ui.ActionBar.d6 e;
    public final long f1843f;
    public final String f1844g;
    public final long h;
    public final TLObject f1845i;
    public final TLObject f1846j;

    public m8(ga gaVar, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j10, String str, long j11, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f1841b = gaVar;
        this.f1842c = callback2;
        this.d = context;
        this.e = d6Var;
        this.f1843f = j10;
        this.f1844g = str;
        this.h = j11;
        this.f1845i = tLObject;
        this.f1846j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1840a) {
            case 0:
                AndroidUtilities.runOnUIThread(new n8(this.f1841b, tLObject, tL_error, this.f1842c, this.d, this.e, this.f1843f, this.f1844g, (TLRPC.TL_payments_paymentFormStarGift) this.f1845i, (TL_stars.StarGift) this.f1846j, this.h));
                return;
            default:
                AndroidUtilities.runOnUIThread(new n8(this.f1841b, tLObject, tL_error, this.f1842c, this.d, this.e, this.f1843f, this.f1844g, this.h, this.f1845i, (TLRPC.TL_textWithEntities) this.f1846j));
                return;
        }
    }

    public m8(ga gaVar, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j10, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j11) {
        this.f1841b = gaVar;
        this.f1842c = callback2;
        this.d = context;
        this.e = d6Var;
        this.f1843f = j10;
        this.f1844g = str;
        this.f1845i = tL_payments_paymentFormStarGift;
        this.f1846j = starGift;
        this.h = j11;
    }
}
