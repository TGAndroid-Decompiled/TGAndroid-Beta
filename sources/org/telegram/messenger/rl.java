package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class rl implements Runnable {
    public final int f19451a = 0;
    public final String f19452b;
    public final Object f19453c;
    public final Object d;

    public rl(String str, String str2, byte[] bArr) {
        this.f19452b = str;
        this.f19453c = str2;
        this.d = bArr;
    }

    @Override
    public final void run() {
        switch (this.f19451a) {
            case 0:
                WearAuthListenerService.a(this.f19452b, (String) this.f19453c, (byte[]) this.d);
                return;
            default:
                ((MediaDataController) this.f19453c).lambda$putEmojiKeywords$216((TLRPC.TL_emojiKeywordsDifference) this.d, this.f19452b);
                return;
        }
    }

    public rl(MediaDataController mediaDataController, TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference, String str) {
        this.f19453c = mediaDataController;
        this.d = tL_emojiKeywordsDifference;
        this.f19452b = str;
    }
}
