package ai;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class n8 implements RequestDelegate {
    public final int f1900a = 1;
    public final ga f1901b;
    public final Utilities.Callback2 f1902c;
    public final Context d;
    public final org.telegram.ui.ActionBar.d6 e;
    public final long f1903f;
    public final String f1904g;
    public final long h;
    public final TLObject f1905i;
    public final TLObject f1906j;

    public n8(ga gaVar, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j10, String str, long j11, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f1901b = gaVar;
        this.f1902c = callback2;
        this.d = context;
        this.e = d6Var;
        this.f1903f = j10;
        this.f1904g = str;
        this.h = j11;
        this.f1905i = tLObject;
        this.f1906j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1900a) {
            case 0:
                AndroidUtilities.runOnUIThread(new o8(this.f1901b, tLObject, tL_error, this.f1902c, this.d, this.e, this.f1903f, this.f1904g, (TLRPC.TL_payments_paymentFormStarGift) this.f1905i, (TL_stars.StarGift) this.f1906j, this.h));
                return;
            default:
                AndroidUtilities.runOnUIThread(new o8(this.f1901b, tLObject, tL_error, this.f1902c, this.d, this.e, this.f1903f, this.f1904g, this.h, this.f1905i, (TLRPC.TL_textWithEntities) this.f1906j));
                return;
        }
    }

    public n8(ga gaVar, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j10, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j11) {
        this.f1901b = gaVar;
        this.f1902c = callback2;
        this.d = context;
        this.e = d6Var;
        this.f1903f = j10;
        this.f1904g = str;
        this.f1905i = tL_payments_paymentFormStarGift;
        this.f1906j = starGift;
        this.h = j11;
    }
}
