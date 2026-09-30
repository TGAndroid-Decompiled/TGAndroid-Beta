package org.telegram.messenger;
public final class w6 implements Runnable {
    public final int f18006a;
    public final MediaDataController f18007b;
    public final String f18008c;

    public w6(MediaDataController mediaDataController, String str, int i10) {
        this.f18006a = i10;
        this.f18007b = mediaDataController;
        this.f18008c = str;
    }

    @Override
    public final void run() {
        switch (this.f18006a) {
            case 0:
                this.f18007b.lambda$fetchNewEmojiKeywords$208(this.f18008c);
                return;
            case 1:
                this.f18007b.lambda$fetchNewEmojiKeywords$210(this.f18008c);
                return;
            case 2:
                this.f18007b.lambda$fetchNewEmojiKeywords$212(this.f18008c);
                return;
            case 3:
                this.f18007b.lambda$fetchNewEmojiKeywords$209(this.f18008c);
                return;
            case 4:
                this.f18007b.lambda$fetchNewEmojiKeywords$214(this.f18008c);
                return;
            case 5:
                this.f18007b.lambda$putEmojiKeywords$215(this.f18008c);
                return;
            default:
                this.f18007b.lambda$processLoadedDiceStickers$86(this.f18008c);
                return;
        }
    }
}
