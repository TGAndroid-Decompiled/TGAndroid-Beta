package org.telegram.messenger;
public final class w2 implements Runnable {
    public final int f18011a;
    public final FileLoader f18012b;
    public final String f18013c;

    public w2(FileLoader fileLoader, String str, int i10) {
        this.f18011a = i10;
        this.f18012b = fileLoader;
        this.f18013c = str;
    }

    @Override
    public final void run() {
        switch (this.f18011a) {
            case 0:
                this.f18012b.lambda$cancelLoadFile$7(this.f18013c);
                return;
            case 1:
                this.f18012b.lambda$cancel$9(this.f18013c);
                return;
            default:
                this.f18012b.lambda$cancelLoadAllFiles$12(this.f18013c);
                return;
        }
    }
}
