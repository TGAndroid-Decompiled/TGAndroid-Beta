package org.telegram.messenger;
public final class u1 implements Runnable {
    public final int f19324a;
    public final String f19325b;

    public u1(String str, int i10) {
        this.f19324a = i10;
        this.f19325b = str;
    }

    @Override
    public final void run() {
        switch (this.f19324a) {
            case 0:
                ContactsController.lambda$markAsContacted$49(this.f19325b);
                return;
            case 1:
                FileLog.lambda$w$8(this.f19325b);
                return;
            case 2:
                FileLog.lambda$e$4(this.f19325b);
                return;
            case 3:
                FileLog.lambda$d$7(this.f19325b);
                return;
            case 4:
                GcmPushListenerService.c(this.f19325b);
                return;
            default:
                SmsReceiver.a(this.f19325b);
                return;
        }
    }
}
