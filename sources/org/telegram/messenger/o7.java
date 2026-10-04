package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class o7 implements Runnable {
    public final int f18755a;
    public final Utilities.Callback f18756b;

    public o7(int i10, Utilities.Callback callback) {
        this.f18755a = i10;
        this.f18756b = callback;
    }

    @Override
    public final void run() {
        switch (this.f18755a) {
            case 0:
                MediaDataController.lambda$loadStickers$98(this.f18756b);
                return;
            case 1:
                MediaDataController.lambda$loadStickers$99(this.f18756b);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$94(this.f18756b);
                return;
            case 3:
                MediaDataController.lambda$loadStickers$95(this.f18756b);
                return;
            case 4:
                MediaDataController.lambda$loadStickers$96(this.f18756b);
                return;
            case 5:
                MediaDataController.lambda$loadBotInfo$199(this.f18756b);
                return;
            case 6:
                this.f18756b.run(null);
                return;
            case 7:
                MessagesController.lambda$addUserToChat$301(this.f18756b);
                return;
            case 8:
                MessagesController.lambda$addUserToChat$305(this.f18756b);
                return;
            case 9:
                this.f18756b.run(null);
                return;
            default:
                ShortcutResultReceiver.a(this.f18756b);
                return;
        }
    }
}
