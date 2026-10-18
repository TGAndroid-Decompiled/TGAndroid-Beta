package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sl implements Runnable {
    public final int f19528a = 0;
    public final String f19529b;
    public final Object f19530c;
    public final Object d;

    public sl(String str, String str2, byte[] bArr) {
        this.f19529b = str;
        this.f19530c = str2;
        this.d = bArr;
    }

    @Override
    public final void run() {
        switch (this.f19528a) {
            case 0:
                WearAuthListenerService.a(this.f19529b, (String) this.f19530c, (byte[]) this.d);
                return;
            default:
                ((MediaDataController) this.f19530c).lambda$putEmojiKeywords$216((TLRPC.TL_emojiKeywordsDifference) this.d, this.f19529b);
                return;
        }
    }

    public sl(MediaDataController mediaDataController, TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference, String str) {
        this.f19530c = mediaDataController;
        this.d = tL_emojiKeywordsDifference;
        this.f19529b = str;
    }
}
