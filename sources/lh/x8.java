package lh;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
public final class x8 implements Runnable {
    public final int f13357a = 0;
    public final boolean f13358b;
    public final boolean f13359c;
    public final int d;
    public final Object e;
    public final Object f13360f;
    public final Object h;
    public final Object f13361n;

    public x8(int i10, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, ph.d dVar, boolean z4, boolean z10, org.telegram.ui.ActionBar.g3[] g3VarArr) {
        this.e = dVar;
        this.f13360f = g3VarArr;
        this.d = i10;
        this.f13358b = z4;
        this.h = starsSubscription;
        this.f13359c = z10;
        this.f13361n = tLObject;
    }

    @Override
    public final void run() {
        String formatString;
        int i10 = this.f13357a;
        Object obj = this.f13361n;
        Object obj2 = this.h;
        Object obj3 = this.f13360f;
        Object obj4 = this.e;
        switch (i10) {
            case 0:
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj2;
                TLObject tLObject = (TLObject) obj;
                ((ph.d) obj4).setLoading(false);
                org.telegram.ui.ActionBar.g3 g3Var = ((org.telegram.ui.ActionBar.g3[]) obj3)[0];
                if (g3Var != null) {
                    g3Var.dismiss();
                }
                t7.y(this.d, false).S();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    if (this.f13358b && !TextUtils.isEmpty(starsSubscription.title)) {
                        formatString = LocaleController.formatString(R.string.StarsSubscriptionCancelledBizToastText, LocaleController.formatDateChat(starsSubscription.until_date), starsSubscription.title);
                    } else if (this.f13359c && !TextUtils.isEmpty(starsSubscription.title)) {
                        formatString = LocaleController.formatString(R.string.StarsSubscriptionCancelledBotToastText, LocaleController.formatDateChat(starsSubscription.until_date), starsSubscription.title);
                    } else {
                        formatString = LocaleController.formatString(R.string.StarsSubscriptionCancelledToastText, LocaleController.formatDateChat(starsSubscription.until_date));
                    }
                    qc.a0(U).V(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionCancelledToast), AndroidUtilities.replaceTags(formatString), null).k(false);
                    return;
                }
                return;
            default:
                ((SendMessagesHelper) obj4).lambda$performSendMessageRequest$95(this.f13358b, (TLRPC.Message) obj3, (ArrayList) obj2, this.f13359c, (ArrayList) obj, this.d);
                return;
        }
    }

    public x8(SendMessagesHelper sendMessagesHelper, boolean z4, TLRPC.Message message, ArrayList arrayList, boolean z10, ArrayList arrayList2, int i10) {
        this.e = sendMessagesHelper;
        this.f13358b = z4;
        this.f13360f = message;
        this.h = arrayList;
        this.f13359c = z10;
        this.f13361n = arrayList2;
        this.d = i10;
    }
}
