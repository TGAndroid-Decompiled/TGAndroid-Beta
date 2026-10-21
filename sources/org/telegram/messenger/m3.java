package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class m3 implements Runnable {
    public final int f18925a;
    public final FilePathDatabase f18926b;
    public final String f18927c;
    public final boolean[] d;
    public final CountDownLatch e;

    public m3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f18925a = i10;
        this.f18926b = filePathDatabase;
        this.f18927c = str;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f18925a) {
            case 0:
                FilePathDatabase.g(this.f18926b, this.f18927c, this.d, this.e);
                return;
            default:
                FilePathDatabase.e(this.f18926b, this.f18927c, this.d, this.e);
                return;
        }
    }
}
