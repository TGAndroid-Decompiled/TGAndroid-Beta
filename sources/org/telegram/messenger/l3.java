package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class l3 implements Runnable {
    public final int f18856a;
    public final FilePathDatabase f18857b;
    public final String f18858c;
    public final boolean[] d;
    public final CountDownLatch e;

    public l3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f18856a = i10;
        this.f18857b = filePathDatabase;
        this.f18858c = str;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f18856a) {
            case 0:
                FilePathDatabase.g(this.f18857b, this.f18858c, this.d, this.e);
                return;
            default:
                FilePathDatabase.e(this.f18857b, this.f18858c, this.d, this.e);
                return;
        }
    }
}
