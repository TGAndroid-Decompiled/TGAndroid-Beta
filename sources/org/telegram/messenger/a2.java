package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class a2 implements Runnable {
    public final int f15633a;
    public final DownloadController f15634b;
    public final TLRPC.Document f15635c;
    public final MessageObject d;

    public a2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f15633a = i10;
        this.f15634b = downloadController;
        this.f15635c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f15633a) {
            case 0:
                this.f15634b.lambda$onDownloadComplete$7(this.f15635c, this.d);
                return;
            default:
                this.f15634b.lambda$startDownloadFile$5(this.f15635c, this.d);
                return;
        }
    }
}
