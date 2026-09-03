package org.telegram.messenger;
public final class x2 implements Runnable {
    public final int f20591a;
    public final FileLoader f20592b;
    public final String f20593c;

    public x2(FileLoader fileLoader, String str, int i10) {
        this.f20591a = i10;
        this.f20592b = fileLoader;
        this.f20593c = str;
    }

    @Override
    public final void run() {
        switch (this.f20591a) {
            case 0:
                this.f20592b.lambda$cancelLoadFile$7(this.f20593c);
                return;
            case 1:
                this.f20592b.lambda$cancel$9(this.f20593c);
                return;
            default:
                this.f20592b.lambda$cancelLoadAllFiles$12(this.f20593c);
                return;
        }
    }
}
