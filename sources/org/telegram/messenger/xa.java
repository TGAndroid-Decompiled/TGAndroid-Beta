package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class xa implements Runnable {
    public final int f18708a;
    public final NotificationCenter.NotificationCenterDelegate f18709b;
    public final long f18710c;
    public final int d;
    public final int e;
    public final boolean f18711f;

    public xa(int i10, int i11, int i12, long j10, MessagesController messagesController, boolean z10) {
        this.f18708a = i12;
        this.f18709b = messagesController;
        this.f18710c = j10;
        this.d = i10;
        this.e = i11;
        this.f18711f = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f18708a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f18709b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$240(this.f18710c, this.d, this.e, this.f18711f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f18710c, this.d, this.e, this.f18711f);
                return;
            default:
                int i11 = ChatActivityEnterView.f22549n5;
                ((ChatActivityEnterView) notificationCenterDelegate).R0(this.d, this.f18711f, this.e, false, this.f18710c);
                return;
        }
    }

    public xa(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j10) {
        this.f18708a = 2;
        this.f18709b = chatActivityEnterView;
        this.f18711f = z10;
        this.d = i10;
        this.e = i11;
        this.f18710c = j10;
    }
}
