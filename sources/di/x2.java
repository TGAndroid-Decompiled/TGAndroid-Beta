package di;

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
    public final int f9366a;
    public final boolean f9367b;
    public final int f9368c;
    public final Object d;
    public final Object e;

    public x2(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.f9366a = i11;
        this.d = obj;
        this.e = obj2;
        this.f9367b = z10;
        this.f9368c = i10;
    }

    @Override
    public final void run(Object obj) {
        long j10;
        String str;
        AccountInstance accountInstance;
        boolean z10;
        switch (this.f9366a) {
            case 0:
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.e;
                Long l4 = (Long) obj;
                q4 q4Var = ((z2) this.d).f9481a;
                TLRPC.User user = q4Var.S2.getAdapter().f14136w0;
                if (user != null) {
                    j10 = user.f22177id;
                } else {
                    j10 = 0;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("id", botInlineResult.f22026id);
                hashMap.put("query_id", "" + botInlineResult.query_id);
                hashMap.put("bot", "" + j10);
                TLRPC.User user2 = q4Var.S2.getAdapter().f14136w0;
                if (user2 == null) {
                    str = "";
                } else {
                    str = user2.username;
                }
                hashMap.put("bot_name", str);
                org.telegram.ui.ActionBar.r2 r2Var = q4Var.f9046y0.f9428f;
                long j11 = j10;
                accountInstance = q4Var.getAccountInstance();
                SendMessagesHelper.prepareSendingBotContextResult(r2Var, accountInstance, botInlineResult, hashMap, q4Var.f9015q1, null, null, q4Var.D1.f8870a, null, this.f9367b, this.f9368c, 0, null, 0L, l4.longValue());
                q4Var.Q1.setFieldText("");
                if (l4.longValue() <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                q4Var.i0(z10);
                MediaDataController.getInstance(q4Var.f9020r2).increaseInlineRating(j11);
                return;
            case 1:
                t6 t6Var = (t6) this.d;
                List list = (List) this.e;
                Long l10 = (Long) obj;
                w6 w6Var = t6Var.f9500q;
                TLObject userOrChat = MessagesController.getInstance(t6Var.f9489c).getUserOrChat(t6Var.D);
                t6Var.G = false;
                if (userOrChat != null) {
                    t6Var.q(this.f9368c, list, this.f9367b);
                    return;
                }
                t6Var.J = 0;
                t6Var.H = "";
                AndroidUtilities.cancelRunOnUIThread(w6Var);
                AndroidUtilities.runOnUIThread(w6Var);
                return;
            default:
                ((nk) this.d).Q.m(((Long) obj).longValue(), (ArrayList) this.e, this.f9367b, this.f9368c);
                return;
        }
    }

    public x2(t6 t6Var, boolean z10, int i10, List list) {
        this.f9366a = 1;
        this.d = t6Var;
        this.f9367b = z10;
        this.f9368c = i10;
        this.e = list;
    }
}
