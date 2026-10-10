package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class v2 implements Runnable {
    public final int f19389a;
    public final FileLoader f19390b;
    public final TLRPC.Document f19391c;
    public final boolean d;

    public v2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f19389a = i10;
        this.f19390b = fileLoader;
        this.f19391c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f19389a) {
            case 0:
                this.f19390b.lambda$setLoadingVideo$0(this.f19391c, this.d);
                return;
            default:
                this.f19390b.lambda$removeLoadingVideo$1(this.f19391c, this.d);
                return;
        }
    }
}
