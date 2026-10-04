package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class g3 implements Runnable {
    public final int f17910a;
    public final FilePathDatabase f17911b;
    public final String f17912c;
    public final boolean[] d;
    public final CountDownLatch f17913e;

    public g3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f17910a = i10;
        this.f17911b = filePathDatabase;
        this.f17912c = str;
        this.d = zArr;
        this.f17913e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f17910a) {
            case 0:
                FilePathDatabase.g(this.f17911b, this.f17912c, this.d, this.f17913e);
                return;
            default:
                FilePathDatabase.e(this.f17911b, this.f17912c, this.d, this.f17913e);
                return;
        }
    }
}
