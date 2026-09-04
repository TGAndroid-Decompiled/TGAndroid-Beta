package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
public final class hj implements Runnable {
    public final int f17897a = 1;
    public final int f17898b;
    public final boolean f17899c;
    public final boolean d;
    public final Object f17900e;
    public final Object f17901f;
    public final Object h;
    public final Object f17902n;

    public hj(int i10, di.d dVar, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z10, boolean z11, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f17900e = dVar;
        this.f17901f = f3VarArr;
        this.f17898b = i10;
        this.f17899c = z10;
        this.h = starsSubscription;
        this.d = z11;
        this.f17902n = tLObject;
    }

    @Override
    public final void run() {
        String formatString;
        int i10 = this.f17897a;
        Object obj = this.f17902n;
        Object obj2 = this.h;
        Object obj3 = this.f17901f;
        Object obj4 = this.f17900e;
        switch (i10) {
            case 0:
                ((SendMessagesHelper) obj4).lambda$performSendMessageRequest$95(this.f17899c, (TLRPC.Message) obj3, (ArrayList) obj2, this.d, (ArrayList) obj, this.f17898b);
                return;
            default:
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj2;
                TLObject tLObject = (TLObject) obj;
                ((di.d) obj4).setLoading(false);
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.ActionBar.f3[]) obj3)[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                }
                zh.s5.y(this.f17898b, false).S();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    if (this.f17899c && !TextUtils.isEmpty(starsSubscription.title)) {
                        formatString = LocaleController.formatString(R.string.StarsSubscriptionCancelledBizToastText, LocaleController.formatDateChat(starsSubscription.until_date), starsSubscription.title);
                    } else if (this.d && !TextUtils.isEmpty(starsSubscription.title)) {
                        formatString = LocaleController.formatString(R.string.StarsSubscriptionCancelledBotToastText, LocaleController.formatDateChat(starsSubscription.until_date), starsSubscription.title);
                    } else {
                        formatString = LocaleController.formatString(R.string.StarsSubscriptionCancelledToastText, LocaleController.formatDateChat(starsSubscription.until_date));
                    }
                    org.telegram.ui.Components.yc.a0(U).V(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionCancelledToast), AndroidUtilities.replaceTags(formatString), null).k(false);
                    return;
                }
                return;
        }
    }

    public hj(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i10) {
        this.f17900e = sendMessagesHelper;
        this.f17899c = z10;
        this.f17901f = message;
        this.h = arrayList;
        this.d = z11;
        this.f17902n = arrayList2;
        this.f17898b = i10;
    }
}
