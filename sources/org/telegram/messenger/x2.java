package org.telegram.messenger;
public final class x2 implements Runnable {
    public final int f18942a;
    public final FileLoader f18943b;
    public final String f18944c;

    public x2(FileLoader fileLoader, String str, int i10) {
        this.f18942a = i10;
        this.f18943b = fileLoader;
        this.f18944c = str;
    }

    @Override
    public final void run() {
        switch (this.f18942a) {
            case 0:
                this.f18943b.lambda$cancelLoadFile$7(this.f18944c);
                return;
            case 1:
                this.f18943b.lambda$cancel$9(this.f18944c);
                return;
            default:
                this.f18943b.lambda$cancelLoadAllFiles$12(this.f18944c);
                return;
        }
    }
}
