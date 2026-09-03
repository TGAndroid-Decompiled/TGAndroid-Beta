package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class c2 implements Runnable {
    public final int f18317a;
    public final DownloadController f18318b;
    public final TLRPC.Document f18319c;
    public final MessageObject d;

    public c2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f18317a = i10;
        this.f18318b = downloadController;
        this.f18319c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f18317a) {
            case 0:
                this.f18318b.lambda$onDownloadComplete$7(this.f18319c, this.d);
                return;
            default:
                this.f18318b.lambda$startDownloadFile$5(this.f18319c, this.d);
                return;
        }
    }
}
