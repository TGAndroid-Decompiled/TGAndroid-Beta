package hh;

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
import org.telegram.ui.Components.mc;
import org.telegram.ui.LaunchActivity;

public final class a9 implements Runnable {

    public final int f8963a = 0;

    public final boolean f8964b;

    public final boolean f8965c;
    public final int d;

    public final Object f8966e;

    public final Object f8967f;
    public final Object h;

    public final Object f8968n;

    public a9(int i10, lh.d dVar, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z10, boolean z11, org.telegram.ui.ActionBar.e3[] e3VarArr) {
        this.f8966e = dVar;
        this.f8967f = e3VarArr;
        this.d = i10;
        this.f8964b = z10;
        this.h = starsSubscription;
        this.f8965c = z11;
        this.f8968n = tLObject;
    }

    @Override
    public final void run() {
        int i10 = this.f8963a;
        Object obj = this.f8968n;
        Object obj2 = this.h;
        Object obj3 = this.f8967f;
        Object obj4 = this.f8966e;
        switch (i10) {
            case 0:
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj2;
                TLObject tLObject = (TLObject) obj;
                ((lh.d) obj4).setLoading(false);
                org.telegram.ui.ActionBar.e3 e3Var = ((org.telegram.ui.ActionBar.e3[]) obj3)[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                }
                u7.y(this.d, false).S();
                org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                if (n2VarU != null) {
                    mc.a0(n2VarU).V(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionCancelledToast), AndroidUtilities.replaceTags((!this.f8964b || TextUtils.isEmpty(starsSubscription.title)) ? (!this.f8965c || TextUtils.isEmpty(starsSubscription.title)) ? LocaleController.formatString(R.string.StarsSubscriptionCancelledToastText, LocaleController.formatDateChat(starsSubscription.until_date)) : LocaleController.formatString(R.string.StarsSubscriptionCancelledBotToastText, LocaleController.formatDateChat(starsSubscription.until_date), starsSubscription.title) : LocaleController.formatString(R.string.StarsSubscriptionCancelledBizToastText, LocaleController.formatDateChat(starsSubscription.until_date), starsSubscription.title)), null).k(false);
                }
                break;
            default:
                ((SendMessagesHelper) obj4).lambda$performSendMessageRequest$95(this.f8964b, (TLRPC.Message) obj3, (ArrayList) obj2, this.f8965c, (ArrayList) obj, this.d);
                break;
        }
    }

    public a9(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i10) {
        this.f8966e = sendMessagesHelper;
        this.f8964b = z10;
        this.f8967f = message;
        this.h = arrayList;
        this.f8965c = z11;
        this.f8968n = arrayList2;
        this.d = i10;
    }
}
