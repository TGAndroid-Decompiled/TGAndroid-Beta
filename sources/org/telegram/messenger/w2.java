package org.telegram.messenger;
public final class w2 implements Runnable {
    public final int f17969a;
    public final FileLoader f17970b;
    public final String f17971c;

    public w2(FileLoader fileLoader, String str, int i10) {
        this.f17969a = i10;
        this.f17970b = fileLoader;
        this.f17971c = str;
    }

    @Override
    public final void run() {
        switch (this.f17969a) {
            case 0:
                this.f17970b.lambda$cancelLoadFile$7(this.f17971c);
                return;
            case 1:
                this.f17970b.lambda$cancel$9(this.f17971c);
                return;
            default:
                this.f17970b.lambda$cancelLoadAllFiles$12(this.f17971c);
                return;
        }
    }
}
