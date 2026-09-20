package org.telegram.messenger;
public final class w2 implements Runnable {
    public final int f17965a;
    public final FileLoader f17966b;
    public final String f17967c;

    public w2(FileLoader fileLoader, String str, int i10) {
        this.f17965a = i10;
        this.f17966b = fileLoader;
        this.f17967c = str;
    }

    @Override
    public final void run() {
        switch (this.f17965a) {
            case 0:
                this.f17966b.lambda$cancelLoadFile$7(this.f17967c);
                return;
            case 1:
                this.f17966b.lambda$cancel$9(this.f17967c);
                return;
            default:
                this.f17966b.lambda$cancelLoadAllFiles$12(this.f17967c);
                return;
        }
    }
}
