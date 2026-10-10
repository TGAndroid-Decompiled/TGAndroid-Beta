package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ua implements Runnable {
    public final int f19332a;
    public final NotificationCenter.NotificationCenterDelegate f19333b;
    public final long f19334c;
    public final int d;
    public final int f19335e;
    public final boolean f19336f;

    public ua(int i10, int i11, int i12, long j3, MessagesController messagesController, boolean z10) {
        this.f19332a = i12;
        this.f19333b = messagesController;
        this.f19334c = j3;
        this.d = i10;
        this.f19335e = i11;
        this.f19336f = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f19332a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f19333b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$240(this.f19334c, this.d, this.f19335e, this.f19336f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f19334c, this.d, this.f19335e, this.f19336f);
                return;
            default:
                int i11 = ChatActivityEnterView.f23854n5;
                ((ChatActivityEnterView) notificationCenterDelegate).R0(this.d, this.f19336f, this.f19335e, false, this.f19334c);
                return;
        }
    }

    public ua(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j3) {
        this.f19332a = 2;
        this.f19333b = chatActivityEnterView;
        this.f19336f = z10;
        this.d = i10;
        this.f19335e = i11;
        this.f19334c = j3;
    }
}
