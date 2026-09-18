package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class r7 implements Runnable {
    public final int f17392a;
    public final Utilities.Callback f17393b;

    public r7(int i10, Utilities.Callback callback) {
        this.f17392a = i10;
        this.f17393b = callback;
    }

    @Override
    public final void run() {
        switch (this.f17392a) {
            case 0:
                MediaDataController.lambda$loadStickers$98(this.f17393b);
                return;
            case 1:
                MediaDataController.lambda$loadStickers$99(this.f17393b);
                return;
            case 2:
                MediaDataController.lambda$loadBotInfo$198(this.f17393b);
                return;
            case 3:
                MediaDataController.lambda$loadStickers$94(this.f17393b);
                return;
            case 4:
                MediaDataController.lambda$loadStickers$95(this.f17393b);
                return;
            case 5:
                MediaDataController.lambda$loadStickers$96(this.f17393b);
                return;
            case 6:
                this.f17393b.run(null);
                return;
            case 7:
                MessagesController.lambda$addUserToChat$301(this.f17393b);
                return;
            case 8:
                MessagesController.lambda$addUserToChat$305(this.f17393b);
                return;
            case 9:
                this.f17393b.run(null);
                return;
            default:
                ShortcutResultReceiver.a(this.f17393b);
                return;
        }
    }
}
