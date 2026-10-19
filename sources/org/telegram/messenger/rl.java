package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class rl implements Runnable {
    public final int f19448a = 0;
    public final String f19449b;
    public final Object f19450c;
    public final Object d;

    public rl(String str, String str2, byte[] bArr) {
        this.f19449b = str;
        this.f19450c = str2;
        this.d = bArr;
    }

    @Override
    public final void run() {
        switch (this.f19448a) {
            case 0:
                WearAuthListenerService.a(this.f19449b, (String) this.f19450c, (byte[]) this.d);
                return;
            default:
                ((MediaDataController) this.f19450c).lambda$putEmojiKeywords$216((TLRPC.TL_emojiKeywordsDifference) this.d, this.f19449b);
                return;
        }
    }

    public rl(MediaDataController mediaDataController, TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference, String str) {
        this.f19450c = mediaDataController;
        this.d = tL_emojiKeywordsDifference;
        this.f19449b = str;
    }
}
