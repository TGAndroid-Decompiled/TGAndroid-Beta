package org.telegram.messenger;
public final class w2 implements Runnable {
    public final int f17724a;
    public final FileLoader f17725b;
    public final String f17726c;

    public w2(FileLoader fileLoader, String str, int i10) {
        this.f17724a = i10;
        this.f17725b = fileLoader;
        this.f17726c = str;
    }

    @Override
    public final void run() {
        switch (this.f17724a) {
            case 0:
                this.f17725b.lambda$cancelLoadFile$7(this.f17726c);
                return;
            case 1:
                this.f17725b.lambda$cancel$9(this.f17726c);
                return;
            default:
                this.f17725b.lambda$cancelLoadAllFiles$12(this.f17726c);
                return;
        }
    }
}
