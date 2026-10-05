package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ae implements Runnable {
    public final int f17342a;
    public final NotificationCenter.NotificationCenterDelegate f17343b;
    public final long f17344c;
    public final int d;
    public final int f17345e;
    public final boolean f17346f;

    public ae(int i10, int i11, int i12, long j3, MessagesController messagesController, boolean z10) {
        this.f17342a = i12;
        this.f17343b = messagesController;
        this.f17344c = j3;
        this.d = i10;
        this.f17345e = i11;
        this.f17346f = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f17342a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f17343b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$242(this.f17344c, this.d, this.f17345e, this.f17346f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f17344c, this.d, this.f17345e, this.f17346f);
                return;
            default:
                int i11 = ChatActivityEnterView.f23854n5;
                ((ChatActivityEnterView) notificationCenterDelegate).T0(this.d, this.f17346f, this.f17345e, false, this.f17344c);
                return;
        }
    }

    public ae(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j3) {
        this.f17342a = 2;
        this.f17343b = chatActivityEnterView;
        this.f17346f = z10;
        this.d = i10;
        this.f17345e = i11;
        this.f17344c = j3;
    }
}
