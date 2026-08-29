package org.telegram.messenger;
public final class u1 implements Runnable {
    public final int f21688a;
    public final String f21689b;

    public u1(String str, int i10) {
        this.f21688a = i10;
        this.f21689b = str;
    }

    @Override
    public final void run() {
        switch (this.f21688a) {
            case 0:
                ContactsController.lambda$markAsContacted$49(this.f21689b);
                return;
            case 1:
                FileLog.lambda$w$7(this.f21689b);
                return;
            case 2:
                FileLog.lambda$e$3(this.f21689b);
                return;
            case 3:
                FileLog.lambda$d$6(this.f21689b);
                return;
            case 4:
                GcmPushListenerService.c(this.f21689b);
                return;
            default:
                SmsReceiver.a(this.f21689b);
                return;
        }
    }
}
