package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class vl implements Runnable {
    public final int f17839a = 0;
    public final String f17840b;
    public final Object f17841c;
    public final Object d;

    public vl(String str, String str2, byte[] bArr) {
        this.f17840b = str;
        this.f17841c = str2;
        this.d = bArr;
    }

    @Override
    public final void run() {
        switch (this.f17839a) {
            case 0:
                WearAuthListenerService.a(this.f17840b, (String) this.f17841c, (byte[]) this.d);
                return;
            default:
                ((MediaDataController) this.f17841c).lambda$putEmojiKeywords$215((TLRPC.TL_emojiKeywordsDifference) this.d, this.f17840b);
                return;
        }
    }

    public vl(MediaDataController mediaDataController, TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference, String str) {
        this.f17841c = mediaDataController;
        this.d = tL_emojiKeywordsDifference;
        this.f17840b = str;
    }
}
