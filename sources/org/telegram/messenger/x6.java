package org.telegram.messenger;
public final class x6 implements Runnable {
    public final int f19805a;
    public final MediaDataController f19806b;
    public final String f19807c;

    public x6(MediaDataController mediaDataController, String str, int i10) {
        this.f19805a = i10;
        this.f19806b = mediaDataController;
        this.f19807c = str;
    }

    @Override
    public final void run() {
        switch (this.f19805a) {
            case 0:
                this.f19806b.lambda$fetchNewEmojiKeywords$208(this.f19807c);
                return;
            case 1:
                this.f19806b.lambda$fetchNewEmojiKeywords$210(this.f19807c);
                return;
            case 2:
                this.f19806b.lambda$fetchNewEmojiKeywords$212(this.f19807c);
                return;
            case 3:
                this.f19806b.lambda$fetchNewEmojiKeywords$209(this.f19807c);
                return;
            case 4:
                this.f19806b.lambda$fetchNewEmojiKeywords$214(this.f19807c);
                return;
            case 5:
                this.f19806b.lambda$putEmojiKeywords$215(this.f19807c);
                return;
            default:
                this.f19806b.lambda$processLoadedDiceStickers$86(this.f19807c);
                return;
        }
    }
}
