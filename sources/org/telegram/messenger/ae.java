package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ae implements Runnable {
    public final int f15903a;
    public final NotificationCenter.NotificationCenterDelegate f15904b;
    public final long f15905c;
    public final int d;
    public final int e;
    public final boolean f15906f;

    public ae(int i10, int i11, int i12, long j3, MessagesController messagesController, boolean z10) {
        this.f15903a = i12;
        this.f15904b = messagesController;
        this.f15905c = j3;
        this.d = i10;
        this.e = i11;
        this.f15906f = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f15903a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f15904b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$242(this.f15905c, this.d, this.e, this.f15906f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f15905c, this.d, this.e, this.f15906f);
                return;
            default:
                int i11 = ChatActivityEnterView.f21952n5;
                ((ChatActivityEnterView) notificationCenterDelegate).T0(this.d, this.f15906f, this.e, false, this.f15905c);
                return;
        }
    }

    public ae(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j3) {
        this.f15903a = 2;
        this.f15904b = chatActivityEnterView;
        this.f15906f = z10;
        this.d = i10;
        this.e = i11;
        this.f15905c = j3;
    }
}
