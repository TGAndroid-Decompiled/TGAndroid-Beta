package org.telegram.messenger;
public final class w2 implements Runnable {
    public final int f19454a;
    public final FileLoader f19455b;
    public final String f19456c;

    public w2(FileLoader fileLoader, String str, int i10) {
        this.f19454a = i10;
        this.f19455b = fileLoader;
        this.f19456c = str;
    }

    @Override
    public final void run() {
        switch (this.f19454a) {
            case 0:
                this.f19455b.lambda$cancelLoadFile$7(this.f19456c);
                return;
            case 1:
                this.f19455b.lambda$cancel$9(this.f19456c);
                return;
            default:
                this.f19455b.lambda$cancelLoadAllFiles$12(this.f19456c);
                return;
        }
    }
}
