package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class a2 implements Runnable {
    public final int f15637a;
    public final DownloadController f15638b;
    public final TLRPC.Document f15639c;
    public final MessageObject d;

    public a2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f15637a = i10;
        this.f15638b = downloadController;
        this.f15639c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f15637a) {
            case 0:
                this.f15638b.lambda$onDownloadComplete$7(this.f15639c, this.d);
                return;
            default:
                this.f15638b.lambda$startDownloadFile$5(this.f15639c, this.d);
                return;
        }
    }
}
