package jh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class d6 implements RequestDelegate {
    public final int f11937a = 1;
    public final s7 f11938b;
    public final Utilities.Callback2 f11939c;
    public final Context d;
    public final org.telegram.ui.ActionBar.c6 f11940e;
    public final long f11941f;
    public final String f11942g;
    public final long h;
    public final TLObject f11943i;
    public final TLObject f11944j;

    public d6(s7 s7Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10, String str, long j11, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f11938b = s7Var;
        this.f11939c = callback2;
        this.d = context;
        this.f11940e = c6Var;
        this.f11941f = j10;
        this.f11942g = str;
        this.h = j11;
        this.f11943i = tLObject;
        this.f11944j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f11937a) {
            case 0:
                AndroidUtilities.runOnUIThread(new e6(this.f11938b, tLObject, tL_error, this.f11939c, this.d, this.f11940e, this.f11941f, this.f11942g, (TLRPC.TL_payments_paymentFormStarGift) this.f11943i, (TL_stars.StarGift) this.f11944j, this.h));
                return;
            default:
                AndroidUtilities.runOnUIThread(new e6(this.f11938b, tLObject, tL_error, this.f11939c, this.d, this.f11940e, this.f11941f, this.f11942g, this.h, this.f11943i, (TLRPC.TL_textWithEntities) this.f11944j));
                return;
        }
    }

    public d6(s7 s7Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j11) {
        this.f11938b = s7Var;
        this.f11939c = callback2;
        this.d = context;
        this.f11940e = c6Var;
        this.f11941f = j10;
        this.f11942g = str;
        this.f11943i = tL_payments_paymentFormStarGift;
        this.f11944j = starGift;
        this.h = j11;
    }
}
