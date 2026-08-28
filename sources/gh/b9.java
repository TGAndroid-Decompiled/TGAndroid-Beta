package gh;

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
import org.telegram.ui.Components.oc;
import org.telegram.ui.LaunchActivity;
public final class b9 implements Runnable {
    public final int f7864a = 0;
    public final boolean f7865b;
    public final boolean f7866c;
    public final int d;
    public final Object f7867e;
    public final Object f7868f;
    public final Object h;
    public final Object f7869n;

    public b9(int i9, kh.d dVar, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z10, boolean z11, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f7867e = dVar;
        this.f7868f = f3VarArr;
        this.d = i9;
        this.f7865b = z10;
        this.h = starsSubscription;
        this.f7866c = z11;
        this.f7869n = tLObject;
    }

    @Override
    public final void run() {
        String formatString;
        int i9 = this.f7864a;
        Object obj = this.f7869n;
        Object obj2 = this.h;
        Object obj3 = this.f7868f;
        Object obj4 = this.f7867e;
        switch (i9) {
            case 0:
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj2;
                TLObject tLObject = (TLObject) obj;
                ((kh.d) obj4).setLoading(false);
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.ActionBar.f3[]) obj3)[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                }
                v7.y(this.d, false).S();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    if (this.f7865b && !TextUtils.isEmpty(starsSubscription.title)) {
                        formatString = LocaleController.formatString(R.string.StarsSubscriptionCancelledBizToastText, LocaleController.formatDateChat(starsSubscription.until_date), starsSubscription.title);
                    } else if (this.f7866c && !TextUtils.isEmpty(starsSubscription.title)) {
                        formatString = LocaleController.formatString(R.string.StarsSubscriptionCancelledBotToastText, LocaleController.formatDateChat(starsSubscription.until_date), starsSubscription.title);
                    } else {
                        formatString = LocaleController.formatString(R.string.StarsSubscriptionCancelledToastText, LocaleController.formatDateChat(starsSubscription.until_date));
                    }
                    oc.a0(U).V(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionCancelledToast), AndroidUtilities.replaceTags(formatString), null).k(false);
                    return;
                }
                return;
            default:
                ((SendMessagesHelper) obj4).lambda$performSendMessageRequest$95(this.f7865b, (TLRPC.Message) obj3, (ArrayList) obj2, this.f7866c, (ArrayList) obj, this.d);
                return;
        }
    }

    public b9(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i9) {
        this.f7867e = sendMessagesHelper;
        this.f7865b = z10;
        this.f7868f = message;
        this.h = arrayList;
        this.f7866c = z11;
        this.f7869n = arrayList2;
        this.d = i9;
    }
}
