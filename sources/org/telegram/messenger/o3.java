package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class o3 implements Runnable {
    public final int f20827a;
    public final FilePathDatabase f20828b;
    public final String f20829c;
    public final boolean[] d;
    public final CountDownLatch e;

    public o3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f20827a = i10;
        this.f20828b = filePathDatabase;
        this.f20829c = str;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f20827a) {
            case 0:
                FilePathDatabase.g(this.f20828b, this.f20829c, this.d, this.e);
                return;
            default:
                FilePathDatabase.e(this.f20828b, this.f20829c, this.d, this.e);
                return;
        }
    }
}
