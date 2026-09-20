package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class a2 implements Runnable {
    public final int f15854a;
    public final DownloadController f15855b;
    public final TLRPC.Document f15856c;
    public final MessageObject d;

    public a2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f15854a = i10;
        this.f15855b = downloadController;
        this.f15856c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f15854a) {
            case 0:
                this.f15855b.lambda$onDownloadComplete$7(this.f15856c, this.d);
                return;
            default:
                this.f15855b.lambda$startDownloadFile$5(this.f15856c, this.d);
                return;
        }
    }
}
