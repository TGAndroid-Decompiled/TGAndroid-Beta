package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class wl implements Runnable {
    public final int f17810a = 0;
    public final String f17811b;
    public final Object f17812c;
    public final Object d;

    public wl(String str, String str2, byte[] bArr) {
        this.f17811b = str;
        this.f17812c = str2;
        this.d = bArr;
    }

    @Override
    public final void run() {
        switch (this.f17810a) {
            case 0:
                WearAuthListenerService.a(this.f17811b, (String) this.f17812c, (byte[]) this.d);
                return;
            default:
                ((MediaDataController) this.f17812c).lambda$putEmojiKeywords$215((TLRPC.TL_emojiKeywordsDifference) this.d, this.f17811b);
                return;
        }
    }

    public wl(MediaDataController mediaDataController, TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference, String str) {
        this.f17812c = mediaDataController;
        this.d = tL_emojiKeywordsDifference;
        this.f17811b = str;
    }
}
