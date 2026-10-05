package org.telegram.messenger;
public final class w2 implements Runnable {
    public final int f19650a;
    public final FileLoader f19651b;
    public final String f19652c;

    public w2(FileLoader fileLoader, String str, int i10) {
        this.f19650a = i10;
        this.f19651b = fileLoader;
        this.f19652c = str;
    }

    @Override
    public final void run() {
        switch (this.f19650a) {
            case 0:
                this.f19651b.lambda$cancelLoadFile$7(this.f19652c);
                return;
            case 1:
                this.f19651b.lambda$cancel$9(this.f19652c);
                return;
            default:
                this.f19651b.lambda$cancelLoadAllFiles$12(this.f19652c);
                return;
        }
    }
}
