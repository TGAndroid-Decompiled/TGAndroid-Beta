package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class d2 implements Runnable {
    public final int f16735a;
    public final DownloadController f16736b;
    public final TLRPC.Document f16737c;
    public final MessageObject d;

    public d2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f16735a = i10;
        this.f16736b = downloadController;
        this.f16737c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f16735a) {
            case 0:
                this.f16736b.lambda$onDownloadComplete$7(this.f16737c, this.d);
                return;
            default:
                this.f16736b.lambda$startDownloadFile$5(this.f16737c, this.d);
                return;
        }
    }
}
