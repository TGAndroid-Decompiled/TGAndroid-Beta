package org.telegram.messenger;
public final class g7 implements Runnable {
    public final int f20147a;
    public final MediaDataController f20148b;
    public final String f20149c;

    public g7(MediaDataController mediaDataController, String str, int i10) {
        this.f20147a = i10;
        this.f20148b = mediaDataController;
        this.f20149c = str;
    }

    @Override
    public final void run() {
        switch (this.f20147a) {
            case 0:
                this.f20148b.lambda$fetchNewEmojiKeywords$208(this.f20149c);
                return;
            case 1:
                this.f20148b.lambda$fetchNewEmojiKeywords$210(this.f20149c);
                return;
            case 2:
                this.f20148b.lambda$fetchNewEmojiKeywords$212(this.f20149c);
                return;
            case 3:
                this.f20148b.lambda$fetchNewEmojiKeywords$209(this.f20149c);
                return;
            case 4:
                this.f20148b.lambda$fetchNewEmojiKeywords$214(this.f20149c);
                return;
            case 5:
                this.f20148b.lambda$putEmojiKeywords$215(this.f20149c);
                return;
            default:
                this.f20148b.lambda$processLoadedDiceStickers$86(this.f20149c);
                return;
        }
    }
}
