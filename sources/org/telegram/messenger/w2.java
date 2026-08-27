package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class w2 implements Runnable {

    public final int f22008a;

    public final FileLoader f22009b;

    public final TLRPC.Document f22010c;
    public final boolean d;

    public w2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f22008a = i10;
        this.f22009b = fileLoader;
        this.f22010c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f22008a) {
            case 0:
                this.f22009b.lambda$setLoadingVideo$0(this.f22010c, this.d);
                break;
            default:
                this.f22009b.lambda$removeLoadingVideo$1(this.f22010c, this.d);
                break;
        }
    }
}
