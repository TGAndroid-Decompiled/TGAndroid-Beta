package org.telegram.messenger;
public final class y1 implements Runnable {
    public final int f21869a;
    public final String f21870b;

    public y1(String str, int i10) {
        this.f21869a = i10;
        this.f21870b = str;
    }

    @Override
    public final void run() {
        switch (this.f21869a) {
            case 0:
                ContactsController.lambda$markAsContacted$49(this.f21870b);
                return;
            case 1:
                FileLog.lambda$w$8(this.f21870b);
                return;
            case 2:
                FileLog.lambda$e$4(this.f21870b);
                return;
            case 3:
                FileLog.lambda$d$7(this.f21870b);
                return;
            case 4:
                GcmPushListenerService.c(this.f21870b);
                return;
            default:
                SmsReceiver.a(this.f21870b);
                return;
        }
    }
}
