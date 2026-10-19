package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class y2 implements Runnable {
    public final int f20118a;
    public final FileLoader f20119b;
    public final TLRPC.Document f20120c;
    public final boolean d;

    public y2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f20118a = i10;
        this.f20119b = fileLoader;
        this.f20120c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f20118a) {
            case 0:
                this.f20119b.lambda$setLoadingVideo$0(this.f20120c, this.d);
                return;
            default:
                this.f20119b.lambda$removeLoadingVideo$1(this.f20120c, this.d);
                return;
        }
    }
}
