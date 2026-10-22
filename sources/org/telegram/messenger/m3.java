package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
public final class m3 implements Runnable {
    public final int f18934a;
    public final FilePathDatabase f18935b;
    public final String f18936c;
    public final boolean[] d;
    public final CountDownLatch e;

    public m3(FilePathDatabase filePathDatabase, String str, boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        this.f18934a = i10;
        this.f18935b = filePathDatabase;
        this.f18936c = str;
        this.d = zArr;
        this.e = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f18934a) {
            case 0:
                FilePathDatabase.g(this.f18935b, this.f18936c, this.d, this.e);
                return;
            default:
                FilePathDatabase.e(this.f18935b, this.f18936c, this.d, this.e);
                return;
        }
    }
}
