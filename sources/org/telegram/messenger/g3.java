package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class g3 implements Runnable {
    public final int f17909a;
    public final FilePathDatabase f17910b;
    public final String f17911c;
    public final boolean[] d;
    public final CountDownLatch f17912e;

    public g3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f17909a = i10;
        this.f17910b = filePathDatabase;
        this.f17911c = str;
        this.d = zArr;
        this.f17912e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f17909a) {
            case 0:
                FilePathDatabase.g(this.f17910b, this.f17911c, this.d, this.f17912e);
                return;
            default:
                FilePathDatabase.e(this.f17910b, this.f17911c, this.d, this.f17912e);
                return;
        }
    }
}
