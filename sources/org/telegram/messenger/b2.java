package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class b2 implements Runnable {
    public final int f15691a;
    public final DownloadController f15692b;
    public final TLRPC.Document f15693c;
    public final MessageObject d;

    public b2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f15691a = i10;
        this.f15692b = downloadController;
        this.f15693c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f15691a) {
            case 0:
                this.f15692b.lambda$onDownloadComplete$7(this.f15693c, this.d);
                return;
            default:
                this.f15692b.lambda$startDownloadFile$5(this.f15693c, this.d);
                return;
        }
    }
}
