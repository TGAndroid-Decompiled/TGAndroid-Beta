package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class v2 implements Runnable {
    public final int f17504a;
    public final FileLoader f17505b;
    public final TLRPC.Document f17506c;
    public final boolean d;

    public v2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f17504a = i10;
        this.f17505b = fileLoader;
        this.f17506c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17504a) {
            case 0:
                this.f17505b.lambda$setLoadingVideo$0(this.f17506c, this.d);
                return;
            default:
                this.f17505b.lambda$removeLoadingVideo$1(this.f17506c, this.d);
                return;
        }
    }
}
