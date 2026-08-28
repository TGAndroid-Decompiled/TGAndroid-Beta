package ih;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fk;
public final class s2 implements Utilities.Callback {
    public final int f12108a;
    public final boolean f12109b;
    public final int f12110c;
    public final Object d;
    public final Object f12111e;

    public s2(int i9, int i10, Object obj, Object obj2, boolean z10) {
        this.f12108a = i10;
        this.d = obj;
        this.f12111e = obj2;
        this.f12109b = z10;
        this.f12110c = i9;
    }

    @Override
    public final void run(Object obj) {
        long j10;
        String str;
        AccountInstance accountInstance;
        boolean z10;
        switch (this.f12108a) {
            case 0:
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.f12111e;
                Long l10 = (Long) obj;
                i4 i4Var = ((t2) this.d).f12158a;
                TLRPC.User user = i4Var.Z2.getAdapter().f19343s0;
                if (user != null) {
                    j10 = user.f22527id;
                } else {
                    j10 = 0;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("id", botInlineResult.f22378id);
                hashMap.put("query_id", "" + botInlineResult.query_id);
                hashMap.put("bot", "" + j10);
                TLRPC.User user2 = i4Var.Z2.getAdapter().f19343s0;
                if (user2 == null) {
                    str = "";
                } else {
                    str = user2.username;
                }
                hashMap.put("bot_name", str);
                org.telegram.ui.ActionBar.o2 o2Var = i4Var.F0.f11797f;
                long j11 = j10;
                accountInstance = i4Var.getAccountInstance();
                SendMessagesHelper.prepareSendingBotContextResult(o2Var, accountInstance, botInlineResult, hashMap, i4Var.f11604x1, null, null, i4Var.K1.f11466a, null, this.f12109b, this.f12110c, 0, null, 0L, l10.longValue());
                i4Var.X1.setFieldText("");
                if (l10.longValue() <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i4Var.k0(z10);
                MediaDataController.getInstance(i4Var.f11609y2).increaseInlineRating(j11);
                return;
            default:
                ((fk) this.d).M.m(((Long) obj).longValue(), (ArrayList) this.f12111e, this.f12109b, this.f12110c);
                return;
        }
    }
}
