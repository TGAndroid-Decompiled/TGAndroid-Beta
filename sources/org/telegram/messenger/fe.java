package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class fe implements Runnable {
    public final int f17203a;
    public final NotificationCenter.NotificationCenterDelegate f17204b;
    public final long f17205c;
    public final int d;
    public final int e;
    public final boolean f17206f;

    public fe(int i10, int i11, int i12, long j10, MessagesController messagesController, boolean z4) {
        this.f17203a = i12;
        this.f17204b = messagesController;
        this.f17205c = j10;
        this.d = i10;
        this.e = i11;
        this.f17206f = z4;
    }

    @Override
    public final void run() {
        int i10 = this.f17203a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f17204b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$242(this.f17205c, this.d, this.e, this.f17206f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f17205c, this.d, this.e, this.f17206f);
                return;
            default:
                int i11 = ChatActivityEnterView.f22702j5;
                ((ChatActivityEnterView) notificationCenterDelegate).T0(this.d, this.f17206f, this.e, false, this.f17205c);
                return;
        }
    }

    public fe(ChatActivityEnterView chatActivityEnterView, boolean z4, int i10, int i11, long j10) {
        this.f17203a = 2;
        this.f17204b = chatActivityEnterView;
        this.f17206f = z4;
        this.d = i10;
        this.e = i11;
        this.f17205c = j10;
    }
}
