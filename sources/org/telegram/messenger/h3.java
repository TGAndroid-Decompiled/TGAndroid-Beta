package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class h3 implements Runnable {
    public final int f18013a;
    public final FilePathDatabase f18014b;
    public final String f18015c;
    public final boolean[] d;
    public final CountDownLatch f18016e;

    public h3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f18013a = i10;
        this.f18014b = filePathDatabase;
        this.f18015c = str;
        this.d = zArr;
        this.f18016e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f18013a) {
            case 0:
                FilePathDatabase.g(this.f18014b, this.f18015c, this.d, this.f18016e);
                return;
            default:
                FilePathDatabase.e(this.f18014b, this.f18015c, this.d, this.f18016e);
                return;
        }
    }
}
