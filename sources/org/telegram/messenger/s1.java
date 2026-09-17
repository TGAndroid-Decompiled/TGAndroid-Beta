package org.telegram.messenger;
public final class s1 implements Runnable {
    public final int f18969a;
    public final String f18970b;

    public s1(String str, int i10) {
        this.f18969a = i10;
        this.f18970b = str;
    }

    @Override
    public final void run() {
        switch (this.f18969a) {
            case 0:
                ContactsController.lambda$markAsContacted$49(this.f18970b);
                return;
            case 1:
                FileLog.lambda$w$7(this.f18970b);
                return;
            case 2:
                FileLog.lambda$e$3(this.f18970b);
                return;
            case 3:
                FileLog.lambda$d$6(this.f18970b);
                return;
            case 4:
                GcmPushListenerService.c(this.f18970b);
                return;
            default:
                SmsReceiver.a(this.f18970b);
                return;
        }
    }
}
