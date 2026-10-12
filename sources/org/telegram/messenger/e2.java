package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class e2 implements Runnable {
    public final int f17469a;
    public final DownloadController f17470b;
    public final TLRPC.Document f17471c;
    public final MessageObject d;

    public e2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f17469a = i10;
        this.f17470b = downloadController;
        this.f17471c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f17469a) {
            case 0:
                this.f17470b.lambda$onDownloadComplete$7(this.f17471c, this.d);
                return;
            default:
                this.f17470b.lambda$startDownloadFile$5(this.f17471c, this.d);
                return;
        }
    }
}
