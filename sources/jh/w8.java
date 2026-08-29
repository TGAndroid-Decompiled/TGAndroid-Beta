package jh;

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
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
public final class w8 implements Runnable {
    public final int f13033a = 0;
    public final boolean f13034b;
    public final boolean f13035c;
    public final int d;
    public final Object f13036e;
    public final Object f13037f;
    public final Object h;
    public final Object f13038n;

    public w8(int i10, nh.d dVar, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z10, boolean z11, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f13036e = dVar;
        this.f13037f = f3VarArr;
        this.d = i10;
        this.f13034b = z10;
        this.h = starsSubscription;
        this.f13035c = z11;
        this.f13038n = tLObject;
    }

    @Override
    public final void run() {
        String formatString;
        int i10 = this.f13033a;
        Object obj = this.f13038n;
        Object obj2 = this.h;
        Object obj3 = this.f13037f;
        Object obj4 = this.f13036e;
        switch (i10) {
            case 0:
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj2;
                TLObject tLObject = (TLObject) obj;
                ((nh.d) obj4).setLoading(false);
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.ActionBar.f3[]) obj3)[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                }
                s7.y(this.d, false).S();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    if (this.f13034b && !TextUtils.isEmpty(starsSubscription.title)) {
                        formatString = LocaleController.formatString(R.string.StarsSubscriptionCancelledBizToastText, LocaleController.formatDateChat(starsSubscription.until_date), starsSubscription.title);
                    } else if (this.f13035c && !TextUtils.isEmpty(starsSubscription.title)) {
                        formatString = LocaleController.formatString(R.string.StarsSubscriptionCancelledBotToastText, LocaleController.formatDateChat(starsSubscription.until_date), starsSubscription.title);
                    } else {
                        formatString = LocaleController.formatString(R.string.StarsSubscriptionCancelledToastText, LocaleController.formatDateChat(starsSubscription.until_date));
                    }
                    tc.a0(U).V(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionCancelledToast), AndroidUtilities.replaceTags(formatString), null).k(false);
                    return;
                }
                return;
            default:
                ((SendMessagesHelper) obj4).lambda$performSendMessageRequest$95(this.f13034b, (TLRPC.Message) obj3, (ArrayList) obj2, this.f13035c, (ArrayList) obj, this.d);
                return;
        }
    }

    public w8(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i10) {
        this.f13036e = sendMessagesHelper;
        this.f13034b = z10;
        this.f13037f = message;
        this.h = arrayList;
        this.f13035c = z11;
        this.f13038n = arrayList2;
        this.d = i10;
    }
}
