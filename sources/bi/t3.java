package bi;

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
import org.telegram.ui.Components.pk;
public final class t3 implements Utilities.Callback {
    public final int f3732a;
    public final boolean f3733b;
    public final int f3734c;
    public final Object d;
    public final Object e;

    public t3(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.f3732a = i11;
        this.d = obj;
        this.e = obj2;
        this.f3733b = z10;
        this.f3734c = i10;
    }

    @Override
    public final void run(Object obj) {
        long j10;
        String str;
        AccountInstance accountInstance;
        boolean z10;
        switch (this.f3732a) {
            case 0:
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.e;
                Long l4 = (Long) obj;
                q5 q5Var = ((v3) this.d).f3855a;
                TLRPC.User user = q5Var.f3517d3.getAdapter().f10638w0;
                if (user != null) {
                    j10 = user.f19363id;
                } else {
                    j10 = 0;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("id", botInlineResult.f19214id);
                hashMap.put("query_id", "" + botInlineResult.query_id);
                hashMap.put("bot", "" + j10);
                TLRPC.User user2 = q5Var.f3517d3.getAdapter().f10638w0;
                if (user2 == null) {
                    str = "";
                } else {
                    str = user2.username;
                }
                hashMap.put("bot_name", str);
                org.telegram.ui.ActionBar.m2 m2Var = q5Var.J0.f3673f;
                long j11 = j10;
                accountInstance = q5Var.getAccountInstance();
                SendMessagesHelper.prepareSendingBotContextResult(m2Var, accountInstance, botInlineResult, hashMap, q5Var.B1, null, null, q5Var.O1.f3413a, null, this.f3733b, this.f3734c, 0, null, 0L, l4.longValue());
                q5Var.f3508b2.setFieldText("");
                if (l4.longValue() <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                q5Var.k0(z10);
                MediaDataController.getInstance(q5Var.C2).increaseInlineRating(j11);
                return;
            case 1:
                g8 g8Var = (g8) this.d;
                List list = (List) this.e;
                Long l10 = (Long) obj;
                j8 j8Var = g8Var.f3437q;
                TLObject userOrChat = MessagesController.getInstance(g8Var.f3426c).getUserOrChat(g8Var.D);
                g8Var.G = false;
                if (userOrChat != null) {
                    g8Var.q(this.f3734c, list, this.f3733b);
                    return;
                }
                g8Var.J = 0;
                g8Var.H = "";
                AndroidUtilities.cancelRunOnUIThread(j8Var);
                AndroidUtilities.runOnUIThread(j8Var);
                return;
            default:
                ((pk) this.d).Q.m(((Long) obj).longValue(), (ArrayList) this.e, this.f3733b, this.f3734c);
                return;
        }
    }

    public t3(g8 g8Var, boolean z10, int i10, List list) {
        this.f3732a = 1;
        this.d = g8Var;
        this.f3733b = z10;
        this.f3734c = i10;
        this.e = list;
    }
}
