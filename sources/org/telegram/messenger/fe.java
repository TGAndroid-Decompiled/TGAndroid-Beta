package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class fe implements Runnable {
    public final int f18670a;
    public final NotificationCenter.NotificationCenterDelegate f18671b;
    public final long f18672c;
    public final int d;
    public final int f18673e;
    public final boolean f18674f;

    public fe(int i10, int i11, int i12, long j10, MessagesController messagesController, boolean z4) {
        this.f18670a = i12;
        this.f18671b = messagesController;
        this.f18672c = j10;
        this.d = i10;
        this.f18673e = i11;
        this.f18674f = z4;
    }

    @Override
    public final void run() {
        int i10 = this.f18670a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f18671b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$242(this.f18672c, this.d, this.f18673e, this.f18674f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f18672c, this.d, this.f18673e, this.f18674f);
                return;
            default:
                int i11 = ChatActivityEnterView.f24570j5;
                ((ChatActivityEnterView) notificationCenterDelegate).T0(this.d, this.f18674f, this.f18673e, false, this.f18672c);
                return;
        }
    }

    public fe(ChatActivityEnterView chatActivityEnterView, boolean z4, int i10, int i11, long j10) {
        this.f18670a = 2;
        this.f18671b = chatActivityEnterView;
        this.f18674f = z4;
        this.d = i10;
        this.f18673e = i11;
        this.f18672c = j10;
    }
}
