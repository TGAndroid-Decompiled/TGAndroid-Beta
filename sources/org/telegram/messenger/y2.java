package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class y2 implements Runnable {
    public final int f20119a;
    public final FileLoader f20120b;
    public final TLRPC.Document f20121c;
    public final boolean d;

    public y2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f20119a = i10;
        this.f20120b = fileLoader;
        this.f20121c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f20119a) {
            case 0:
                this.f20120b.lambda$setLoadingVideo$0(this.f20121c, this.d);
                return;
            default:
                this.f20120b.lambda$removeLoadingVideo$1(this.f20121c, this.d);
                return;
        }
    }
}
