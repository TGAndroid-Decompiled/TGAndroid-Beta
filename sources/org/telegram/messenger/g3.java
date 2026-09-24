package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class g3 implements Runnable {
    public final int f16406a;
    public final FilePathDatabase f16407b;
    public final String f16408c;
    public final boolean[] d;
    public final CountDownLatch e;

    public g3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f16406a = i10;
        this.f16407b = filePathDatabase;
        this.f16408c = str;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f16406a) {
            case 0:
                FilePathDatabase.g(this.f16407b, this.f16408c, this.d, this.e);
                return;
            default:
                FilePathDatabase.e(this.f16407b, this.f16408c, this.d, this.e);
                return;
        }
    }
}
