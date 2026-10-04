package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ae implements Runnable {
    public final int f17333a;
    public final NotificationCenter.NotificationCenterDelegate f17334b;
    public final long f17335c;
    public final int d;
    public final int f17336e;
    public final boolean f17337f;

    public ae(int i10, int i11, int i12, long j3, MessagesController messagesController, boolean z10) {
        this.f17333a = i12;
        this.f17334b = messagesController;
        this.f17335c = j3;
        this.d = i10;
        this.f17336e = i11;
        this.f17337f = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f17333a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f17334b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$242(this.f17335c, this.d, this.f17336e, this.f17337f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f17335c, this.d, this.f17336e, this.f17337f);
                return;
            default:
                int i11 = ChatActivityEnterView.f23847n5;
                ((ChatActivityEnterView) notificationCenterDelegate).T0(this.d, this.f17337f, this.f17336e, false, this.f17335c);
                return;
        }
    }

    public ae(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j3) {
        this.f17333a = 2;
        this.f17334b = chatActivityEnterView;
        this.f17337f = z10;
        this.d = i10;
        this.f17336e = i11;
        this.f17335c = j3;
    }
}
