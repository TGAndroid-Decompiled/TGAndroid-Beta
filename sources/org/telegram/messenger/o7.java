package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class o7 implements Runnable {
    public final int f21118a;
    public final Utilities.Callback f21119b;

    public o7(int i9, Utilities.Callback callback) {
        this.f21118a = i9;
        this.f21119b = callback;
    }

    @Override
    public final void run() {
        switch (this.f21118a) {
            case 0:
                MediaDataController.lambda$loadStickers$98(this.f21119b);
                return;
            case 1:
                MediaDataController.lambda$loadStickers$99(this.f21119b);
                return;
            case 2:
                MediaDataController.lambda$loadBotInfo$198(this.f21119b);
                return;
            case 3:
                MediaDataController.lambda$loadStickers$94(this.f21119b);
                return;
            case 4:
                MediaDataController.lambda$loadStickers$95(this.f21119b);
                return;
            case 5:
                MediaDataController.lambda$loadStickers$96(this.f21119b);
                return;
            case 6:
                this.f21119b.run(null);
                return;
            case 7:
                MessagesController.lambda$addUserToChat$301(this.f21119b);
                return;
            case 8:
                MessagesController.lambda$addUserToChat$305(this.f21119b);
                return;
            case 9:
                this.f21119b.run(null);
                return;
            default:
                ShortcutResultReceiver.a(this.f21119b);
                return;
        }
    }
}
