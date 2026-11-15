package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class nh implements RequestDelegate {
    public final int f25196a;
    public final si f25197b;
    public final int f25198c;

    public nh(si siVar, int i7, int i10) {
        this.f25196a = i10;
        this.f25197b = siVar;
        this.f25198c = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        switch (this.f25196a) {
            case 0:
                si siVar = this.f25197b;
                Long[] lArr = siVar.G0;
                Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
                int i7 = this.f25198c;
                lArr[i7] = valueOf;
                if (tLObject instanceof TL_account.TL_emojiStatusesNotModified) {
                    siVar.I0[i7] = false;
                    return;
                } else if (tLObject instanceof TL_account.TL_emojiStatuses) {
                    TL_account.TL_emojiStatuses tL_emojiStatuses = (TL_account.TL_emojiStatuses) tLObject;
                    siVar.E0[i7] = tL_emojiStatuses.hash;
                    siVar.F0[i7] = tL_emojiStatuses.statuses;
                    siVar.getMessagesStorage().f27219a.c(new l7(siVar, i7, tL_emojiStatuses, 8));
                    g0.h3(new eg(siVar, 1));
                    return;
                } else {
                    return;
                }
            case 1:
                g0.h3(new cg(this.f25197b, tL_error, tLObject, this.f25198c, 0));
                return;
            case 2:
                if (tLObject instanceof TLRPC.TL_messages_savedGifs) {
                    arrayList = ((TLRPC.TL_messages_savedGifs) tLObject).gifs;
                } else {
                    arrayList = null;
                }
                this.f25197b.y1(this.f25198c, arrayList, true, 0, true);
                return;
            default:
                int i10 = this.f25198c;
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
                this.f25197b.y1(i10, arrayList2, false, 0, true);
                return;
        }
    }
}
