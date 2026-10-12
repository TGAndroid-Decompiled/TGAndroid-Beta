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
import org.telegram.ui.Components.uk;
public final class e4 implements Utilities.Callback {
    public final int f874a;
    public final boolean f875b;
    public final int f876c;
    public final Object d;
    public final Object f877e;

    public e4(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.f874a = i11;
        this.d = obj;
        this.f877e = obj2;
        this.f875b = z10;
        this.f876c = i10;
    }

    @Override
    public final void run(Object obj) {
        long j3;
        String str;
        AccountInstance accountInstance;
        boolean z10;
        switch (this.f874a) {
            case 0:
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.f877e;
                Long l4 = (Long) obj;
                f6 f6Var = ((g4) this.d).f1050a;
                TLRPC.User user = f6Var.f959d3.getAdapter().f10692w0;
                if (user != null) {
                    j3 = user.f19949id;
                } else {
                    j3 = 0;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("id", botInlineResult.f19800id);
                hashMap.put("query_id", "" + botInlineResult.query_id);
                hashMap.put("bot", "" + j3);
                TLRPC.User user2 = f6Var.f959d3.getAdapter().f10692w0;
                if (user2 == null) {
                    str = "";
                } else {
                    str = user2.username;
                }
                hashMap.put("bot_name", str);
                org.telegram.ui.ActionBar.m2 m2Var = f6Var.J0.f1265f;
                long j10 = j3;
                accountInstance = f6Var.getAccountInstance();
                SendMessagesHelper.prepareSendingBotContextResult(m2Var, accountInstance, botInlineResult, hashMap, f6Var.B1, null, null, f6Var.O1.f820a, null, this.f875b, this.f876c, 0, null, 0L, l4.longValue());
                f6Var.f950b2.setFieldText("");
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
                List list = (List) this.f877e;
                Long l10 = (Long) obj;
                z8 z8Var = w8Var.f905q;
                TLObject userOrChat = MessagesController.getInstance(w8Var.f893c).getUserOrChat(w8Var.D);
                w8Var.G = false;
                if (userOrChat != null) {
                    w8Var.q(this.f876c, list, this.f875b);
                    return;
                }
                w8Var.J = 0;
                w8Var.H = "";
                AndroidUtilities.cancelRunOnUIThread(z8Var);
                AndroidUtilities.runOnUIThread(z8Var);
                return;
            default:
                ((uk) this.d).Q.l(((Long) obj).longValue(), (ArrayList) this.f877e, this.f875b, this.f876c);
                return;
        }
    }

    public e4(w8 w8Var, boolean z10, int i10, List list) {
        this.f874a = 1;
        this.d = w8Var;
        this.f875b = z10;
        this.f876c = i10;
        this.f877e = list;
    }
}
