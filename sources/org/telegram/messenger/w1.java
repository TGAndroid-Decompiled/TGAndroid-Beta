package org.telegram.messenger;
public final class w1 implements Runnable {
    public final int f16820a;
    public final String f16821b;

    public w1(String str, int i10) {
        this.f16820a = i10;
        this.f16821b = str;
    }

    @Override
    public final void run() {
        switch (this.f16820a) {
            case 0:
                ContactsController.lambda$markAsContacted$49(this.f16821b);
                return;
            case 1:
                FileLog.lambda$w$7(this.f16821b);
                return;
            case 2:
                FileLog.lambda$e$3(this.f16821b);
                return;
            case 3:
                FileLog.lambda$d$6(this.f16821b);
                return;
            case 4:
                GcmPushListenerService.c(this.f16821b);
                return;
            default:
                SmsReceiver.a(this.f16821b);
                return;
        }
    }
}
