package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class vl implements Runnable {
    public final int f17854a = 0;
    public final String f17855b;
    public final Object f17856c;
    public final Object d;

    public vl(String str, String str2, byte[] bArr) {
        this.f17855b = str;
        this.f17856c = str2;
        this.d = bArr;
    }

    @Override
    public final void run() {
        switch (this.f17854a) {
            case 0:
                WearAuthListenerService.a(this.f17855b, (String) this.f17856c, (byte[]) this.d);
                return;
            default:
                ((MediaDataController) this.f17856c).lambda$putEmojiKeywords$215((TLRPC.TL_emojiKeywordsDifference) this.d, this.f17855b);
                return;
        }
    }

    public vl(MediaDataController mediaDataController, TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference, String str) {
        this.f17856c = mediaDataController;
        this.d = tL_emojiKeywordsDifference;
        this.f17855b = str;
    }
}
