package org.telegram.messenger;
public final class w2 implements Runnable {
    public final int f22047a;
    public final FileLoader f22048b;
    public final String f22049c;

    public w2(FileLoader fileLoader, String str, int i10) {
        this.f22047a = i10;
        this.f22048b = fileLoader;
        this.f22049c = str;
    }

    @Override
    public final void run() {
        switch (this.f22047a) {
            case 0:
                this.f22048b.lambda$cancelLoadFile$7(this.f22049c);
                return;
            case 1:
                this.f22048b.lambda$cancel$9(this.f22049c);
                return;
            default:
                this.f22048b.lambda$cancelLoadAllFiles$12(this.f22049c);
                return;
        }
    }
}
