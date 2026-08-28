package fh;

import android.text.TextUtils;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.oc;
import org.telegram.ui.LaunchActivity;
public final class m implements Utilities.Callback2 {
    public final int f6609a;
    public final long f6610b;
    public final Object f6611c;

    public m(Object obj, long j10, int i9) {
        this.f6609a = i9;
        this.f6611c = obj;
        this.f6610b = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i9 = this.f6609a;
        long j10 = this.f6610b;
        Object obj3 = this.f6611c;
        switch (i9) {
            case 0:
                x.R((x) obj3, j10, (Boolean) obj, (String) obj2);
                return;
            case 1:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj3;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    if (TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                        nh.r0.d(o2Var, -j10, 2);
                        return;
                    } else {
                        oc.a0(o2Var).d0(tL_error, false);
                        return;
                    }
                }
                nh.r0.d(o2Var, -j10, 1);
                return;
            case 2:
                ((GiftAuctionController) obj3).lambda$subscribeToGiftAuctionStateInternal$1(j10, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                Long l10 = (Long) obj2;
                Pattern pattern = LaunchActivity.f35493x1;
                if ("paid".equals((String) obj) && l10.longValue() != 0) {
                    AndroidUtilities.runOnUIThread(new e5.w(launchActivity, l10, this.f6610b, 29));
                    return;
                }
                return;
        }
    }
}
