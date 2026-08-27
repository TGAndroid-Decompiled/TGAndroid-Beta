package hh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

public final class f6 implements RequestDelegate {

    public final int f9261a = 1;

    public final u7 f9262b;

    public final Utilities.Callback2 f9263c;
    public final Context d;

    public final org.telegram.ui.ActionBar.c6 f9264e;

    public final long f9265f;

    public final String f9266g;
    public final long h;

    public final TLObject f9267i;

    public final TLObject f9268j;

    public f6(u7 u7Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10, String str, long j11, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f9262b = u7Var;
        this.f9263c = callback2;
        this.d = context;
        this.f9264e = c6Var;
        this.f9265f = j10;
        this.f9266g = str;
        this.h = j11;
        this.f9267i = tLObject;
        this.f9268j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9261a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g6(this.f9262b, tLObject, tL_error, this.f9263c, this.d, this.f9264e, this.f9265f, this.f9266g, (TLRPC.TL_payments_paymentFormStarGift) this.f9267i, (TL_stars.StarGift) this.f9268j, this.h));
                break;
            default:
                AndroidUtilities.runOnUIThread(new g6(this.f9262b, tLObject, tL_error, this.f9263c, this.d, this.f9264e, this.f9265f, this.f9266g, this.h, this.f9267i, (TLRPC.TL_textWithEntities) this.f9268j));
                break;
        }
    }

    public f6(u7 u7Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j11) {
        this.f9262b = u7Var;
        this.f9263c = callback2;
        this.d = context;
        this.f9264e = c6Var;
        this.f9265f = j10;
        this.f9266g = str;
        this.f9267i = tL_payments_paymentFormStarGift;
        this.f9268j = starGift;
        this.h = j11;
    }
}
