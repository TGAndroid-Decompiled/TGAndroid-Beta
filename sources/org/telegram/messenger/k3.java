package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class k3 implements Runnable {
    public final int f18755a;
    public final FilePathDatabase f18756b;
    public final String f18757c;
    public final boolean[] d;
    public final CountDownLatch e;

    public k3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f18755a = i10;
        this.f18756b = filePathDatabase;
        this.f18757c = str;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f18755a) {
            case 0:
                FilePathDatabase.g(this.f18756b, this.f18757c, this.d, this.e);
                return;
            default:
                FilePathDatabase.e(this.f18756b, this.f18757c, this.d, this.e);
                return;
        }
    }
}
