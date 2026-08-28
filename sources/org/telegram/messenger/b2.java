package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class b2 implements Runnable {
    public final int f19792a;
    public final DownloadController f19793b;
    public final TLRPC.Document f19794c;
    public final MessageObject d;

    public b2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i9) {
        this.f19792a = i9;
        this.f19793b = downloadController;
        this.f19794c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f19792a) {
            case 0:
                this.f19793b.lambda$onDownloadComplete$7(this.f19794c, this.d);
                return;
            default:
                this.f19793b.lambda$startDownloadFile$5(this.f19794c, this.d);
                return;
        }
    }
}
