package ai;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class m8 implements RequestDelegate {
    public final int f1836a = 1;
    public final ga f1837b;
    public final Utilities.Callback2 f1838c;
    public final Context d;
    public final org.telegram.ui.ActionBar.d6 e;
    public final long f1839f;
    public final String f1840g;
    public final long h;
    public final TLObject f1841i;
    public final TLObject f1842j;

    public m8(ga gaVar, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j10, String str, long j11, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f1837b = gaVar;
        this.f1838c = callback2;
        this.d = context;
        this.e = d6Var;
        this.f1839f = j10;
        this.f1840g = str;
        this.h = j11;
        this.f1841i = tLObject;
        this.f1842j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1836a) {
            case 0:
                AndroidUtilities.runOnUIThread(new n8(this.f1837b, tLObject, tL_error, this.f1838c, this.d, this.e, this.f1839f, this.f1840g, (TLRPC.TL_payments_paymentFormStarGift) this.f1841i, (TL_stars.StarGift) this.f1842j, this.h));
                return;
            default:
                AndroidUtilities.runOnUIThread(new n8(this.f1837b, tLObject, tL_error, this.f1838c, this.d, this.e, this.f1839f, this.f1840g, this.h, this.f1841i, (TLRPC.TL_textWithEntities) this.f1842j));
                return;
        }
    }

    public m8(ga gaVar, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j10, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j11) {
        this.f1837b = gaVar;
        this.f1838c = callback2;
        this.d = context;
        this.e = d6Var;
        this.f1839f = j10;
        this.f1840g = str;
        this.f1841i = tL_payments_paymentFormStarGift;
        this.f1842j = starGift;
        this.h = j11;
    }
}
