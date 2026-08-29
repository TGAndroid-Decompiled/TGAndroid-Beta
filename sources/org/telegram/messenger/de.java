package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class de implements Runnable {
    public final int f20040a;
    public final NotificationCenter.NotificationCenterDelegate f20041b;
    public final long f20042c;
    public final int d;
    public final int f20043e;
    public final boolean f20044f;

    public de(int i10, int i11, int i12, long j10, MessagesController messagesController, boolean z10) {
        this.f20040a = i12;
        this.f20041b = messagesController;
        this.f20042c = j10;
        this.d = i10;
        this.f20043e = i11;
        this.f20044f = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f20040a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f20041b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$242(this.f20042c, this.d, this.f20043e, this.f20044f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f20042c, this.d, this.f20043e, this.f20044f);
                return;
            default:
                int i11 = ChatActivityEnterView.f26085i5;
                ((ChatActivityEnterView) notificationCenterDelegate).T0(this.d, this.f20044f, this.f20043e, false, this.f20042c);
                return;
        }
    }

    public de(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j10) {
        this.f20040a = 2;
        this.f20041b = chatActivityEnterView;
        this.f20044f = z10;
        this.d = i10;
        this.f20043e = i11;
        this.f20042c = j10;
    }
}
