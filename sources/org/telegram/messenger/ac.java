package org.telegram.messenger;
public final class ac implements Runnable {
    public final int f19723a;
    public final MessagesController f19724b;
    public final a0.h f19725c;

    public ac(MessagesController messagesController, a0.h hVar, int i9) {
        this.f19723a = i9;
        this.f19724b = messagesController;
        this.f19725c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f19723a) {
            case 0:
                this.f19724b.lambda$processUpdateArray$407(this.f19725c);
                return;
            case 1:
                this.f19724b.lambda$processUpdateArray$406(this.f19725c);
                return;
            default:
                this.f19724b.lambda$getChannelDifference$340(this.f19725c);
                return;
        }
    }
}
