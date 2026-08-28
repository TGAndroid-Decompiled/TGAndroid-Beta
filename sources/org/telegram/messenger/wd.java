package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class wd implements Runnable {
    public final int f22021a;
    public final NotificationCenter.NotificationCenterDelegate f22022b;
    public final long f22023c;
    public final int d;
    public final int f22024e;
    public final boolean f22025f;

    public wd(int i9, int i10, int i11, long j10, MessagesController messagesController, boolean z10) {
        this.f22021a = i11;
        this.f22022b = messagesController;
        this.f22023c = j10;
        this.d = i9;
        this.f22024e = i10;
        this.f22025f = z10;
    }

    @Override
    public final void run() {
        int i9 = this.f22021a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f22022b;
        switch (i9) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$242(this.f22023c, this.d, this.f22024e, this.f22025f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f22023c, this.d, this.f22024e, this.f22025f);
                return;
            default:
                int i10 = ChatActivityEnterView.f26074i5;
                ((ChatActivityEnterView) notificationCenterDelegate).T0(this.d, this.f22025f, this.f22024e, false, this.f22023c);
                return;
        }
    }

    public wd(ChatActivityEnterView chatActivityEnterView, boolean z10, int i9, int i10, long j10) {
        this.f22021a = 2;
        this.f22022b = chatActivityEnterView;
        this.f22025f = z10;
        this.d = i9;
        this.f22024e = i10;
        this.f22023c = j10;
    }
}
