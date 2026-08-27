package jh;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bk;

public final class r2 implements Utilities.Callback {

    public final int f13895a;

    public final boolean f13896b;

    public final int f13897c;
    public final Object d;

    public final Object f13898e;

    public r2(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.f13895a = i11;
        this.d = obj;
        this.f13898e = obj2;
        this.f13896b = z10;
        this.f13897c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f13895a) {
            case 0:
                s2 s2Var = (s2) this.d;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.f13898e;
                Long l10 = (Long) obj;
                e4 e4Var = s2Var.f13937a;
                TLRPC.User user = e4Var.Z2.getAdapter().f45944s0;
                long j10 = user != null ? user.f22527id : 0L;
                HashMap map = new HashMap();
                map.put("id", botInlineResult.f22378id);
                map.put("query_id", "" + botInlineResult.query_id);
                map.put("bot", "" + j10);
                TLRPC.User user2 = e4Var.Z2.getAdapter().f45944s0;
                map.put("bot_name", user2 != null ? user2.username : "");
                long j11 = j10;
                SendMessagesHelper.prepareSendingBotContextResult(e4Var.F0.f13478f, e4Var.getAccountInstance(), botInlineResult, map, e4Var.f13291x1, null, null, e4Var.K1.f13141a, null, this.f13896b, this.f13897c, 0, null, 0L, l10.longValue());
                e4Var.X1.setFieldText("");
                e4Var.k0(l10.longValue() <= 0);
                MediaDataController.getInstance(e4Var.f13296y2).increaseInlineRating(j11);
                break;
            default:
                ((bk) this.d).M.m(((Long) obj).longValue(), (ArrayList) this.f13898e, this.f13896b, this.f13897c);
                break;
        }
    }
}
