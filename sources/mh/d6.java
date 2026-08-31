package mh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class d6 implements RequestDelegate {
    public final int f13898a = 1;
    public final t7 f13899b;
    public final Utilities.Callback2 f13900c;
    public final Context d;
    public final org.telegram.ui.ActionBar.g6 f13901e;
    public final long f13902f;
    public final String f13903g;
    public final long h;
    public final TLObject f13904i;
    public final TLObject f13905j;

    public d6(t7 t7Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.g6 g6Var, long j10, String str, long j11, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f13899b = t7Var;
        this.f13900c = callback2;
        this.d = context;
        this.f13901e = g6Var;
        this.f13902f = j10;
        this.f13903g = str;
        this.h = j11;
        this.f13904i = tLObject;
        this.f13905j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f13898a) {
            case 0:
                AndroidUtilities.runOnUIThread(new e6(this.f13899b, tLObject, tL_error, this.f13900c, this.d, this.f13901e, this.f13902f, this.f13903g, (TLRPC.TL_payments_paymentFormStarGift) this.f13904i, (TL_stars.StarGift) this.f13905j, this.h));
                return;
            default:
                AndroidUtilities.runOnUIThread(new e6(this.f13899b, tLObject, tL_error, this.f13900c, this.d, this.f13901e, this.f13902f, this.f13903g, this.h, this.f13904i, (TLRPC.TL_textWithEntities) this.f13905j));
                return;
        }
    }

    public d6(t7 t7Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.g6 g6Var, long j10, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j11) {
        this.f13899b = t7Var;
        this.f13900c = callback2;
        this.d = context;
        this.f13901e = g6Var;
        this.f13902f = j10;
        this.f13903g = str;
        this.f13904i = tL_payments_paymentFormStarGift;
        this.f13905j = starGift;
        this.h = j11;
    }
}
