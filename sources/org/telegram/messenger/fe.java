package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class fe implements Runnable {
    public final int f17223a;
    public final NotificationCenter.NotificationCenterDelegate f17224b;
    public final long f17225c;
    public final int d;
    public final int e;
    public final boolean f17226f;

    public fe(int i10, int i11, int i12, long j10, MessagesController messagesController, boolean z4) {
        this.f17223a = i12;
        this.f17224b = messagesController;
        this.f17225c = j10;
        this.d = i10;
        this.e = i11;
        this.f17226f = z4;
    }

    @Override
    public final void run() {
        int i10 = this.f17223a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f17224b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$242(this.f17225c, this.d, this.e, this.f17226f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f17225c, this.d, this.e, this.f17226f);
                return;
            default:
                int i11 = ChatActivityEnterView.f22729j5;
                ((ChatActivityEnterView) notificationCenterDelegate).T0(this.d, this.f17226f, this.e, false, this.f17225c);
                return;
        }
    }

    public fe(ChatActivityEnterView chatActivityEnterView, boolean z4, int i10, int i11, long j10) {
        this.f17223a = 2;
        this.f17224b = chatActivityEnterView;
        this.f17226f = z4;
        this.d = i10;
        this.e = i11;
        this.f17225c = j10;
    }
}
