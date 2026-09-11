package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class g3 implements Runnable {
    public final int f17748a;
    public final FilePathDatabase f17749b;
    public final String f17750c;
    public final boolean[] d;
    public final CountDownLatch f17751e;

    public g3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f17748a = i10;
        this.f17749b = filePathDatabase;
        this.f17750c = str;
        this.d = zArr;
        this.f17751e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f17748a) {
            case 0:
                FilePathDatabase.g(this.f17749b, this.f17750c, this.d, this.f17751e);
                return;
            default:
                FilePathDatabase.e(this.f17749b, this.f17750c, this.d, this.f17751e);
                return;
        }
    }
}
