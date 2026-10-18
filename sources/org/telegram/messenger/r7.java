package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class r7 implements Runnable {
    public final int f19403a;
    public final Utilities.Callback f19404b;

    public r7(int i10, Utilities.Callback callback) {
        this.f19403a = i10;
        this.f19404b = callback;
    }

    @Override
    public final void run() {
        switch (this.f19403a) {
            case 0:
                MediaDataController.lambda$loadStickers$98(this.f19404b);
                return;
            case 1:
                MediaDataController.lambda$loadStickers$99(this.f19404b);
                return;
            case 2:
                MediaDataController.lambda$loadStickers$94(this.f19404b);
                return;
            case 3:
                MediaDataController.lambda$loadStickers$95(this.f19404b);
                return;
            case 4:
                MediaDataController.lambda$loadStickers$96(this.f19404b);
                return;
            case 5:
                MediaDataController.lambda$loadBotInfo$199(this.f19404b);
                return;
            case 6:
                this.f19404b.run(null);
                return;
            case 7:
                MessagesController.lambda$addUserToChat$300(this.f19404b);
                return;
            case 8:
                MessagesController.lambda$addUserToChat$304(this.f19404b);
                return;
            case 9:
                this.f19404b.run(null);
                return;
            default:
                ShortcutResultReceiver.a(this.f19404b);
                return;
        }
    }
}
