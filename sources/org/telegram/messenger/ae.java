package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ae implements Runnable {
    public final int f17332a;
    public final NotificationCenter.NotificationCenterDelegate f17333b;
    public final long f17334c;
    public final int d;
    public final int f17335e;
    public final boolean f17336f;

    public ae(int i10, int i11, int i12, long j3, MessagesController messagesController, boolean z10) {
        this.f17332a = i12;
        this.f17333b = messagesController;
        this.f17334c = j3;
        this.d = i10;
        this.f17335e = i11;
        this.f17336f = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f17332a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f17333b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$242(this.f17334c, this.d, this.f17335e, this.f17336f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f17334c, this.d, this.f17335e, this.f17336f);
                return;
            default:
                int i11 = ChatActivityEnterView.f23846n5;
                ((ChatActivityEnterView) notificationCenterDelegate).T0(this.d, this.f17336f, this.f17335e, false, this.f17334c);
                return;
        }
    }

    public ae(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j3) {
        this.f17332a = 2;
        this.f17333b = chatActivityEnterView;
        this.f17336f = z10;
        this.d = i10;
        this.f17335e = i11;
        this.f17334c = j3;
    }
}
