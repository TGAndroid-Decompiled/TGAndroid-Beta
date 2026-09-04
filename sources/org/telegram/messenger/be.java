package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class be implements Runnable {
    public final int f17249a;
    public final NotificationCenter.NotificationCenterDelegate f17250b;
    public final long f17251c;
    public final int d;
    public final int f17252e;
    public final boolean f17253f;

    public be(int i10, int i11, int i12, long j3, MessagesController messagesController, boolean z10) {
        this.f17249a = i12;
        this.f17250b = messagesController;
        this.f17251c = j3;
        this.d = i10;
        this.f17252e = i11;
        this.f17253f = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f17249a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f17250b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$242(this.f17251c, this.d, this.f17252e, this.f17253f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f17251c, this.d, this.f17252e, this.f17253f);
                return;
            default:
                int i11 = ChatActivityEnterView.f23661m5;
                ((ChatActivityEnterView) notificationCenterDelegate).T0(this.d, this.f17253f, this.f17252e, false, this.f17251c);
                return;
        }
    }

    public be(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j3) {
        this.f17249a = 2;
        this.f17250b = chatActivityEnterView;
        this.f17253f = z10;
        this.d = i10;
        this.f17252e = i11;
        this.f17251c = j3;
    }
}
