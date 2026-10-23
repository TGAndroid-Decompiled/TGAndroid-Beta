package ai;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class n8 implements RequestDelegate {
    public final int f1890a = 1;
    public final ha f1891b;
    public final Utilities.Callback2 f1892c;
    public final Context d;
    public final org.telegram.ui.ActionBar.g6 e;
    public final long f1893f;
    public final String f1894g;
    public final long h;
    public final TLObject f1895i;
    public final TLObject f1896j;

    public n8(ha haVar, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.g6 g6Var, long j10, String str, long j11, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f1891b = haVar;
        this.f1892c = callback2;
        this.d = context;
        this.e = g6Var;
        this.f1893f = j10;
        this.f1894g = str;
        this.h = j11;
        this.f1895i = tLObject;
        this.f1896j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1890a) {
            case 0:
                AndroidUtilities.runOnUIThread(new o8(this.f1891b, tLObject, tL_error, this.f1892c, this.d, this.e, this.f1893f, this.f1894g, (TLRPC.TL_payments_paymentFormStarGift) this.f1895i, (TL_stars.StarGift) this.f1896j, this.h));
                return;
            default:
                AndroidUtilities.runOnUIThread(new o8(this.f1891b, tLObject, tL_error, this.f1892c, this.d, this.e, this.f1893f, this.f1894g, this.h, this.f1895i, (TLRPC.TL_textWithEntities) this.f1896j));
                return;
        }
    }

    public n8(ha haVar, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.g6 g6Var, long j10, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j11) {
        this.f1891b = haVar;
        this.f1892c = callback2;
        this.d = context;
        this.e = g6Var;
        this.f1893f = j10;
        this.f1894g = str;
        this.f1895i = tL_payments_paymentFormStarGift;
        this.f1896j = starGift;
        this.h = j11;
    }
}
