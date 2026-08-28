package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class u2 implements Runnable {
    public final int f21617a;
    public final FileLoader f21618b;
    public final TLRPC.Document f21619c;
    public final boolean d;

    public u2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i9) {
        this.f21617a = i9;
        this.f21618b = fileLoader;
        this.f21619c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f21617a) {
            case 0:
                this.f21618b.lambda$setLoadingVideo$0(this.f21619c, this.d);
                return;
            default:
                this.f21618b.lambda$removeLoadingVideo$1(this.f21619c, this.d);
                return;
        }
    }
}
