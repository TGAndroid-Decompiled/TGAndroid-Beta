package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class oh implements RequestDelegate {
    public final int f17269a;
    public final ui f17270b;
    public final int f17271c;

    public oh(ui uiVar, int i10, int i11) {
        this.f17269a = i11;
        this.f17270b = uiVar;
        this.f17271c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        switch (this.f17269a) {
            case 0:
                ui uiVar = this.f17270b;
                Long[] lArr = uiVar.F0;
                Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
                int i10 = this.f17271c;
                lArr[i10] = valueOf;
                if (tLObject instanceof TL_account.TL_emojiStatusesNotModified) {
                    uiVar.H0[i10] = false;
                    return;
                } else if (tLObject instanceof TL_account.TL_emojiStatuses) {
                    TL_account.TL_emojiStatuses tL_emojiStatuses = (TL_account.TL_emojiStatuses) tLObject;
                    uiVar.D0[i10] = tL_emojiStatuses.hash;
                    uiVar.E0[i10] = tL_emojiStatuses.statuses;
                    uiVar.getMessagesStorage().f15938a.c(new o7(uiVar, i10, tL_emojiStatuses, 8));
                    i0.g3(new eg(uiVar, 1));
                    return;
                } else {
                    return;
                }
            case 1:
                i0.g3(new cg(this.f17270b, tL_error, tLObject, this.f17271c, 0));
                return;
            case 2:
                if (tLObject instanceof TLRPC.TL_messages_savedGifs) {
                    arrayList = ((TLRPC.TL_messages_savedGifs) tLObject).gifs;
                } else {
                    arrayList = null;
                }
                this.f17270b.y1(this.f17271c, arrayList, true, 0, true);
                return;
            default:
                int i11 = this.f17271c;
                if (i11 != 3 && i11 != 7) {
                    if (i11 == 2) {
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
                this.f17270b.y1(i11, arrayList2, false, 0, true);
                return;
        }
    }
}
