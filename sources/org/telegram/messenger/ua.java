package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ua implements Runnable {
    public final int f19328a;
    public final NotificationCenter.NotificationCenterDelegate f19329b;
    public final long f19330c;
    public final int d;
    public final int f19331e;
    public final boolean f19332f;

    public ua(int i10, int i11, int i12, long j3, MessagesController messagesController, boolean z10) {
        this.f19328a = i12;
        this.f19329b = messagesController;
        this.f19330c = j3;
        this.d = i10;
        this.f19331e = i11;
        this.f19332f = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f19328a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f19329b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$240(this.f19330c, this.d, this.f19331e, this.f19332f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f19330c, this.d, this.f19331e, this.f19332f);
                return;
            default:
                int i11 = ChatActivityEnterView.f23850n5;
                ((ChatActivityEnterView) notificationCenterDelegate).R0(this.d, this.f19332f, this.f19331e, false, this.f19330c);
                return;
        }
    }

    public ua(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j3) {
        this.f19328a = 2;
        this.f19329b = chatActivityEnterView;
        this.f19332f = z10;
        this.d = i10;
        this.f19331e = i11;
        this.f19330c = j3;
    }
}
