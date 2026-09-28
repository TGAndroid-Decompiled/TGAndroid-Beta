package org.telegram.messenger;
public final class w2 implements Runnable {
    public final int f17994a;
    public final FileLoader f17995b;
    public final String f17996c;

    public w2(FileLoader fileLoader, String str, int i10) {
        this.f17994a = i10;
        this.f17995b = fileLoader;
        this.f17996c = str;
    }

    @Override
    public final void run() {
        switch (this.f17994a) {
            case 0:
                this.f17995b.lambda$cancelLoadFile$7(this.f17996c);
                return;
            case 1:
                this.f17995b.lambda$cancel$9(this.f17996c);
                return;
            default:
                this.f17995b.lambda$cancelLoadAllFiles$12(this.f17996c);
                return;
        }
    }
}
