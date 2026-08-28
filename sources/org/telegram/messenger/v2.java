package org.telegram.messenger;
public final class v2 implements Runnable {
    public final int f21718a;
    public final FileLoader f21719b;
    public final String f21720c;

    public v2(FileLoader fileLoader, String str, int i9) {
        this.f21718a = i9;
        this.f21719b = fileLoader;
        this.f21720c = str;
    }

    @Override
    public final void run() {
        switch (this.f21718a) {
            case 0:
                this.f21719b.lambda$cancelLoadFile$7(this.f21720c);
                return;
            case 1:
                this.f21719b.lambda$cancel$9(this.f21720c);
                return;
            default:
                this.f21719b.lambda$cancelLoadAllFiles$12(this.f21720c);
                return;
        }
    }
}
