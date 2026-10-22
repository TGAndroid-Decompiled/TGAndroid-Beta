package org.telegram.messenger;
public final class e7 implements Runnable {
    public final int f18247a;
    public final MediaDataController f18248b;
    public final String f18249c;

    public e7(MediaDataController mediaDataController, String str, int i10) {
        this.f18247a = i10;
        this.f18248b = mediaDataController;
        this.f18249c = str;
    }

    @Override
    public final void run() {
        switch (this.f18247a) {
            case 0:
                this.f18248b.lambda$fetchNewEmojiKeywords$208(this.f18249c);
                return;
            case 1:
                this.f18248b.lambda$fetchNewEmojiKeywords$210(this.f18249c);
                return;
            case 2:
                this.f18248b.lambda$fetchNewEmojiKeywords$212(this.f18249c);
                return;
            case 3:
                this.f18248b.lambda$fetchNewEmojiKeywords$209(this.f18249c);
                return;
            case 4:
                this.f18248b.lambda$fetchNewEmojiKeywords$214(this.f18249c);
                return;
            case 5:
                this.f18248b.lambda$putEmojiKeywords$215(this.f18249c);
                return;
            default:
                this.f18248b.lambda$processLoadedDiceStickers$86(this.f18249c);
                return;
        }
    }
}
