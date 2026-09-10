package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
public final class pj implements Runnable {
    public final int f16070a = 1;
    public final int f16071b;
    public final boolean f16072c;
    public final boolean d;
    public final Object e;
    public final Object f16073f;
    public final Object h;
    public final Object f16074n;

    public pj(int i10, bi.d dVar, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z10, boolean z11, org.telegram.ui.ActionBar.h3[] h3VarArr) {
        this.e = dVar;
        this.f16073f = h3VarArr;
        this.f16071b = i10;
        this.f16072c = z10;
        this.h = starsSubscription;
        this.d = z11;
        this.f16074n = tLObject;
    }

    @Override
    public final void run() {
        String formatString;
        int i10 = this.f16070a;
        Object obj = this.f16074n;
        Object obj2 = this.h;
        Object obj3 = this.f16073f;
        Object obj4 = this.e;
        switch (i10) {
            case 0:
                ((SendMessagesHelper) obj4).lambda$performSendMessageRequest$95(this.f16072c, (TLRPC.Message) obj3, (ArrayList) obj2, this.d, (ArrayList) obj, this.f16071b);
                return;
            default:
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj2;
                TLObject tLObject = (TLObject) obj;
                ((bi.d) obj4).setLoading(false);
                org.telegram.ui.ActionBar.h3 h3Var = ((org.telegram.ui.ActionBar.h3[]) obj3)[0];
                if (h3Var != null) {
                    h3Var.dismiss();
                }
                xh.v5.y(this.f16071b, false).S();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    if (this.f16072c && !TextUtils.isEmpty(starsSubscription.title)) {
                        formatString = LocaleController.formatString(R.string.StarsSubscriptionCancelledBizToastText, LocaleController.formatDateChat(starsSubscription.until_date), starsSubscription.title);
                    } else if (this.d && !TextUtils.isEmpty(starsSubscription.title)) {
                        formatString = LocaleController.formatString(R.string.StarsSubscriptionCancelledBotToastText, LocaleController.formatDateChat(starsSubscription.until_date), starsSubscription.title);
                    } else {
                        formatString = LocaleController.formatString(R.string.StarsSubscriptionCancelledToastText, LocaleController.formatDateChat(starsSubscription.until_date));
                    }
                    org.telegram.ui.Components.wc.a0(U).V(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionCancelledToast), AndroidUtilities.replaceTags(formatString), null).k(false);
                    return;
                }
                return;
        }
    }

    public pj(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i10) {
        this.e = sendMessagesHelper;
        this.f16072c = z10;
        this.f16073f = message;
        this.h = arrayList;
        this.d = z11;
        this.f16074n = arrayList2;
        this.f16071b = i10;
    }
}
