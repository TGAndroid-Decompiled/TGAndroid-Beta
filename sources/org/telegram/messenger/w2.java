package org.telegram.messenger;
public final class w2 implements Runnable {
    public final int f17737a;
    public final FileLoader f17738b;
    public final String f17739c;

    public w2(FileLoader fileLoader, String str, int i10) {
        this.f17737a = i10;
        this.f17738b = fileLoader;
        this.f17739c = str;
    }

    @Override
    public final void run() {
        switch (this.f17737a) {
            case 0:
                this.f17738b.lambda$cancelLoadFile$7(this.f17739c);
                return;
            case 1:
                this.f17738b.lambda$cancel$9(this.f17739c);
                return;
            default:
                this.f17738b.lambda$cancelLoadAllFiles$12(this.f17739c);
                return;
        }
    }
}
