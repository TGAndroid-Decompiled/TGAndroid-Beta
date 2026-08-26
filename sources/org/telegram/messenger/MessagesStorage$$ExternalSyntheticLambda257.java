package org.telegram.messenger;

public final class MessagesStorage$$ExternalSyntheticLambda257 implements Runnable {
    public final int $r8$classId;
    public final Utilities.Callback f$0;

    public MessagesStorage$$ExternalSyntheticLambda257(int i, Utilities.Callback callback) {
        this.$r8$classId = i;
        this.f$0 = callback;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.run(null);
                break;
            case 1:
                MediaDataController.lambda$loadStickers$98(this.f$0);
                break;
            case 2:
                MediaDataController.lambda$loadStickers$99(this.f$0);
                break;
            case 3:
                MediaDataController.lambda$loadBotInfo$198(this.f$0);
                break;
            case 4:
                MediaDataController.lambda$loadStickers$94(this.f$0);
                break;
            case 5:
                MediaDataController.lambda$loadStickers$95(this.f$0);
                break;
            case 6:
                MediaDataController.lambda$loadStickers$96(this.f$0);
                break;
            case 7:
                MessagesController.lambda$addUserToChat$305(this.f$0);
                break;
            case 8:
                MessagesController.lambda$addUserToChat$301(this.f$0);
                break;
            case 9:
                this.f$0.run(null);
                break;
            default:
                ShortcutResultReceiver.lambda$onReceive$0(this.f$0);
                break;
        }
    }
}
