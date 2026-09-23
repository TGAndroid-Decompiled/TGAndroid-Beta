package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ae implements Runnable {
    public final int f15651a;
    public final NotificationCenter.NotificationCenterDelegate f15652b;
    public final long f15653c;
    public final int d;
    public final int e;
    public final boolean f15654f;

    public ae(int i10, int i11, int i12, long j3, MessagesController messagesController, boolean z10) {
        this.f15651a = i12;
        this.f15652b = messagesController;
        this.f15653c = j3;
        this.d = i10;
        this.e = i11;
        this.f15654f = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f15651a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f15652b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$242(this.f15653c, this.d, this.e, this.f15654f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f15653c, this.d, this.e, this.f15654f);
                return;
            default:
                int i11 = ChatActivityEnterView.f21701n5;
                ((ChatActivityEnterView) notificationCenterDelegate).U0(this.d, this.f15654f, this.e, false, this.f15653c);
                return;
        }
    }

    public ae(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j3) {
        this.f15651a = 2;
        this.f15652b = chatActivityEnterView;
        this.f15654f = z10;
        this.d = i10;
        this.e = i11;
        this.f15653c = j3;
    }
}
