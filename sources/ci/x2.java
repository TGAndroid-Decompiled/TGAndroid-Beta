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
public final class x2 implements Utilities.Callback {
    public final int f6099a;
    public final boolean f6100b;
    public final int f6101c;
    public final Object d;
    public final Object e;

    public x2(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.f6099a = i11;
        this.d = obj;
        this.e = obj2;
        this.f6100b = z10;
        this.f6101c = i10;
    }

    @Override
    public final void run(Object obj) {
        long j10;
        String str;
        AccountInstance accountInstance;
        boolean z10;
        switch (this.f6099a) {
            case 0:
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.e;
                Long l4 = (Long) obj;
                p4 p4Var = ((z2) this.d).f6173a;
                TLRPC.User user = p4Var.f5658d3.getAdapter().f11947w0;
                if (user != null) {
                    j10 = user.f20419id;
                } else {
                    j10 = 0;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("id", botInlineResult.f20270id);
                hashMap.put("query_id", "" + botInlineResult.query_id);
                hashMap.put("bot", "" + j10);
                TLRPC.User user2 = p4Var.f5658d3.getAdapter().f11947w0;
                if (user2 == null) {
                    str = "";
                } else {
                    str = user2.username;
                }
                hashMap.put("bot_name", str);
                org.telegram.ui.ActionBar.n2 n2Var = p4Var.J0.f6222f;
                long j11 = j10;
                accountInstance = p4Var.getAccountInstance();
                SendMessagesHelper.prepareSendingBotContextResult(n2Var, accountInstance, botInlineResult, hashMap, p4Var.B1, null, null, p4Var.O1.f5591a, null, this.f6100b, this.f6101c, 0, null, 0L, l4.longValue());
                p4Var.f5649b2.setFieldText("");
                if (l4.longValue() <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                p4Var.k0(z10);
                MediaDataController.getInstance(p4Var.C2).increaseInlineRating(j11);
                return;
            case 1:
                t6 t6Var = (t6) this.d;
                List list = (List) this.e;
                Long l10 = (Long) obj;
                w6 w6Var = t6Var.f6192q;
                TLObject userOrChat = MessagesController.getInstance(t6Var.f6181c).getUserOrChat(t6Var.D);
                t6Var.G = false;
                if (userOrChat != null) {
                    t6Var.q(this.f6101c, list, this.f6100b);
                    return;
                }
                t6Var.J = 0;
                t6Var.H = "";
                AndroidUtilities.cancelRunOnUIThread(w6Var);
                AndroidUtilities.runOnUIThread(w6Var);
                return;
            default:
                ((nk) this.d).Q.m(((Long) obj).longValue(), (ArrayList) this.e, this.f6100b, this.f6101c);
                return;
        }
    }

    public x2(t6 t6Var, boolean z10, int i10, List list) {
        this.f6099a = 1;
        this.d = t6Var;
        this.f6100b = z10;
        this.f6101c = i10;
        this.e = list;
    }
}
