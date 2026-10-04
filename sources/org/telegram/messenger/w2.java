package org.telegram.messenger;
public final class w2 implements Runnable {
    public final int f19657a;
    public final FileLoader f19658b;
    public final String f19659c;

    public w2(FileLoader fileLoader, String str, int i10) {
        this.f19657a = i10;
        this.f19658b = fileLoader;
        this.f19659c = str;
    }

    @Override
    public final void run() {
        switch (this.f19657a) {
            case 0:
                this.f19658b.lambda$cancelLoadFile$7(this.f19659c);
                return;
            case 1:
                this.f19658b.lambda$cancel$9(this.f19659c);
                return;
            default:
                this.f19658b.lambda$cancelLoadAllFiles$12(this.f19659c);
                return;
        }
    }
}
