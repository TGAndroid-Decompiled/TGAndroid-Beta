package org.telegram.messenger;
public final class y1 implements Runnable {
    public final int f21871a;
    public final String f21872b;

    public y1(String str, int i10) {
        this.f21871a = i10;
        this.f21872b = str;
    }

    @Override
    public final void run() {
        switch (this.f21871a) {
            case 0:
                ContactsController.lambda$markAsContacted$49(this.f21872b);
                return;
            case 1:
                FileLog.lambda$w$8(this.f21872b);
                return;
            case 2:
                FileLog.lambda$e$4(this.f21872b);
                return;
            case 3:
                FileLog.lambda$d$7(this.f21872b);
                return;
            case 4:
                GcmPushListenerService.c(this.f21872b);
                return;
            default:
                SmsReceiver.a(this.f21872b);
                return;
        }
    }
}
