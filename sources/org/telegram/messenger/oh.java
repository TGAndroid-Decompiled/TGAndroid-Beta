package org.telegram.messenger;
public final class oh implements Runnable {
    public final int f19183a;
    public final String f19184b;
    public final String f19185c;
    public final long d;

    public oh(int i10, long j10, String str, String str2) {
        this.f19183a = i10;
        this.f19184b = str;
        this.f19185c = str2;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19183a) {
            case 0:
                PushListenerController.c(this.d, this.f19184b, this.f19185c);
                return;
            default:
                PushListenerController.h(this.d, this.f19184b, this.f19185c);
                return;
        }
    }
}
