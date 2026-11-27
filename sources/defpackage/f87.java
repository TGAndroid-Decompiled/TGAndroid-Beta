package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class f87 implements icc {
    public final byte a;
    public final uc7 b;

    public f87(uc7 uc7Var, byte b) {
        this.a = b;
        this.b = uc7Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        int i = 0;
        uc7 uc7Var = this.b;
        switch (b) {
            case 0:
                Long l = (Long) obj;
                hl.c3(new o87(uc7Var, (TL_account.TL_webBrowserSettings) obj2, (byte) 1));
                return;
            case 1:
                TL_account.WebBrowserSettings webBrowserSettings = (TL_account.WebBrowserSettings) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (webBrowserSettings instanceof TL_account.TL_webBrowserSettings) {
                    uc7Var.e5((TL_account.TL_webBrowserSettings) webBrowserSettings);
                    return;
                }
                return;
            case 2:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (updates != null) {
                    uc7Var.Y3(updates, false);
                }
                hl.c3(new pa7(uc7Var, (byte) 1));
                return;
            case 3:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (updates2 != null) {
                    uc7Var.Y3(updates2, false);
                }
                hl.c3(new pa7(uc7Var, (byte) 0));
                return;
            case 4:
                TL_account.WebBrowserSettings webBrowserSettings2 = (TL_account.WebBrowserSettings) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (webBrowserSettings2 instanceof TL_account.TL_webBrowserSettings) {
                    uc7Var.e5((TL_account.TL_webBrowserSettings) webBrowserSettings2);
                    return;
                }
                return;
            case 5:
                TLRPC.EmojiGameInfo emojiGameInfo = (TLRPC.EmojiGameInfo) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                if (emojiGameInfo != null) {
                    uc7Var.m5 = emojiGameInfo;
                }
                ArrayList arrayList = uc7Var.l5;
                int size = arrayList.size();
                while (i < size) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    ((pcc) obj3).a(Boolean.valueOf(uc7Var.m5 instanceof TLRPC.TL_emojiGameDiceInfo));
                }
                uc7Var.l5 = null;
                return;
            default:
                TLRPC.Updates updates3 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                if (updates3 != null) {
                    uc7Var.Y3(updates3, false);
                    return;
                }
                return;
        }
    }
}
