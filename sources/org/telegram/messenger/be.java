package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class be implements Runnable {
    public final int f15979a;
    public final NotificationCenter.NotificationCenterDelegate f15980b;
    public final long f15981c;
    public final int d;
    public final int e;
    public final boolean f15982f;

    public be(int i10, int i11, int i12, long j3, MessagesController messagesController, boolean z10) {
        this.f15979a = i12;
        this.f15980b = messagesController;
        this.f15981c = j3;
        this.d = i10;
        this.e = i11;
        this.f15982f = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f15979a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f15980b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$242(this.f15981c, this.d, this.e, this.f15982f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f15981c, this.d, this.e, this.f15982f);
                return;
            default:
                int i11 = ChatActivityEnterView.f21952m5;
                ((ChatActivityEnterView) notificationCenterDelegate).T0(this.d, this.f15982f, this.e, false, this.f15981c);
                return;
        }
    }

    public be(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j3) {
        this.f15979a = 2;
        this.f15980b = chatActivityEnterView;
        this.f15982f = z10;
        this.d = i10;
        this.e = i11;
        this.f15981c = j3;
    }
}
