package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ph implements RequestDelegate {
    public final int f17602a;
    public final vi f17603b;
    public final int f17604c;

    public ph(vi viVar, int i10, int i11) {
        this.f17602a = i11;
        this.f17603b = viVar;
        this.f17604c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        switch (this.f17602a) {
            case 0:
                vi viVar = this.f17603b;
                Long[] lArr = viVar.F0;
                Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
                int i10 = this.f17604c;
                lArr[i10] = valueOf;
                if (tLObject instanceof TL_account.TL_emojiStatusesNotModified) {
                    viVar.H0[i10] = false;
                    return;
                } else if (tLObject instanceof TL_account.TL_emojiStatuses) {
                    TL_account.TL_emojiStatuses tL_emojiStatuses = (TL_account.TL_emojiStatuses) tLObject;
                    viVar.D0[i10] = tL_emojiStatuses.hash;
                    viVar.E0[i10] = tL_emojiStatuses.statuses;
                    viVar.getMessagesStorage().f16331a.c(new o7(viVar, i10, tL_emojiStatuses, 8));
                    i0.g3(new fg(viVar, 1));
                    return;
                } else {
                    return;
                }
            case 1:
                i0.g3(new dg(this.f17603b, tL_error, tLObject, this.f17604c, 0));
                return;
            case 2:
                if (tLObject instanceof TLRPC.TL_messages_savedGifs) {
                    arrayList = ((TLRPC.TL_messages_savedGifs) tLObject).gifs;
                } else {
                    arrayList = null;
                }
                this.f17603b.y1(this.f17604c, arrayList, true, 0, true);
                return;
            default:
                int i11 = this.f17604c;
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
                this.f17603b.y1(i11, arrayList2, false, 0, true);
                return;
        }
    }
}
