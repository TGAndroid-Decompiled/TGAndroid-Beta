package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class cr6 implements RequestDelegate {
    public final byte a;
    public final hs6 b;
    public final byte c;

    public cr6(hs6 hs6Var, int i, byte b) {
        this.a = b;
        this.b = hs6Var;
        this.c = i;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList<TLRPC.Document> arrayList = null;
        switch (this.a) {
            case 0:
                hs6 hs6Var = this.b;
                Long[] lArr = hs6Var.G0;
                Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
                byte b = this.c;
                lArr[b] = valueOf;
                if (tLObject instanceof TL_account.TL_emojiStatusesNotModified) {
                    hs6Var.I0[b] = false;
                    return;
                } else if (tLObject instanceof TL_account.TL_emojiStatuses) {
                    TL_account.TL_emojiStatuses tL_emojiStatuses = (TL_account.TL_emojiStatuses) tLObject;
                    hs6Var.E0[b] = tL_emojiStatuses.hash;
                    hs6Var.F0[b] = tL_emojiStatuses.statuses;
                    hs6Var.getMessagesStorage().a.c(new ob4(hs6Var, b, tL_emojiStatuses, (byte) 6));
                    gm.c3(new vp6(hs6Var, (byte) 3));
                    return;
                } else {
                    return;
                }
            case 1:
                if (tLObject instanceof TLRPC.TL_messages_savedGifs) {
                    arrayList = ((TLRPC.TL_messages_savedGifs) tLObject).gifs;
                }
                this.b.z1(this.c, arrayList, true, 0, true);
                return;
            default:
                byte b2 = this.c;
                if (b2 != 3 && b2 != 7) {
                    if (b2 == 2) {
                        if (tLObject instanceof TLRPC.TL_messages_favedStickers) {
                            arrayList = ((TLRPC.TL_messages_favedStickers) tLObject).stickers;
                        }
                    } else if (tLObject instanceof TLRPC.TL_messages_recentStickers) {
                        arrayList = ((TLRPC.TL_messages_recentStickers) tLObject).stickers;
                    }
                } else if (tLObject instanceof TLRPC.TL_messages_stickers) {
                    arrayList = ((TLRPC.TL_messages_stickers) tLObject).stickers;
                }
                this.b.z1(b2, arrayList, false, 0, true);
                return;
        }
    }
}
