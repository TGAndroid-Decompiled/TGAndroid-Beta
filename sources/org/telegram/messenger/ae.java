package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ae implements Runnable {
    public final int f15906a;
    public final NotificationCenter.NotificationCenterDelegate f15907b;
    public final long f15908c;
    public final int d;
    public final int e;
    public final boolean f15909f;

    public ae(int i10, int i11, int i12, long j3, MessagesController messagesController, boolean z10) {
        this.f15906a = i12;
        this.f15907b = messagesController;
        this.f15908c = j3;
        this.d = i10;
        this.e = i11;
        this.f15909f = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f15906a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f15907b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$242(this.f15908c, this.d, this.e, this.f15909f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f15908c, this.d, this.e, this.f15909f);
                return;
            default:
                int i11 = ChatActivityEnterView.f21953n5;
                ((ChatActivityEnterView) notificationCenterDelegate).T0(this.d, this.f15909f, this.e, false, this.f15908c);
                return;
        }
    }

    public ae(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j3) {
        this.f15906a = 2;
        this.f15907b = chatActivityEnterView;
        this.f15909f = z10;
        this.d = i10;
        this.e = i11;
        this.f15908c = j3;
    }
}
