package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class k67 implements i8c {
    public final byte a;
    public final na7 b;

    public k67(na7 na7Var, byte b) {
        this.a = b;
        this.b = na7Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        int i = 0;
        na7 na7Var = this.b;
        switch (b) {
            case 0:
                Long l = (Long) obj;
                gl.d3(new p67(na7Var, (TL_account.TL_webBrowserSettings) obj2, (byte) 1));
                return;
            case 1:
                TL_account.WebBrowserSettings webBrowserSettings = (TL_account.WebBrowserSettings) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (webBrowserSettings instanceof TL_account.TL_webBrowserSettings) {
                    na7Var.V4((TL_account.TL_webBrowserSettings) webBrowserSettings);
                    return;
                }
                return;
            case 2:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (updates != null) {
                    na7Var.Q3(updates, false);
                    return;
                }
                return;
            case 3:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (updates2 != null) {
                    na7Var.Q3(updates2, false);
                }
                gl.d3(new f67(na7Var, (byte) 29));
                return;
            case 4:
                TLRPC.Updates updates3 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (updates3 != null) {
                    na7Var.Q3(updates3, false);
                }
                gl.d3(new c87(na7Var, (byte) 2));
                return;
            case 5:
                TLRPC.EmojiGameInfo emojiGameInfo = (TLRPC.EmojiGameInfo) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                if (emojiGameInfo != null) {
                    na7Var.k5 = emojiGameInfo;
                }
                ArrayList arrayList = na7Var.j5;
                int size = arrayList.size();
                while (i < size) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    ((p8c) obj3).a(Boolean.valueOf(na7Var.k5 instanceof TLRPC.TL_emojiGameDiceInfo));
                }
                na7Var.j5 = null;
                return;
            default:
                TL_account.WebBrowserSettings webBrowserSettings2 = (TL_account.WebBrowserSettings) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                if (webBrowserSettings2 instanceof TL_account.TL_webBrowserSettings) {
                    na7Var.V4((TL_account.TL_webBrowserSettings) webBrowserSettings2);
                    return;
                }
                return;
        }
    }
}
