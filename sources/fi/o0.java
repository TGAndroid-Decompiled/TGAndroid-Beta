package fi;

import android.text.TextUtils;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.ad;
import org.telegram.ui.LaunchActivity;
public final class o0 implements Utilities.Callback2 {
    public final int f10017a;
    public final long f10018b;
    public final Object f10019c;

    public o0(Object obj, long j3, int i10) {
        this.f10017a = i10;
        this.f10019c = obj;
        this.f10018b = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f10017a;
        long j3 = this.f10018b;
        Object obj3 = this.f10019c;
        switch (i10) {
            case 0:
                m2 m2Var = (m2) obj3;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    if (TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                        u0.d(m2Var, -j3, 2);
                        return;
                    } else {
                        ad.a0(m2Var).f0(tL_error, false);
                        return;
                    }
                }
                u0.d(m2Var, -j3, 1);
                return;
            case 1:
                ((GiftAuctionController) obj3).lambda$subscribeToGiftAuctionStateInternal$1(j3, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                Long l4 = (Long) obj2;
                Pattern pattern = LaunchActivity.B1;
                if ("paid".equals((String) obj) && l4.longValue() != 0) {
                    AndroidUtilities.runOnUIThread(new a3.h0(launchActivity, l4, this.f10018b, 25));
                    return;
                }
                return;
            default:
                xh.o.T((xh.o) obj3, j3, (Boolean) obj, (String) obj2);
                return;
        }
    }
}
