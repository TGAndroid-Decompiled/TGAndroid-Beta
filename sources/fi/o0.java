package fi;

import android.text.TextUtils;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.vc;
import org.telegram.ui.LaunchActivity;
public final class o0 implements Utilities.Callback2 {
    public final int f9149a;
    public final long f9150b;
    public final Object f9151c;

    public o0(Object obj, long j3, int i10) {
        this.f9149a = i10;
        this.f9151c = obj;
        this.f9150b = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f9149a;
        long j3 = this.f9150b;
        Object obj3 = this.f9151c;
        switch (i10) {
            case 0:
                o2 o2Var = (o2) obj3;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    if (TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                        u0.d(o2Var, -j3, 2);
                        return;
                    } else {
                        vc.a0(o2Var).d0(tL_error, false);
                        return;
                    }
                }
                u0.d(o2Var, -j3, 1);
                return;
            case 1:
                ((GiftAuctionController) obj3).lambda$subscribeToGiftAuctionStateInternal$1(j3, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                Long l4 = (Long) obj2;
                Pattern pattern = LaunchActivity.B1;
                if ("paid".equals((String) obj) && l4.longValue() != 0) {
                    AndroidUtilities.runOnUIThread(new a3.h0(launchActivity, l4, this.f9150b, 26));
                    return;
                }
                return;
            default:
                xh.m.S((xh.m) obj3, j3, (Boolean) obj, (String) obj2);
                return;
        }
    }
}
