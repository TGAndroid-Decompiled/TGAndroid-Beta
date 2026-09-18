package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class g3 implements Runnable {
    public final int f16190a;
    public final FilePathDatabase f16191b;
    public final String f16192c;
    public final boolean[] d;
    public final CountDownLatch e;

    public g3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f16190a = i10;
        this.f16191b = filePathDatabase;
        this.f16192c = str;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f16190a) {
            case 0:
                FilePathDatabase.g(this.f16191b, this.f16192c, this.d, this.e);
                return;
            default:
                FilePathDatabase.e(this.f16191b, this.f16192c, this.d, this.e);
                return;
        }
    }
}
