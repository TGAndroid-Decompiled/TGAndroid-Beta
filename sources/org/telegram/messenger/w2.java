package org.telegram.messenger;
public final class w2 implements Runnable {
    public final int f17995a;
    public final FileLoader f17996b;
    public final String f17997c;

    public w2(FileLoader fileLoader, String str, int i10) {
        this.f17995a = i10;
        this.f17996b = fileLoader;
        this.f17997c = str;
    }

    @Override
    public final void run() {
        switch (this.f17995a) {
            case 0:
                this.f17996b.lambda$cancelLoadFile$7(this.f17997c);
                return;
            case 1:
                this.f17996b.lambda$cancel$9(this.f17997c);
                return;
            default:
                this.f17996b.lambda$cancelLoadAllFiles$12(this.f17997c);
                return;
        }
    }
}
