package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class n3 implements Runnable {
    public final int f20735a;
    public final FilePathDatabase f20736b;
    public final String f20737c;
    public final boolean[] d;
    public final CountDownLatch e;

    public n3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f20735a = i10;
        this.f20736b = filePathDatabase;
        this.f20737c = str;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f20735a) {
            case 0:
                FilePathDatabase.g(this.f20736b, this.f20737c, this.d, this.e);
                return;
            default:
                FilePathDatabase.e(this.f20736b, this.f20737c, this.d, this.e);
                return;
        }
    }
}
