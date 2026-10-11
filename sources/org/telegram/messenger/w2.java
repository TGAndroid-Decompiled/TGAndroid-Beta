package org.telegram.messenger;
public final class w2 implements Runnable {
    public final int f19689a;
    public final FileLoader f19690b;
    public final String f19691c;

    public w2(FileLoader fileLoader, String str, int i10) {
        this.f19689a = i10;
        this.f19690b = fileLoader;
        this.f19691c = str;
    }

    @Override
    public final void run() {
        switch (this.f19689a) {
            case 0:
                this.f19690b.lambda$cancelLoadFile$7(this.f19691c);
                return;
            case 1:
                this.f19690b.lambda$cancel$9(this.f19691c);
                return;
            default:
                this.f19690b.lambda$cancelLoadAllFiles$12(this.f19691c);
                return;
        }
    }
}
