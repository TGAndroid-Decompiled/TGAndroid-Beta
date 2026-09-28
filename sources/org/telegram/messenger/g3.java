package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class g3 implements Runnable {
    public final int f16430a;
    public final FilePathDatabase f16431b;
    public final String f16432c;
    public final boolean[] d;
    public final CountDownLatch e;

    public g3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f16430a = i10;
        this.f16431b = filePathDatabase;
        this.f16432c = str;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f16430a) {
            case 0:
                FilePathDatabase.g(this.f16431b, this.f16432c, this.d, this.e);
                return;
            default:
                FilePathDatabase.e(this.f16431b, this.f16432c, this.d, this.e);
                return;
        }
    }
}
