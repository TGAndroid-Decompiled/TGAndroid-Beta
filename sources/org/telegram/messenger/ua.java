package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ua implements Runnable {
    public final int f19330a;
    public final NotificationCenter.NotificationCenterDelegate f19331b;
    public final long f19332c;
    public final int d;
    public final int f19333e;
    public final boolean f19334f;

    public ua(int i10, int i11, int i12, long j3, MessagesController messagesController, boolean z10) {
        this.f19330a = i12;
        this.f19331b = messagesController;
        this.f19332c = j3;
        this.d = i10;
        this.f19333e = i11;
        this.f19334f = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f19330a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f19331b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$240(this.f19332c, this.d, this.f19333e, this.f19334f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f19332c, this.d, this.f19333e, this.f19334f);
                return;
            default:
                int i11 = ChatActivityEnterView.f23842n5;
                ((ChatActivityEnterView) notificationCenterDelegate).R0(this.d, this.f19334f, this.f19333e, false, this.f19332c);
                return;
        }
    }

    public ua(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j3) {
        this.f19330a = 2;
        this.f19331b = chatActivityEnterView;
        this.f19334f = z10;
        this.d = i10;
        this.f19333e = i11;
        this.f19332c = j3;
    }
}
