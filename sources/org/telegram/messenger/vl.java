package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class vl implements Runnable {
    public final int f19551a = 0;
    public final String f19552b;
    public final Object f19553c;
    public final Object d;

    public vl(String str, String str2, byte[] bArr) {
        this.f19552b = str;
        this.f19553c = str2;
        this.d = bArr;
    }

    @Override
    public final void run() {
        switch (this.f19551a) {
            case 0:
                WearAuthListenerService.a(this.f19552b, (String) this.f19553c, (byte[]) this.d);
                return;
            default:
                ((MediaDataController) this.f19553c).lambda$putEmojiKeywords$216((TLRPC.TL_emojiKeywordsDifference) this.d, this.f19552b);
                return;
        }
    }

    public vl(MediaDataController mediaDataController, TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference, String str) {
        this.f19553c = mediaDataController;
        this.d = tL_emojiKeywordsDifference;
        this.f19552b = str;
    }
}
