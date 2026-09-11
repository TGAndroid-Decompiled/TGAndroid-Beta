package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class a2 implements Runnable {
    public final int f17115a;
    public final DownloadController f17116b;
    public final TLRPC.Document f17117c;
    public final MessageObject d;

    public a2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f17115a = i10;
        this.f17116b = downloadController;
        this.f17117c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f17115a) {
            case 0:
                this.f17116b.lambda$onDownloadComplete$7(this.f17117c, this.d);
                return;
            default:
                this.f17116b.lambda$startDownloadFile$5(this.f17117c, this.d);
                return;
        }
    }
}
