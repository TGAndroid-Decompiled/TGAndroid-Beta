package org.telegram.messenger;

public final class qa implements Runnable {

    public final int f21341a;

    public final MessagesController f21342b;

    public final gf.u f21343c;

    public qa(MessagesController messagesController, gf.u uVar, int i10) {
        this.f21341a = i10;
        this.f21342b = messagesController;
        this.f21343c = uVar;
    }

    @Override
    public final void run() {
        switch (this.f21341a) {
            case 0:
                this.f21342b.lambda$processUpdateArray$402(this.f21343c);
                break;
            case 1:
                this.f21342b.lambda$processUpdateArray$404(this.f21343c);
                break;
            default:
                this.f21342b.lambda$processUpdateArray$399(this.f21343c);
                break;
        }
    }
}
