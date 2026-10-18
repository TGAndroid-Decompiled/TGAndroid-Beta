package org.telegram.messenger;
public final class w1 implements Runnable {
    public final int f19950a;
    public final String f19951b;

    public w1(String str, int i10) {
        this.f19950a = i10;
        this.f19951b = str;
    }

    @Override
    public final void run() {
        switch (this.f19950a) {
            case 0:
                ContactsController.lambda$markAsContacted$49(this.f19951b);
                return;
            case 1:
                FileLog.lambda$w$8(this.f19951b);
                return;
            case 2:
                FileLog.lambda$e$4(this.f19951b);
                return;
            case 3:
                FileLog.lambda$d$7(this.f19951b);
                return;
            case 4:
                GcmPushListenerService.c(this.f19951b);
                return;
            default:
                SmsReceiver.a(this.f19951b);
                return;
        }
    }
}
