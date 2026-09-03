package kh;

import android.text.TextUtils;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
public final class l implements Utilities.Callback2 {
    public final int f10797a;
    public final long f10798b;
    public final Object f10799c;

    public l(Object obj, long j10, int i10) {
        this.f10797a = i10;
        this.f10799c = obj;
        this.f10798b = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f10797a;
        long j10 = this.f10798b;
        Object obj3 = this.f10799c;
        switch (i10) {
            case 0:
                s.S((s) obj3, j10, (Boolean) obj, (String) obj2);
                return;
            case 1:
                ((GiftAuctionController) obj3).lambda$subscribeToGiftAuctionStateInternal$1(j10, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                Long l10 = (Long) obj2;
                Pattern pattern = LaunchActivity.f31586y1;
                if ("paid".equals((String) obj) && l10.longValue() != 0) {
                    AndroidUtilities.runOnUIThread(new i5.v(launchActivity, l10, this.f10798b, 27));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj3;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    if (TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                        sh.o0.d(p2Var, -j10, 2);
                        return;
                    } else {
                        qc.a0(p2Var).d0(tL_error, false);
                        return;
                    }
                }
                sh.o0.d(p2Var, -j10, 1);
                return;
        }
    }
}
