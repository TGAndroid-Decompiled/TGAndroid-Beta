package org.telegram.messenger;
public final class v1 implements Runnable {
    public final int f18626a;
    public final String f18627b;

    public v1(String str, int i10) {
        this.f18626a = i10;
        this.f18627b = str;
    }

    @Override
    public final void run() {
        switch (this.f18626a) {
            case 0:
                ContactsController.lambda$markAsContacted$49(this.f18627b);
                return;
            case 1:
                FileLog.lambda$w$7(this.f18627b);
                return;
            case 2:
                FileLog.lambda$e$3(this.f18627b);
                return;
            case 3:
                FileLog.lambda$d$6(this.f18627b);
                return;
            case 4:
                GcmPushListenerService.c(this.f18627b);
                return;
            default:
                SmsReceiver.a(this.f18627b);
                return;
        }
    }
}
