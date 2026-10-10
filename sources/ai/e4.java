package ai;

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
import org.telegram.ui.Components.sk;
public final class e4 implements Utilities.Callback {
    public final int f876a;
    public final boolean f877b;
    public final int f878c;
    public final Object d;
    public final Object f879e;

    public e4(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.f876a = i11;
        this.d = obj;
        this.f879e = obj2;
        this.f877b = z10;
        this.f878c = i10;
    }

    @Override
    public final void run(Object obj) {
        long j3;
        String str;
        AccountInstance accountInstance;
        boolean z10;
        switch (this.f876a) {
            case 0:
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.f879e;
                Long l4 = (Long) obj;
                f6 f6Var = ((g4) this.d).f1052a;
                TLRPC.User user = f6Var.f961d3.getAdapter().f10694w0;
                if (user != null) {
                    j3 = user.f20189id;
                } else {
                    j3 = 0;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("id", botInlineResult.f20040id);
                hashMap.put("query_id", "" + botInlineResult.query_id);
                hashMap.put("bot", "" + j3);
                TLRPC.User user2 = f6Var.f961d3.getAdapter().f10694w0;
                if (user2 == null) {
                    str = "";
                } else {
                    str = user2.username;
                }
                hashMap.put("bot_name", str);
                org.telegram.ui.ActionBar.n2 n2Var = f6Var.J0.f1267f;
                long j10 = j3;
                accountInstance = f6Var.getAccountInstance();
                SendMessagesHelper.prepareSendingBotContextResult(n2Var, accountInstance, botInlineResult, hashMap, f6Var.B1, null, null, f6Var.O1.f822a, null, this.f877b, this.f878c, 0, null, 0L, l4.longValue());
                f6Var.f952b2.setFieldText("");
                if (l4.longValue() <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f6Var.k0(z10);
                MediaDataController.getInstance(f6Var.C2).increaseInlineRating(j10);
                return;
            case 1:
                w8 w8Var = (w8) this.d;
                List list = (List) this.f879e;
                Long l10 = (Long) obj;
                z8 z8Var = w8Var.f907q;
                TLObject userOrChat = MessagesController.getInstance(w8Var.f895c).getUserOrChat(w8Var.D);
                w8Var.G = false;
                if (userOrChat != null) {
                    w8Var.q(this.f878c, list, this.f877b);
                    return;
                }
                w8Var.J = 0;
                w8Var.H = "";
                AndroidUtilities.cancelRunOnUIThread(z8Var);
                AndroidUtilities.runOnUIThread(z8Var);
                return;
            default:
                ((sk) this.d).Q.l(((Long) obj).longValue(), (ArrayList) this.f879e, this.f877b, this.f878c);
                return;
        }
    }

    public e4(w8 w8Var, boolean z10, int i10, List list) {
        this.f876a = 1;
        this.d = w8Var;
        this.f877b = z10;
        this.f878c = i10;
        this.f879e = list;
    }
}
