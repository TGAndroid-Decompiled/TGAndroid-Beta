package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class y2 implements Runnable {
    public final int f20113a;
    public final FileLoader f20114b;
    public final TLRPC.Document f20115c;
    public final boolean d;

    public y2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f20113a = i10;
        this.f20114b = fileLoader;
        this.f20115c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f20113a) {
            case 0:
                this.f20114b.lambda$setLoadingVideo$0(this.f20115c, this.d);
                return;
            default:
                this.f20114b.lambda$removeLoadingVideo$1(this.f20115c, this.d);
                return;
        }
    }
}
