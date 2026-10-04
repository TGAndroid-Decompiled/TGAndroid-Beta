package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class b2 implements Runnable {
    public final int f17377a;
    public final DownloadController f17378b;
    public final TLRPC.Document f17379c;
    public final MessageObject d;

    public b2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f17377a = i10;
        this.f17378b = downloadController;
        this.f17379c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f17377a) {
            case 0:
                this.f17378b.lambda$onDownloadComplete$7(this.f17379c, this.d);
                return;
            default:
                this.f17378b.lambda$startDownloadFile$5(this.f17379c, this.d);
                return;
        }
    }
}
