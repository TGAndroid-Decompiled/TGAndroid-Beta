package org.telegram.messenger;
public final class w1 implements Runnable {
    public final int f18888a;
    public final String f18889b;

    public w1(String str, int i10) {
        this.f18888a = i10;
        this.f18889b = str;
    }

    @Override
    public final void run() {
        switch (this.f18888a) {
            case 0:
                ContactsController.lambda$markAsContacted$49(this.f18889b);
                return;
            case 1:
                FileLog.lambda$w$8(this.f18889b);
                return;
            case 2:
                FileLog.lambda$e$4(this.f18889b);
                return;
            case 3:
                FileLog.lambda$d$7(this.f18889b);
                return;
            case 4:
                GcmPushListenerService.c(this.f18889b);
                return;
            default:
                SmsReceiver.a(this.f18889b);
                return;
        }
    }
}
