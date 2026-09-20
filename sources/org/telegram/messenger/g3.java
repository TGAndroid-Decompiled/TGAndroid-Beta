package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class g3 implements Runnable {
    public final int f16401a;
    public final FilePathDatabase f16402b;
    public final String f16403c;
    public final boolean[] d;
    public final CountDownLatch e;

    public g3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f16401a = i10;
        this.f16402b = filePathDatabase;
        this.f16403c = str;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f16401a) {
            case 0:
                FilePathDatabase.g(this.f16402b, this.f16403c, this.d, this.e);
                return;
            default:
                FilePathDatabase.e(this.f16402b, this.f16403c, this.d, this.e);
                return;
        }
    }
}
