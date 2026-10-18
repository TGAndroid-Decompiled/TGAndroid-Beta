package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ua implements Runnable {
    public final int f19644a;
    public final NotificationCenter.NotificationCenterDelegate f19645b;
    public final long f19646c;
    public final int d;
    public final int e;
    public final boolean f19647f;

    public ua(int i10, int i11, int i12, long j10, MessagesController messagesController, boolean z10) {
        this.f19644a = i12;
        this.f19645b = messagesController;
        this.f19646c = j10;
        this.d = i10;
        this.e = i11;
        this.f19647f = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f19644a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f19645b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$240(this.f19646c, this.d, this.e, this.f19647f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f19646c, this.d, this.e, this.f19647f);
                return;
            default:
                int i11 = ChatActivityEnterView.f23904n5;
                ((ChatActivityEnterView) notificationCenterDelegate).R0(this.d, this.f19647f, this.e, false, this.f19646c);
                return;
        }
    }

    public ua(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j10) {
        this.f19644a = 2;
        this.f19645b = chatActivityEnterView;
        this.f19647f = z10;
        this.d = i10;
        this.e = i11;
        this.f19646c = j10;
    }
}
