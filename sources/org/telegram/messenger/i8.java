package org.telegram.messenger;
public final class i8 implements Runnable {
    public final int f15434a;
    public final MediaDataController f15435b;
    public final String f15436c;

    public i8(MediaDataController mediaDataController, String str, int i10) {
        this.f15434a = i10;
        this.f15435b = mediaDataController;
        this.f15436c = str;
    }

    @Override
    public final void run() {
        switch (this.f15434a) {
            case 0:
                this.f15435b.lambda$fetchNewEmojiKeywords$207(this.f15436c);
                return;
            case 1:
                this.f15435b.lambda$putEmojiKeywords$214(this.f15436c);
                return;
            case 2:
                this.f15435b.lambda$fetchNewEmojiKeywords$208(this.f15436c);
                return;
            case 3:
                this.f15435b.lambda$fetchNewEmojiKeywords$213(this.f15436c);
                return;
            case 4:
                this.f15435b.lambda$processLoadedDiceStickers$86(this.f15436c);
                return;
            case 5:
                this.f15435b.lambda$fetchNewEmojiKeywords$209(this.f15436c);
                return;
            default:
                this.f15435b.lambda$fetchNewEmojiKeywords$211(this.f15436c);
                return;
        }
    }
}
