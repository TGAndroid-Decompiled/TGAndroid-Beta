package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class l3 implements Runnable {
    public final int f15669a;
    public final FilePathDatabase f15670b;
    public final String f15671c;
    public final boolean[] d;
    public final CountDownLatch e;

    public l3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f15669a = i10;
        this.f15670b = filePathDatabase;
        this.f15671c = str;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f15669a) {
            case 0:
                FilePathDatabase.g(this.f15670b, this.f15671c, this.d, this.e);
                return;
            default:
                FilePathDatabase.e(this.f15670b, this.f15671c, this.d, this.e);
                return;
        }
    }
}
