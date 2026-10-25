package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class f2 implements Runnable {
    public final int f20042a;
    public final DownloadController f20043b;
    public final TLRPC.Document f20044c;
    public final MessageObject d;

    public f2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f20042a = i10;
        this.f20043b = downloadController;
        this.f20044c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f20042a) {
            case 0:
                this.f20043b.lambda$onDownloadComplete$7(this.f20044c, this.d);
                return;
            default:
                this.f20043b.lambda$startDownloadFile$5(this.f20044c, this.d);
                return;
        }
    }
}
