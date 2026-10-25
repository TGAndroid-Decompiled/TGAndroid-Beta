package org.telegram.messenger;
public final class be implements Runnable {
    public final int f19710a;
    public final MessagesController f19711b;

    public be(MessagesController messagesController, int i10) {
        this.f19710a = i10;
        this.f19711b = messagesController;
    }

    @Override
    public final void run() {
        switch (this.f19710a) {
            case 0:
                MessagesController.y1(this.f19711b);
                return;
            case 1:
                MessagesController.r(this.f19711b);
                return;
            case 2:
                this.f19711b.lambda$removeWebBrowserException$519();
                return;
            case 3:
                MessagesController.d7(this.f19711b);
                return;
            case 4:
                MessagesController.U8(this.f19711b);
                return;
            case 5:
                this.f19711b.loadAppConfig();
                return;
            case 6:
                MessagesController.U6(this.f19711b);
                return;
            case 7:
                MessagesController.z0(this.f19711b);
                return;
            case 8:
                MessagesController.s(this.f19711b);
                return;
            case 9:
                MessagesController.h1(this.f19711b);
                return;
            case 10:
                MessagesController.H(this.f19711b);
                return;
            case 11:
                MessagesController.a9(this.f19711b);
                return;
            default:
                MessagesController.p8(this.f19711b);
                return;
        }
    }
}
