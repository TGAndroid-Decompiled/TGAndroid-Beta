package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class k3 implements Runnable {
    public final int f18759a;
    public final FilePathDatabase f18760b;
    public final String f18761c;
    public final boolean[] d;
    public final CountDownLatch e;

    public k3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f18759a = i10;
        this.f18760b = filePathDatabase;
        this.f18761c = str;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f18759a) {
            case 0:
                FilePathDatabase.g(this.f18760b, this.f18761c, this.d, this.e);
                return;
            default:
                FilePathDatabase.e(this.f18760b, this.f18761c, this.d, this.e);
                return;
        }
    }
}
