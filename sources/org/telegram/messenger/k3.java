package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class k3 implements Runnable {
    public final int f17353a;
    public final FilePathDatabase f17354b;
    public final String f17355c;
    public final boolean[] d;
    public final CountDownLatch e;

    public k3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f17353a = i10;
        this.f17354b = filePathDatabase;
        this.f17355c = str;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f17353a) {
            case 0:
                FilePathDatabase.g(this.f17354b, this.f17355c, this.d, this.e);
                return;
            default:
                FilePathDatabase.e(this.f17354b, this.f17355c, this.d, this.e);
                return;
        }
    }
}
