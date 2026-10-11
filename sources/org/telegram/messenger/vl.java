package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class vl implements Runnable {
    public final int f19515a = 0;
    public final String f19516b;
    public final Object f19517c;
    public final Object d;

    public vl(String str, String str2, byte[] bArr) {
        this.f19516b = str;
        this.f19517c = str2;
        this.d = bArr;
    }

    @Override
    public final void run() {
        switch (this.f19515a) {
            case 0:
                WearAuthListenerService.a(this.f19516b, (String) this.f19517c, (byte[]) this.d);
                return;
            default:
                ((MediaDataController) this.f19517c).lambda$putEmojiKeywords$216((TLRPC.TL_emojiKeywordsDifference) this.d, this.f19516b);
                return;
        }
    }

    public vl(MediaDataController mediaDataController, TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference, String str) {
        this.f19517c = mediaDataController;
        this.d = tL_emojiKeywordsDifference;
        this.f19516b = str;
    }
}
