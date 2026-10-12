package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class xa implements Runnable {
    public final int f19563a;
    public final NotificationCenter.NotificationCenterDelegate f19564b;
    public final long f19565c;
    public final int d;
    public final int f19566e;
    public final boolean f19567f;

    public xa(int i10, int i11, int i12, long j3, MessagesController messagesController, boolean z10) {
        this.f19563a = i12;
        this.f19564b = messagesController;
        this.f19565c = j3;
        this.d = i10;
        this.f19566e = i11;
        this.f19567f = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f19563a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f19564b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$240(this.f19565c, this.d, this.f19566e, this.f19567f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f19565c, this.d, this.f19566e, this.f19567f);
                return;
            default:
                int i11 = ChatActivityEnterView.S5;
                ((ChatActivityEnterView) notificationCenterDelegate).W0(this.d, this.f19567f, this.f19566e, false, this.f19565c);
                return;
        }
    }

    public xa(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j3) {
        this.f19563a = 2;
        this.f19564b = chatActivityEnterView;
        this.f19567f = z10;
        this.d = i10;
        this.f19566e = i11;
        this.f19565c = j3;
    }
}
