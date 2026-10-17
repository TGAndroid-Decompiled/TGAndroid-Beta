package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class y2 implements Runnable {
    public final int f20111a;
    public final FileLoader f20112b;
    public final TLRPC.Document f20113c;
    public final boolean d;

    public y2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f20111a = i10;
        this.f20112b = fileLoader;
        this.f20113c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f20111a) {
            case 0:
                this.f20112b.lambda$setLoadingVideo$0(this.f20113c, this.d);
                return;
            default:
                this.f20112b.lambda$removeLoadingVideo$1(this.f20113c, this.d);
                return;
        }
    }
}
