package org.telegram.messenger;
public final class sh implements Runnable {
    public final int f19175a;
    public final String f19176b;
    public final String f19177c;
    public final long d;

    public sh(int i10, long j3, String str, String str2) {
        this.f19175a = i10;
        this.f19176b = str;
        this.f19177c = str2;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19175a) {
            case 0:
                PushListenerController.c(this.d, this.f19176b, this.f19177c);
                return;
            default:
                PushListenerController.h(this.d, this.f19176b, this.f19177c);
                return;
        }
    }
}
