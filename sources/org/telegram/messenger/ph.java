package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ph implements RequestDelegate {
    public final int f24568a;
    public final ui f24569b;
    public final int f24570c;

    public ph(ui uiVar, int i7, int i10) {
        this.f24568a = i10;
        this.f24569b = uiVar;
        this.f24570c = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        switch (this.f24568a) {
            case 0:
                ui uiVar = this.f24569b;
                Long[] lArr = uiVar.F0;
                Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
                int i7 = this.f24570c;
                lArr[i7] = valueOf;
                if (tLObject instanceof TL_account.TL_emojiStatusesNotModified) {
                    uiVar.H0[i7] = false;
                    return;
                } else if (tLObject instanceof TL_account.TL_emojiStatuses) {
                    TL_account.TL_emojiStatuses tL_emojiStatuses = (TL_account.TL_emojiStatuses) tLObject;
                    uiVar.D0[i7] = tL_emojiStatuses.hash;
                    uiVar.E0[i7] = tL_emojiStatuses.statuses;
                    uiVar.getMessagesStorage().f26723a.c(new l7(uiVar, i7, tL_emojiStatuses, 8));
                    g0.h3(new fg(uiVar, 1));
                    return;
                } else {
                    return;
                }
            case 1:
                g0.h3(new dg(this.f24569b, tL_error, tLObject, this.f24570c, 0));
                return;
            case 2:
                if (tLObject instanceof TLRPC.TL_messages_savedGifs) {
                    arrayList = ((TLRPC.TL_messages_savedGifs) tLObject).gifs;
                } else {
                    arrayList = null;
                }
                this.f24569b.y1(this.f24570c, arrayList, true, 0, true);
                return;
            default:
                int i10 = this.f24570c;
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
                this.f24569b.y1(i10, arrayList2, false, 0, true);
                return;
        }
    }
}
