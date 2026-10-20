package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class tl implements Runnable {
    public final int f19620a = 0;
    public final String f19621b;
    public final Object f19622c;
    public final Object d;

    public tl(String str, String str2, byte[] bArr) {
        this.f19621b = str;
        this.f19622c = str2;
        this.d = bArr;
    }

    @Override
    public final void run() {
        switch (this.f19620a) {
            case 0:
                WearAuthListenerService.a(this.f19621b, (String) this.f19622c, (byte[]) this.d);
                return;
            default:
                ((MediaDataController) this.f19622c).lambda$putEmojiKeywords$216((TLRPC.TL_emojiKeywordsDifference) this.d, this.f19621b);
                return;
        }
    }

    public tl(MediaDataController mediaDataController, TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference, String str) {
        this.f19622c = mediaDataController;
        this.d = tL_emojiKeywordsDifference;
        this.f19621b = str;
    }
}
