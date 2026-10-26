package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class xa implements Runnable {
    public final int f21819a;
    public final NotificationCenter.NotificationCenterDelegate f21820b;
    public final long f21821c;
    public final int d;
    public final int e;
    public final boolean f21822f;

    public xa(int i10, int i11, int i12, long j10, MessagesController messagesController, boolean z10) {
        this.f21819a = i12;
        this.f21820b = messagesController;
        this.f21821c = j10;
        this.d = i10;
        this.e = i11;
        this.f21822f = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f21819a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f21820b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$240(this.f21821c, this.d, this.e, this.f21822f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f21821c, this.d, this.e, this.f21822f);
                return;
            default:
                int i11 = ChatActivityEnterView.f25843r5;
                ((ChatActivityEnterView) notificationCenterDelegate).R0(this.d, this.f21822f, this.e, false, this.f21821c);
                return;
        }
    }

    public xa(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j10) {
        this.f21819a = 2;
        this.f21820b = chatActivityEnterView;
        this.f21822f = z10;
        this.d = i10;
        this.e = i11;
        this.f21821c = j10;
    }
}
