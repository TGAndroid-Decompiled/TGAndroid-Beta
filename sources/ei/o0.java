package ei;

import android.text.TextUtils;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
public final class o0 implements Utilities.Callback2 {
    public final int f7593a;
    public final long f7594b;
    public final Object f7595c;

    public o0(Object obj, long j3, int i10) {
        this.f7593a = i10;
        this.f7595c = obj;
        this.f7594b = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f7593a;
        long j3 = this.f7594b;
        Object obj3 = this.f7595c;
        switch (i10) {
            case 0:
                p2 p2Var = (p2) obj3;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    if (TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                        u0.d(p2Var, -j3, 2);
                        return;
                    } else {
                        wc.a0(p2Var).d0(tL_error, false);
                        return;
                    }
                }
                u0.d(p2Var, -j3, 1);
                return;
            case 1:
                ((GiftAuctionController) obj3).lambda$subscribeToGiftAuctionStateInternal$1(j3, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                Long l4 = (Long) obj2;
                Pattern pattern = LaunchActivity.B1;
                if ("paid".equals((String) obj) && l4.longValue() != 0) {
                    AndroidUtilities.runOnUIThread(new a3.h0(launchActivity, l4, this.f7594b, 20));
                    return;
                }
                return;
            default:
                wh.m.S((wh.m) obj3, j3, (Boolean) obj, (String) obj2);
                return;
        }
    }
}
