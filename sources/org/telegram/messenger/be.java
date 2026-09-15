package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class be implements Runnable {
    public final int f15756a;
    public final NotificationCenter.NotificationCenterDelegate f15757b;
    public final long f15758c;
    public final int d;
    public final int e;
    public final boolean f15759f;

    public be(int i10, int i11, int i12, long j3, MessagesController messagesController, boolean z10) {
        this.f15756a = i12;
        this.f15757b = messagesController;
        this.f15758c = j3;
        this.d = i10;
        this.e = i11;
        this.f15759f = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f15756a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f15757b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$242(this.f15758c, this.d, this.e, this.f15759f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f15758c, this.d, this.e, this.f15759f);
                return;
            default:
                int i11 = ChatActivityEnterView.f21731m5;
                ((ChatActivityEnterView) notificationCenterDelegate).T0(this.d, this.f15759f, this.e, false, this.f15758c);
                return;
        }
    }

    public be(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j3) {
        this.f15756a = 2;
        this.f15757b = chatActivityEnterView;
        this.f15759f = z10;
        this.d = i10;
        this.e = i11;
        this.f15758c = j3;
    }
}
