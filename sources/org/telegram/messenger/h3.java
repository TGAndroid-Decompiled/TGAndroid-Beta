package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class h3 implements Runnable {
    public final int f17359a;
    public final FilePathDatabase f17360b;
    public final String f17361c;
    public final boolean[] d;
    public final CountDownLatch e;

    public h3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f17359a = i10;
        this.f17360b = filePathDatabase;
        this.f17361c = str;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f17359a) {
            case 0:
                FilePathDatabase.g(this.f17360b, this.f17361c, this.d, this.e);
                return;
            default:
                FilePathDatabase.e(this.f17360b, this.f17361c, this.d, this.e);
                return;
        }
    }
}
