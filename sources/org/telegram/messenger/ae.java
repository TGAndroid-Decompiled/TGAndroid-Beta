package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ae implements Runnable {
    public final int f17337a;
    public final NotificationCenter.NotificationCenterDelegate f17338b;
    public final long f17339c;
    public final int d;
    public final int f17340e;
    public final boolean f17341f;

    public ae(int i10, int i11, int i12, long j3, MessagesController messagesController, boolean z10) {
        this.f17337a = i12;
        this.f17338b = messagesController;
        this.f17339c = j3;
        this.d = i10;
        this.f17340e = i11;
        this.f17341f = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f17337a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f17338b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$242(this.f17339c, this.d, this.f17340e, this.f17341f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f17339c, this.d, this.f17340e, this.f17341f);
                return;
            default:
                int i11 = ChatActivityEnterView.f23851n5;
                ((ChatActivityEnterView) notificationCenterDelegate).T0(this.d, this.f17341f, this.f17340e, false, this.f17339c);
                return;
        }
    }

    public ae(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j3) {
        this.f17337a = 2;
        this.f17338b = chatActivityEnterView;
        this.f17341f = z10;
        this.d = i10;
        this.f17340e = i11;
        this.f17339c = j3;
    }
}
