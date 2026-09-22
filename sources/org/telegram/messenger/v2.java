package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class v2 implements Runnable {
    public final int f17501a;
    public final FileLoader f17502b;
    public final TLRPC.Document f17503c;
    public final boolean d;

    public v2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f17501a = i10;
        this.f17502b = fileLoader;
        this.f17503c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17501a) {
            case 0:
                this.f17502b.lambda$setLoadingVideo$0(this.f17503c, this.d);
                return;
            default:
                this.f17502b.lambda$removeLoadingVideo$1(this.f17503c, this.d);
                return;
        }
    }
}
