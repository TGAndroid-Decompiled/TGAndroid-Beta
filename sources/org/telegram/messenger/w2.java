package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class w2 implements Runnable {
    public final int f20506a;
    public final FileLoader f20507b;
    public final TLRPC.Document f20508c;
    public final boolean d;

    public w2(FileLoader fileLoader, TLRPC.Document document, boolean z4, int i10) {
        this.f20506a = i10;
        this.f20507b = fileLoader;
        this.f20508c = document;
        this.d = z4;
    }

    @Override
    public final void run() {
        switch (this.f20506a) {
            case 0:
                this.f20507b.lambda$setLoadingVideo$0(this.f20508c, this.d);
                return;
            default:
                this.f20507b.lambda$removeLoadingVideo$1(this.f20508c, this.d);
                return;
        }
    }
}
