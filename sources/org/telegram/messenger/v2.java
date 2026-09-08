package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class v2 implements Runnable {
    public final int f19223a;
    public final FileLoader f19224b;
    public final TLRPC.Document f19225c;
    public final boolean d;

    public v2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f19223a = i10;
        this.f19224b = fileLoader;
        this.f19225c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f19223a) {
            case 0:
                this.f19224b.lambda$setLoadingVideo$0(this.f19225c, this.d);
                return;
            default:
                this.f19224b.lambda$removeLoadingVideo$1(this.f19225c, this.d);
                return;
        }
    }
}
