package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class g3 implements Runnable {
    public final int f16421a;
    public final FilePathDatabase f16422b;
    public final String f16423c;
    public final boolean[] d;
    public final CountDownLatch e;

    public g3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f16421a = i10;
        this.f16422b = filePathDatabase;
        this.f16423c = str;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f16421a) {
            case 0:
                FilePathDatabase.g(this.f16422b, this.f16423c, this.d, this.e);
                return;
            default:
                FilePathDatabase.e(this.f16422b, this.f16423c, this.d, this.e);
                return;
        }
    }
}
