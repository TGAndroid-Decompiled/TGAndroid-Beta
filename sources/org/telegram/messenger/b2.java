package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class b2 implements Runnable {
    public final int f17422a;
    public final DownloadController f17423b;
    public final TLRPC.Document f17424c;
    public final MessageObject d;

    public b2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f17422a = i10;
        this.f17423b = downloadController;
        this.f17424c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f17422a) {
            case 0:
                this.f17423b.lambda$onDownloadComplete$7(this.f17424c, this.d);
                return;
            default:
                this.f17423b.lambda$startDownloadFile$5(this.f17424c, this.d);
                return;
        }
    }
}
