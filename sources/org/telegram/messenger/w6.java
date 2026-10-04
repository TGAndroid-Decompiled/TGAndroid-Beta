package org.telegram.messenger;
public final class w6 implements Runnable {
    public final int f19656a;
    public final MediaDataController f19657b;
    public final String f19658c;

    public w6(MediaDataController mediaDataController, String str, int i10) {
        this.f19656a = i10;
        this.f19657b = mediaDataController;
        this.f19658c = str;
    }

    @Override
    public final void run() {
        switch (this.f19656a) {
            case 0:
                this.f19657b.lambda$fetchNewEmojiKeywords$208(this.f19658c);
                return;
            case 1:
                this.f19657b.lambda$fetchNewEmojiKeywords$210(this.f19658c);
                return;
            case 2:
                this.f19657b.lambda$fetchNewEmojiKeywords$212(this.f19658c);
                return;
            case 3:
                this.f19657b.lambda$fetchNewEmojiKeywords$209(this.f19658c);
                return;
            case 4:
                this.f19657b.lambda$fetchNewEmojiKeywords$214(this.f19658c);
                return;
            case 5:
                this.f19657b.lambda$putEmojiKeywords$215(this.f19658c);
                return;
            default:
                this.f19657b.lambda$processLoadedDiceStickers$86(this.f19658c);
                return;
        }
    }
}
