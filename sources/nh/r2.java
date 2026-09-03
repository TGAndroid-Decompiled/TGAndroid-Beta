package nh;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hk;
public final class r2 implements Utilities.Callback {
    public final int f15812a;
    public final boolean f15813b;
    public final int f15814c;
    public final Object d;
    public final Object e;

    public r2(int i10, int i11, Object obj, Object obj2, boolean z4) {
        this.f15812a = i11;
        this.d = obj;
        this.e = obj2;
        this.f15813b = z4;
        this.f15814c = i10;
    }

    @Override
    public final void run(Object obj) {
        long j10;
        String str;
        AccountInstance accountInstance;
        boolean z4;
        switch (this.f15812a) {
            case 0:
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.e;
                Long l10 = (Long) obj;
                d4 d4Var = ((s2) this.d).f15854a;
                TLRPC.User user = d4Var.f15163a3.getAdapter().f44922t0;
                if (user != null) {
                    j10 = user.f19306id;
                } else {
                    j10 = 0;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("id", botInlineResult.f19157id);
                hashMap.put("query_id", "" + botInlineResult.query_id);
                hashMap.put("bot", "" + j10);
                TLRPC.User user2 = d4Var.f15163a3.getAdapter().f44922t0;
                if (user2 == null) {
                    str = "";
                } else {
                    str = user2.username;
                }
                hashMap.put("bot_name", str);
                org.telegram.ui.ActionBar.p2 p2Var = d4Var.G0.f15441f;
                long j11 = j10;
                accountInstance = d4Var.getAccountInstance();
                SendMessagesHelper.prepareSendingBotContextResult(p2Var, accountInstance, botInlineResult, hashMap, d4Var.f15238y1, null, null, d4Var.L1.f15091a, null, this.f15813b, this.f15814c, 0, null, 0L, l10.longValue());
                d4Var.Y1.setFieldText("");
                if (l10.longValue() <= 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                d4Var.k0(z4);
                MediaDataController.getInstance(d4Var.f15243z2).increaseInlineRating(j11);
                return;
            default:
                ((hk) this.d).N.m(((Long) obj).longValue(), (ArrayList) this.e, this.f15813b, this.f15814c);
                return;
        }
    }
}
