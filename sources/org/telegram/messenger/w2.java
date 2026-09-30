package org.telegram.messenger;
public final class w2 implements Runnable {
    public final int f17996a;
    public final FileLoader f17997b;
    public final String f17998c;

    public w2(FileLoader fileLoader, String str, int i10) {
        this.f17996a = i10;
        this.f17997b = fileLoader;
        this.f17998c = str;
    }

    @Override
    public final void run() {
        switch (this.f17996a) {
            case 0:
                this.f17997b.lambda$cancelLoadFile$7(this.f17998c);
                return;
            case 1:
                this.f17997b.lambda$cancel$9(this.f17998c);
                return;
            default:
                this.f17997b.lambda$cancelLoadAllFiles$12(this.f17998c);
                return;
        }
    }
}
