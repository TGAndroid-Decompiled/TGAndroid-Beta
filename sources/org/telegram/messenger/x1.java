package org.telegram.messenger;
public final class x1 implements Runnable {
    public final int f20039a;
    public final String f20040b;

    public x1(String str, int i10) {
        this.f20039a = i10;
        this.f20040b = str;
    }

    @Override
    public final void run() {
        switch (this.f20039a) {
            case 0:
                ContactsController.lambda$markAsContacted$49(this.f20040b);
                return;
            case 1:
                FileLog.lambda$w$8(this.f20040b);
                return;
            case 2:
                FileLog.lambda$e$4(this.f20040b);
                return;
            case 3:
                FileLog.lambda$d$7(this.f20040b);
                return;
            case 4:
                GcmPushListenerService.c(this.f20040b);
                return;
            default:
                SmsReceiver.a(this.f20040b);
                return;
        }
    }
}
