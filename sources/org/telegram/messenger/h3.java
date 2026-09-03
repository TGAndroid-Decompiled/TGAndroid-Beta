package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class h3 implements Runnable {
    public final int f17339a;
    public final FilePathDatabase f17340b;
    public final String f17341c;
    public final boolean[] d;
    public final CountDownLatch e;

    public h3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f17339a = i10;
        this.f17340b = filePathDatabase;
        this.f17341c = str;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f17339a) {
            case 0:
                FilePathDatabase.g(this.f17340b, this.f17341c, this.d, this.e);
                return;
            default:
                FilePathDatabase.e(this.f17340b, this.f17341c, this.d, this.e);
                return;
        }
    }
}
