package org.telegram.messenger;
public final class w2 implements Runnable {
    public final int f17984a;
    public final FileLoader f17985b;
    public final String f17986c;

    public w2(FileLoader fileLoader, String str, int i10) {
        this.f17984a = i10;
        this.f17985b = fileLoader;
        this.f17986c = str;
    }

    @Override
    public final void run() {
        switch (this.f17984a) {
            case 0:
                this.f17985b.lambda$cancelLoadFile$7(this.f17986c);
                return;
            case 1:
                this.f17985b.lambda$cancel$9(this.f17986c);
                return;
            default:
                this.f17985b.lambda$cancelLoadAllFiles$12(this.f17986c);
                return;
        }
    }
}
