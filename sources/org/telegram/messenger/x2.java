package org.telegram.messenger;

public final class x2 implements Runnable {

    public final int f22095a;

    public final FileLoader f22096b;

    public final String f22097c;

    public x2(FileLoader fileLoader, String str, int i10) {
        this.f22095a = i10;
        this.f22096b = fileLoader;
        this.f22097c = str;
    }

    @Override
    public final void run() {
        switch (this.f22095a) {
            case 0:
                this.f22096b.lambda$cancelLoadFile$7(this.f22097c);
                break;
            case 1:
                this.f22096b.lambda$cancel$9(this.f22097c);
                break;
            default:
                this.f22096b.lambda$cancelLoadAllFiles$12(this.f22097c);
                break;
        }
    }
}
