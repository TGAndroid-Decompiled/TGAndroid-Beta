package org.telegram.messenger;
public final class y7 implements Runnable {
    public final int f22216a;
    public final MediaDataController f22217b;
    public final String f22218c;

    public y7(MediaDataController mediaDataController, String str, int i9) {
        this.f22216a = i9;
        this.f22217b = mediaDataController;
        this.f22218c = str;
    }

    @Override
    public final void run() {
        switch (this.f22216a) {
            case 0:
                this.f22217b.lambda$fetchNewEmojiKeywords$207(this.f22218c);
                return;
            case 1:
                this.f22217b.lambda$putEmojiKeywords$214(this.f22218c);
                return;
            case 2:
                this.f22217b.lambda$fetchNewEmojiKeywords$208(this.f22218c);
                return;
            case 3:
                this.f22217b.lambda$fetchNewEmojiKeywords$213(this.f22218c);
                return;
            case 4:
                this.f22217b.lambda$processLoadedDiceStickers$86(this.f22218c);
                return;
            case 5:
                this.f22217b.lambda$fetchNewEmojiKeywords$209(this.f22218c);
                return;
            default:
                this.f22217b.lambda$fetchNewEmojiKeywords$211(this.f22218c);
                return;
        }
    }
}
