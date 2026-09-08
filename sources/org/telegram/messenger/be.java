package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class be implements Runnable {
    public final int f17276a;
    public final NotificationCenter.NotificationCenterDelegate f17277b;
    public final long f17278c;
    public final int d;
    public final int f17279e;
    public final boolean f17280f;

    public be(int i10, int i11, int i12, long j3, MessagesController messagesController, boolean z10) {
        this.f17276a = i12;
        this.f17277b = messagesController;
        this.f17278c = j3;
        this.d = i10;
        this.f17279e = i11;
        this.f17280f = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f17276a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f17277b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$242(this.f17278c, this.d, this.f17279e, this.f17280f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f17278c, this.d, this.f17279e, this.f17280f);
                return;
            default:
                int i11 = ChatActivityEnterView.f23688m5;
                ((ChatActivityEnterView) notificationCenterDelegate).T0(this.d, this.f17280f, this.f17279e, false, this.f17278c);
                return;
        }
    }

    public be(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j3) {
        this.f17276a = 2;
        this.f17277b = chatActivityEnterView;
        this.f17280f = z10;
        this.d = i10;
        this.f17279e = i11;
        this.f17278c = j3;
    }
}
