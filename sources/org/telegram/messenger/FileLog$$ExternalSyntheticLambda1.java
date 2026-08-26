package org.telegram.messenger;

public final class FileLog$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final String f$0;

    public FileLog$$ExternalSyntheticLambda1(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                FileLog.lambda$w$7(this.f$0);
                break;
            case 1:
                ContactsController.lambda$markAsContacted$49(this.f$0);
                break;
            case 2:
                FileLog.lambda$e$3(this.f$0);
                break;
            case 3:
                FileLog.lambda$d$6(this.f$0);
                break;
            case 4:
                GcmPushListenerService.lambda$onNewToken$0(this.f$0);
                break;
            default:
                SmsReceiver.lambda$onReceive$0(this.f$0);
                break;
        }
    }
}
