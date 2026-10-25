package org.telegram.messenger;
public final class f7 implements Runnable {
    public final int f20063a;
    public final MediaDataController f20064b;
    public final String f20065c;

    public f7(MediaDataController mediaDataController, String str, int i10) {
        this.f20063a = i10;
        this.f20064b = mediaDataController;
        this.f20065c = str;
    }

    @Override
    public final void run() {
        switch (this.f20063a) {
            case 0:
                this.f20064b.lambda$fetchNewEmojiKeywords$208(this.f20065c);
                return;
            case 1:
                this.f20064b.lambda$fetchNewEmojiKeywords$210(this.f20065c);
                return;
            case 2:
                this.f20064b.lambda$fetchNewEmojiKeywords$212(this.f20065c);
                return;
            case 3:
                this.f20064b.lambda$fetchNewEmojiKeywords$209(this.f20065c);
                return;
            case 4:
                this.f20064b.lambda$fetchNewEmojiKeywords$214(this.f20065c);
                return;
            case 5:
                this.f20064b.lambda$putEmojiKeywords$215(this.f20065c);
                return;
            default:
                this.f20064b.lambda$processLoadedDiceStickers$86(this.f20065c);
                return;
        }
    }
}
