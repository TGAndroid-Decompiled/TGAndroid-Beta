package org.telegram.messenger;
public final class e7 implements Runnable {
    public final int f18311a;
    public final MediaDataController f18312b;
    public final String f18313c;

    public e7(MediaDataController mediaDataController, String str, int i10) {
        this.f18311a = i10;
        this.f18312b = mediaDataController;
        this.f18313c = str;
    }

    @Override
    public final void run() {
        switch (this.f18311a) {
            case 0:
                this.f18312b.lambda$fetchNewEmojiKeywords$208(this.f18313c);
                return;
            case 1:
                this.f18312b.lambda$fetchNewEmojiKeywords$210(this.f18313c);
                return;
            case 2:
                this.f18312b.lambda$fetchNewEmojiKeywords$212(this.f18313c);
                return;
            case 3:
                this.f18312b.lambda$fetchNewEmojiKeywords$209(this.f18313c);
                return;
            case 4:
                this.f18312b.lambda$fetchNewEmojiKeywords$214(this.f18313c);
                return;
            case 5:
                this.f18312b.lambda$putEmojiKeywords$215(this.f18313c);
                return;
            default:
                this.f18312b.lambda$processLoadedDiceStickers$86(this.f18313c);
                return;
        }
    }
}
