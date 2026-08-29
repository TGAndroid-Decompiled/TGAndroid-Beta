package ih;

import android.text.TextUtils;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
public final class m implements Utilities.Callback2 {
    public final int f9273a;
    public final long f9274b;
    public final Object f9275c;

    public m(Object obj, long j10, int i10) {
        this.f9273a = i10;
        this.f9275c = obj;
        this.f9274b = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f9273a;
        long j10 = this.f9274b;
        Object obj3 = this.f9275c;
        switch (i10) {
            case 0:
                t.S((t) obj3, j10, (Boolean) obj, (String) obj2);
                return;
            case 1:
                ((GiftAuctionController) obj3).lambda$subscribeToGiftAuctionStateInternal$1(j10, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                Long l10 = (Long) obj2;
                Pattern pattern = LaunchActivity.f35560x1;
                if ("paid".equals((String) obj) && l10.longValue() != 0) {
                    AndroidUtilities.runOnUIThread(new g5.v(launchActivity, l10, this.f9274b, 28));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj3;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    if (TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                        qh.p0.d(o2Var, -j10, 2);
                        return;
                    } else {
                        tc.a0(o2Var).d0(tL_error, false);
                        return;
                    }
                }
                qh.p0.d(o2Var, -j10, 1);
                return;
        }
    }
}
