package gh;

import android.text.TextUtils;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.mc;
import org.telegram.ui.LaunchActivity;

public final class m implements Utilities.Callback2 {

    public final int f7420a;

    public final long f7421b;

    public final Object f7422c;

    public m(Object obj, long j10, int i10) {
        this.f7420a = i10;
        this.f7422c = obj;
        this.f7421b = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f7420a;
        long j10 = this.f7421b;
        Object obj3 = this.f7422c;
        switch (i10) {
            case 0:
                v.S((v) obj3, j10, (Boolean) obj, (String) obj2);
                break;
            case 1:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null) {
                    oh.r0.d(n2Var, -j10, 1);
                } else if (!TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                    mc.a0(n2Var).d0(tL_error, false);
                } else {
                    oh.r0.d(n2Var, -j10, 2);
                }
                break;
            case 2:
                ((GiftAuctionController) obj3).lambda$subscribeToGiftAuctionStateInternal$1(j10, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                Long l10 = (Long) obj2;
                Pattern pattern = LaunchActivity.f35496x1;
                if ("paid".equals((String) obj) && l10.longValue() != 0) {
                    AndroidUtilities.runOnUIThread(new e5.u(launchActivity, l10, this.f7421b, 29));
                    break;
                }
                break;
        }
    }
}
