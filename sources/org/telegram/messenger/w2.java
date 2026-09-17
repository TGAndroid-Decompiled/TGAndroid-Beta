package org.telegram.messenger;
public final class w2 implements Runnable {
    public final int f17749a;
    public final FileLoader f17750b;
    public final String f17751c;

    public w2(FileLoader fileLoader, String str, int i10) {
        this.f17749a = i10;
        this.f17750b = fileLoader;
        this.f17751c = str;
    }

    @Override
    public final void run() {
        switch (this.f17749a) {
            case 0:
                this.f17750b.lambda$cancelLoadFile$7(this.f17751c);
                return;
            case 1:
                this.f17750b.lambda$cancel$9(this.f17751c);
                return;
            default:
                this.f17750b.lambda$cancelLoadAllFiles$12(this.f17751c);
                return;
        }
    }
}
