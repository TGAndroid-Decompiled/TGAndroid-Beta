package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class v2 implements Runnable {
    public final int f19385a;
    public final FileLoader f19386b;
    public final TLRPC.Document f19387c;
    public final boolean d;

    public v2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f19385a = i10;
        this.f19386b = fileLoader;
        this.f19387c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f19385a) {
            case 0:
                this.f19386b.lambda$setLoadingVideo$0(this.f19387c, this.d);
                return;
            default:
                this.f19386b.lambda$removeLoadingVideo$1(this.f19387c, this.d);
                return;
        }
    }
}
