package org.telegram.messenger;
public final class w6 implements Runnable {
    public final int f18004a;
    public final MediaDataController f18005b;
    public final String f18006c;

    public w6(MediaDataController mediaDataController, String str, int i10) {
        this.f18004a = i10;
        this.f18005b = mediaDataController;
        this.f18006c = str;
    }

    @Override
    public final void run() {
        switch (this.f18004a) {
            case 0:
                this.f18005b.lambda$fetchNewEmojiKeywords$208(this.f18006c);
                return;
            case 1:
                this.f18005b.lambda$fetchNewEmojiKeywords$210(this.f18006c);
                return;
            case 2:
                this.f18005b.lambda$fetchNewEmojiKeywords$212(this.f18006c);
                return;
            case 3:
                this.f18005b.lambda$fetchNewEmojiKeywords$209(this.f18006c);
                return;
            case 4:
                this.f18005b.lambda$fetchNewEmojiKeywords$214(this.f18006c);
                return;
            case 5:
                this.f18005b.lambda$putEmojiKeywords$215(this.f18006c);
                return;
            default:
                this.f18005b.lambda$processLoadedDiceStickers$86(this.f18006c);
                return;
        }
    }
}
