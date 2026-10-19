package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ta implements Runnable {
    public final int f19565a;
    public final NotificationCenter.NotificationCenterDelegate f19566b;
    public final long f19567c;
    public final int d;
    public final int e;
    public final boolean f19568f;

    public ta(int i10, int i11, int i12, long j10, MessagesController messagesController, boolean z10) {
        this.f19565a = i12;
        this.f19566b = messagesController;
        this.f19567c = j10;
        this.d = i10;
        this.e = i11;
        this.f19568f = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f19565a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f19566b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$240(this.f19567c, this.d, this.e, this.f19568f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f19567c, this.d, this.e, this.f19568f);
                return;
            default:
                int i11 = ChatActivityEnterView.f23905n5;
                ((ChatActivityEnterView) notificationCenterDelegate).R0(this.d, this.f19568f, this.e, false, this.f19567c);
                return;
        }
    }

    public ta(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j10) {
        this.f19565a = 2;
        this.f19566b = chatActivityEnterView;
        this.f19568f = z10;
        this.d = i10;
        this.e = i11;
        this.f19567c = j10;
    }
}
