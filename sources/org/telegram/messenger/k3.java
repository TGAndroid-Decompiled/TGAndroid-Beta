package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class k3 implements Runnable {
    public final int f18751a;
    public final FilePathDatabase f18752b;
    public final String f18753c;
    public final boolean[] d;
    public final CountDownLatch e;

    public k3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f18751a = i10;
        this.f18752b = filePathDatabase;
        this.f18753c = str;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f18751a) {
            case 0:
                FilePathDatabase.g(this.f18752b, this.f18753c, this.d, this.e);
                return;
            default:
                FilePathDatabase.e(this.f18752b, this.f18753c, this.d, this.e);
                return;
        }
    }
}
