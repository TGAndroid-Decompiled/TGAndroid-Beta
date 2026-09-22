package org.telegram.messenger;
public final class w2 implements Runnable {
    public final int f17980a;
    public final FileLoader f17981b;
    public final String f17982c;

    public w2(FileLoader fileLoader, String str, int i10) {
        this.f17980a = i10;
        this.f17981b = fileLoader;
        this.f17982c = str;
    }

    @Override
    public final void run() {
        switch (this.f17980a) {
            case 0:
                this.f17981b.lambda$cancelLoadFile$7(this.f17982c);
                return;
            case 1:
                this.f17981b.lambda$cancel$9(this.f17982c);
                return;
            default:
                this.f17981b.lambda$cancelLoadAllFiles$12(this.f17982c);
                return;
        }
    }
}
