package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ae implements Runnable {
    public final int f15920a;
    public final NotificationCenter.NotificationCenterDelegate f15921b;
    public final long f15922c;
    public final int d;
    public final int e;
    public final boolean f15923f;

    public ae(int i10, int i11, int i12, long j3, MessagesController messagesController, boolean z10) {
        this.f15920a = i12;
        this.f15921b = messagesController;
        this.f15922c = j3;
        this.d = i10;
        this.e = i11;
        this.f15923f = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f15920a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f15921b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$242(this.f15922c, this.d, this.e, this.f15923f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f15922c, this.d, this.e, this.f15923f);
                return;
            default:
                int i11 = ChatActivityEnterView.f21974n5;
                ((ChatActivityEnterView) notificationCenterDelegate).T0(this.d, this.f15923f, this.e, false, this.f15922c);
                return;
        }
    }

    public ae(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j3) {
        this.f15920a = 2;
        this.f15921b = chatActivityEnterView;
        this.f15923f = z10;
        this.d = i10;
        this.e = i11;
        this.f15922c = j3;
    }
}
