package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
public final class gj implements Runnable {
    public final int f16226a = 1;
    public final int f16227b;
    public final boolean f16228c;
    public final boolean d;
    public final Object e;
    public final Object f16229f;
    public final Object h;
    public final Object f16230n;

    public gj(int i10, ci.d dVar, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z10, boolean z11, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.e = dVar;
        this.f16229f = f3VarArr;
        this.f16227b = i10;
        this.f16228c = z10;
        this.h = starsSubscription;
        this.d = z11;
        this.f16230n = tLObject;
    }

    @Override
    public final void run() {
        String formatString;
        int i10 = this.f16226a;
        Object obj = this.f16230n;
        Object obj2 = this.h;
        Object obj3 = this.f16229f;
        Object obj4 = this.e;
        switch (i10) {
            case 0:
                ((SendMessagesHelper) obj4).lambda$performSendMessageRequest$95(this.f16228c, (TLRPC.Message) obj3, (ArrayList) obj2, this.d, (ArrayList) obj, this.f16227b);
                return;
            default:
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj2;
                TLObject tLObject = (TLObject) obj;
                ((ci.d) obj4).setLoading(false);
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.ActionBar.f3[]) obj3)[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                }
                yh.t5.y(this.f16227b, false).S();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    if (this.f16228c && !TextUtils.isEmpty(starsSubscription.title)) {
                        formatString = LocaleController.formatString(R.string.StarsSubscriptionCancelledBizToastText, LocaleController.formatDateChat(starsSubscription.until_date), starsSubscription.title);
                    } else if (this.d && !TextUtils.isEmpty(starsSubscription.title)) {
                        formatString = LocaleController.formatString(R.string.StarsSubscriptionCancelledBotToastText, LocaleController.formatDateChat(starsSubscription.until_date), starsSubscription.title);
                    } else {
                        formatString = LocaleController.formatString(R.string.StarsSubscriptionCancelledToastText, LocaleController.formatDateChat(starsSubscription.until_date));
                    }
                    org.telegram.ui.Components.xc.a0(U).V(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionCancelledToast), AndroidUtilities.replaceTags(formatString), null).k(false);
                    return;
                }
                return;
        }
    }

    public gj(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i10) {
        this.e = sendMessagesHelper;
        this.f16228c = z10;
        this.f16229f = message;
        this.h = arrayList;
        this.d = z11;
        this.f16230n = arrayList2;
        this.f16227b = i10;
    }
}
