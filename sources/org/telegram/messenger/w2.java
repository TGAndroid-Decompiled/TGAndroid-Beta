package org.telegram.messenger;
public final class w2 implements Runnable {
    public final int f19481a;
    public final FileLoader f19482b;
    public final String f19483c;

    public w2(FileLoader fileLoader, String str, int i10) {
        this.f19481a = i10;
        this.f19482b = fileLoader;
        this.f19483c = str;
    }

    @Override
    public final void run() {
        switch (this.f19481a) {
            case 0:
                this.f19482b.lambda$cancelLoadFile$7(this.f19483c);
                return;
            case 1:
                this.f19482b.lambda$cancel$9(this.f19483c);
                return;
            default:
                this.f19482b.lambda$cancelLoadAllFiles$12(this.f19483c);
                return;
        }
    }
}
