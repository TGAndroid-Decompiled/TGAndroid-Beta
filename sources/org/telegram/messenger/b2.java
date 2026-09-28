package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class b2 implements Runnable {
    public final int f15943a;
    public final DownloadController f15944b;
    public final TLRPC.Document f15945c;
    public final MessageObject d;

    public b2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f15943a = i10;
        this.f15944b = downloadController;
        this.f15945c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f15943a) {
            case 0:
                this.f15944b.lambda$onDownloadComplete$7(this.f15945c, this.d);
                return;
            default:
                this.f15944b.lambda$startDownloadFile$5(this.f15945c, this.d);
                return;
        }
    }
}
