package org.telegram.messenger;
public final class s1 implements Runnable {
    public final int f17275a;
    public final String f17276b;

    public s1(String str, int i10) {
        this.f17275a = i10;
        this.f17276b = str;
    }

    @Override
    public final void run() {
        switch (this.f17275a) {
            case 0:
                ContactsController.lambda$markAsContacted$49(this.f17276b);
                return;
            case 1:
                FileLog.lambda$w$7(this.f17276b);
                return;
            case 2:
                FileLog.lambda$e$3(this.f17276b);
                return;
            case 3:
                FileLog.lambda$d$6(this.f17276b);
                return;
            case 4:
                GcmPushListenerService.c(this.f17276b);
                return;
            default:
                SmsReceiver.a(this.f17276b);
                return;
        }
    }
}
