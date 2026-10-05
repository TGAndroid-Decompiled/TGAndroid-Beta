package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class b2 implements Runnable {
    public final int f17388a;
    public final DownloadController f17389b;
    public final TLRPC.Document f17390c;
    public final MessageObject d;

    public b2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f17388a = i10;
        this.f17389b = downloadController;
        this.f17390c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f17388a) {
            case 0:
                this.f17389b.lambda$onDownloadComplete$7(this.f17390c, this.d);
                return;
            default:
                this.f17389b.lambda$startDownloadFile$5(this.f17390c, this.d);
                return;
        }
    }
}
