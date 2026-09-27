package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ae implements Runnable {
    public final int f15900a;
    public final NotificationCenter.NotificationCenterDelegate f15901b;
    public final long f15902c;
    public final int d;
    public final int e;
    public final boolean f15903f;

    public ae(int i10, int i11, int i12, long j3, MessagesController messagesController, boolean z10) {
        this.f15900a = i12;
        this.f15901b = messagesController;
        this.f15902c = j3;
        this.d = i10;
        this.e = i11;
        this.f15903f = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f15900a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f15901b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$242(this.f15902c, this.d, this.e, this.f15903f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f15902c, this.d, this.e, this.f15903f);
                return;
            default:
                int i11 = ChatActivityEnterView.f21955n5;
                ((ChatActivityEnterView) notificationCenterDelegate).T0(this.d, this.f15903f, this.e, false, this.f15902c);
                return;
        }
    }

    public ae(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j3) {
        this.f15900a = 2;
        this.f15901b = chatActivityEnterView;
        this.f15903f = z10;
        this.d = i10;
        this.e = i11;
        this.f15902c = j3;
    }
}
