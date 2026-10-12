package org.telegram.messenger;
public final class x1 implements Runnable {
    public final int f19517a;
    public final String f19518b;

    public x1(String str, int i10) {
        this.f19517a = i10;
        this.f19518b = str;
    }

    @Override
    public final void run() {
        switch (this.f19517a) {
            case 0:
                ContactsController.lambda$markAsContacted$49(this.f19518b);
                return;
            case 1:
                FileLog.lambda$w$8(this.f19518b);
                return;
            case 2:
                FileLog.lambda$e$4(this.f19518b);
                return;
            case 3:
                FileLog.lambda$d$7(this.f19518b);
                return;
            case 4:
                GcmPushListenerService.c(this.f19518b);
                return;
            default:
                SmsReceiver.a(this.f19518b);
                return;
        }
    }
}
