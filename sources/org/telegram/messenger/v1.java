package org.telegram.messenger;
public final class v1 implements Runnable {
    public final int f18608a;
    public final String f18609b;

    public v1(String str, int i10) {
        this.f18608a = i10;
        this.f18609b = str;
    }

    @Override
    public final void run() {
        switch (this.f18608a) {
            case 0:
                ContactsController.lambda$markAsContacted$49(this.f18609b);
                return;
            case 1:
                FileLog.lambda$w$7(this.f18609b);
                return;
            case 2:
                FileLog.lambda$e$3(this.f18609b);
                return;
            case 3:
                FileLog.lambda$d$6(this.f18609b);
                return;
            case 4:
                GcmPushListenerService.c(this.f18609b);
                return;
            default:
                SmsReceiver.a(this.f18609b);
                return;
        }
    }
}
