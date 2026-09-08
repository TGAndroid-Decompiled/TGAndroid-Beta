package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class a2 implements Runnable {
    public final int f17142a;
    public final DownloadController f17143b;
    public final TLRPC.Document f17144c;
    public final MessageObject d;

    public a2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f17142a = i10;
        this.f17143b = downloadController;
        this.f17144c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f17142a) {
            case 0:
                this.f17143b.lambda$onDownloadComplete$7(this.f17144c, this.d);
                return;
            default:
                this.f17143b.lambda$startDownloadFile$5(this.f17144c, this.d);
                return;
        }
    }
}
