package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sl implements Runnable {
    public final int f19531a = 0;
    public final String f19532b;
    public final Object f19533c;
    public final Object d;

    public sl(String str, String str2, byte[] bArr) {
        this.f19532b = str;
        this.f19533c = str2;
        this.d = bArr;
    }

    @Override
    public final void run() {
        switch (this.f19531a) {
            case 0:
                WearAuthListenerService.a(this.f19532b, (String) this.f19533c, (byte[]) this.d);
                return;
            default:
                ((MediaDataController) this.f19533c).lambda$putEmojiKeywords$216((TLRPC.TL_emojiKeywordsDifference) this.d, this.f19532b);
                return;
        }
    }

    public sl(MediaDataController mediaDataController, TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference, String str) {
        this.f19533c = mediaDataController;
        this.d = tL_emojiKeywordsDifference;
        this.f19532b = str;
    }
}
