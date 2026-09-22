package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class g3 implements Runnable {
    public final int f16416a;
    public final FilePathDatabase f16417b;
    public final String f16418c;
    public final boolean[] d;
    public final CountDownLatch e;

    public g3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f16416a = i10;
        this.f16417b = filePathDatabase;
        this.f16418c = str;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f16416a) {
            case 0:
                FilePathDatabase.g(this.f16417b, this.f16418c, this.d, this.e);
                return;
            default:
                FilePathDatabase.e(this.f16417b, this.f16418c, this.d, this.e);
                return;
        }
    }
}
