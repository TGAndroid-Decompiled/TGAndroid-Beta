package org.telegram.messenger;

public final class r7 implements Runnable {

    public final int f21413a;

    public final Utilities.Callback f21414b;

    public r7(int i10, Utilities.Callback callback) {
        this.f21413a = i10;
        this.f21414b = callback;
    }

    @Override
    public final void run() {
        switch (this.f21413a) {
            case 0:
                MediaDataController.lambda$loadStickers$98(this.f21414b);
                break;
            case 1:
                MediaDataController.lambda$loadStickers$99(this.f21414b);
                break;
            case 2:
                MediaDataController.lambda$loadBotInfo$198(this.f21414b);
                break;
            case 3:
                MediaDataController.lambda$loadStickers$94(this.f21414b);
                break;
            case 4:
                MediaDataController.lambda$loadStickers$95(this.f21414b);
                break;
            case 5:
                MediaDataController.lambda$loadStickers$96(this.f21414b);
                break;
            case 6:
                this.f21414b.run(null);
                break;
            case 7:
                MessagesController.lambda$addUserToChat$301(this.f21414b);
                break;
            case 8:
                MessagesController.lambda$addUserToChat$305(this.f21414b);
                break;
            case 9:
                this.f21414b.run(null);
                break;
            default:
                ShortcutResultReceiver.lambda$onReceive$0(this.f21414b);
                break;
        }
    }
}
