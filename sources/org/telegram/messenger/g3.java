package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class g3 implements Runnable {
    public final int f16446a;
    public final FilePathDatabase f16447b;
    public final String f16448c;
    public final boolean[] d;
    public final CountDownLatch e;

    public g3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f16446a = i10;
        this.f16447b = filePathDatabase;
        this.f16448c = str;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f16446a) {
            case 0:
                FilePathDatabase.g(this.f16447b, this.f16448c, this.d, this.e);
                return;
            default:
                FilePathDatabase.e(this.f16447b, this.f16448c, this.d, this.e);
                return;
        }
    }
}
