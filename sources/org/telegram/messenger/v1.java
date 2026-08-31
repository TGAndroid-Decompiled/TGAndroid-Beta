package org.telegram.messenger;
public final class v1 implements Runnable {
    public final int f20240a;
    public final String f20241b;

    public v1(String str, int i10) {
        this.f20240a = i10;
        this.f20241b = str;
    }

    @Override
    public final void run() {
        switch (this.f20240a) {
            case 0:
                ContactsController.lambda$markAsContacted$49(this.f20241b);
                return;
            case 1:
                FileLog.lambda$w$7(this.f20241b);
                return;
            case 2:
                FileLog.lambda$e$3(this.f20241b);
                return;
            case 3:
                FileLog.lambda$d$6(this.f20241b);
                return;
            case 4:
                GcmPushListenerService.c(this.f20241b);
                return;
            default:
                SmsReceiver.a(this.f20241b);
                return;
        }
    }
}
