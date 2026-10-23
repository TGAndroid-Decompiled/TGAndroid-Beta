package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class e2 implements Runnable {
    public final int f18312a;
    public final DownloadController f18313b;
    public final TLRPC.Document f18314c;
    public final MessageObject d;

    public e2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f18312a = i10;
        this.f18313b = downloadController;
        this.f18314c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f18312a) {
            case 0:
                this.f18313b.lambda$onDownloadComplete$7(this.f18314c, this.d);
                return;
            default:
                this.f18313b.lambda$startDownloadFile$5(this.f18314c, this.d);
                return;
        }
    }
}
