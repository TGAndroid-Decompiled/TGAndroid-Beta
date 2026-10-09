package org.telegram.messenger;
public final class x6 implements Runnable {
    public final int f19772a;
    public final MediaDataController f19773b;
    public final String f19774c;

    public x6(MediaDataController mediaDataController, String str, int i10) {
        this.f19772a = i10;
        this.f19773b = mediaDataController;
        this.f19774c = str;
    }

    @Override
    public final void run() {
        switch (this.f19772a) {
            case 0:
                this.f19773b.lambda$fetchNewEmojiKeywords$208(this.f19774c);
                return;
            case 1:
                this.f19773b.lambda$fetchNewEmojiKeywords$210(this.f19774c);
                return;
            case 2:
                this.f19773b.lambda$fetchNewEmojiKeywords$212(this.f19774c);
                return;
            case 3:
                this.f19773b.lambda$fetchNewEmojiKeywords$209(this.f19774c);
                return;
            case 4:
                this.f19773b.lambda$fetchNewEmojiKeywords$214(this.f19774c);
                return;
            case 5:
                this.f19773b.lambda$putEmojiKeywords$215(this.f19774c);
                return;
            default:
                this.f19773b.lambda$processLoadedDiceStickers$86(this.f19774c);
                return;
        }
    }
}
