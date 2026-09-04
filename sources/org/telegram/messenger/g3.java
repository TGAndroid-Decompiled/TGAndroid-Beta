package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class g3 implements Runnable {
    public final int f17712a;
    public final FilePathDatabase f17713b;
    public final String f17714c;
    public final boolean[] d;
    public final CountDownLatch f17715e;

    public g3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f17712a = i10;
        this.f17713b = filePathDatabase;
        this.f17714c = str;
        this.d = zArr;
        this.f17715e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f17712a) {
            case 0:
                FilePathDatabase.g(this.f17713b, this.f17714c, this.d, this.f17715e);
                return;
            default:
                FilePathDatabase.e(this.f17713b, this.f17714c, this.d, this.f17715e);
                return;
        }
    }
}
