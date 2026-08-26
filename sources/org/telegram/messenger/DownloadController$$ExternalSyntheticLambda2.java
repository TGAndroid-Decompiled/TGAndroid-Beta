package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class DownloadController$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final DownloadController f$0;
    public final TLRPC.Document f$1;
    public final MessageObject f$2;

    public DownloadController$$ExternalSyntheticLambda2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i) {
        this.$r8$classId = i;
        this.f$0 = downloadController;
        this.f$1 = document;
        this.f$2 = messageObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onDownloadComplete$7(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$startDownloadFile$5(this.f$1, this.f$2);
                break;
        }
    }
}
