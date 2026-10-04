package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class g3 implements Runnable {
    public final int f17905a;
    public final FilePathDatabase f17906b;
    public final String f17907c;
    public final boolean[] d;
    public final CountDownLatch f17908e;

    public g3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f17905a = i10;
        this.f17906b = filePathDatabase;
        this.f17907c = str;
        this.d = zArr;
        this.f17908e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f17905a) {
            case 0:
                FilePathDatabase.g(this.f17906b, this.f17907c, this.d, this.f17908e);
                return;
            default:
                FilePathDatabase.e(this.f17906b, this.f17907c, this.d, this.f17908e);
                return;
        }
    }
}
