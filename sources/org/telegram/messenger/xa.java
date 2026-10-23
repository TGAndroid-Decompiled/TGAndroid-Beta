package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class xa implements Runnable {
    public final int f20133a;
    public final NotificationCenter.NotificationCenterDelegate f20134b;
    public final long f20135c;
    public final int d;
    public final int e;
    public final boolean f20136f;

    public xa(int i10, int i11, int i12, long j10, MessagesController messagesController, boolean z10) {
        this.f20133a = i12;
        this.f20134b = messagesController;
        this.f20135c = j10;
        this.d = i10;
        this.e = i11;
        this.f20136f = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f20133a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f20134b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$240(this.f20135c, this.d, this.e, this.f20136f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f20135c, this.d, this.e, this.f20136f);
                return;
            default:
                int i11 = ChatActivityEnterView.f24050r5;
                ((ChatActivityEnterView) notificationCenterDelegate).R0(this.d, this.f20136f, this.e, false, this.f20135c);
                return;
        }
    }

    public xa(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j10) {
        this.f20133a = 2;
        this.f20134b = chatActivityEnterView;
        this.f20136f = z10;
        this.d = i10;
        this.e = i11;
        this.f20135c = j10;
    }
}
