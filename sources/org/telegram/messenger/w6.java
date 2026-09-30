package org.telegram.messenger;
public final class w6 implements Runnable {
    public final int f18021a;
    public final MediaDataController f18022b;
    public final String f18023c;

    public w6(MediaDataController mediaDataController, String str, int i10) {
        this.f18021a = i10;
        this.f18022b = mediaDataController;
        this.f18023c = str;
    }

    @Override
    public final void run() {
        switch (this.f18021a) {
            case 0:
                this.f18022b.lambda$fetchNewEmojiKeywords$208(this.f18023c);
                return;
            case 1:
                this.f18022b.lambda$fetchNewEmojiKeywords$210(this.f18023c);
                return;
            case 2:
                this.f18022b.lambda$fetchNewEmojiKeywords$212(this.f18023c);
                return;
            case 3:
                this.f18022b.lambda$fetchNewEmojiKeywords$209(this.f18023c);
                return;
            case 4:
                this.f18022b.lambda$fetchNewEmojiKeywords$214(this.f18023c);
                return;
            case 5:
                this.f18022b.lambda$putEmojiKeywords$215(this.f18023c);
                return;
            default:
                this.f18022b.lambda$processLoadedDiceStickers$86(this.f18023c);
                return;
        }
    }
}
