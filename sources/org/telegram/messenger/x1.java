package org.telegram.messenger;
public final class x1 implements Runnable {
    public final int f20101a;
    public final String f20102b;

    public x1(String str, int i10) {
        this.f20101a = i10;
        this.f20102b = str;
    }

    @Override
    public final void run() {
        switch (this.f20101a) {
            case 0:
                ContactsController.lambda$markAsContacted$49(this.f20102b);
                return;
            case 1:
                FileLog.lambda$w$8(this.f20102b);
                return;
            case 2:
                FileLog.lambda$e$4(this.f20102b);
                return;
            case 3:
                FileLog.lambda$d$7(this.f20102b);
                return;
            case 4:
                GcmPushListenerService.c(this.f20102b);
                return;
            default:
                SmsReceiver.a(this.f20102b);
                return;
        }
    }
}
