package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class k3 implements Runnable {
    public final int f17654a;
    public final FilePathDatabase f17655b;
    public final String f17656c;
    public final boolean[] d;
    public final CountDownLatch e;

    public k3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f17654a = i10;
        this.f17655b = filePathDatabase;
        this.f17656c = str;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f17654a) {
            case 0:
                FilePathDatabase.g(this.f17655b, this.f17656c, this.d, this.e);
                return;
            default:
                FilePathDatabase.e(this.f17655b, this.f17656c, this.d, this.e);
                return;
        }
    }
}
