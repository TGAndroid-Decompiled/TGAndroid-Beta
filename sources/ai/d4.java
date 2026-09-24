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
import org.telegram.ui.Components.pk;
public final class d4 implements Utilities.Callback {
    public final int f706a;
    public final boolean f707b;
    public final int f708c;
    public final Object d;
    public final Object e;

    public d4(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.f706a = i11;
        this.d = obj;
        this.e = obj2;
        this.f707b = z10;
        this.f708c = i10;
    }

    @Override
    public final void run(Object obj) {
        long j3;
        String str;
        AccountInstance accountInstance;
        boolean z10;
        switch (this.f706a) {
            case 0:
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.e;
                Long l4 = (Long) obj;
                e6 e6Var = ((f4) this.d).f873a;
                TLRPC.User user = e6Var.f782d3.getAdapter().f9823w0;
                if (user != null) {
                    j3 = user.f18468id;
                } else {
                    j3 = 0;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("id", botInlineResult.f18319id);
                hashMap.put("query_id", "" + botInlineResult.query_id);
                hashMap.put("bot", "" + j3);
                TLRPC.User user2 = e6Var.f782d3.getAdapter().f9823w0;
                if (user2 == null) {
                    str = "";
                } else {
                    str = user2.username;
                }
                hashMap.put("bot_name", str);
                org.telegram.ui.ActionBar.m2 m2Var = e6Var.J0.f1071f;
                long j10 = j3;
                accountInstance = e6Var.getAccountInstance();
                SendMessagesHelper.prepareSendingBotContextResult(m2Var, accountInstance, botInlineResult, hashMap, e6Var.B1, null, null, e6Var.O1.f642a, null, this.f707b, this.f708c, 0, null, 0L, l4.longValue());
                e6Var.f773b2.setFieldText("");
                if (l4.longValue() <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e6Var.k0(z10);
                MediaDataController.getInstance(e6Var.C2).increaseInlineRating(j10);
                return;
            case 1:
                v8 v8Var = (v8) this.d;
                List list = (List) this.e;
                Long l10 = (Long) obj;
                y8 y8Var = v8Var.f733q;
                TLObject userOrChat = MessagesController.getInstance(v8Var.f722c).getUserOrChat(v8Var.D);
                v8Var.G = false;
                if (userOrChat != null) {
                    v8Var.q(this.f708c, list, this.f707b);
                    return;
                }
                v8Var.J = 0;
                v8Var.H = "";
                AndroidUtilities.cancelRunOnUIThread(y8Var);
                AndroidUtilities.runOnUIThread(y8Var);
                return;
            default:
                ((pk) this.d).Q.l(((Long) obj).longValue(), (ArrayList) this.e, this.f707b, this.f708c);
                return;
        }
    }

    public d4(v8 v8Var, boolean z10, int i10, List list) {
        this.f706a = 1;
        this.d = v8Var;
        this.f707b = z10;
        this.f708c = i10;
        this.e = list;
    }
}
