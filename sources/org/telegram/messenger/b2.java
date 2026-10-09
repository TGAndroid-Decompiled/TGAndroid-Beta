package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class b2 implements Runnable {
    public final int f17389a;
    public final DownloadController f17390b;
    public final TLRPC.Document f17391c;
    public final MessageObject d;

    public b2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f17389a = i10;
        this.f17390b = downloadController;
        this.f17391c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f17389a) {
            case 0:
                this.f17390b.lambda$onDownloadComplete$7(this.f17391c, this.d);
                return;
            default:
                this.f17390b.lambda$startDownloadFile$5(this.f17391c, this.d);
                return;
        }
    }
}
