package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class be implements Runnable {
    public final int f15754a;
    public final NotificationCenter.NotificationCenterDelegate f15755b;
    public final long f15756c;
    public final int d;
    public final int e;
    public final boolean f15757f;

    public be(int i10, int i11, int i12, long j3, MessagesController messagesController, boolean z10) {
        this.f15754a = i12;
        this.f15755b = messagesController;
        this.f15756c = j3;
        this.d = i10;
        this.e = i11;
        this.f15757f = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f15754a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f15755b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$242(this.f15756c, this.d, this.e, this.f15757f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f15756c, this.d, this.e, this.f15757f);
                return;
            default:
                int i11 = ChatActivityEnterView.f21727n5;
                ((ChatActivityEnterView) notificationCenterDelegate).U0(this.d, this.f15757f, this.e, false, this.f15756c);
                return;
        }
    }

    public be(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j3) {
        this.f15754a = 2;
        this.f15755b = chatActivityEnterView;
        this.f15757f = z10;
        this.d = i10;
        this.e = i11;
        this.f15756c = j3;
    }
}
