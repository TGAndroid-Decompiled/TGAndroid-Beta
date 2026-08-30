package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class c2 implements Runnable {
    public final int f16897a;
    public final DownloadController f16898b;
    public final TLRPC.Document f16899c;
    public final MessageObject d;

    public c2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f16897a = i10;
        this.f16898b = downloadController;
        this.f16899c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f16897a) {
            case 0:
                this.f16898b.lambda$onDownloadComplete$7(this.f16899c, this.d);
                return;
            default:
                this.f16898b.lambda$startDownloadFile$5(this.f16899c, this.d);
                return;
        }
    }
}
