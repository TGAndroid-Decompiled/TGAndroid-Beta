package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ua implements Runnable {
    public final int f19366a;
    public final NotificationCenter.NotificationCenterDelegate f19367b;
    public final long f19368c;
    public final int d;
    public final int f19369e;
    public final boolean f19370f;

    public ua(int i10, int i11, int i12, long j3, MessagesController messagesController, boolean z10) {
        this.f19366a = i12;
        this.f19367b = messagesController;
        this.f19368c = j3;
        this.d = i10;
        this.f19369e = i11;
        this.f19370f = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f19366a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f19367b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$240(this.f19368c, this.d, this.f19369e, this.f19370f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f19368c, this.d, this.f19369e, this.f19370f);
                return;
            default:
                int i11 = ChatActivityEnterView.f23878n5;
                ((ChatActivityEnterView) notificationCenterDelegate).R0(this.d, this.f19370f, this.f19369e, false, this.f19368c);
                return;
        }
    }

    public ua(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j3) {
        this.f19366a = 2;
        this.f19367b = chatActivityEnterView;
        this.f19370f = z10;
        this.d = i10;
        this.f19369e = i11;
        this.f19368c = j3;
    }
}
