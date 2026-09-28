package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class g3 implements Runnable {
    public final int f16429a;
    public final FilePathDatabase f16430b;
    public final String f16431c;
    public final boolean[] d;
    public final CountDownLatch e;

    public g3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f16429a = i10;
        this.f16430b = filePathDatabase;
        this.f16431c = str;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f16429a) {
            case 0:
                FilePathDatabase.g(this.f16430b, this.f16431c, this.d, this.e);
                return;
            default:
                FilePathDatabase.e(this.f16430b, this.f16431c, this.d, this.e);
                return;
        }
    }
}
