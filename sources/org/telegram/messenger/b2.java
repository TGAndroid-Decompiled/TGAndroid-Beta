package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class b2 implements Runnable {
    public final int f17383a;
    public final DownloadController f17384b;
    public final TLRPC.Document f17385c;
    public final MessageObject d;

    public b2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f17383a = i10;
        this.f17384b = downloadController;
        this.f17385c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f17383a) {
            case 0:
                this.f17384b.lambda$onDownloadComplete$7(this.f17385c, this.d);
                return;
            default:
                this.f17384b.lambda$startDownloadFile$5(this.f17385c, this.d);
                return;
        }
    }
}
