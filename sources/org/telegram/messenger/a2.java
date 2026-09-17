package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class a2 implements Runnable {
    public final int f15646a;
    public final DownloadController f15647b;
    public final TLRPC.Document f15648c;
    public final MessageObject d;

    public a2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f15646a = i10;
        this.f15647b = downloadController;
        this.f15648c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f15646a) {
            case 0:
                this.f15647b.lambda$onDownloadComplete$7(this.f15648c, this.d);
                return;
            default:
                this.f15647b.lambda$startDownloadFile$5(this.f15648c, this.d);
                return;
        }
    }
}
