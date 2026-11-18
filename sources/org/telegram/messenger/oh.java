package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class oh implements RequestDelegate {
    public final int f26059a;
    public final ri f26060b;
    public final int f26061c;

    public oh(ri riVar, int i7, int i10) {
        this.f26059a = i10;
        this.f26060b = riVar;
        this.f26061c = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        switch (this.f26059a) {
            case 0:
                ri riVar = this.f26060b;
                Long[] lArr = riVar.G0;
                Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
                int i7 = this.f26061c;
                lArr[i7] = valueOf;
                if (tLObject instanceof TL_account.TL_emojiStatusesNotModified) {
                    riVar.I0[i7] = false;
                    return;
                } else if (tLObject instanceof TL_account.TL_emojiStatuses) {
                    TL_account.TL_emojiStatuses tL_emojiStatuses = (TL_account.TL_emojiStatuses) tLObject;
                    riVar.E0[i7] = tL_emojiStatuses.hash;
                    riVar.F0[i7] = tL_emojiStatuses.statuses;
                    riVar.getMessagesStorage().f27052a.c(new l7(riVar, i7, tL_emojiStatuses, 8));
                    g0.g3(new eg(riVar, 3));
                    return;
                } else {
                    return;
                }
            case 1:
                g0.g3(new dg(this.f26060b, tL_error, tLObject, this.f26061c, 0));
                return;
            case 2:
                if (tLObject instanceof TLRPC.TL_messages_savedGifs) {
                    arrayList = ((TLRPC.TL_messages_savedGifs) tLObject).gifs;
                } else {
                    arrayList = null;
                }
                this.f26060b.B1(this.f26061c, arrayList, true, 0, true);
                return;
            default:
                int i10 = this.f26061c;
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
                this.f26060b.B1(i10, arrayList2, false, 0, true);
                return;
        }
    }
}
