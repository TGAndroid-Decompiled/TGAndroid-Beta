package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class rl implements Runnable {
    public final int f19450a = 0;
    public final String f19451b;
    public final Object f19452c;
    public final Object d;

    public rl(String str, String str2, byte[] bArr) {
        this.f19451b = str;
        this.f19452c = str2;
        this.d = bArr;
    }

    @Override
    public final void run() {
        switch (this.f19450a) {
            case 0:
                WearAuthListenerService.a(this.f19451b, (String) this.f19452c, (byte[]) this.d);
                return;
            default:
                ((MediaDataController) this.f19452c).lambda$putEmojiKeywords$216((TLRPC.TL_emojiKeywordsDifference) this.d, this.f19451b);
                return;
        }
    }

    public rl(MediaDataController mediaDataController, TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference, String str) {
        this.f19452c = mediaDataController;
        this.d = tL_emojiKeywordsDifference;
        this.f19451b = str;
    }
}
