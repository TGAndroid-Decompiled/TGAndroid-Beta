package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class b2 implements Runnable {
    public final int f17378a;
    public final DownloadController f17379b;
    public final TLRPC.Document f17380c;
    public final MessageObject d;

    public b2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f17378a = i10;
        this.f17379b = downloadController;
        this.f17380c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f17378a) {
            case 0:
                this.f17379b.lambda$onDownloadComplete$7(this.f17380c, this.d);
                return;
            default:
                this.f17379b.lambda$startDownloadFile$5(this.f17380c, this.d);
                return;
        }
    }
}
