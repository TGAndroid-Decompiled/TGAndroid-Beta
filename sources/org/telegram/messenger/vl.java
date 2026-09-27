package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class vl implements Runnable {
    public final int f17848a = 0;
    public final String f17849b;
    public final Object f17850c;
    public final Object d;

    public vl(String str, String str2, byte[] bArr) {
        this.f17849b = str;
        this.f17850c = str2;
        this.d = bArr;
    }

    @Override
    public final void run() {
        switch (this.f17848a) {
            case 0:
                WearAuthListenerService.a(this.f17849b, (String) this.f17850c, (byte[]) this.d);
                return;
            default:
                ((MediaDataController) this.f17850c).lambda$putEmojiKeywords$215((TLRPC.TL_emojiKeywordsDifference) this.d, this.f17849b);
                return;
        }
    }

    public vl(MediaDataController mediaDataController, TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference, String str) {
        this.f17850c = mediaDataController;
        this.d = tL_emojiKeywordsDifference;
        this.f17849b = str;
    }
}
