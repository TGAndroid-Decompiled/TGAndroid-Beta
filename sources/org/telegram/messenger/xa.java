package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class xa implements Runnable {
    public final int f19562a;
    public final NotificationCenter.NotificationCenterDelegate f19563b;
    public final long f19564c;
    public final int d;
    public final int f19565e;
    public final boolean f19566f;

    public xa(int i10, int i11, int i12, long j3, MessagesController messagesController, boolean z10) {
        this.f19562a = i12;
        this.f19563b = messagesController;
        this.f19564c = j3;
        this.d = i10;
        this.f19565e = i11;
        this.f19566f = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f19562a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f19563b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$240(this.f19564c, this.d, this.f19565e, this.f19566f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f19564c, this.d, this.f19565e, this.f19566f);
                return;
            default:
                int i11 = ChatActivityEnterView.Q5;
                ((ChatActivityEnterView) notificationCenterDelegate).W0(this.d, this.f19566f, this.f19565e, false, this.f19564c);
                return;
        }
    }

    public xa(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j3) {
        this.f19562a = 2;
        this.f19563b = chatActivityEnterView;
        this.f19566f = z10;
        this.d = i10;
        this.f19565e = i11;
        this.f19564c = j3;
    }
}
