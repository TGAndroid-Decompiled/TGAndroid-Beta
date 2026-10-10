package org.telegram.messenger;
public final class x6 implements Runnable {
    public final int f19776a;
    public final MediaDataController f19777b;
    public final String f19778c;

    public x6(MediaDataController mediaDataController, String str, int i10) {
        this.f19776a = i10;
        this.f19777b = mediaDataController;
        this.f19778c = str;
    }

    @Override
    public final void run() {
        switch (this.f19776a) {
            case 0:
                this.f19777b.lambda$fetchNewEmojiKeywords$208(this.f19778c);
                return;
            case 1:
                this.f19777b.lambda$fetchNewEmojiKeywords$210(this.f19778c);
                return;
            case 2:
                this.f19777b.lambda$fetchNewEmojiKeywords$212(this.f19778c);
                return;
            case 3:
                this.f19777b.lambda$fetchNewEmojiKeywords$209(this.f19778c);
                return;
            case 4:
                this.f19777b.lambda$fetchNewEmojiKeywords$214(this.f19778c);
                return;
            case 5:
                this.f19777b.lambda$putEmojiKeywords$215(this.f19778c);
                return;
            default:
                this.f19777b.lambda$processLoadedDiceStickers$86(this.f19778c);
                return;
        }
    }
}
