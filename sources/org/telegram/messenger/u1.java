package org.telegram.messenger;

public final class u1 implements Runnable {

    public final int f21672a;

    public final String f21673b;

    public u1(String str, int i10) {
        this.f21672a = i10;
        this.f21673b = str;
    }

    @Override
    public final void run() {
        switch (this.f21672a) {
            case 0:
                ContactsController.lambda$markAsContacted$49(this.f21673b);
                break;
            case 1:
                FileLog.lambda$w$7(this.f21673b);
                break;
            case 2:
                FileLog.lambda$e$3(this.f21673b);
                break;
            case 3:
                FileLog.lambda$d$6(this.f21673b);
                break;
            case 4:
                GcmPushListenerService.lambda$onNewToken$0(this.f21673b);
                break;
            default:
                SmsReceiver.lambda$onReceive$0(this.f21673b);
                break;
        }
    }
}
