package org.telegram.messenger;
public final class d7 implements Runnable {
    public final int f18238a;
    public final MediaDataController f18239b;
    public final String f18240c;

    public d7(MediaDataController mediaDataController, String str, int i10) {
        this.f18238a = i10;
        this.f18239b = mediaDataController;
        this.f18240c = str;
    }

    @Override
    public final void run() {
        switch (this.f18238a) {
            case 0:
                this.f18239b.lambda$fetchNewEmojiKeywords$208(this.f18240c);
                return;
            case 1:
                this.f18239b.lambda$fetchNewEmojiKeywords$210(this.f18240c);
                return;
            case 2:
                this.f18239b.lambda$fetchNewEmojiKeywords$212(this.f18240c);
                return;
            case 3:
                this.f18239b.lambda$fetchNewEmojiKeywords$209(this.f18240c);
                return;
            case 4:
                this.f18239b.lambda$fetchNewEmojiKeywords$214(this.f18240c);
                return;
            case 5:
                this.f18239b.lambda$putEmojiKeywords$215(this.f18240c);
                return;
            default:
                this.f18239b.lambda$processLoadedDiceStickers$86(this.f18240c);
                return;
        }
    }
}
