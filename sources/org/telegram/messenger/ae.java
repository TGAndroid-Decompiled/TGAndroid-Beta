package org.telegram.messenger;

import org.telegram.ui.Components.ChatActivityEnterView;

public final class ae implements Runnable {

    public final int f19705a;

    public final NotificationCenter.NotificationCenterDelegate f19706b;

    public final long f19707c;
    public final int d;

    public final int f19708e;

    public final boolean f19709f;

    public ae(int i10, int i11, int i12, long j10, MessagesController messagesController, boolean z10) {
        this.f19705a = i12;
        this.f19706b = messagesController;
        this.f19707c = j10;
        this.d = i10;
        this.f19708e = i11;
        this.f19709f = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f19705a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f19706b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$242(this.f19707c, this.d, this.f19708e, this.f19709f);
                break;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f19707c, this.d, this.f19708e, this.f19709f);
                break;
            default:
                int i11 = ChatActivityEnterView.f26070i5;
                ((ChatActivityEnterView) notificationCenterDelegate).T0(this.d, this.f19709f, this.f19708e, false, this.f19707c);
                break;
        }
    }

    public ae(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j10) {
        this.f19705a = 2;
        this.f19706b = chatActivityEnterView;
        this.f19709f = z10;
        this.d = i10;
        this.f19708e = i11;
        this.f19707c = j10;
    }
}
