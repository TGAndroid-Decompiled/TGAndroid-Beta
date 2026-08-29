package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class v2 implements Runnable {
    public final int f21783a;
    public final FileLoader f21784b;
    public final TLRPC.Document f21785c;
    public final boolean d;

    public v2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f21783a = i10;
        this.f21784b = fileLoader;
        this.f21785c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f21783a) {
            case 0:
                this.f21784b.lambda$setLoadingVideo$0(this.f21785c, this.d);
                return;
            default:
                this.f21784b.lambda$removeLoadingVideo$1(this.f21785c, this.d);
                return;
        }
    }
}
