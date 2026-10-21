package org.telegram.messenger;
public final class x1 implements Runnable {
    public final int f20037a;
    public final String f20038b;

    public x1(String str, int i10) {
        this.f20037a = i10;
        this.f20038b = str;
    }

    @Override
    public final void run() {
        switch (this.f20037a) {
            case 0:
                ContactsController.lambda$markAsContacted$49(this.f20038b);
                return;
            case 1:
                FileLog.lambda$w$8(this.f20038b);
                return;
            case 2:
                FileLog.lambda$e$4(this.f20038b);
                return;
            case 3:
                FileLog.lambda$d$7(this.f20038b);
                return;
            case 4:
                GcmPushListenerService.c(this.f20038b);
                return;
            default:
                SmsReceiver.a(this.f20038b);
                return;
        }
    }
}
