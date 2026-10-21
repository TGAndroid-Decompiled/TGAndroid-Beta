package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class va implements Runnable {
    public final int f19731a;
    public final NotificationCenter.NotificationCenterDelegate f19732b;
    public final long f19733c;
    public final int d;
    public final int e;
    public final boolean f19734f;

    public va(int i10, int i11, int i12, long j10, MessagesController messagesController, boolean z10) {
        this.f19731a = i12;
        this.f19732b = messagesController;
        this.f19733c = j10;
        this.d = i10;
        this.e = i11;
        this.f19734f = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f19731a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f19732b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$240(this.f19733c, this.d, this.e, this.f19734f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f19733c, this.d, this.e, this.f19734f);
                return;
            default:
                int i11 = ChatActivityEnterView.f23908n5;
                ((ChatActivityEnterView) notificationCenterDelegate).R0(this.d, this.f19734f, this.e, false, this.f19733c);
                return;
        }
    }

    public va(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j10) {
        this.f19731a = 2;
        this.f19732b = chatActivityEnterView;
        this.f19734f = z10;
        this.d = i10;
        this.e = i11;
        this.f19733c = j10;
    }
}
