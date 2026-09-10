package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class e2 implements Runnable {
    public final int f15036a;
    public final DownloadController f15037b;
    public final TLRPC.Document f15038c;
    public final MessageObject d;

    public e2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f15036a = i10;
        this.f15037b = downloadController;
        this.f15038c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f15036a) {
            case 0:
                this.f15037b.lambda$onDownloadComplete$7(this.f15038c, this.d);
                return;
            default:
                this.f15037b.lambda$startDownloadFile$5(this.f15038c, this.d);
                return;
        }
    }
}
