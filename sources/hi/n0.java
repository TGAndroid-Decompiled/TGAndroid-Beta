package hi;

import android.text.TextUtils;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
public final class n0 implements Utilities.Callback2 {
    public final int f12219a;
    public final long f12220b;
    public final Object f12221c;

    public n0(Object obj, long j10, int i10) {
        this.f12219a = i10;
        this.f12221c = obj;
        this.f12220b = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f12219a;
        long j10 = this.f12220b;
        Object obj3 = this.f12221c;
        switch (i10) {
            case 0:
                o2 o2Var = (o2) obj3;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    if (TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                        t0.d(o2Var, -j10, 2);
                        return;
                    } else {
                        xc.a0(o2Var).f0(tL_error, false);
                        return;
                    }
                }
                t0.d(o2Var, -j10, 1);
                return;
            case 1:
                ((GiftAuctionController) obj3).lambda$subscribeToGiftAuctionStateInternal$1(j10, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                Long l4 = (Long) obj2;
                Pattern pattern = LaunchActivity.E1;
                if ("paid".equals((String) obj) && l4.longValue() != 0) {
                    AndroidUtilities.runOnUIThread(new a3.i0(launchActivity, l4, this.f12220b, 28));
                    return;
                }
                return;
            default:
                yh.m.S((yh.m) obj3, j10, (Boolean) obj, (String) obj2);
                return;
        }
    }
}
