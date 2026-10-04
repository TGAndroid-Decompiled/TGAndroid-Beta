package org.telegram.messenger;
public final class u1 implements Runnable {
    public final int f19284a;
    public final String f19285b;

    public u1(String str, int i10) {
        this.f19284a = i10;
        this.f19285b = str;
    }

    @Override
    public final void run() {
        switch (this.f19284a) {
            case 0:
                ContactsController.lambda$markAsContacted$49(this.f19285b);
                return;
            case 1:
                FileLog.lambda$w$7(this.f19285b);
                return;
            case 2:
                FileLog.lambda$e$3(this.f19285b);
                return;
            case 3:
                FileLog.lambda$d$6(this.f19285b);
                return;
            case 4:
                GcmPushListenerService.c(this.f19285b);
                return;
            default:
                SmsReceiver.a(this.f19285b);
                return;
        }
    }
}
