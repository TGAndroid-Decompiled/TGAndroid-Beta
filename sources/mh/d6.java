package mh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class d6 implements RequestDelegate {
    public final int f13900a = 1;
    public final t7 f13901b;
    public final Utilities.Callback2 f13902c;
    public final Context d;
    public final org.telegram.ui.ActionBar.g6 f13903e;
    public final long f13904f;
    public final String f13905g;
    public final long h;
    public final TLObject f13906i;
    public final TLObject f13907j;

    public d6(t7 t7Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.g6 g6Var, long j10, String str, long j11, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f13901b = t7Var;
        this.f13902c = callback2;
        this.d = context;
        this.f13903e = g6Var;
        this.f13904f = j10;
        this.f13905g = str;
        this.h = j11;
        this.f13906i = tLObject;
        this.f13907j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f13900a) {
            case 0:
                AndroidUtilities.runOnUIThread(new e6(this.f13901b, tLObject, tL_error, this.f13902c, this.d, this.f13903e, this.f13904f, this.f13905g, (TLRPC.TL_payments_paymentFormStarGift) this.f13906i, (TL_stars.StarGift) this.f13907j, this.h));
                return;
            default:
                AndroidUtilities.runOnUIThread(new e6(this.f13901b, tLObject, tL_error, this.f13902c, this.d, this.f13903e, this.f13904f, this.f13905g, this.h, this.f13906i, (TLRPC.TL_textWithEntities) this.f13907j));
                return;
        }
    }

    public d6(t7 t7Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.g6 g6Var, long j10, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j11) {
        this.f13901b = t7Var;
        this.f13902c = callback2;
        this.d = context;
        this.f13903e = g6Var;
        this.f13904f = j10;
        this.f13905g = str;
        this.f13906i = tL_payments_paymentFormStarGift;
        this.f13907j = starGift;
        this.h = j11;
    }
}
