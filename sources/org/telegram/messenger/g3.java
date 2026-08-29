package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class g3 implements Runnable {
    public final int f20298a;
    public final FilePathDatabase f20299b;
    public final String f20300c;
    public final boolean[] d;
    public final CountDownLatch f20301e;

    public g3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f20298a = i10;
        this.f20299b = filePathDatabase;
        this.f20300c = str;
        this.d = zArr;
        this.f20301e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f20298a) {
            case 0:
                FilePathDatabase.g(this.f20299b, this.f20300c, this.d, this.f20301e);
                return;
            default:
                FilePathDatabase.e(this.f20299b, this.f20300c, this.d, this.f20301e);
                return;
        }
    }
}
