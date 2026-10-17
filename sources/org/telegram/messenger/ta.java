package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ta implements Runnable {
    public final int f19562a;
    public final NotificationCenter.NotificationCenterDelegate f19563b;
    public final long f19564c;
    public final int d;
    public final int e;
    public final boolean f19565f;

    public ta(int i10, int i11, int i12, long j10, MessagesController messagesController, boolean z10) {
        this.f19562a = i12;
        this.f19563b = messagesController;
        this.f19564c = j10;
        this.d = i10;
        this.e = i11;
        this.f19565f = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f19562a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f19563b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$240(this.f19564c, this.d, this.e, this.f19565f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f19564c, this.d, this.e, this.f19565f);
                return;
            default:
                int i11 = ChatActivityEnterView.f23904n5;
                ((ChatActivityEnterView) notificationCenterDelegate).R0(this.d, this.f19565f, this.e, false, this.f19564c);
                return;
        }
    }

    public ta(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j10) {
        this.f19562a = 2;
        this.f19563b = chatActivityEnterView;
        this.f19565f = z10;
        this.d = i10;
        this.e = i11;
        this.f19564c = j10;
    }
}
