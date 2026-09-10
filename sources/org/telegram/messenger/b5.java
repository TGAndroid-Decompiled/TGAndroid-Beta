package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class b5 implements Runnable {
    public final int f14755a = 0;
    public final long f14756b;
    public final long f14757c;
    public final int d;
    public final String e;

    public b5(int i10, String str, long j3, long j10) {
        this.d = i10;
        this.e = str;
        this.f14756b = j3;
        this.f14757c = j10;
    }

    @Override
    public final void run() {
        switch (this.f14755a) {
            case 0:
                ImageLoader.AnonymousClass5.i(this.d, this.e, this.f14756b, this.f14757c);
                return;
            default:
                FileLog.i(this.d, this.e, this.f14756b, this.f14757c);
                return;
        }
    }

    public b5(long j3, long j10, int i10, String str) {
        this.f14756b = j3;
        this.f14757c = j10;
        this.d = i10;
        this.e = str;
    }
}
