package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class k3 implements Runnable {
    public final int f18762a;
    public final FilePathDatabase f18763b;
    public final String f18764c;
    public final boolean[] d;
    public final CountDownLatch e;

    public k3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f18762a = i10;
        this.f18763b = filePathDatabase;
        this.f18764c = str;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f18762a) {
            case 0:
                FilePathDatabase.g(this.f18763b, this.f18764c, this.d, this.e);
                return;
            default:
                FilePathDatabase.e(this.f18763b, this.f18764c, this.d, this.e);
                return;
        }
    }
}
