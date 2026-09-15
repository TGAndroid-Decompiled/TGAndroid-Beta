package org.telegram.messenger;
public final class w2 implements Runnable {
    public final int f17740a;
    public final FileLoader f17741b;
    public final String f17742c;

    public w2(FileLoader fileLoader, String str, int i10) {
        this.f17740a = i10;
        this.f17741b = fileLoader;
        this.f17742c = str;
    }

    @Override
    public final void run() {
        switch (this.f17740a) {
            case 0:
                this.f17741b.lambda$cancelLoadFile$7(this.f17742c);
                return;
            case 1:
                this.f17741b.lambda$cancel$9(this.f17742c);
                return;
            default:
                this.f17741b.lambda$cancelLoadAllFiles$12(this.f17742c);
                return;
        }
    }
}
