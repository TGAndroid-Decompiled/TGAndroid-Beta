package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class k3 implements Runnable {
    public final int f18758a;
    public final FilePathDatabase f18759b;
    public final String f18760c;
    public final boolean[] d;
    public final CountDownLatch e;

    public k3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f18758a = i10;
        this.f18759b = filePathDatabase;
        this.f18760c = str;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f18758a) {
            case 0:
                FilePathDatabase.g(this.f18759b, this.f18760c, this.d, this.e);
                return;
            default:
                FilePathDatabase.e(this.f18759b, this.f18760c, this.d, this.e);
                return;
        }
    }
}
