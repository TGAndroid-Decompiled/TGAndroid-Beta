package mh;

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
    public final int f15057a = 0;
    public final boolean f15058b;
    public final boolean f15059c;
    public final int d;
    public final Object f15060e;
    public final Object f15061f;
    public final Object h;
    public final Object f15062n;

    public x8(int i10, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, qh.d dVar, boolean z4, boolean z10, org.telegram.ui.ActionBar.h3[] h3VarArr) {
        this.f15060e = dVar;
        this.f15061f = h3VarArr;
        this.d = i10;
        this.f15058b = z4;
        this.h = starsSubscription;
        this.f15059c = z10;
        this.f15062n = tLObject;
    }

    @Override
    public final void run() {
        String formatString;
        int i10 = this.f15057a;
        Object obj = this.f15062n;
        Object obj2 = this.h;
        Object obj3 = this.f15061f;
        Object obj4 = this.f15060e;
        switch (i10) {
            case 0:
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj2;
                TLObject tLObject = (TLObject) obj;
                ((qh.d) obj4).setLoading(false);
                org.telegram.ui.ActionBar.h3 h3Var = ((org.telegram.ui.ActionBar.h3[]) obj3)[0];
                if (h3Var != null) {
                    h3Var.dismiss();
                }
                t7.y(this.d, false).S();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    if (this.f15058b && !TextUtils.isEmpty(starsSubscription.title)) {
                        formatString = LocaleController.formatString(R.string.StarsSubscriptionCancelledBizToastText, LocaleController.formatDateChat(starsSubscription.until_date), starsSubscription.title);
                    } else if (this.f15059c && !TextUtils.isEmpty(starsSubscription.title)) {
                        formatString = LocaleController.formatString(R.string.StarsSubscriptionCancelledBotToastText, LocaleController.formatDateChat(starsSubscription.until_date), starsSubscription.title);
                    } else {
                        formatString = LocaleController.formatString(R.string.StarsSubscriptionCancelledToastText, LocaleController.formatDateChat(starsSubscription.until_date));
                    }
                    qc.a0(U).V(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionCancelledToast), AndroidUtilities.replaceTags(formatString), null).k(false);
                    return;
                }
                return;
            default:
                ((SendMessagesHelper) obj4).lambda$performSendMessageRequest$95(this.f15058b, (TLRPC.Message) obj3, (ArrayList) obj2, this.f15059c, (ArrayList) obj, this.d);
                return;
        }
    }

    public x8(SendMessagesHelper sendMessagesHelper, boolean z4, TLRPC.Message message, ArrayList arrayList, boolean z10, ArrayList arrayList2, int i10) {
        this.f15060e = sendMessagesHelper;
        this.f15058b = z4;
        this.f15061f = message;
        this.h = arrayList;
        this.f15059c = z10;
        this.f15062n = arrayList2;
        this.d = i10;
    }
}
