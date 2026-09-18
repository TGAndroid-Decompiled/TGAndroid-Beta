package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class be implements Runnable {
    public final int f15943a;
    public final NotificationCenter.NotificationCenterDelegate f15944b;
    public final long f15945c;
    public final int d;
    public final int e;
    public final boolean f15946f;

    public be(int i10, int i11, int i12, long j3, MessagesController messagesController, boolean z10) {
        this.f15943a = i12;
        this.f15944b = messagesController;
        this.f15945c = j3;
        this.d = i10;
        this.e = i11;
        this.f15946f = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f15943a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f15944b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$242(this.f15945c, this.d, this.e, this.f15946f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f15945c, this.d, this.e, this.f15946f);
                return;
            default:
                int i11 = ChatActivityEnterView.f21917m5;
                ((ChatActivityEnterView) notificationCenterDelegate).T0(this.d, this.f15946f, this.e, false, this.f15945c);
                return;
        }
    }

    public be(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j3) {
        this.f15943a = 2;
        this.f15944b = chatActivityEnterView;
        this.f15946f = z10;
        this.d = i10;
        this.e = i11;
        this.f15945c = j3;
    }
}
