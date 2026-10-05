package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class v2 implements Runnable {
    public final int f19382a;
    public final FileLoader f19383b;
    public final TLRPC.Document f19384c;
    public final boolean d;

    public v2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f19382a = i10;
        this.f19383b = fileLoader;
        this.f19384c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f19382a) {
            case 0:
                this.f19383b.lambda$setLoadingVideo$0(this.f19384c, this.d);
                return;
            default:
                this.f19383b.lambda$removeLoadingVideo$1(this.f19384c, this.d);
                return;
        }
    }
}
