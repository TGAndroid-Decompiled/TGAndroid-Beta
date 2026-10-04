package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class v2 implements Runnable {
    public final int f19375a;
    public final FileLoader f19376b;
    public final TLRPC.Document f19377c;
    public final boolean d;

    public v2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f19375a = i10;
        this.f19376b = fileLoader;
        this.f19377c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f19375a) {
            case 0:
                this.f19376b.lambda$setLoadingVideo$0(this.f19377c, this.d);
                return;
            default:
                this.f19376b.lambda$removeLoadingVideo$1(this.f19377c, this.d);
                return;
        }
    }
}
