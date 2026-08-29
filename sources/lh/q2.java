package lh;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jk;
public final class q2 implements Utilities.Callback {
    public final int f16117a;
    public final boolean f16118b;
    public final int f16119c;
    public final Object d;
    public final Object f16120e;

    public q2(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.f16117a = i11;
        this.d = obj;
        this.f16120e = obj2;
        this.f16118b = z10;
        this.f16119c = i10;
    }

    @Override
    public final void run(Object obj) {
        long j10;
        String str;
        AccountInstance accountInstance;
        boolean z10;
        switch (this.f16117a) {
            case 0:
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.f16120e;
                Long l10 = (Long) obj;
                d4 d4Var = ((r2) this.d).f16160a;
                TLRPC.User user = d4Var.Z2.getAdapter().f47385s0;
                if (user != null) {
                    j10 = user.f22539id;
                } else {
                    j10 = 0;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("id", botInlineResult.f22390id);
                hashMap.put("query_id", "" + botInlineResult.query_id);
                hashMap.put("bot", "" + j10);
                TLRPC.User user2 = d4Var.Z2.getAdapter().f47385s0;
                if (user2 == null) {
                    str = "";
                } else {
                    str = user2.username;
                }
                hashMap.put("bot_name", str);
                org.telegram.ui.ActionBar.o2 o2Var = d4Var.F0.f15756f;
                long j11 = j10;
                accountInstance = d4Var.getAccountInstance();
                SendMessagesHelper.prepareSendingBotContextResult(o2Var, accountInstance, botInlineResult, hashMap, d4Var.f15540x1, null, null, d4Var.K1.f15374a, null, this.f16118b, this.f16119c, 0, null, 0L, l10.longValue());
                d4Var.X1.setFieldText("");
                if (l10.longValue() <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                d4Var.k0(z10);
                MediaDataController.getInstance(d4Var.f15545y2).increaseInlineRating(j11);
                return;
            default:
                ((jk) this.d).M.m(((Long) obj).longValue(), (ArrayList) this.f16120e, this.f16118b, this.f16119c);
                return;
        }
    }
}
