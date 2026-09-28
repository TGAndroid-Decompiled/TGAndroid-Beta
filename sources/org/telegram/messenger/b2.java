package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class b2 implements Runnable {
    public final int f15944a;
    public final DownloadController f15945b;
    public final TLRPC.Document f15946c;
    public final MessageObject d;

    public b2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f15944a = i10;
        this.f15945b = downloadController;
        this.f15946c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f15944a) {
            case 0:
                this.f15945b.lambda$onDownloadComplete$7(this.f15946c, this.d);
                return;
            default:
                this.f15945b.lambda$startDownloadFile$5(this.f15946c, this.d);
                return;
        }
    }
}
