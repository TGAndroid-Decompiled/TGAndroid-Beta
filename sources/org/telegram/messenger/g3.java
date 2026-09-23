package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class g3 implements Runnable {
    public final int f16162a;
    public final FilePathDatabase f16163b;
    public final String f16164c;
    public final boolean[] d;
    public final CountDownLatch e;

    public g3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f16162a = i10;
        this.f16163b = filePathDatabase;
        this.f16164c = str;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f16162a) {
            case 0:
                FilePathDatabase.g(this.f16163b, this.f16164c, this.d, this.e);
                return;
            default:
                FilePathDatabase.e(this.f16163b, this.f16164c, this.d, this.e);
                return;
        }
    }
}
