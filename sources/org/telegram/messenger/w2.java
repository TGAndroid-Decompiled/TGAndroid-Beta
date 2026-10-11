package org.telegram.messenger;
public final class w2 implements Runnable {
    public final int f19653a;
    public final FileLoader f19654b;
    public final String f19655c;

    public w2(FileLoader fileLoader, String str, int i10) {
        this.f19653a = i10;
        this.f19654b = fileLoader;
        this.f19655c = str;
    }

    @Override
    public final void run() {
        switch (this.f19653a) {
            case 0:
                this.f19654b.lambda$cancelLoadFile$7(this.f19655c);
                return;
            case 1:
                this.f19654b.lambda$cancel$9(this.f19655c);
                return;
            default:
                this.f19654b.lambda$cancelLoadAllFiles$12(this.f19655c);
                return;
        }
    }
}
