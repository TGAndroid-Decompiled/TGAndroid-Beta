package org.telegram.messenger;
public final class x2 implements Runnable {
    public final int f20589a;
    public final FileLoader f20590b;
    public final String f20591c;

    public x2(FileLoader fileLoader, String str, int i10) {
        this.f20589a = i10;
        this.f20590b = fileLoader;
        this.f20591c = str;
    }

    @Override
    public final void run() {
        switch (this.f20589a) {
            case 0:
                this.f20590b.lambda$cancelLoadFile$7(this.f20591c);
                return;
            case 1:
                this.f20590b.lambda$cancel$9(this.f20591c);
                return;
            default:
                this.f20590b.lambda$cancelLoadAllFiles$12(this.f20591c);
                return;
        }
    }
}
