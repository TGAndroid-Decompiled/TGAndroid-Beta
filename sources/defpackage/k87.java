package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class k87 implements jac {
    public final byte a;
    public final oc7 b;

    public k87(oc7 oc7Var, byte b) {
        this.a = b;
        this.b = oc7Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        int i = 0;
        oc7 oc7Var = this.b;
        switch (b) {
            case 0:
                Long l = (Long) obj;
                gm.c3(new r87(oc7Var, (TL_account.TL_webBrowserSettings) obj2, (byte) 1));
                return;
            case 1:
                TL_account.WebBrowserSettings webBrowserSettings = (TL_account.WebBrowserSettings) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (webBrowserSettings instanceof TL_account.TL_webBrowserSettings) {
                    oc7Var.Y4((TL_account.TL_webBrowserSettings) webBrowserSettings);
                    return;
                }
                return;
            case 2:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (updates != null) {
                    oc7Var.T3(updates, false);
                    return;
                }
                return;
            case 3:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (updates2 != null) {
                    oc7Var.T3(updates2, false);
                }
                gm.c3(new g87(oc7Var, (byte) 29));
                return;
            case 4:
                TLRPC.Updates updates3 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (updates3 != null) {
                    oc7Var.T3(updates3, false);
                }
                gm.c3(new ba7(oc7Var, (byte) 1));
                return;
            case 5:
                TLRPC.EmojiGameInfo emojiGameInfo = (TLRPC.EmojiGameInfo) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                if (emojiGameInfo != null) {
                    oc7Var.m5 = emojiGameInfo;
                }
                ArrayList arrayList = oc7Var.l5;
                int size = arrayList.size();
                while (i < size) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    ((qac) obj3).a(Boolean.valueOf(oc7Var.m5 instanceof TLRPC.TL_emojiGameDiceInfo));
                }
                oc7Var.l5 = null;
                return;
            default:
                TL_account.WebBrowserSettings webBrowserSettings2 = (TL_account.WebBrowserSettings) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                if (webBrowserSettings2 instanceof TL_account.TL_webBrowserSettings) {
                    oc7Var.Y4((TL_account.TL_webBrowserSettings) webBrowserSettings2);
                    return;
                }
                return;
        }
    }
}
