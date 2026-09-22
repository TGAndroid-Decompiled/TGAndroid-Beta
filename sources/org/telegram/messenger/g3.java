package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class g3 implements Runnable {
    public final int f16170a;
    public final FilePathDatabase f16171b;
    public final String f16172c;
    public final boolean[] d;
    public final CountDownLatch e;

    public g3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f16170a = i10;
        this.f16171b = filePathDatabase;
        this.f16172c = str;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f16170a) {
            case 0:
                FilePathDatabase.g(this.f16171b, this.f16172c, this.d, this.e);
                return;
            default:
                FilePathDatabase.e(this.f16171b, this.f16172c, this.d, this.e);
                return;
        }
    }
}
