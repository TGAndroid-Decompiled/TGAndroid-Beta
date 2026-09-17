package org.telegram.messenger;
public final class w2 implements Runnable {
    public final int f19495a;
    public final FileLoader f19496b;
    public final String f19497c;

    public w2(FileLoader fileLoader, String str, int i10) {
        this.f19495a = i10;
        this.f19496b = fileLoader;
        this.f19497c = str;
    }

    @Override
    public final void run() {
        switch (this.f19495a) {
            case 0:
                this.f19496b.lambda$cancelLoadFile$7(this.f19497c);
                return;
            case 1:
                this.f19496b.lambda$cancel$9(this.f19497c);
                return;
            default:
                this.f19496b.lambda$cancelLoadAllFiles$12(this.f19497c);
                return;
        }
    }
}
