package oh;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jk;
public final class s2 implements Utilities.Callback {
    public final int f17724a;
    public final boolean f17725b;
    public final int f17726c;
    public final Object d;
    public final Object f17727e;

    public s2(int i10, int i11, Object obj, Object obj2, boolean z4) {
        this.f17724a = i11;
        this.d = obj;
        this.f17727e = obj2;
        this.f17725b = z4;
        this.f17726c = i10;
    }

    @Override
    public final void run(Object obj) {
        long j10;
        String str;
        AccountInstance accountInstance;
        boolean z4;
        switch (this.f17724a) {
            case 0:
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.f17727e;
                Long l10 = (Long) obj;
                f4 f4Var = ((t2) this.d).f17763a;
                TLRPC.User user = f4Var.f17053a3.getAdapter().f48717t0;
                if (user != null) {
                    j10 = user.f20990id;
                } else {
                    j10 = 0;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("id", botInlineResult.f20841id);
                hashMap.put("query_id", "" + botInlineResult.query_id);
                hashMap.put("bot", "" + j10);
                TLRPC.User user2 = f4Var.f17053a3.getAdapter().f48717t0;
                if (user2 == null) {
                    str = "";
                } else {
                    str = user2.username;
                }
                hashMap.put("bot_name", str);
                org.telegram.ui.ActionBar.p2 p2Var = f4Var.G0.f17266f;
                long j11 = j10;
                accountInstance = f4Var.getAccountInstance();
                SendMessagesHelper.prepareSendingBotContextResult(p2Var, accountInstance, botInlineResult, hashMap, f4Var.f17128y1, null, null, f4Var.L1.f16961a, null, this.f17725b, this.f17726c, 0, null, 0L, l10.longValue());
                f4Var.Y1.setFieldText("");
                if (l10.longValue() <= 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                f4Var.k0(z4);
                MediaDataController.getInstance(f4Var.f17133z2).increaseInlineRating(j11);
                return;
            default:
                ((jk) this.d).N.m(((Long) obj).longValue(), (ArrayList) this.f17727e, this.f17725b, this.f17726c);
                return;
        }
    }
}
