package bi;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class j8 implements RequestDelegate {
    public final int f4897a = 1;
    public final ca f4898b;
    public final Utilities.Callback2 f4899c;
    public final Context d;
    public final org.telegram.ui.ActionBar.u6 e;
    public final long f4900f;
    public final String f4901g;
    public final long h;
    public final TLObject f4902i;
    public final TLObject f4903j;

    public j8(ca caVar, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.u6 u6Var, long j10, String str, long j11, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f4898b = caVar;
        this.f4899c = callback2;
        this.d = context;
        this.e = u6Var;
        this.f4900f = j10;
        this.f4901g = str;
        this.h = j11;
        this.f4902i = tLObject;
        this.f4903j = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f4897a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k8(this.f4898b, tLObject, tL_error, this.f4899c, this.d, this.e, this.f4900f, this.f4901g, (TLRPC.TL_payments_paymentFormStarGift) this.f4902i, (TL_stars.StarGift) this.f4903j, this.h));
                return;
            default:
                AndroidUtilities.runOnUIThread(new k8(this.f4898b, tLObject, tL_error, this.f4899c, this.d, this.e, this.f4900f, this.f4901g, this.h, this.f4902i, (TLRPC.TL_textWithEntities) this.f4903j));
                return;
        }
    }

    public j8(ca caVar, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.u6 u6Var, long j10, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j11) {
        this.f4898b = caVar;
        this.f4899c = callback2;
        this.d = context;
        this.e = u6Var;
        this.f4900f = j10;
        this.f4901g = str;
        this.f4902i = tL_payments_paymentFormStarGift;
        this.f4903j = starGift;
        this.h = j11;
    }
}
