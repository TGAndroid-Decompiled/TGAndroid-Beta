package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class g3 implements Runnable {
    public final int f17739a;
    public final FilePathDatabase f17740b;
    public final String f17741c;
    public final boolean[] d;
    public final CountDownLatch f17742e;

    public g3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f17739a = i10;
        this.f17740b = filePathDatabase;
        this.f17741c = str;
        this.d = zArr;
        this.f17742e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f17739a) {
            case 0:
                FilePathDatabase.g(this.f17740b, this.f17741c, this.d, this.f17742e);
                return;
            default:
                FilePathDatabase.e(this.f17740b, this.f17741c, this.d, this.f17742e);
                return;
        }
    }
}
