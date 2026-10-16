package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class y2 implements Runnable {
    public final int f18758a;
    public final FileLoader f18759b;
    public final TLRPC.Document f18760c;
    public final boolean d;

    public y2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f18758a = i10;
        this.f18759b = fileLoader;
        this.f18760c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f18758a) {
            case 0:
                this.f18759b.lambda$setLoadingVideo$0(this.f18760c, this.d);
                return;
            default:
                this.f18759b.lambda$removeLoadingVideo$1(this.f18760c, this.d);
                return;
        }
    }
}
