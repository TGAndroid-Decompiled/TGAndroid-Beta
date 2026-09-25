package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class v2 implements Runnable {
    public final int f17728a;
    public final FileLoader f17729b;
    public final TLRPC.Document f17730c;
    public final boolean d;

    public v2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f17728a = i10;
        this.f17729b = fileLoader;
        this.f17730c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17728a) {
            case 0:
                this.f17729b.lambda$setLoadingVideo$0(this.f17730c, this.d);
                return;
            default:
                this.f17729b.lambda$removeLoadingVideo$1(this.f17730c, this.d);
                return;
        }
    }
}
