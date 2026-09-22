package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class a2 implements Runnable {
    public final int f15869a;
    public final DownloadController f15870b;
    public final TLRPC.Document f15871c;
    public final MessageObject d;

    public a2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f15869a = i10;
        this.f15870b = downloadController;
        this.f15871c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f15869a) {
            case 0:
                this.f15870b.lambda$onDownloadComplete$7(this.f15871c, this.d);
                return;
            default:
                this.f15870b.lambda$startDownloadFile$5(this.f15871c, this.d);
                return;
        }
    }
}
