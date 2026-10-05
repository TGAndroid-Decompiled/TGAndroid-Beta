package org.telegram.messenger;
public final class u1 implements Runnable {
    public final int f19295a;
    public final String f19296b;

    public u1(String str, int i10) {
        this.f19295a = i10;
        this.f19296b = str;
    }

    @Override
    public final void run() {
        switch (this.f19295a) {
            case 0:
                ContactsController.lambda$markAsContacted$49(this.f19296b);
                return;
            case 1:
                FileLog.lambda$w$7(this.f19296b);
                return;
            case 2:
                FileLog.lambda$e$3(this.f19296b);
                return;
            case 3:
                FileLog.lambda$d$6(this.f19296b);
                return;
            case 4:
                GcmPushListenerService.c(this.f19296b);
                return;
            default:
                SmsReceiver.a(this.f19296b);
                return;
        }
    }
}
