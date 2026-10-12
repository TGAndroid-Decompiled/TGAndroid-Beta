package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class xa implements Runnable {
    public final int f19004a;
    public final NotificationCenter.NotificationCenterDelegate f19005b;
    public final long f19006c;
    public final int d;
    public final int e;
    public final boolean f19007f;

    public xa(int i10, int i11, int i12, long j10, MessagesController messagesController, boolean z10) {
        this.f19004a = i12;
        this.f19005b = messagesController;
        this.f19006c = j10;
        this.d = i10;
        this.e = i11;
        this.f19007f = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f19004a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f19005b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$240(this.f19006c, this.d, this.e, this.f19007f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f19006c, this.d, this.e, this.f19007f);
                return;
            default:
                int i11 = ChatActivityEnterView.f22849n5;
                ((ChatActivityEnterView) notificationCenterDelegate).R0(this.d, this.f19007f, this.e, false, this.f19006c);
                return;
        }
    }

    public xa(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j10) {
        this.f19004a = 2;
        this.f19005b = chatActivityEnterView;
        this.f19007f = z10;
        this.d = i10;
        this.e = i11;
        this.f19006c = j10;
    }
}
