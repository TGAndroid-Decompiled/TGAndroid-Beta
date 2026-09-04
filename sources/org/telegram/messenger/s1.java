package org.telegram.messenger;
public final class s1 implements Runnable {
    public final int f18940a;
    public final String f18941b;

    public s1(String str, int i10) {
        this.f18940a = i10;
        this.f18941b = str;
    }

    @Override
    public final void run() {
        switch (this.f18940a) {
            case 0:
                ContactsController.lambda$markAsContacted$49(this.f18941b);
                return;
            case 1:
                FileLog.lambda$w$7(this.f18941b);
                return;
            case 2:
                FileLog.lambda$e$3(this.f18941b);
                return;
            case 3:
                FileLog.lambda$d$6(this.f18941b);
                return;
            case 4:
                GcmPushListenerService.c(this.f18941b);
                return;
            default:
                SmsReceiver.a(this.f18941b);
                return;
        }
    }
}
