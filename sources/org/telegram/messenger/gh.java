package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class gh implements RequestDelegate {
    public final int f22720a;
    public final li f22721b;
    public final int f22722c;

    public gh(li liVar, int i3, int i10) {
        this.f22720a = i10;
        this.f22721b = liVar;
        this.f22722c = i3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        switch (this.f22720a) {
            case 0:
                li liVar = this.f22721b;
                Long[] lArr = liVar.G0;
                Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
                int i3 = this.f22722c;
                lArr[i3] = valueOf;
                if (tLObject instanceof TL_account.TL_emojiStatusesNotModified) {
                    liVar.I0[i3] = false;
                    return;
                } else if (tLObject instanceof TL_account.TL_emojiStatuses) {
                    TL_account.TL_emojiStatuses tL_emojiStatuses = (TL_account.TL_emojiStatuses) tLObject;
                    liVar.E0[i3] = tL_emojiStatuses.hash;
                    liVar.F0[i3] = tL_emojiStatuses.statuses;
                    liVar.getMessagesStorage().f24934a.c(new k7(liVar, i3, tL_emojiStatuses, 8));
                    g0.h3(new xf(liVar, 1));
                    return;
                } else {
                    return;
                }
            case 1:
                g0.h3(new vf(this.f22721b, tL_error, tLObject, this.f22722c, 0));
                return;
            case 2:
                if (tLObject instanceof TLRPC.TL_messages_savedGifs) {
                    arrayList = ((TLRPC.TL_messages_savedGifs) tLObject).gifs;
                } else {
                    arrayList = null;
                }
                this.f22721b.y1(this.f22722c, arrayList, true, 0, true);
                return;
            default:
                int i10 = this.f22722c;
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
                this.f22721b.y1(i10, arrayList2, false, 0, true);
                return;
        }
    }
}
