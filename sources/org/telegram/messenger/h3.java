package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;

public final class h3 implements Runnable {

    public final int f20440a;

    public final FilePathDatabase f20441b;

    public final String f20442c;
    public final boolean[] d;

    public final CountDownLatch f20443e;

    public h3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f20440a = i10;
        this.f20441b = filePathDatabase;
        this.f20442c = str;
        this.d = zArr;
        this.f20443e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f20440a) {
            case 0:
                this.f20441b.lambda$isLocallyCreated$8(this.f20442c, this.d, this.f20443e);
                break;
            default:
                this.f20441b.lambda$hasAnotherRefOnFile$4(this.f20442c, this.d, this.f20443e);
                break;
        }
    }
}
