package ai;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ok;
public final class d4 implements Utilities.Callback {
    public final int f700a;
    public final boolean f701b;
    public final int f702c;
    public final Object d;
    public final Object e;

    public d4(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.f700a = i11;
        this.d = obj;
        this.e = obj2;
        this.f701b = z10;
        this.f702c = i10;
    }

    @Override
    public final void run(Object obj) {
        long j3;
        String str;
        AccountInstance accountInstance;
        boolean z10;
        switch (this.f700a) {
            case 0:
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.e;
                Long l4 = (Long) obj;
                f6 f6Var = ((f4) this.d).f792a;
                TLRPC.User user = f6Var.f809d3.getAdapter().f9842w0;
                if (user != null) {
                    j3 = user.f18268id;
                } else {
                    j3 = 0;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("id", botInlineResult.f18119id);
                hashMap.put("query_id", "" + botInlineResult.query_id);
                hashMap.put("bot", "" + j3);
                TLRPC.User user2 = f6Var.f809d3.getAdapter().f9842w0;
                if (user2 == null) {
                    str = "";
                } else {
                    str = user2.username;
                }
                hashMap.put("bot_name", str);
                org.telegram.ui.ActionBar.o2 o2Var = f6Var.J0.f1080f;
                long j10 = j3;
                accountInstance = f6Var.getAccountInstance();
                SendMessagesHelper.prepareSendingBotContextResult(o2Var, accountInstance, botInlineResult, hashMap, f6Var.B1, null, null, f6Var.O1.f706a, null, this.f701b, this.f702c, 0, null, 0L, l4.longValue());
                f6Var.f800b2.setFieldText("");
                if (l4.longValue() <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f6Var.k0(z10);
                MediaDataController.getInstance(f6Var.C2).increaseInlineRating(j10);
                return;
            default:
                ((ok) this.d).Q.l(((Long) obj).longValue(), (ArrayList) this.e, this.f701b, this.f702c);
                return;
        }
    }
}
