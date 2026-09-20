package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class v2 implements Runnable {
    public final int f17718a;
    public final FileLoader f17719b;
    public final TLRPC.Document f17720c;
    public final boolean d;

    public v2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f17718a = i10;
        this.f17719b = fileLoader;
        this.f17720c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17718a) {
            case 0:
                this.f17719b.lambda$setLoadingVideo$0(this.f17720c, this.d);
                return;
            default:
                this.f17719b.lambda$removeLoadingVideo$1(this.f17720c, this.d);
                return;
        }
    }
}
