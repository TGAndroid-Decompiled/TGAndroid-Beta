package ii;

import android.text.TextUtils;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
public final class m0 implements Utilities.Callback2 {
    public final int f14383a;
    public final long f14384b;
    public final Object f14385c;

    public m0(Object obj, long j10, int i10) {
        this.f14383a = i10;
        this.f14385c = obj;
        this.f14384b = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f14383a;
        long j10 = this.f14384b;
        Object obj3 = this.f14385c;
        switch (i10) {
            case 0:
                r2 r2Var = (r2) obj3;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    if (TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                        s0.d(r2Var, -j10, 2);
                        return;
                    } else {
                        wc.b0(r2Var).g0(tL_error, false);
                        return;
                    }
                }
                s0.d(r2Var, -j10, 1);
                return;
            case 1:
                ((GiftAuctionController) obj3).lambda$subscribeToGiftAuctionStateInternal$1(j10, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                Long l4 = (Long) obj2;
                Pattern pattern = LaunchActivity.D1;
                if ("paid".equals((String) obj) && l4.longValue() != 0) {
                    AndroidUtilities.runOnUIThread(new a3.i0(launchActivity, l4, this.f14384b, 28));
                    return;
                }
                return;
            default:
                zh.m.S((zh.m) obj3, j10, (Boolean) obj, (String) obj2);
                return;
        }
    }
}
