package org.telegram.messenger;

public final class ImageLoader$5$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId = 0;
    public final int f$0;
    public final Object f$1;
    public final boolean f$2;

    public ImageLoader$5$$ExternalSyntheticLambda0(int i, String str, boolean z) {
        this.f$0 = i;
        this.f$1 = str;
        this.f$2 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ImageLoader.AnonymousClass5.lambda$fileDidFailedUpload$3(this.f$0, (String) this.f$1, this.f$2);
                break;
            default:
                ((MessagesController) this.f$1).lambda$removeFolderTemporarily$479(this.f$0, this.f$2);
                break;
        }
    }

    public ImageLoader$5$$ExternalSyntheticLambda0(int i, MessagesController messagesController, boolean z) {
        this.f$1 = messagesController;
        this.f$0 = i;
        this.f$2 = z;
    }
}
