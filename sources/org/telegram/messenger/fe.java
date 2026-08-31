package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class fe implements Runnable {
    public final int f18668a;
    public final NotificationCenter.NotificationCenterDelegate f18669b;
    public final long f18670c;
    public final int d;
    public final int f18671e;
    public final boolean f18672f;

    public fe(int i10, int i11, int i12, long j10, MessagesController messagesController, boolean z4) {
        this.f18668a = i12;
        this.f18669b = messagesController;
        this.f18670c = j10;
        this.d = i10;
        this.f18671e = i11;
        this.f18672f = z4;
    }

    @Override
    public final void run() {
        int i10 = this.f18668a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f18669b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$242(this.f18670c, this.d, this.f18671e, this.f18672f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f18670c, this.d, this.f18671e, this.f18672f);
                return;
            default:
                int i11 = ChatActivityEnterView.f24568j5;
                ((ChatActivityEnterView) notificationCenterDelegate).T0(this.d, this.f18672f, this.f18671e, false, this.f18670c);
                return;
        }
    }

    public fe(ChatActivityEnterView chatActivityEnterView, boolean z4, int i10, int i11, long j10) {
        this.f18668a = 2;
        this.f18669b = chatActivityEnterView;
        this.f18672f = z4;
        this.d = i10;
        this.f18671e = i11;
        this.f18670c = j10;
    }
}
