package org.telegram.messenger;

public final class b8 implements Runnable {

    public final int f19777a;

    public final MediaDataController f19778b;

    public final String f19779c;

    public b8(MediaDataController mediaDataController, String str, int i10) {
        this.f19777a = i10;
        this.f19778b = mediaDataController;
        this.f19779c = str;
    }

    @Override
    public final void run() {
        switch (this.f19777a) {
            case 0:
                this.f19778b.lambda$fetchNewEmojiKeywords$207(this.f19779c);
                break;
            case 1:
                this.f19778b.lambda$putEmojiKeywords$214(this.f19779c);
                break;
            case 2:
                this.f19778b.lambda$fetchNewEmojiKeywords$208(this.f19779c);
                break;
            case 3:
                this.f19778b.lambda$fetchNewEmojiKeywords$213(this.f19779c);
                break;
            case 4:
                this.f19778b.lambda$processLoadedDiceStickers$86(this.f19779c);
                break;
            case 5:
                this.f19778b.lambda$fetchNewEmojiKeywords$209(this.f19779c);
                break;
            default:
                this.f19778b.lambda$fetchNewEmojiKeywords$211(this.f19779c);
                break;
        }
    }
}
