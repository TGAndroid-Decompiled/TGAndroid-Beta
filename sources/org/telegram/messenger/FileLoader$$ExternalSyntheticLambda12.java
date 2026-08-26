package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class FileLoader$$ExternalSyntheticLambda12 implements Runnable {
    public final int $r8$classId;
    public final FileLoader f$0;
    public final TLRPC.Document f$1;
    public final boolean f$2;

    public FileLoader$$ExternalSyntheticLambda12(FileLoader fileLoader, TLRPC.Document document, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = fileLoader;
        this.f$1 = document;
        this.f$2 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setLoadingVideo$0(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$removeLoadingVideo$1(this.f$1, this.f$2);
                break;
        }
    }
}
