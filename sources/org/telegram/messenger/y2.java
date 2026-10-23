package org.telegram.messenger;
public final class y2 implements Runnable {
    public final int f20185a;
    public final FileLoader f20186b;

    public y2(FileLoader fileLoader, int i10) {
        this.f20185a = i10;
        this.f20186b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f20185a) {
            case 0:
                this.f20186b.lambda$new$20();
                return;
            case 1:
                this.f20186b.lambda$cancelLoadFile$8();
                return;
            default:
                this.f20186b.lambda$cancel$10();
                return;
        }
    }
}
