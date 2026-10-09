package org.telegram.messenger;
public final class sh implements Runnable {
    public final int f19167a;
    public final String f19168b;
    public final String f19169c;
    public final long d;

    public sh(int i10, long j3, String str, String str2) {
        this.f19167a = i10;
        this.f19168b = str;
        this.f19169c = str2;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19167a) {
            case 0:
                PushListenerController.c(this.d, this.f19168b, this.f19169c);
                return;
            default:
                PushListenerController.h(this.d, this.f19168b, this.f19169c);
                return;
        }
    }
}
