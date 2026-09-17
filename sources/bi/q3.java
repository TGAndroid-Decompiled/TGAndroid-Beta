package bi;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ok;
public final class q3 implements Utilities.Callback {
    public final int f3623a;
    public final boolean f3624b;
    public final int f3625c;
    public final Object d;
    public final Object f3626e;

    public q3(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.f3623a = i11;
        this.d = obj;
        this.f3626e = obj2;
        this.f3624b = z10;
        this.f3625c = i10;
    }

    @Override
    public final void run(Object obj) {
        long j3;
        String str;
        AccountInstance accountInstance;
        boolean z10;
        switch (this.f3623a) {
            case 0:
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.f3626e;
                Long l4 = (Long) obj;
                o5 o5Var = ((s3) this.d).f3711a;
                TLRPC.User user = o5Var.f3442d3.getAdapter().f11182w0;
                if (user != null) {
                    j3 = user.f20043id;
                } else {
                    j3 = 0;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("id", botInlineResult.f19894id);
                hashMap.put("query_id", "" + botInlineResult.query_id);
                hashMap.put("bot", "" + j3);
                TLRPC.User user2 = o5Var.f3442d3.getAdapter().f11182w0;
                if (user2 == null) {
                    str = "";
                } else {
                    str = user2.username;
                }
                hashMap.put("bot_name", str);
                org.telegram.ui.ActionBar.n2 n2Var = o5Var.J0.f3572f;
                long j10 = j3;
                accountInstance = o5Var.getAccountInstance();
                SendMessagesHelper.prepareSendingBotContextResult(n2Var, accountInstance, botInlineResult, hashMap, o5Var.B1, null, null, o5Var.O1.f3337a, null, this.f3624b, this.f3625c, 0, null, 0L, l4.longValue());
                o5Var.f3433b2.setFieldText("");
                if (l4.longValue() <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                o5Var.k0(z10);
                MediaDataController.getInstance(o5Var.C2).increaseInlineRating(j10);
                return;
            default:
                ((ok) this.d).Q.l(((Long) obj).longValue(), (ArrayList) this.f3626e, this.f3624b, this.f3625c);
                return;
        }
    }
}
