package org.telegram.messenger;

public final class v2 implements Runnable {

    public final int f21765a;

    public final FileLoader f21766b;

    public v2(FileLoader fileLoader, int i10) {
        this.f21765a = i10;
        this.f21766b = fileLoader;
    }

    @Override
    public final void run() {
        switch (this.f21765a) {
            case 0:
                this.f21766b.lambda$new$18();
                break;
            case 1:
                this.f21766b.lambda$cancelLoadFile$8();
                break;
            default:
                this.f21766b.lambda$cancel$10();
                break;
        }
    }
}
