package ci;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nk;
public final class y2 implements Utilities.Callback {
    public final int f6198a;
    public final boolean f6199b;
    public final int f6200c;
    public final Object d;
    public final Object e;

    public y2(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.f6198a = i11;
        this.d = obj;
        this.e = obj2;
        this.f6199b = z10;
        this.f6200c = i10;
    }

    @Override
    public final void run(Object obj) {
        long j10;
        String str;
        AccountInstance accountInstance;
        boolean z10;
        switch (this.f6198a) {
            case 0:
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.e;
                Long l4 = (Long) obj;
                q4 q4Var = ((a3) this.d).f5140a;
                TLRPC.User user = q4Var.f5777d3.getAdapter().f11947w0;
                if (user != null) {
                    j10 = user.f20419id;
                } else {
                    j10 = 0;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("id", botInlineResult.f20270id);
                hashMap.put("query_id", "" + botInlineResult.query_id);
                hashMap.put("bot", "" + j10);
                TLRPC.User user2 = q4Var.f5777d3.getAdapter().f11947w0;
                if (user2 == null) {
                    str = "";
                } else {
                    str = user2.username;
                }
                hashMap.put("bot_name", str);
                org.telegram.ui.ActionBar.n2 n2Var = q4Var.J0.f5189f;
                long j11 = j10;
                accountInstance = q4Var.getAccountInstance();
                SendMessagesHelper.prepareSendingBotContextResult(n2Var, accountInstance, botInlineResult, hashMap, q4Var.B1, null, null, q4Var.O1.f5690a, null, this.f6199b, this.f6200c, 0, null, 0L, l4.longValue());
                q4Var.f5768b2.setFieldText("");
                if (l4.longValue() <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                q4Var.k0(z10);
                MediaDataController.getInstance(q4Var.C2).increaseInlineRating(j11);
                return;
            case 1:
                u6 u6Var = (u6) this.d;
                List list = (List) this.e;
                Long l10 = (Long) obj;
                x6 x6Var = u6Var.f5159q;
                TLObject userOrChat = MessagesController.getInstance(u6Var.f5148c).getUserOrChat(u6Var.D);
                u6Var.G = false;
                if (userOrChat != null) {
                    u6Var.q(this.f6200c, list, this.f6199b);
                    return;
                }
                u6Var.J = 0;
                u6Var.H = "";
                AndroidUtilities.cancelRunOnUIThread(x6Var);
                AndroidUtilities.runOnUIThread(x6Var);
                return;
            default:
                ((nk) this.d).Q.m(((Long) obj).longValue(), (ArrayList) this.e, this.f6199b, this.f6200c);
                return;
        }
    }

    public y2(u6 u6Var, boolean z10, int i10, List list) {
        this.f6198a = 1;
        this.d = u6Var;
        this.f6199b = z10;
        this.f6200c = i10;
        this.e = list;
    }
}
