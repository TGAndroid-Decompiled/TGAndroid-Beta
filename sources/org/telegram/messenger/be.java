package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class be implements Runnable {
    public final int f15994a;
    public final NotificationCenter.NotificationCenterDelegate f15995b;
    public final long f15996c;
    public final int d;
    public final int e;
    public final boolean f15997f;

    public be(int i10, int i11, int i12, long j3, MessagesController messagesController, boolean z10) {
        this.f15994a = i12;
        this.f15995b = messagesController;
        this.f15996c = j3;
        this.d = i10;
        this.e = i11;
        this.f15997f = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f15994a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f15995b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$242(this.f15996c, this.d, this.e, this.f15997f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f15996c, this.d, this.e, this.f15997f);
                return;
            default:
                int i11 = ChatActivityEnterView.f21967n5;
                ((ChatActivityEnterView) notificationCenterDelegate).T0(this.d, this.f15997f, this.e, false, this.f15996c);
                return;
        }
    }

    public be(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j3) {
        this.f15994a = 2;
        this.f15995b = chatActivityEnterView;
        this.f15997f = z10;
        this.d = i10;
        this.e = i11;
        this.f15996c = j3;
    }
}
