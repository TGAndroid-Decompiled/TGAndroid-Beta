package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class e2 implements Runnable {
    public final int f18234a;
    public final DownloadController f18235b;
    public final TLRPC.Document f18236c;
    public final MessageObject d;

    public e2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f18234a = i10;
        this.f18235b = downloadController;
        this.f18236c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f18234a) {
            case 0:
                this.f18235b.lambda$onDownloadComplete$7(this.f18236c, this.d);
                return;
            default:
                this.f18235b.lambda$startDownloadFile$5(this.f18236c, this.d);
                return;
        }
    }
}
