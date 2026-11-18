package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class oh implements RequestDelegate {
    public final int f26061a;
    public final ri f26062b;
    public final int f26063c;

    public oh(ri riVar, int i7, int i10) {
        this.f26061a = i10;
        this.f26062b = riVar;
        this.f26063c = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        switch (this.f26061a) {
            case 0:
                ri riVar = this.f26062b;
                Long[] lArr = riVar.G0;
                Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
                int i7 = this.f26063c;
                lArr[i7] = valueOf;
                if (tLObject instanceof TL_account.TL_emojiStatusesNotModified) {
                    riVar.I0[i7] = false;
                    return;
                } else if (tLObject instanceof TL_account.TL_emojiStatuses) {
                    TL_account.TL_emojiStatuses tL_emojiStatuses = (TL_account.TL_emojiStatuses) tLObject;
                    riVar.E0[i7] = tL_emojiStatuses.hash;
                    riVar.F0[i7] = tL_emojiStatuses.statuses;
                    riVar.getMessagesStorage().f27054a.c(new l7(riVar, i7, tL_emojiStatuses, 8));
                    g0.g3(new eg(riVar, 3));
                    return;
                } else {
                    return;
                }
            case 1:
                g0.g3(new dg(this.f26062b, tL_error, tLObject, this.f26063c, 0));
                return;
            case 2:
                if (tLObject instanceof TLRPC.TL_messages_savedGifs) {
                    arrayList = ((TLRPC.TL_messages_savedGifs) tLObject).gifs;
                } else {
                    arrayList = null;
                }
                this.f26062b.B1(this.f26063c, arrayList, true, 0, true);
                return;
            default:
                int i10 = this.f26063c;
                if (i10 != 3 && i10 != 7) {
                    if (i10 == 2) {
                        if (tLObject instanceof TLRPC.TL_messages_favedStickers) {
                            arrayList2 = ((TLRPC.TL_messages_favedStickers) tLObject).stickers;
                        }
                        arrayList2 = null;
                    } else {
                        if (tLObject instanceof TLRPC.TL_messages_recentStickers) {
                            arrayList2 = ((TLRPC.TL_messages_recentStickers) tLObject).stickers;
                        }
                        arrayList2 = null;
                    }
                } else {
                    if (tLObject instanceof TLRPC.TL_messages_stickers) {
                        arrayList2 = ((TLRPC.TL_messages_stickers) tLObject).stickers;
                    }
                    arrayList2 = null;
                }
                this.f26062b.B1(i10, arrayList2, false, 0, true);
                return;
        }
    }
}
