package org.telegram.messenger;
public final class y2 implements Runnable {
    public final int f20122a;
    public final FileLoader f20123b;

    public y2(FileLoader fileLoader, int i10) {
        this.f20122a = i10;
        this.f20123b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f20122a) {
            case 0:
                this.f20123b.lambda$new$18();
                return;
            case 1:
                this.f20123b.lambda$cancelLoadFile$8();
                return;
            default:
                this.f20123b.lambda$cancel$10();
                return;
        }
    }
}
