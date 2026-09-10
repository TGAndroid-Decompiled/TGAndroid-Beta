package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class je implements Runnable {
    public final int f15539a;
    public final NotificationCenter.NotificationCenterDelegate f15540b;
    public final long f15541c;
    public final int d;
    public final int e;
    public final boolean f15542f;

    public je(int i10, int i11, int i12, long j3, MessagesController messagesController, boolean z10) {
        this.f15539a = i12;
        this.f15540b = messagesController;
        this.f15541c = j3;
        this.d = i10;
        this.e = i11;
        this.f15542f = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f15539a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f15540b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$242(this.f15541c, this.d, this.e, this.f15542f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f15541c, this.d, this.e, this.f15542f);
                return;
            default:
                int i11 = ChatActivityEnterView.f20816m5;
                ((ChatActivityEnterView) notificationCenterDelegate).T0(this.d, this.f15542f, this.e, false, this.f15541c);
                return;
        }
    }

    public je(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j3) {
        this.f15539a = 2;
        this.f15540b = chatActivityEnterView;
        this.f15542f = z10;
        this.d = i10;
        this.e = i11;
        this.f15541c = j3;
    }
}
