package ai;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class m8 implements RequestDelegate {
    public final int f1844a = 1;
    public final ga f1845b;
    public final Utilities.Callback2 f1846c;
    public final Context d;
    public final org.telegram.ui.ActionBar.d6 e;
    public final long f1847f;
    public final String f1848g;
    public final long h;
    public final TLObject f1849i;
    public final TLObject f1850j;

    public m8(ga gaVar, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j10, String str, long j11, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f1845b = gaVar;
        this.f1846c = callback2;
        this.d = context;
        this.e = d6Var;
        this.f1847f = j10;
        this.f1848g = str;
        this.h = j11;
        this.f1849i = tLObject;
        this.f1850j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1844a) {
            case 0:
                AndroidUtilities.runOnUIThread(new n8(this.f1845b, tLObject, tL_error, this.f1846c, this.d, this.e, this.f1847f, this.f1848g, (TLRPC.TL_payments_paymentFormStarGift) this.f1849i, (TL_stars.StarGift) this.f1850j, this.h));
                return;
            default:
                AndroidUtilities.runOnUIThread(new n8(this.f1845b, tLObject, tL_error, this.f1846c, this.d, this.e, this.f1847f, this.f1848g, this.h, this.f1849i, (TLRPC.TL_textWithEntities) this.f1850j));
                return;
        }
    }

    public m8(ga gaVar, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j10, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j11) {
        this.f1845b = gaVar;
        this.f1846c = callback2;
        this.d = context;
        this.e = d6Var;
        this.f1847f = j10;
        this.f1848g = str;
        this.f1849i = tL_payments_paymentFormStarGift;
        this.f1850j = starGift;
        this.h = j11;
    }
}
