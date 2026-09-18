package org.telegram.messenger;
public final class w2 implements Runnable {
    public final int f17924a;
    public final FileLoader f17925b;
    public final String f17926c;

    public w2(FileLoader fileLoader, String str, int i10) {
        this.f17924a = i10;
        this.f17925b = fileLoader;
        this.f17926c = str;
    }

    @Override
    public final void run() {
        switch (this.f17924a) {
            case 0:
                this.f17925b.lambda$cancelLoadFile$7(this.f17926c);
                return;
            case 1:
                this.f17925b.lambda$cancel$9(this.f17926c);
                return;
            default:
                this.f17925b.lambda$cancelLoadAllFiles$12(this.f17926c);
                return;
        }
    }
}
