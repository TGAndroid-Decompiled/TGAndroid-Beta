package gh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class g6 implements RequestDelegate {
    public final int f8138a = 1;
    public final v7 f8139b;
    public final Utilities.Callback2 f8140c;
    public final Context d;
    public final org.telegram.ui.ActionBar.b6 f8141e;
    public final long f8142f;
    public final String f8143g;
    public final long h;
    public final TLObject f8144i;
    public final TLObject f8145j;

    public g6(v7 v7Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.b6 b6Var, long j10, String str, long j11, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f8139b = v7Var;
        this.f8140c = callback2;
        this.d = context;
        this.f8141e = b6Var;
        this.f8142f = j10;
        this.f8143g = str;
        this.h = j11;
        this.f8144i = tLObject;
        this.f8145j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f8138a) {
            case 0:
                AndroidUtilities.runOnUIThread(new h6(this.f8139b, tLObject, tL_error, this.f8140c, this.d, this.f8141e, this.f8142f, this.f8143g, (TLRPC.TL_payments_paymentFormStarGift) this.f8144i, (TL_stars.StarGift) this.f8145j, this.h));
                return;
            default:
                AndroidUtilities.runOnUIThread(new h6(this.f8139b, tLObject, tL_error, this.f8140c, this.d, this.f8141e, this.f8142f, this.f8143g, this.h, this.f8144i, (TLRPC.TL_textWithEntities) this.f8145j));
                return;
        }
    }

    public g6(v7 v7Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.b6 b6Var, long j10, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j11) {
        this.f8139b = v7Var;
        this.f8140c = callback2;
        this.d = context;
        this.f8141e = b6Var;
        this.f8142f = j10;
        this.f8143g = str;
        this.f8144i = tL_payments_paymentFormStarGift;
        this.f8145j = starGift;
        this.h = j11;
    }
}
