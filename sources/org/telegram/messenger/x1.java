package org.telegram.messenger;
public final class x1 implements Runnable {
    public final int f19518a;
    public final String f19519b;

    public x1(String str, int i10) {
        this.f19518a = i10;
        this.f19519b = str;
    }

    @Override
    public final void run() {
        switch (this.f19518a) {
            case 0:
                ContactsController.lambda$markAsContacted$49(this.f19519b);
                return;
            case 1:
                FileLog.lambda$w$8(this.f19519b);
                return;
            case 2:
                FileLog.lambda$e$4(this.f19519b);
                return;
            case 3:
                FileLog.lambda$d$7(this.f19519b);
                return;
            case 4:
                GcmPushListenerService.c(this.f19519b);
                return;
            default:
                SmsReceiver.a(this.f19519b);
                return;
        }
    }
}
