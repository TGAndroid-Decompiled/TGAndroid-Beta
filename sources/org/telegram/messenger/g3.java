package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class g3 implements Runnable {
    public final int f17775a;
    public final FilePathDatabase f17776b;
    public final String f17777c;
    public final boolean[] d;
    public final CountDownLatch f17778e;

    public g3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f17775a = i10;
        this.f17776b = filePathDatabase;
        this.f17777c = str;
        this.d = zArr;
        this.f17778e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f17775a) {
            case 0:
                FilePathDatabase.g(this.f17776b, this.f17777c, this.d, this.f17778e);
                return;
            default:
                FilePathDatabase.e(this.f17776b, this.f17777c, this.d, this.f17778e);
                return;
        }
    }
}
