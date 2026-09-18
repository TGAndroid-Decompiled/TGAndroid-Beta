package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class g3 implements Runnable {
    public final int f16354a;
    public final FilePathDatabase f16355b;
    public final String f16356c;
    public final boolean[] d;
    public final CountDownLatch e;

    public g3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f16354a = i10;
        this.f16355b = filePathDatabase;
        this.f16356c = str;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f16354a) {
            case 0:
                FilePathDatabase.g(this.f16355b, this.f16356c, this.d, this.e);
                return;
            default:
                FilePathDatabase.e(this.f16355b, this.f16356c, this.d, this.e);
                return;
        }
    }
}
