package defpackage;

import org.telegram.messenger.PushListenerController;
public final class zw8 implements Runnable {
    public final byte a;
    public final String b;
    public final String c;
    public final long d;

    public zw8(String str, String str2, long j, byte b) {
        this.a = b;
        this.b = str;
        this.c = str2;
        this.d = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        long j = this.d;
        String str = this.c;
        String str2 = this.b;
        switch (b) {
            case 0:
                PushListenerController.c(j, str2, str);
                return;
            default:
                PushListenerController.h(j, str2, str);
                return;
        }
    }
}
