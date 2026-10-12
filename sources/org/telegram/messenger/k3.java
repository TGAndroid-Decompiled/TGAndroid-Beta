package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class k3 implements Runnable {
    public final int f18029a;
    public final FilePathDatabase f18030b;
    public final String f18031c;
    public final boolean[] d;
    public final CountDownLatch f18032e;

    public k3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f18029a = i10;
        this.f18030b = filePathDatabase;
        this.f18031c = str;
        this.d = zArr;
        this.f18032e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f18029a) {
            case 0:
                FilePathDatabase.g(this.f18030b, this.f18031c, this.d, this.f18032e);
                return;
            default:
                FilePathDatabase.e(this.f18030b, this.f18031c, this.d, this.f18032e);
                return;
        }
    }
}
