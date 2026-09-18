package org.telegram.messenger;
public final class s1 implements Runnable {
    public final int f17284a;
    public final String f17285b;

    public s1(String str, int i10) {
        this.f17284a = i10;
        this.f17285b = str;
    }

    @Override
    public final void run() {
        switch (this.f17284a) {
            case 0:
                ContactsController.lambda$markAsContacted$49(this.f17285b);
                return;
            case 1:
                FileLog.lambda$w$7(this.f17285b);
                return;
            case 2:
                FileLog.lambda$e$3(this.f17285b);
                return;
            case 3:
                FileLog.lambda$d$6(this.f17285b);
                return;
            case 4:
                GcmPushListenerService.c(this.f17285b);
                return;
            default:
                SmsReceiver.a(this.f17285b);
                return;
        }
    }
}
