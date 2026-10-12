package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class e2 implements Runnable {
    public final int f17470a;
    public final DownloadController f17471b;
    public final TLRPC.Document f17472c;
    public final MessageObject d;

    public e2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f17470a = i10;
        this.f17471b = downloadController;
        this.f17472c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f17470a) {
            case 0:
                this.f17471b.lambda$onDownloadComplete$7(this.f17472c, this.d);
                return;
            default:
                this.f17471b.lambda$startDownloadFile$5(this.f17472c, this.d);
                return;
        }
    }
}
