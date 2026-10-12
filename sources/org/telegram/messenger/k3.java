package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class k3 implements Runnable {
    public final int f18030a;
    public final FilePathDatabase f18031b;
    public final String f18032c;
    public final boolean[] d;
    public final CountDownLatch f18033e;

    public k3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f18030a = i10;
        this.f18031b = filePathDatabase;
        this.f18032c = str;
        this.d = zArr;
        this.f18033e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f18030a) {
            case 0:
                FilePathDatabase.g(this.f18031b, this.f18032c, this.d, this.f18033e);
                return;
            default:
                FilePathDatabase.e(this.f18031b, this.f18032c, this.d, this.f18033e);
                return;
        }
    }
}
