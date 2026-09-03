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
    public final int f17726a;
    public final boolean f17727b;
    public final int f17728c;
    public final Object d;
    public final Object f17729e;

    public s2(int i10, int i11, Object obj, Object obj2, boolean z4) {
        this.f17726a = i11;
        this.d = obj;
        this.f17729e = obj2;
        this.f17727b = z4;
        this.f17728c = i10;
    }

    @Override
    public final void run(Object obj) {
        long j10;
        String str;
        AccountInstance accountInstance;
        boolean z4;
        switch (this.f17726a) {
            case 0:
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.f17729e;
                Long l10 = (Long) obj;
                f4 f4Var = ((t2) this.d).f17765a;
                TLRPC.User user = f4Var.f17055a3.getAdapter().f48753t0;
                if (user != null) {
                    j10 = user.f20992id;
                } else {
                    j10 = 0;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("id", botInlineResult.f20843id);
                hashMap.put("query_id", "" + botInlineResult.query_id);
                hashMap.put("bot", "" + j10);
                TLRPC.User user2 = f4Var.f17055a3.getAdapter().f48753t0;
                if (user2 == null) {
                    str = "";
                } else {
                    str = user2.username;
                }
                hashMap.put("bot_name", str);
                org.telegram.ui.ActionBar.p2 p2Var = f4Var.G0.f17268f;
                long j11 = j10;
                accountInstance = f4Var.getAccountInstance();
                SendMessagesHelper.prepareSendingBotContextResult(p2Var, accountInstance, botInlineResult, hashMap, f4Var.f17130y1, null, null, f4Var.L1.f16963a, null, this.f17727b, this.f17728c, 0, null, 0L, l10.longValue());
                f4Var.Y1.setFieldText("");
                if (l10.longValue() <= 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                f4Var.k0(z4);
                MediaDataController.getInstance(f4Var.f17135z2).increaseInlineRating(j11);
                return;
            default:
                ((jk) this.d).N.m(((Long) obj).longValue(), (ArrayList) this.f17729e, this.f17727b, this.f17728c);
                return;
        }
    }
}
