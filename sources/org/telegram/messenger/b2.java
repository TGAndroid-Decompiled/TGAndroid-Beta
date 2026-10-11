package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class b2 implements Runnable {
    public final int f17386a;
    public final DownloadController f17387b;
    public final TLRPC.Document f17388c;
    public final MessageObject d;

    public b2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f17386a = i10;
        this.f17387b = downloadController;
        this.f17388c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f17386a) {
            case 0:
                this.f17387b.lambda$onDownloadComplete$7(this.f17388c, this.d);
                return;
            default:
                this.f17387b.lambda$startDownloadFile$5(this.f17388c, this.d);
                return;
        }
    }
}
