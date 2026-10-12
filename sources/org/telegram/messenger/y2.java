package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class y2 implements Runnable {
    public final int f19057a;
    public final FileLoader f19058b;
    public final TLRPC.Document f19059c;
    public final boolean d;

    public y2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f19057a = i10;
        this.f19058b = fileLoader;
        this.f19059c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f19057a) {
            case 0:
                this.f19058b.lambda$setLoadingVideo$0(this.f19059c, this.d);
                return;
            default:
                this.f19058b.lambda$removeLoadingVideo$1(this.f19059c, this.d);
                return;
        }
    }
}
